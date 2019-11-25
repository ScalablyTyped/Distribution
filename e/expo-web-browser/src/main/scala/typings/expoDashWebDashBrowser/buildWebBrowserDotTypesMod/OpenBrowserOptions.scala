package typings.expoDashWebDashBrowser.buildWebBrowserDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenBrowserOptions extends js.Object {
  var browserPackage: js.UndefOr[String] = js.undefined
  /** iOS only */
  var controlsColor: js.UndefOr[String] = js.undefined
  var enableBarCollapsing: js.UndefOr[Boolean] = js.undefined
  /** Android only */
  var showInRecents: js.UndefOr[Boolean] = js.undefined
  var showTitle: js.UndefOr[Boolean] = js.undefined
  var toolbarColor: js.UndefOr[String] = js.undefined
  var windowFeatures: js.UndefOr[String] = js.undefined
  var windowName: js.UndefOr[String] = js.undefined
}

object OpenBrowserOptions {
  @scala.inline
  def apply(
    browserPackage: String = null,
    controlsColor: String = null,
    enableBarCollapsing: js.UndefOr[Boolean] = js.undefined,
    showInRecents: js.UndefOr[Boolean] = js.undefined,
    showTitle: js.UndefOr[Boolean] = js.undefined,
    toolbarColor: String = null,
    windowFeatures: String = null,
    windowName: String = null
  ): OpenBrowserOptions = {
    val __obj = js.Dynamic.literal()
    if (browserPackage != null) __obj.updateDynamic("browserPackage")(browserPackage.asInstanceOf[js.Any])
    if (controlsColor != null) __obj.updateDynamic("controlsColor")(controlsColor.asInstanceOf[js.Any])
    if (!js.isUndefined(enableBarCollapsing)) __obj.updateDynamic("enableBarCollapsing")(enableBarCollapsing.asInstanceOf[js.Any])
    if (!js.isUndefined(showInRecents)) __obj.updateDynamic("showInRecents")(showInRecents.asInstanceOf[js.Any])
    if (!js.isUndefined(showTitle)) __obj.updateDynamic("showTitle")(showTitle.asInstanceOf[js.Any])
    if (toolbarColor != null) __obj.updateDynamic("toolbarColor")(toolbarColor.asInstanceOf[js.Any])
    if (windowFeatures != null) __obj.updateDynamic("windowFeatures")(windowFeatures.asInstanceOf[js.Any])
    if (windowName != null) __obj.updateDynamic("windowName")(windowName.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenBrowserOptions]
  }
}

