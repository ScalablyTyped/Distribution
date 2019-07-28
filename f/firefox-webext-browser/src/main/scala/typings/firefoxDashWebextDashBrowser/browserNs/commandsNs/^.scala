package typings.firefoxDashWebextDashBrowser.browserNs.commandsNs

import typings.firefoxDashWebextDashBrowser.Anon_Description
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.commands")
@js.native
object ^ extends js.Object {
  /* commands events */
  /** Fired when a registered command is activated using a keyboard shortcut. */
  val onCommand: WebExtEvent[js.Function1[/* command */ String, Unit]] = js.native
  /** Returns all the registered extension commands for this extension and their shortcut (if active). */
  def getAll(): js.Promise[js.UndefOr[js.Array[Command]]] = js.native
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
  def update(detail: Anon_Description): js.Promise[Unit] = js.native
}

