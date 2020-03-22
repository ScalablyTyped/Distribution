package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.GIF
import typings.devextreme.devextremeStrings.JPEG
import typings.devextreme.devextremeStrings.PDF
import typings.devextreme.devextremeStrings.PNG
import typings.devextreme.devextremeStrings.SVG
import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import typings.std.HTMLCanvasElement
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Configures the exporting and printing features. */
trait BaseWidgetExport extends js.Object {
  /** Specifies the color that will fill transparent regions in the resulting file or document. */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /** Enables the client-side exporting in the widget. */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies a default name for the file to which the widget will be exported. */
  var fileName: js.UndefOr[String] = js.undefined
  /** Specifies a set of export formats. */
  var formats: js.UndefOr[js.Array[GIF | JPEG | PDF | PNG | SVG]] = js.undefined
  /** Adds an empty space around the exported widget; measured in pixels. */
  var margin: js.UndefOr[Double] = js.undefined
  /** Enables the printing feature in the widget. Applies only if the export.enabled option is true. */
  var printingEnabled: js.UndefOr[Boolean] = js.undefined
  /** @deprecated [important] Since v10, Safari browser supports API for saving files, and this option is no longer required. */
  /** Specifies the URL of the server-side proxy that streams the resulting file to the end user to enable exporting in the Safari browser. */
  var proxyUrl: js.UndefOr[String] = js.undefined
  /** A function that renders SVG markup on the HTML canvas. Required to export custom SVG elements (for example, markerTemplate). */
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
    margin: Int | Double = null,
    printingEnabled: js.UndefOr[Boolean] = js.undefined,
    proxyUrl: String = null,
    svgToCanvas: (/* svg */ SVGElement, /* canvas */ HTMLCanvasElement) => Promise[Unit] | JQueryPromise[Unit] = null
  ): BaseWidgetExport = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (formats != null) __obj.updateDynamic("formats")(formats.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(printingEnabled)) __obj.updateDynamic("printingEnabled")(printingEnabled.asInstanceOf[js.Any])
    if (proxyUrl != null) __obj.updateDynamic("proxyUrl")(proxyUrl.asInstanceOf[js.Any])
    if (svgToCanvas != null) __obj.updateDynamic("svgToCanvas")(js.Any.fromFunction2(svgToCanvas))
    __obj.asInstanceOf[BaseWidgetExport]
  }
}

