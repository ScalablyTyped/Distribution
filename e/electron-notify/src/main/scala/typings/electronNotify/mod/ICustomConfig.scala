package typings.electronNotify.mod

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
    animationStepMs: js.UndefOr[Double] = js.undefined,
    animationSteps: js.UndefOr[Double] = js.undefined,
    appIcon: String = null,
    borderRadius: js.UndefOr[Double] = js.undefined,
    defaultStyleAppIcon: js.Any = null,
    defaultStyleClose: js.Any = null,
    defaultStyleContainer: js.Any = null,
    defaultStyleImage: js.Any = null,
    defaultStyleText: js.Any = null,
    defaultWindow: BrowserWindowConstructorOptions = null,
    displayTime: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    logging: js.UndefOr[Boolean] = js.undefined,
    padding: js.UndefOr[Double] = js.undefined,
    pathToModule: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): ICustomConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animateInParallel)) __obj.updateDynamic("animateInParallel")(animateInParallel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationStepMs)) __obj.updateDynamic("animationStepMs")(animationStepMs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationSteps)) __obj.updateDynamic("animationSteps")(animationSteps.get.asInstanceOf[js.Any])
    if (appIcon != null) __obj.updateDynamic("appIcon")(appIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(borderRadius)) __obj.updateDynamic("borderRadius")(borderRadius.get.asInstanceOf[js.Any])
    if (defaultStyleAppIcon != null) __obj.updateDynamic("defaultStyleAppIcon")(defaultStyleAppIcon.asInstanceOf[js.Any])
    if (defaultStyleClose != null) __obj.updateDynamic("defaultStyleClose")(defaultStyleClose.asInstanceOf[js.Any])
    if (defaultStyleContainer != null) __obj.updateDynamic("defaultStyleContainer")(defaultStyleContainer.asInstanceOf[js.Any])
    if (defaultStyleImage != null) __obj.updateDynamic("defaultStyleImage")(defaultStyleImage.asInstanceOf[js.Any])
    if (defaultStyleText != null) __obj.updateDynamic("defaultStyleText")(defaultStyleText.asInstanceOf[js.Any])
    if (defaultWindow != null) __obj.updateDynamic("defaultWindow")(defaultWindow.asInstanceOf[js.Any])
    if (!js.isUndefined(displayTime)) __obj.updateDynamic("displayTime")(displayTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(logging)) __obj.updateDynamic("logging")(logging.get.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (pathToModule != null) __obj.updateDynamic("pathToModule")(pathToModule.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomConfig]
  }
}

