package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundColor extends js.Object {
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

object BackgroundColor {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    fileName: String = null,
    format: String = null,
    height: js.UndefOr[Double] = js.undefined,
    margin: js.UndefOr[Double] = js.undefined,
    onExported: js.Function = null,
    onExporting: js.Function = null,
    onFileSaving: js.Function = null,
    proxyUrl: String = null,
    svgToCanvas: js.Function = null,
    width: js.UndefOr[Double] = js.undefined
  ): BackgroundColor = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(margin)) __obj.updateDynamic("margin")(margin.get.asInstanceOf[js.Any])
    if (onExported != null) __obj.updateDynamic("onExported")(onExported.asInstanceOf[js.Any])
    if (onExporting != null) __obj.updateDynamic("onExporting")(onExporting.asInstanceOf[js.Any])
    if (onFileSaving != null) __obj.updateDynamic("onFileSaving")(onFileSaving.asInstanceOf[js.Any])
    if (proxyUrl != null) __obj.updateDynamic("proxyUrl")(proxyUrl.asInstanceOf[js.Any])
    if (svgToCanvas != null) __obj.updateDynamic("svgToCanvas")(svgToCanvas.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColor]
  }
}

