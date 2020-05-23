package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.GIF
import typings.devextreme.devextremeStrings.JPEG
import typings.devextreme.devextremeStrings.PDF
import typings.devextreme.devextremeStrings.PNG
import typings.devextreme.devextremeStrings.SVG
import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import typings.std.HTMLCanvasElement
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name BaseWidget.Options.export */
trait BaseWidgetExport extends js.Object {
  /** @name BaseWidget.Options.export.backgroundColor */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /** @name BaseWidget.Options.export.enabled */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** @name BaseWidget.Options.export.fileName */
  var fileName: js.UndefOr[String] = js.undefined
  /** @name BaseWidget.Options.export.formats */
  var formats: js.UndefOr[js.Array[GIF | JPEG | PDF | PNG | SVG]] = js.undefined
  /** @name BaseWidget.Options.export.margin */
  var margin: js.UndefOr[Double] = js.undefined
  /** @name BaseWidget.Options.export.printingEnabled */
  var printingEnabled: js.UndefOr[Boolean] = js.undefined
  /** @deprecated */
  /** @name BaseWidget.Options.export.proxyUrl */
  var proxyUrl: js.UndefOr[String] = js.undefined
  /** @name BaseWidget.Options.export.svgToCanvas */
  var svgToCanvas: js.UndefOr[
    js.Function2[
      /* svg */ SVGElement, 
      /* canvas */ HTMLCanvasElement, 
      Promise[Unit] | JQueryPromise[Unit]
    ]
  ] = js.undefined
}

object BaseWidgetExport {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    fileName: String = null,
    formats: js.Array[GIF | JPEG | PDF | PNG | SVG] = null,
    margin: js.UndefOr[Double] = js.undefined,
    printingEnabled: js.UndefOr[Boolean] = js.undefined,
    proxyUrl: String = null,
    svgToCanvas: (/* svg */ SVGElement, /* canvas */ HTMLCanvasElement) => Promise[Unit] | JQueryPromise[Unit] = null
  ): BaseWidgetExport = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (formats != null) __obj.updateDynamic("formats")(formats.asInstanceOf[js.Any])
    if (!js.isUndefined(margin)) __obj.updateDynamic("margin")(margin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(printingEnabled)) __obj.updateDynamic("printingEnabled")(printingEnabled.get.asInstanceOf[js.Any])
    if (proxyUrl != null) __obj.updateDynamic("proxyUrl")(proxyUrl.asInstanceOf[js.Any])
    if (svgToCanvas != null) __obj.updateDynamic("svgToCanvas")(js.Any.fromFunction2(svgToCanvas))
    __obj.asInstanceOf[BaseWidgetExport]
  }
}

