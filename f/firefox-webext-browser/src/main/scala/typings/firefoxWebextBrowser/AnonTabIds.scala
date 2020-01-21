package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTabIds extends js.Object {
  /** All highlighted tabs in the window. */
  var tabIds: js.Array[Double]
  /** The window whose tabs changed. */
  var windowId: Double
}

object AnonTabIds {
  @scala.inline
  def apply(tabIds: js.Array[Double], windowId: Double): AnonTabIds = {
    val __obj = js.Dynamic.literal(tabIds = tabIds.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTabIds]
  }
}

