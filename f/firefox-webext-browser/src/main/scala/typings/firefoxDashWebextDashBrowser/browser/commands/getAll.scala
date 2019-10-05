package typings.firefoxDashWebextDashBrowser.browser.commands

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.commands.getAll")
@js.native
object getAll extends js.Object {
  /** Returns all the registered extension commands for this extension and their shortcut (if active). */
  def apply(): js.Promise[js.UndefOr[js.Array[Command]]] = js.native
}

