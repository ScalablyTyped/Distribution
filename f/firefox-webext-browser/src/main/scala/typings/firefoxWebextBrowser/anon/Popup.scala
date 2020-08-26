package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Popup extends js.Object {
  /** The html file to show in a popup. If set to the empty string (''), no popup is shown. */
  var popup: String | Null = js.native
  /**
    * When setting a value, it will be specific to the specified tab, and will automatically reset when the tab
    * navigates. When getting, specifies the tab to get the value from; if there is no tab-specific value, the
    * window one will be inherited.
    */
  var tabId: js.UndefOr[Double] = js.native
  /**
    * When setting a value, it will be specific to the specified window. When getting, specifies the window to get
    * the value from; if there is no window-specific value, the global one will be inherited.
    */
  var windowId: js.UndefOr[Double] = js.native
}

object Popup {
  @scala.inline
  def apply(): Popup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Popup]
  }
  @scala.inline
  implicit class PopupOps[Self <: Popup] (val x: Self) extends AnyVal {
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
    def setPopup(value: String): Self = this.set("popup", value.asInstanceOf[js.Any])
    @scala.inline
    def setPopupNull: Self = this.set("popup", null)
    @scala.inline
    def setTabId(value: Double): Self = this.set("tabId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabId: Self = this.set("tabId", js.undefined)
    @scala.inline
    def setWindowId(value: Double): Self = this.set("windowId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowId: Self = this.set("windowId", js.undefined)
  }
  
}

