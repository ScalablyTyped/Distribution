package typings
package firefoxDashWebextDashBrowserLib.browserNs.commandsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.commands")
@js.native
object commandsNsMembers extends js.Object {
  /* commands events */
  /** Fired when a registered command is activated using a keyboard shortcut. */
  val onCommand: firefoxDashWebextDashBrowserLib.WebExtEvent[js.Function1[/* command */ java.lang.String, scala.Unit]] = js.native
  /** Returns all the registered extension commands for this extension and their shortcut (if active). */
  def getAll(): stdLib.Promise[js.UndefOr[js.Array[Command]]] = js.native
  /**
       * Reset a command's details to what is specified in the manifest.
       * @param name The name of the command.
       */
  def reset(name: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  /* commands functions */
  /**
       * Update the details of an already defined command.
       * @param detail The new description for the command.
       */
  def update(detail: firefoxDashWebextDashBrowserLib.Anon_Shortcut): stdLib.Promise[scala.Unit] = js.native
}

