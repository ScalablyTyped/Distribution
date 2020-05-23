package typings.devextreme.anon

import typings.devextreme.devextremeStrings.GIF
import typings.devextreme.devextremeStrings.JPEG
import typings.devextreme.devextremeStrings.PDF
import typings.devextreme.devextremeStrings.PNG
import typings.devextreme.devextremeStrings.SVG
import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileName extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var fileName: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[GIF | JPEG | PDF | PNG | SVG] = js.undefined
  var gridLayout: js.UndefOr[Boolean] = js.undefined
  var horizontalAlignment: js.UndefOr[center | left | right] = js.undefined
  var margin: js.UndefOr[Double] = js.undefined
  var onExported: js.UndefOr[js.Function] = js.undefined
  var onExporting: js.UndefOr[js.Function] = js.undefined
  var onFileSaving: js.UndefOr[js.Function] = js.undefined
  var proxyUrl: js.UndefOr[String] = js.undefined
  var svgToCanvas: js.UndefOr[js.Function] = js.undefined
  var verticalAlignment: js.UndefOr[bottom | center | top] = js.undefined
}

object FileName {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    fileName: String = null,
    format: GIF | JPEG | PDF | PNG | SVG = null,
    gridLayout: js.UndefOr[Boolean] = js.undefined,
    horizontalAlignment: center | left | right = null,
    margin: js.UndefOr[Double] = js.undefined,
    onExported: js.Function = null,
    onExporting: js.Function = null,
    onFileSaving: js.Function = null,
    proxyUrl: String = null,
    svgToCanvas: js.Function = null,
    verticalAlignment: bottom | center | top = null
  ): FileName = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(gridLayout)) __obj.updateDynamic("gridLayout")(gridLayout.get.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(margin)) __obj.updateDynamic("margin")(margin.get.asInstanceOf[js.Any])
    if (onExported != null) __obj.updateDynamic("onExported")(onExported.asInstanceOf[js.Any])
    if (onExporting != null) __obj.updateDynamic("onExporting")(onExporting.asInstanceOf[js.Any])
    if (onFileSaving != null) __obj.updateDynamic("onFileSaving")(onFileSaving.asInstanceOf[js.Any])
    if (proxyUrl != null) __obj.updateDynamic("proxyUrl")(proxyUrl.asInstanceOf[js.Any])
    if (svgToCanvas != null) __obj.updateDynamic("svgToCanvas")(svgToCanvas.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileName]
  }
}

