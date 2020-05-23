package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabIdNumber extends js.Object {
  /** Specify the tab to get the popup from. */
  var tabId: Double
}

object TabIdNumber {
  @scala.inline
  def apply(tabId: Double): TabIdNumber = {
    val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabIdNumber]
  }
}

