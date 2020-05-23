package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.anon.Description
import typings.firefoxWebextBrowser.browser.commands.Command
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Use the commands API to add keyboard shortcuts that trigger actions in your extension, for example, an action to
  * open the browser action or send a command to the xtension.
  *
  * Manifest keys: `commands`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
@JSGlobal("browser.commands")
@js.native
object commands extends js.Object {
  /* commands events */
  /** Fired when a registered command is activated using a keyboard shortcut. */
  val onCommand: WebExtEvent[js.Function1[/* command */ String, Unit]] = js.native
  /** Returns all the registered extension commands for this extension and their shortcut (if active). */
  def getAll(): js.Promise[js.Array[Command]] = js.native
  /**
    * Reset a command's details to what is specified in the manifest.
    * @param name The name of the command.
    */
  def reset(name: String): js.Promise[Unit] = js.native
  /* commands functions */
  /**
    * Update the details of an already defined command.
    * @param detail The new description for the command.
    */
  def update(detail: Description): js.Promise[Unit] = js.native
}

