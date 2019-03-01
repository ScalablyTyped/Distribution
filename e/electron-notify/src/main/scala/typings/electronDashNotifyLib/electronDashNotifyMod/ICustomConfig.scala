package typings
package electronDashNotifyLib.electronDashNotifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomConfig extends js.Object {
  var animateInParallel: js.UndefOr[scala.Boolean] = js.undefined
  var animationStepMs: js.UndefOr[scala.Double] = js.undefined
  var animationSteps: js.UndefOr[scala.Double] = js.undefined
  var appIcon: js.UndefOr[java.lang.String] = js.undefined
  var borderRadius: js.UndefOr[scala.Double] = js.undefined
  var defaultStyleAppIcon: js.UndefOr[js.Any] = js.undefined
  var defaultStyleClose: js.UndefOr[js.Any] = js.undefined
  var defaultStyleContainer: js.UndefOr[js.Any] = js.undefined
  var defaultStyleImage: js.UndefOr[js.Any] = js.undefined
  var defaultStyleText: js.UndefOr[js.Any] = js.undefined
  var defaultWindow: js.UndefOr[electronLib.ElectronNs.BrowserWindowConstructorOptions] = js.undefined
  var displayTime: js.UndefOr[scala.Double] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var logging: js.UndefOr[scala.Boolean] = js.undefined
  var padding: js.UndefOr[scala.Double] = js.undefined
  var pathToModule: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ICustomConfig {
  @scala.inline
  def apply(
    animateInParallel: js.UndefOr[scala.Boolean] = js.undefined,
    animationStepMs: scala.Int | scala.Double = null,
    animationSteps: scala.Int | scala.Double = null,
    appIcon: java.lang.String = null,
    borderRadius: scala.Int | scala.Double = null,
    defaultStyleAppIcon: js.Any = null,
    defaultStyleClose: js.Any = null,
    defaultStyleContainer: js.Any = null,
    defaultStyleImage: js.Any = null,
    defaultStyleText: js.Any = null,
    defaultWindow: electronLib.ElectronNs.BrowserWindowConstructorOptions = null,
    displayTime: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    logging: js.UndefOr[scala.Boolean] = js.undefined,
    padding: scala.Int | scala.Double = null,
    pathToModule: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): ICustomConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animateInParallel)) __obj.updateDynamic("animateInParallel")(animateInParallel)
    if (animationStepMs != null) __obj.updateDynamic("animationStepMs")(animationStepMs.asInstanceOf[js.Any])
    if (animationSteps != null) __obj.updateDynamic("animationSteps")(animationSteps.asInstanceOf[js.Any])
    if (appIcon != null) __obj.updateDynamic("appIcon")(appIcon)
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (defaultStyleAppIcon != null) __obj.updateDynamic("defaultStyleAppIcon")(defaultStyleAppIcon)
    if (defaultStyleClose != null) __obj.updateDynamic("defaultStyleClose")(defaultStyleClose)
    if (defaultStyleContainer != null) __obj.updateDynamic("defaultStyleContainer")(defaultStyleContainer)
    if (defaultStyleImage != null) __obj.updateDynamic("defaultStyleImage")(defaultStyleImage)
    if (defaultStyleText != null) __obj.updateDynamic("defaultStyleText")(defaultStyleText)
    if (defaultWindow != null) __obj.updateDynamic("defaultWindow")(defaultWindow)
    if (displayTime != null) __obj.updateDynamic("displayTime")(displayTime.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(logging)) __obj.updateDynamic("logging")(logging)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (pathToModule != null) __obj.updateDynamic("pathToModule")(pathToModule)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomConfig]
  }
}

