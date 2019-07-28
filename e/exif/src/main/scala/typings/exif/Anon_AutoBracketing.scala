package typings.exif

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoBracketing extends js.Object {
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

object Anon_AutoBracketing {
  @scala.inline
  def apply(
    AutoBracketing: Int | Double = null,
    BlurWarning: Int | Double = null,
    ExposureWarning: Int | Double = null,
    FlashExposureComp: Int | Double = null,
    FocusMode: Int | Double = null,
    FocusWarning: Int | Double = null,
    FujiFlashMode: Int | Double = null,
    Macro: Int | Double = null,
    Quality: String = null,
    Sharpness: Int | Double = null,
    SlowSync: Int | Double = null,
    Version: Buffer = null,
    WhiteBalance: Int | Double = null,
    error: String = null
  ): Anon_AutoBracketing = {
    val __obj = js.Dynamic.literal()
    if (AutoBracketing != null) __obj.updateDynamic("AutoBracketing")(AutoBracketing.asInstanceOf[js.Any])
    if (BlurWarning != null) __obj.updateDynamic("BlurWarning")(BlurWarning.asInstanceOf[js.Any])
    if (ExposureWarning != null) __obj.updateDynamic("ExposureWarning")(ExposureWarning.asInstanceOf[js.Any])
    if (FlashExposureComp != null) __obj.updateDynamic("FlashExposureComp")(FlashExposureComp.asInstanceOf[js.Any])
    if (FocusMode != null) __obj.updateDynamic("FocusMode")(FocusMode.asInstanceOf[js.Any])
    if (FocusWarning != null) __obj.updateDynamic("FocusWarning")(FocusWarning.asInstanceOf[js.Any])
    if (FujiFlashMode != null) __obj.updateDynamic("FujiFlashMode")(FujiFlashMode.asInstanceOf[js.Any])
    if (Macro != null) __obj.updateDynamic("Macro")(Macro.asInstanceOf[js.Any])
    if (Quality != null) __obj.updateDynamic("Quality")(Quality)
    if (Sharpness != null) __obj.updateDynamic("Sharpness")(Sharpness.asInstanceOf[js.Any])
    if (SlowSync != null) __obj.updateDynamic("SlowSync")(SlowSync.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version)
    if (WhiteBalance != null) __obj.updateDynamic("WhiteBalance")(WhiteBalance.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[Anon_AutoBracketing]
  }
}

