package typings.expoWebBrowser.webBrowserTypesMod

import typings.expoWebBrowser.expoWebBrowserStrings.cancel
import typings.expoWebBrowser.expoWebBrowserStrings.close
import typings.expoWebBrowser.expoWebBrowserStrings.done
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebBrowserOpenOptions extends js.Object {
  var browserPackage: js.UndefOr[String] = js.native
  /** iOS only */
  var controlsColor: js.UndefOr[String] = js.native
  var dismissButtonStyle: js.UndefOr[done | close | cancel] = js.native
  /**
    * Whether the toolbar should be hiding when a user scrolls the website.
    */
  var enableBarCollapsing: js.UndefOr[Boolean] = js.native
  var enableDefaultShareMenuItem: js.UndefOr[Boolean] = js.native
  var readerMode: js.UndefOr[Boolean] = js.native
  /**
    * Whether browsed website should be shown as separate entry in Android recents/multitasking view.
    * Default: `false`
    */
  var showInRecents: js.UndefOr[Boolean] = js.native
  /** Android only */
  /**
    * Whether the browser should show the title of website on the toolbar.
    */
  var showTitle: js.UndefOr[Boolean] = js.native
  /**
    * Color of the toolbar in either #AARRGGBB or #RRGGBB format.
    */
  var toolbarColor: js.UndefOr[String] = js.native
  /**
    * **Web:** features to use with `window.open()`
    */
  var windowFeatures: js.UndefOr[String | WebBrowserWindowFeatures] = js.native
  /**
    * **Web:** name to assign to the popup window.
    */
  var windowName: js.UndefOr[String] = js.native
}

object WebBrowserOpenOptions {
  @scala.inline
  def apply(): WebBrowserOpenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebBrowserOpenOptions]
  }
  @scala.inline
  implicit class WebBrowserOpenOptionsOps[Self <: WebBrowserOpenOptions] (val x: Self) extends AnyVal {
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
    def setBrowserPackage(value: String): Self = this.set("browserPackage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowserPackage: Self = this.set("browserPackage", js.undefined)
    @scala.inline
    def setControlsColor(value: String): Self = this.set("controlsColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControlsColor: Self = this.set("controlsColor", js.undefined)
    @scala.inline
    def setDismissButtonStyle(value: done | close | cancel): Self = this.set("dismissButtonStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDismissButtonStyle: Self = this.set("dismissButtonStyle", js.undefined)
    @scala.inline
    def setEnableBarCollapsing(value: Boolean): Self = this.set("enableBarCollapsing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableBarCollapsing: Self = this.set("enableBarCollapsing", js.undefined)
    @scala.inline
    def setEnableDefaultShareMenuItem(value: Boolean): Self = this.set("enableDefaultShareMenuItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableDefaultShareMenuItem: Self = this.set("enableDefaultShareMenuItem", js.undefined)
    @scala.inline
    def setReaderMode(value: Boolean): Self = this.set("readerMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReaderMode: Self = this.set("readerMode", js.undefined)
    @scala.inline
    def setShowInRecents(value: Boolean): Self = this.set("showInRecents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowInRecents: Self = this.set("showInRecents", js.undefined)
    @scala.inline
    def setShowTitle(value: Boolean): Self = this.set("showTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTitle: Self = this.set("showTitle", js.undefined)
    @scala.inline
    def setToolbarColor(value: String): Self = this.set("toolbarColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbarColor: Self = this.set("toolbarColor", js.undefined)
    @scala.inline
    def setWindowFeatures(value: String | WebBrowserWindowFeatures): Self = this.set("windowFeatures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowFeatures: Self = this.set("windowFeatures", js.undefined)
    @scala.inline
    def setWindowName(value: String): Self = this.set("windowName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowName: Self = this.set("windowName", js.undefined)
  }
  
}

