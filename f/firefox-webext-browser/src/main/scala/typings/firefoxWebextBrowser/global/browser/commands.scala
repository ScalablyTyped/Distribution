package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.commands.Command
import typings.firefoxWebextBrowser.browser.commands.UpdateDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the commands API to add keyboard shortcuts that trigger actions in your extension, for example, an action to open the browser action or send a command to the xtension.
  *
  * Manifest keys: `commands`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object commands {
  
  /** Returns all the registered extension commands for this extension and their shortcut (if active). */
  @JSGlobal("browser.commands.getAll")
  @js.native
  def getAll(): js.Promise[js.Array[Command]] = js.native
  
  /* commands events */
  /** Fired when a registered command is activated using a keyboard shortcut. */
  @JSGlobal("browser.commands.onCommand")
  @js.native
  val onCommand: WebExtEvent[js.Function1[/* command */ String, Unit]] = js.native
  
  /**
    * Reset a command's details to what is specified in the manifest.
    * @param name The name of the command.
    */
  @JSGlobal("browser.commands.reset")
  @js.native
  def reset(name: String): js.Promise[Unit] = js.native
  
  /* commands functions */
  /**
    * Update the details of an already defined command.
    * @param detail The new description for the command.
    */
  @JSGlobal("browser.commands.update")
  @js.native
  def update(detail: UpdateDetail): js.Promise[Unit] = js.native
}
