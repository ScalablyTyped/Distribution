package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllHistory extends js.Object {
  /** True if all history was removed. If true, then urls will be empty. */
  var allHistory: Boolean
  var urls: js.Array[String]
}

object AnonAllHistory {
  @scala.inline
  def apply(allHistory: Boolean, urls: js.Array[String]): AnonAllHistory = {
    val __obj = js.Dynamic.literal(allHistory = allHistory.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAllHistory]
  }
}

