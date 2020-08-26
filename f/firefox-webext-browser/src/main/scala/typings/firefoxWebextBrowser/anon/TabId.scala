package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabId extends js.Object {
  /** Sets the sidebar title for the tab specified by tabId. Automatically resets when the tab is closed. */
  var tabId: js.UndefOr[Double] = js.native
  /** The string the sidebar action should display when moused over. */
  var title: String | Null = js.native
  /** Sets the sidebar title for the window specified by windowId. */
  var windowId: js.UndefOr[Double] = js.native
}

object TabId {
  @scala.inline
  def apply(): TabId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabId]
  }
  @scala.inline
  implicit class TabIdOps[Self <: TabId] (val x: Self) extends AnyVal {
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
    @scala.inline
    def deleteTabId: Self = this.set("tabId", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitleNull: Self = this.set("title", null)
    @scala.inline
    def setWindowId(value: Double): Self = this.set("windowId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowId: Self = this.set("windowId", js.undefined)
  }
  
}

