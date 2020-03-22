package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackgroundColor extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var fileName: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var margin: js.UndefOr[Double] = js.undefined
  var onExported: js.UndefOr[js.Function] = js.undefined
  var onExporting: js.UndefOr[js.Function] = js.undefined
  var onFileSaving: js.UndefOr[js.Function] = js.undefined
  var proxyUrl: js.UndefOr[String] = js.undefined
  var svgToCanvas: js.UndefOr[js.Function] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnonBackgroundColor {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    fileName: String = null,
    format: String = null,
    height: Int | Double = null,
    margin: Int | Double = null,
    onExported: js.Function = null,
    onExporting: js.Function = null,
    onFileSaving: js.Function = null,
    proxyUrl: String = null,
    svgToCanvas: js.Function = null,
    width: Int | Double = null
  ): AnonBackgroundColor = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onExported != null) __obj.updateDynamic("onExported")(onExported.asInstanceOf[js.Any])
    if (onExporting != null) __obj.updateDynamic("onExporting")(onExporting.asInstanceOf[js.Any])
    if (onFileSaving != null) __obj.updateDynamic("onFileSaving")(onFileSaving.asInstanceOf[js.Any])
    if (proxyUrl != null) __obj.updateDynamic("proxyUrl")(proxyUrl.asInstanceOf[js.Any])
    if (svgToCanvas != null) __obj.updateDynamic("svgToCanvas")(svgToCanvas.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackgroundColor]
  }
}

