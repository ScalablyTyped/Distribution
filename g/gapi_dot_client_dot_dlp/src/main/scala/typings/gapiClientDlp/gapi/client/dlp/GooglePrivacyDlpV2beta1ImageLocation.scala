package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1ImageLocation extends js.Object {
  /** Height of the bounding box in pixels. */
  var height: js.UndefOr[Double] = js.undefined
  /** Left coordinate of the bounding box. (0,0) is upper left. */
  var left: js.UndefOr[Double] = js.undefined
  /** Top coordinate of the bounding box. (0,0) is upper left. */
  var top: js.UndefOr[Double] = js.undefined
  /** Width of the bounding box in pixels. */
  var width: js.UndefOr[Double] = js.undefined
}

object GooglePrivacyDlpV2beta1ImageLocation {
  @scala.inline
  def apply(
    height: js.UndefOr[Double] = js.undefined,
    left: js.UndefOr[Double] = js.undefined,
    top: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): GooglePrivacyDlpV2beta1ImageLocation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1ImageLocation]
  }
}

