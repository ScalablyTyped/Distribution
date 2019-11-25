package typings.firefoxDashWebextDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TabIds extends js.Object {
  /** All highlighted tabs in the window. */
  var tabIds: js.Array[Double]
  /** The window whose tabs changed. */
  var windowId: Double
}

object Anon_TabIds {
  @scala.inline
  def apply(tabIds: js.Array[Double], windowId: Double): Anon_TabIds = {
    val __obj = js.Dynamic.literal(tabIds = tabIds.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_TabIds]
  }
}

