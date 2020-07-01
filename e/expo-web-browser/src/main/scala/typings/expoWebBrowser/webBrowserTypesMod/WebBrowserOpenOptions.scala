package typings.expoWebBrowser.webBrowserTypesMod

import typings.expoWebBrowser.expoWebBrowserStrings.cancel
import typings.expoWebBrowser.expoWebBrowserStrings.close
import typings.expoWebBrowser.expoWebBrowserStrings.done
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebBrowserOpenOptions extends js.Object {
  var browserPackage: js.UndefOr[String] = js.undefined
  /** iOS only */
  var controlsColor: js.UndefOr[String] = js.undefined
  var dismissButtonStyle: js.UndefOr[done | close | cancel] = js.undefined
  /**
    * Whether the toolbar should be hiding when a user scrolls the website.
    */
  var enableBarCollapsing: js.UndefOr[Boolean] = js.undefined
  var enableDefaultShareMenuItem: js.UndefOr[Boolean] = js.undefined
  var readerMode: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether browsed website should be shown as separate entry in Android recents/multitasking view.
    * Default: `false`
    */
  var showInRecents: js.UndefOr[Boolean] = js.undefined
  /** Android only */
  /**
    * Whether the browser should show the title of website on the toolbar.
    */
  var showTitle: js.UndefOr[Boolean] = js.undefined
  /**
    * Color of the toolbar in either #AARRGGBB or #RRGGBB format.
    */
  var toolbarColor: js.UndefOr[String] = js.undefined
  /**
    * **Web:** features to use with `window.open()`
    */
  var windowFeatures: js.UndefOr[String | WebBrowserWindowFeatures] = js.undefined
  /**
    * **Web:** name to assign to the popup window.
    */
  var windowName: js.UndefOr[String] = js.undefined
}

object WebBrowserOpenOptions {
  @scala.inline
  def apply(
    browserPackage: String = null,
    controlsColor: String = null,
    dismissButtonStyle: done | close | cancel = null,
    enableBarCollapsing: js.UndefOr[Boolean] = js.undefined,
    enableDefaultShareMenuItem: js.UndefOr[Boolean] = js.undefined,
    readerMode: js.UndefOr[Boolean] = js.undefined,
    showInRecents: js.UndefOr[Boolean] = js.undefined,
    showTitle: js.UndefOr[Boolean] = js.undefined,
    toolbarColor: String = null,
    windowFeatures: String | WebBrowserWindowFeatures = null,
    windowName: String = null
  ): WebBrowserOpenOptions = {
    val __obj = js.Dynamic.literal()
    if (browserPackage != null) __obj.updateDynamic("browserPackage")(browserPackage.asInstanceOf[js.Any])
    if (controlsColor != null) __obj.updateDynamic("controlsColor")(controlsColor.asInstanceOf[js.Any])
    if (dismissButtonStyle != null) __obj.updateDynamic("dismissButtonStyle")(dismissButtonStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(enableBarCollapsing)) __obj.updateDynamic("enableBarCollapsing")(enableBarCollapsing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDefaultShareMenuItem)) __obj.updateDynamic("enableDefaultShareMenuItem")(enableDefaultShareMenuItem.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readerMode)) __obj.updateDynamic("readerMode")(readerMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showInRecents)) __obj.updateDynamic("showInRecents")(showInRecents.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showTitle)) __obj.updateDynamic("showTitle")(showTitle.get.asInstanceOf[js.Any])
    if (toolbarColor != null) __obj.updateDynamic("toolbarColor")(toolbarColor.asInstanceOf[js.Any])
    if (windowFeatures != null) __obj.updateDynamic("windowFeatures")(windowFeatures.asInstanceOf[js.Any])
    if (windowName != null) __obj.updateDynamic("windowName")(windowName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebBrowserOpenOptions]
  }
}

