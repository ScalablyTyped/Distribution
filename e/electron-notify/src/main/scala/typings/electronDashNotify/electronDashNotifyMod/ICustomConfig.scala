package typings.electronDashNotify.electronDashNotifyMod

import typings.electron.Electron.BrowserWindowConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomConfig extends js.Object {
  var animateInParallel: js.UndefOr[Boolean] = js.undefined
  var animationStepMs: js.UndefOr[Double] = js.undefined
  var animationSteps: js.UndefOr[Double] = js.undefined
  var appIcon: js.UndefOr[String] = js.undefined
  var borderRadius: js.UndefOr[Double] = js.undefined
  var defaultStyleAppIcon: js.UndefOr[js.Any] = js.undefined
  var defaultStyleClose: js.UndefOr[js.Any] = js.undefined
  var defaultStyleContainer: js.UndefOr[js.Any] = js.undefined
  var defaultStyleImage: js.UndefOr[js.Any] = js.undefined
  var defaultStyleText: js.UndefOr[js.Any] = js.undefined
  var defaultWindow: js.UndefOr[BrowserWindowConstructorOptions] = js.undefined
  var displayTime: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var logging: js.UndefOr[Boolean] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var pathToModule: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ICustomConfig {
  @scala.inline
  def apply(
    animateInParallel: js.UndefOr[Boolean] = js.undefined,
    animationStepMs: Int | Double = null,
    animationSteps: Int | Double = null,
    appIcon: String = null,
    borderRadius: Int | Double = null,
    defaultStyleAppIcon: js.Any = null,
    defaultStyleClose: js.Any = null,
    defaultStyleContainer: js.Any = null,
    defaultStyleImage: js.Any = null,
    defaultStyleText: js.Any = null,
    defaultWindow: BrowserWindowConstructorOptions = null,
    displayTime: Int | Double = null,
    height: Int | Double = null,
    logging: js.UndefOr[Boolean] = js.undefined,
    padding: Int | Double = null,
    pathToModule: String = null,
    width: Int | Double = null
  ): ICustomConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animateInParallel)) __obj.updateDynamic("animateInParallel")(animateInParallel.asInstanceOf[js.Any])
    if (animationStepMs != null) __obj.updateDynamic("animationStepMs")(animationStepMs.asInstanceOf[js.Any])
    if (animationSteps != null) __obj.updateDynamic("animationSteps")(animationSteps.asInstanceOf[js.Any])
    if (appIcon != null) __obj.updateDynamic("appIcon")(appIcon.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (defaultStyleAppIcon != null) __obj.updateDynamic("defaultStyleAppIcon")(defaultStyleAppIcon.asInstanceOf[js.Any])
    if (defaultStyleClose != null) __obj.updateDynamic("defaultStyleClose")(defaultStyleClose.asInstanceOf[js.Any])
    if (defaultStyleContainer != null) __obj.updateDynamic("defaultStyleContainer")(defaultStyleContainer.asInstanceOf[js.Any])
    if (defaultStyleImage != null) __obj.updateDynamic("defaultStyleImage")(defaultStyleImage.asInstanceOf[js.Any])
    if (defaultStyleText != null) __obj.updateDynamic("defaultStyleText")(defaultStyleText.asInstanceOf[js.Any])
    if (defaultWindow != null) __obj.updateDynamic("defaultWindow")(defaultWindow.asInstanceOf[js.Any])
    if (displayTime != null) __obj.updateDynamic("displayTime")(displayTime.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(logging)) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (pathToModule != null) __obj.updateDynamic("pathToModule")(pathToModule.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomConfig]
  }
}

