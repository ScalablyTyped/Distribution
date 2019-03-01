package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IndexWindowId extends js.Object {
  /** The position to move the window to. -1 will place the tab at the end of the window. */
  var index: scala.Double
  /** Defaults to the window the tab is currently in. */
  var windowId: js.UndefOr[scala.Double] = js.undefined
}

object Anon_IndexWindowId {
  @scala.inline
  def apply(index: scala.Double, windowId: scala.Int | scala.Double = null): Anon_IndexWindowId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(index)
    if (windowId != null) __obj.updateDynamic("windowId")(windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IndexWindowId]
  }
}

