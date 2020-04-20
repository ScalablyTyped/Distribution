package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReplacedTabId extends js.Object {
  /** The ID of the tab that was replaced. */
  var replacedTabId: Double
  /** The ID of the tab that replaced the old tab. */
  var tabId: Double
  /** The time when the replacement happened, in milliseconds since the epoch. */
  var timeStamp: Double
}

object AnonReplacedTabId {
  @scala.inline
  def apply(replacedTabId: Double, tabId: Double, timeStamp: Double): AnonReplacedTabId = {
    val __obj = js.Dynamic.literal(replacedTabId = replacedTabId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReplacedTabId]
  }
}

