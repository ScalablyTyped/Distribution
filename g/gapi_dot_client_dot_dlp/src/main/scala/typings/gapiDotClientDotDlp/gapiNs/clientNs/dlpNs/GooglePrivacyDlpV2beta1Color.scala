package typings.gapiDotClientDotDlp.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1Color extends js.Object {
  /** The amount of blue in the color as a value in the interval [0, 1]. */
  var blue: js.UndefOr[Double] = js.undefined
  /** The amount of green in the color as a value in the interval [0, 1]. */
  var green: js.UndefOr[Double] = js.undefined
  /** The amount of red in the color as a value in the interval [0, 1]. */
  var red: js.UndefOr[Double] = js.undefined
}

object GooglePrivacyDlpV2beta1Color {
  @scala.inline
  def apply(blue: Int | Double = null, green: Int | Double = null, red: Int | Double = null): GooglePrivacyDlpV2beta1Color = {
    val __obj = js.Dynamic.literal()
    if (blue != null) __obj.updateDynamic("blue")(blue.asInstanceOf[js.Any])
    if (green != null) __obj.updateDynamic("green")(green.asInstanceOf[js.Any])
    if (red != null) __obj.updateDynamic("red")(red.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1Color]
  }
}

