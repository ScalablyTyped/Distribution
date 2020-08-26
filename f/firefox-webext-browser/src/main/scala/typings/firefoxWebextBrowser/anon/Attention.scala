package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.tabs.QueryScreen
import typings.firefoxWebextBrowser.browser.tabs.TabStatus
import typings.firefoxWebextBrowser.browser.tabs.WindowType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attention extends js.Object {
  /** Whether the tabs are active in their windows. */
  var active: js.UndefOr[Boolean] = js.native
  /** Whether the tabs are drawing attention. */
  var attention: js.UndefOr[Boolean] = js.native
  /** Whether the tabs are audible. */
  var audible: js.UndefOr[Boolean] = js.native
  /** True if the tab is using the camera. */
  var camera: js.UndefOr[Boolean] = js.native
  /** The CookieStoreId used for the tab. */
  var cookieStoreId: js.UndefOr[String] = js.native
  /** Whether the tabs are in the current window. */
  var currentWindow: js.UndefOr[Boolean] = js.native
  /** True while the tabs are not loaded with content. */
  var discarded: js.UndefOr[Boolean] = js.native
  /** True while the tabs are hidden. */
  var hidden: js.UndefOr[Boolean] = js.native
  /** Whether the tabs are highlighted. Works as an alias of active. */
  var highlighted: js.UndefOr[Boolean] = js.native
  /** The position of the tabs within their windows. */
  var index: js.UndefOr[Double] = js.native
  /** Whether the tabs are in the last focused window. */
  var lastFocusedWindow: js.UndefOr[Boolean] = js.native
  /** True if the tab is using the microphone. */
  var microphone: js.UndefOr[Boolean] = js.native
  /** Whether the tabs are muted. */
  var muted: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the tab that opened this tab. If specified, the opener tab must be in the same window as this tab.
    */
  var openerTabId: js.UndefOr[Double] = js.native
  /** Whether the tabs are pinned. */
  var pinned: js.UndefOr[Boolean] = js.native
  /** True for any screen sharing, or a string to specify type of screen sharing. */
  var screen: js.UndefOr[Boolean | QueryScreen] = js.native
  /** Whether the tabs have completed loading. */
  var status: js.UndefOr[TabStatus] = js.native
  /** Match page titles against a pattern. */
  var title: js.UndefOr[String] = js.native
  /** Match tabs against one or more URL patterns. Note that fragment identifiers are not matched. */
  var url: js.UndefOr[String | js.Array[String]] = js.native
  /** The ID of the parent window, or `windows.WINDOW_ID_CURRENT` for the current window. */
  var windowId: js.UndefOr[Double] = js.native
  /** The type of window the tabs are in. */
  var windowType: js.UndefOr[WindowType] = js.native
}

object Attention {
  @scala.inline
  def apply(): Attention = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attention]
  }
  @scala.inline
  implicit class AttentionOps[Self <: Attention] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setAttention(value: Boolean): Self = this.set("attention", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttention: Self = this.set("attention", js.undefined)
    @scala.inline
    def setAudible(value: Boolean): Self = this.set("audible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudible: Self = this.set("audible", js.undefined)
    @scala.inline
    def setCamera(value: Boolean): Self = this.set("camera", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCamera: Self = this.set("camera", js.undefined)
    @scala.inline
    def setCookieStoreId(value: String): Self = this.set("cookieStoreId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookieStoreId: Self = this.set("cookieStoreId", js.undefined)
    @scala.inline
    def setCurrentWindow(value: Boolean): Self = this.set("currentWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentWindow: Self = this.set("currentWindow", js.undefined)
    @scala.inline
    def setDiscarded(value: Boolean): Self = this.set("discarded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiscarded: Self = this.set("discarded", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setHighlighted(value: Boolean): Self = this.set("highlighted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlighted: Self = this.set("highlighted", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setLastFocusedWindow(value: Boolean): Self = this.set("lastFocusedWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastFocusedWindow: Self = this.set("lastFocusedWindow", js.undefined)
    @scala.inline
    def setMicrophone(value: Boolean): Self = this.set("microphone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMicrophone: Self = this.set("microphone", js.undefined)
    @scala.inline
    def setMuted(value: Boolean): Self = this.set("muted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMuted: Self = this.set("muted", js.undefined)
    @scala.inline
    def setOpenerTabId(value: Double): Self = this.set("openerTabId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenerTabId: Self = this.set("openerTabId", js.undefined)
    @scala.inline
    def setPinned(value: Boolean): Self = this.set("pinned", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinned: Self = this.set("pinned", js.undefined)
    @scala.inline
    def setScreen(value: Boolean | QueryScreen): Self = this.set("screen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreen: Self = this.set("screen", js.undefined)
    @scala.inline
    def setStatus(value: TabStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUrlVarargs(value: String*): Self = this.set("url", js.Array(value :_*))
    @scala.inline
    def setUrl(value: String | js.Array[String]): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setWindowId(value: Double): Self = this.set("windowId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowId: Self = this.set("windowId", js.undefined)
    @scala.inline
    def setWindowType(value: WindowType): Self = this.set("windowType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowType: Self = this.set("windowType", js.undefined)
  }
  
}

