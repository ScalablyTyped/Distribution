package typings.gapiClientBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFillColorArgb extends js.Object {
  var fillColorArgb: js.UndefOr[String] = js.undefined
  var imageUrl: js.UndefOr[String] = js.undefined
  var maskColorArgb: js.UndefOr[String] = js.undefined
  var moreButtonText: js.UndefOr[String] = js.undefined
  var moreButtonUrl: js.UndefOr[String] = js.undefined
  var textColorArgb: js.UndefOr[String] = js.undefined
}

object AnonFillColorArgb {
  @scala.inline
  def apply(
    fillColorArgb: String = null,
    imageUrl: String = null,
    maskColorArgb: String = null,
    moreButtonText: String = null,
    moreButtonUrl: String = null,
    textColorArgb: String = null
  ): AnonFillColorArgb = {
    val __obj = js.Dynamic.literal()
    if (fillColorArgb != null) __obj.updateDynamic("fillColorArgb")(fillColorArgb.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (maskColorArgb != null) __obj.updateDynamic("maskColorArgb")(maskColorArgb.asInstanceOf[js.Any])
    if (moreButtonText != null) __obj.updateDynamic("moreButtonText")(moreButtonText.asInstanceOf[js.Any])
    if (moreButtonUrl != null) __obj.updateDynamic("moreButtonUrl")(moreButtonUrl.asInstanceOf[js.Any])
    if (textColorArgb != null) __obj.updateDynamic("textColorArgb")(textColorArgb.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFillColorArgb]
  }
}

