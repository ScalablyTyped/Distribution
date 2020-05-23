package typings.gapiClientDlp.gapi.client.dlp

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
  def apply(
    blue: js.UndefOr[Double] = js.undefined,
    green: js.UndefOr[Double] = js.undefined,
    red: js.UndefOr[Double] = js.undefined
  ): GooglePrivacyDlpV2beta1Color = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blue)) __obj.updateDynamic("blue")(blue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(green)) __obj.updateDynamic("green")(green.get.asInstanceOf[js.Any])
    if (!js.isUndefined(red)) __obj.updateDynamic("red")(red.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1Color]
  }
}

