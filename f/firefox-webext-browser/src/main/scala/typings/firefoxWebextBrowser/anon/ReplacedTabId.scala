package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplacedTabId extends js.Object {
  /** The ID of the tab that was replaced. */
  var replacedTabId: Double = js.native
  /** The ID of the tab that replaced the old tab. */
  var tabId: Double = js.native
  /** The time when the replacement happened, in milliseconds since the epoch. */
  var timeStamp: Double = js.native
}

object ReplacedTabId {
  @scala.inline
  def apply(replacedTabId: Double, tabId: Double, timeStamp: Double): ReplacedTabId = {
    val __obj = js.Dynamic.literal(replacedTabId = replacedTabId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplacedTabId]
  }
  @scala.inline
  implicit class ReplacedTabIdOps[Self <: ReplacedTabId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReplacedTabId(value: Double): Self = this.set("replacedTabId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabId(value: Double): Self = this.set("tabId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeStamp(value: Double): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
  }
  
}

