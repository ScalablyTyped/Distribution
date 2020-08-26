package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabIdNumber extends js.Object {
  /** The ID of the tab. */
  var tabId: Double = js.native
}

object TabIdNumber {
  @scala.inline
  def apply(tabId: Double): TabIdNumber = {
    val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabIdNumber]
  }
  @scala.inline
  implicit class TabIdNumberOps[Self <: TabIdNumber] (val x: Self) extends AnyVal {
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
    def setTabId(value: Double): Self = this.set("tabId", value.asInstanceOf[js.Any])
  }
  
}

