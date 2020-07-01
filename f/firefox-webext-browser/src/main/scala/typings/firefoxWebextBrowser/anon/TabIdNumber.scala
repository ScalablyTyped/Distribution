package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabIdNumber extends js.Object {
  /** The ID of the tab. */
  var tabId: Double
}

object TabIdNumber {
  @scala.inline
  def apply(tabId: Double): TabIdNumber = {
    val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabIdNumber]
  }
}

