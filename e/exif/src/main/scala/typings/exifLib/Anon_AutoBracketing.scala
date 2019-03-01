package typings
package exifLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoBracketing extends js.Object {
  var AutoBracketing: js.UndefOr[scala.Double] = js.undefined
  var BlurWarning: js.UndefOr[scala.Double] = js.undefined
  var ExposureWarning: js.UndefOr[scala.Double] = js.undefined
  var FlashExposureComp: js.UndefOr[scala.Double] = js.undefined
  var FocusMode: js.UndefOr[scala.Double] = js.undefined
  var FocusWarning: js.UndefOr[scala.Double] = js.undefined
  var FujiFlashMode: js.UndefOr[scala.Double] = js.undefined
  var Macro: js.UndefOr[scala.Double] = js.undefined
  var Quality: js.UndefOr[java.lang.String] = js.undefined
  var Sharpness: js.UndefOr[scala.Double] = js.undefined
  var SlowSync: js.UndefOr[scala.Double] = js.undefined
  var Version: js.UndefOr[nodeLib.Buffer] = js.undefined
  var WhiteBalance: js.UndefOr[scala.Double] = js.undefined
  var error: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AutoBracketing {
  @scala.inline
  def apply(
    AutoBracketing: scala.Int | scala.Double = null,
    BlurWarning: scala.Int | scala.Double = null,
    ExposureWarning: scala.Int | scala.Double = null,
    FlashExposureComp: scala.Int | scala.Double = null,
    FocusMode: scala.Int | scala.Double = null,
    FocusWarning: scala.Int | scala.Double = null,
    FujiFlashMode: scala.Int | scala.Double = null,
    Macro: scala.Int | scala.Double = null,
    Quality: java.lang.String = null,
    Sharpness: scala.Int | scala.Double = null,
    SlowSync: scala.Int | scala.Double = null,
    Version: nodeLib.Buffer = null,
    WhiteBalance: scala.Int | scala.Double = null,
    error: java.lang.String = null
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

