package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FillColorArgb extends js.Object {
  var fillColorArgb: js.UndefOr[String] = js.native
  var imageUrl: js.UndefOr[String] = js.native
  var maskColorArgb: js.UndefOr[String] = js.native
  var moreButtonText: js.UndefOr[String] = js.native
  var moreButtonUrl: js.UndefOr[String] = js.native
  var textColorArgb: js.UndefOr[String] = js.native
}

object FillColorArgb {
  @scala.inline
  def apply(
    fillColorArgb: String = null,
    imageUrl: String = null,
    maskColorArgb: String = null,
    moreButtonText: String = null,
    moreButtonUrl: String = null,
    textColorArgb: String = null
  ): FillColorArgb = {
    val __obj = js.Dynamic.literal()
    if (fillColorArgb != null) __obj.updateDynamic("fillColorArgb")(fillColorArgb.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (maskColorArgb != null) __obj.updateDynamic("maskColorArgb")(maskColorArgb.asInstanceOf[js.Any])
    if (moreButtonText != null) __obj.updateDynamic("moreButtonText")(moreButtonText.asInstanceOf[js.Any])
    if (moreButtonUrl != null) __obj.updateDynamic("moreButtonUrl")(moreButtonUrl.asInstanceOf[js.Any])
    if (textColorArgb != null) __obj.updateDynamic("textColorArgb")(textColorArgb.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillColorArgb]
  }
}

