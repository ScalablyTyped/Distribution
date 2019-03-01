package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FillColorArgb extends js.Object {
  var fillColorArgb: js.UndefOr[java.lang.String] = js.undefined
  var imageUrl: js.UndefOr[java.lang.String] = js.undefined
  var maskColorArgb: js.UndefOr[java.lang.String] = js.undefined
  var moreButtonText: js.UndefOr[java.lang.String] = js.undefined
  var moreButtonUrl: js.UndefOr[java.lang.String] = js.undefined
  var textColorArgb: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_FillColorArgb {
  @scala.inline
  def apply(
    fillColorArgb: java.lang.String = null,
    imageUrl: java.lang.String = null,
    maskColorArgb: java.lang.String = null,
    moreButtonText: java.lang.String = null,
    moreButtonUrl: java.lang.String = null,
    textColorArgb: java.lang.String = null
  ): Anon_FillColorArgb = {
    val __obj = js.Dynamic.literal()
    if (fillColorArgb != null) __obj.updateDynamic("fillColorArgb")(fillColorArgb)
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (maskColorArgb != null) __obj.updateDynamic("maskColorArgb")(maskColorArgb)
    if (moreButtonText != null) __obj.updateDynamic("moreButtonText")(moreButtonText)
    if (moreButtonUrl != null) __obj.updateDynamic("moreButtonUrl")(moreButtonUrl)
    if (textColorArgb != null) __obj.updateDynamic("textColorArgb")(textColorArgb)
    __obj.asInstanceOf[Anon_FillColorArgb]
  }
}

