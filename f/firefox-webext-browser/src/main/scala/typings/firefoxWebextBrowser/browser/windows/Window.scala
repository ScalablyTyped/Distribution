package typings.firefoxWebextBrowser.browser.windows

import typings.firefoxWebextBrowser.browser.tabs.Tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  /** Whether the window is set to be always on top. */
  var alwaysOnTop: Boolean = js.native
  /** Whether the window is currently the focused window. */
  var focused: Boolean = js.native
  /**
    * The height of the window, including the frame, in pixels. Under some circumstances a Window may not be
    * assigned height property, for example when querying closed windows from the `sessions` API.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The ID of the window. Window IDs are unique within a browser session. Under some circumstances a Window may
    * not be assigned an ID, for example when querying windows using the `sessions` API, in which case a session
    * ID may be present.
    */
  var id: js.UndefOr[Double] = js.native
  /** Whether the window is incognito. */
  var incognito: Boolean = js.native
  /**
    * The offset of the window from the left edge of the screen in pixels. Under some circumstances a Window may
    * not be assigned left property, for example when querying closed windows from the `sessions` API.
    */
  var left: js.UndefOr[Double] = js.native
  /** The session ID used to uniquely identify a Window obtained from the `sessions` API. */
  var sessionId: js.UndefOr[String] = js.native
  /** The state of this browser window. */
  var state: js.UndefOr[WindowState] = js.native
  /** Array of `tabs.Tab` objects representing the current tabs in the window. */
  var tabs: js.UndefOr[js.Array[Tab]] = js.native
  /** The title of the window. Read-only. */
  var title: js.UndefOr[String] = js.native
  /**
    * The offset of the window from the top edge of the screen in pixels. Under some circumstances a Window may
    * not be assigned top property, for example when querying closed windows from the `sessions` API.
    */
  var top: js.UndefOr[Double] = js.native
  /** The type of browser window this is. */
  var `type`: js.UndefOr[WindowType] = js.native
  /**
    * The width of the window, including the frame, in pixels. Under some circumstances a Window may not be
    * assigned width property, for example when querying closed windows from the `sessions` API.
    */
  var width: js.UndefOr[Double] = js.native
}

object Window {
  @scala.inline
  def apply(alwaysOnTop: Boolean, focused: Boolean, incognito: Boolean): Window = {
    val __obj = js.Dynamic.literal(alwaysOnTop = alwaysOnTop.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], incognito = incognito.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
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
    def setAlwaysOnTop(value: Boolean): Self = this.set("alwaysOnTop", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocused(value: Boolean): Self = this.set("focused", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncognito(value: Boolean): Self = this.set("incognito", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setSessionId(value: String): Self = this.set("sessionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionId: Self = this.set("sessionId", js.undefined)
    @scala.inline
    def setState(value: WindowState): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setTabsVarargs(value: Tab*): Self = this.set("tabs", js.Array(value :_*))
    @scala.inline
    def setTabs(value: js.Array[Tab]): Self = this.set("tabs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabs: Self = this.set("tabs", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setType(value: WindowType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

