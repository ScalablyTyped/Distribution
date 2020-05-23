package typings.exif.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoBracketing extends js.Object {
  var AutoBracketing: js.UndefOr[Double] = js.undefined
  var BlurWarning: js.UndefOr[Double] = js.undefined
  var ExposureWarning: js.UndefOr[Double] = js.undefined
  var FlashExposureComp: js.UndefOr[Double] = js.undefined
  var FocusMode: js.UndefOr[Double] = js.undefined
  var FocusWarning: js.UndefOr[Double] = js.undefined
  var FujiFlashMode: js.UndefOr[Double] = js.undefined
  var Macro: js.UndefOr[Double] = js.undefined
  var Quality: js.UndefOr[String] = js.undefined
  var Sharpness: js.UndefOr[Double] = js.undefined
  var SlowSync: js.UndefOr[Double] = js.undefined
  var Version: js.UndefOr[Buffer] = js.undefined
  var WhiteBalance: js.UndefOr[Double] = js.undefined
  var error: js.UndefOr[String] = js.undefined
}

object AutoBracketing {
  @scala.inline
  def apply(
    AutoBracketing: js.UndefOr[Double] = js.undefined,
    BlurWarning: js.UndefOr[Double] = js.undefined,
    ExposureWarning: js.UndefOr[Double] = js.undefined,
    FlashExposureComp: js.UndefOr[Double] = js.undefined,
    FocusMode: js.UndefOr[Double] = js.undefined,
    FocusWarning: js.UndefOr[Double] = js.undefined,
    FujiFlashMode: js.UndefOr[Double] = js.undefined,
    Macro: js.UndefOr[Double] = js.undefined,
    Quality: String = null,
    Sharpness: js.UndefOr[Double] = js.undefined,
    SlowSync: js.UndefOr[Double] = js.undefined,
    Version: Buffer = null,
    WhiteBalance: js.UndefOr[Double] = js.undefined,
    error: String = null
  ): AutoBracketing = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutoBracketing)) __obj.updateDynamic("AutoBracketing")(AutoBracketing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(BlurWarning)) __obj.updateDynamic("BlurWarning")(BlurWarning.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ExposureWarning)) __obj.updateDynamic("ExposureWarning")(ExposureWarning.get.asInstanceOf[js.Any])
    if (!js.isUndefined(FlashExposureComp)) __obj.updateDynamic("FlashExposureComp")(FlashExposureComp.get.asInstanceOf[js.Any])
    if (!js.isUndefined(FocusMode)) __obj.updateDynamic("FocusMode")(FocusMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(FocusWarning)) __obj.updateDynamic("FocusWarning")(FocusWarning.get.asInstanceOf[js.Any])
    if (!js.isUndefined(FujiFlashMode)) __obj.updateDynamic("FujiFlashMode")(FujiFlashMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Macro)) __obj.updateDynamic("Macro")(Macro.get.asInstanceOf[js.Any])
    if (Quality != null) __obj.updateDynamic("Quality")(Quality.asInstanceOf[js.Any])
    if (!js.isUndefined(Sharpness)) __obj.updateDynamic("Sharpness")(Sharpness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SlowSync)) __obj.updateDynamic("SlowSync")(SlowSync.get.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    if (!js.isUndefined(WhiteBalance)) __obj.updateDynamic("WhiteBalance")(WhiteBalance.get.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoBracketing]
  }
}

