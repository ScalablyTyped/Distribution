package typings.firefoxDashWebextDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReplacedTabId extends js.Object {
  /** The ID of the tab that was replaced. */
  var replacedTabId: Double
  /** The ID of the tab that replaced the old tab. */
  var tabId: Double
  /** The time when the replacement happened, in milliseconds since the epoch. */
  var timeStamp: Double
}

object Anon_ReplacedTabId {
  @scala.inline
  def apply(replacedTabId: Double, tabId: Double, timeStamp: Double): Anon_ReplacedTabId = {
    val __obj = js.Dynamic.literal(replacedTabId = replacedTabId, tabId = tabId, timeStamp = timeStamp)
  
    __obj.asInstanceOf[Anon_ReplacedTabId]
  }
}

