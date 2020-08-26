package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoScroll extends js.Object {
  /** Don't scroll to highlighted item. */
  var noScroll: js.UndefOr[Boolean] = js.native
  /** Found range to be highlighted. Default highlights all ranges. */
  var rangeIndex: js.UndefOr[Double] = js.native
  /** Tab to highlight. Defaults to the active tab. */
  var tabId: js.UndefOr[Double] = js.native
}

object NoScroll {
  @scala.inline
  def apply(): NoScroll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoScroll]
  }
  @scala.inline
  implicit class NoScrollOps[Self <: NoScroll] (val x: Self) extends AnyVal {
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
    def setNoScroll(value: Boolean): Self = this.set("noScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoScroll: Self = this.set("noScroll", js.undefined)
    @scala.inline
    def setRangeIndex(value: Double): Self = this.set("rangeIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeIndex: Self = this.set("rangeIndex", js.undefined)
    @scala.inline
    def setTabId(value: Double): Self = this.set("tabId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabId: Self = this.set("tabId", js.undefined)
  }
  
}

