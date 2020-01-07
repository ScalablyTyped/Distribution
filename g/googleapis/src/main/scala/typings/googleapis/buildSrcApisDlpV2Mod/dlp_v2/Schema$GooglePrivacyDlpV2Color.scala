package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a color in the RGB color space.
  */
@js.native
trait Schema$GooglePrivacyDlpV2Color extends js.Object {
  /**
    * The amount of blue in the color as a value in the interval [0, 1].
    */
  var blue: js.UndefOr[Double] = js.native
  /**
    * The amount of green in the color as a value in the interval [0, 1].
    */
  var green: js.UndefOr[Double] = js.native
  /**
    * The amount of red in the color as a value in the interval [0, 1].
    */
  var red: js.UndefOr[Double] = js.native
}

object Schema$GooglePrivacyDlpV2Color {
  @scala.inline
  def apply(blue: Int | Double = null, green: Int | Double = null, red: Int | Double = null): Schema$GooglePrivacyDlpV2Color = {
    val __obj = js.Dynamic.literal()
    if (blue != null) __obj.updateDynamic("blue")(blue.asInstanceOf[js.Any])
    if (green != null) __obj.updateDynamic("green")(green.asInstanceOf[js.Any])
    if (red != null) __obj.updateDynamic("red")(red.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2Color]
  }
}

