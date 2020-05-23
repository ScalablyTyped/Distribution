package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllHistory extends js.Object {
  /** True if all history was removed. If true, then urls will be empty. */
  var allHistory: Boolean
  var urls: js.Array[String]
}

object AllHistory {
  @scala.inline
  def apply(allHistory: Boolean, urls: js.Array[String]): AllHistory = {
    val __obj = js.Dynamic.literal(allHistory = allHistory.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllHistory]
  }
}

