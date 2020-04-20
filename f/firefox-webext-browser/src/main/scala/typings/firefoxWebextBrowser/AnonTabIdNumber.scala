package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTabIdNumber extends js.Object {
  /** Specify the tab to get the popup from. */
  var tabId: Double
}

object AnonTabIdNumber {
  @scala.inline
  def apply(tabId: Double): AnonTabIdNumber = {
    val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTabIdNumber]
  }
}

