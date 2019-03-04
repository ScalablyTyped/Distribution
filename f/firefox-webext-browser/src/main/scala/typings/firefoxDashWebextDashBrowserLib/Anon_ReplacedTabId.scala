package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReplacedTabId extends js.Object {
  /** The ID of the tab that was replaced. */
  var replacedTabId: scala.Double
  /** The ID of the tab that replaced the old tab. */
  var tabId: scala.Double
  /** The time when the replacement happened, in milliseconds since the epoch. */
  var timeStamp: scala.Double
}

object Anon_ReplacedTabId {
  @scala.inline
  def apply(replacedTabId: scala.Double, tabId: scala.Double, timeStamp: scala.Double): Anon_ReplacedTabId = {
    val __obj = js.Dynamic.literal(replacedTabId = replacedTabId, tabId = tabId, timeStamp = timeStamp)
  
    __obj.asInstanceOf[Anon_ReplacedTabId]
  }
}

