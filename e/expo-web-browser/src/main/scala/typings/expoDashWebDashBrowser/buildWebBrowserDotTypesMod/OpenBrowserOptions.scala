package typings.expoDashWebDashBrowser.buildWebBrowserDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenBrowserOptions extends js.Object {
  var browserPackage: js.UndefOr[String] = js.undefined
  var enableBarCollapsing: js.UndefOr[Boolean] = js.undefined
  var showTitle: js.UndefOr[Boolean] = js.undefined
  var toolbarColor: js.UndefOr[String] = js.undefined
  var windowFeatures: js.UndefOr[String] = js.undefined
  var windowName: js.UndefOr[String] = js.undefined
}

object OpenBrowserOptions {
  @scala.inline
  def apply(
    browserPackage: String = null,
    enableBarCollapsing: js.UndefOr[Boolean] = js.undefined,
    showTitle: js.UndefOr[Boolean] = js.undefined,
    toolbarColor: String = null,
    windowFeatures: String = null,
    windowName: String = null
  ): OpenBrowserOptions = {
    val __obj = js.Dynamic.literal()
    if (browserPackage != null) __obj.updateDynamic("browserPackage")(browserPackage)
    if (!js.isUndefined(enableBarCollapsing)) __obj.updateDynamic("enableBarCollapsing")(enableBarCollapsing)
    if (!js.isUndefined(showTitle)) __obj.updateDynamic("showTitle")(showTitle)
    if (toolbarColor != null) __obj.updateDynamic("toolbarColor")(toolbarColor)
    if (windowFeatures != null) __obj.updateDynamic("windowFeatures")(windowFeatures)
    if (windowName != null) __obj.updateDynamic("windowName")(windowName)
    __obj.asInstanceOf[OpenBrowserOptions]
  }
}

