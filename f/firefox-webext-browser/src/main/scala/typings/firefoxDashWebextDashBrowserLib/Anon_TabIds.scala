package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TabIds extends js.Object {
  /** All highlighted tabs in the window. */
  var tabIds: js.Array[scala.Double]
  /** The window whose tabs changed. */
  var windowId: scala.Double
}

object Anon_TabIds {
  @scala.inline
  def apply(tabIds: js.Array[scala.Double], windowId: scala.Double): Anon_TabIds = {
    val __obj = js.Dynamic.literal(tabIds = tabIds, windowId = windowId)
  
    __obj.asInstanceOf[Anon_TabIds]
  }
}

