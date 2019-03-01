package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1ImageLocation extends js.Object {
  /** Height of the bounding box in pixels. */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Left coordinate of the bounding box. (0,0) is upper left. */
  var left: js.UndefOr[scala.Double] = js.undefined
  /** Top coordinate of the bounding box. (0,0) is upper left. */
  var top: js.UndefOr[scala.Double] = js.undefined
  /** Width of the bounding box in pixels. */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object GooglePrivacyDlpV2beta1ImageLocation {
  @scala.inline
  def apply(
    height: scala.Int | scala.Double = null,
    left: scala.Int | scala.Double = null,
    top: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): GooglePrivacyDlpV2beta1ImageLocation = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1ImageLocation]
  }
}

