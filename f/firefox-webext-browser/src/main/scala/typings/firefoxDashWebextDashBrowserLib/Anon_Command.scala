package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Command extends js.Object {
  /* commands events */
  /** Fired when a registered command is activated using a keyboard shortcut. */
  val onCommand: WebExtEvent[js.Function1[/* command */ java.lang.String, scala.Unit]]
  /** Returns all the registered extension commands for this extension and their shortcut (if active). */
  def getAll(): js.Promise[
    js.UndefOr[js.Array[firefoxDashWebextDashBrowserLib.browserNs.commandsNs.Command]]
  ]
  /**
    * Reset a command's details to what is specified in the manifest.
    * @param name The name of the command.
    */
  def reset(name: java.lang.String): js.Promise[scala.Unit]
  /* commands functions */
  /**
    * Update the details of an already defined command.
    * @param detail The new description for the command.
    */
  def update(detail: Anon_Description): js.Promise[scala.Unit]
}

