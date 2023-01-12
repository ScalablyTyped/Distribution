package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.common.ExportFormat
import typings.std.HTMLCanvasElement
import typings.std.PromiseLike
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseWidgetExport extends StObject {
  
  /**
    * Specifies the color that will fill transparent regions in the resulting file or document.
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * Enables the client-side exporting in the UI component.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a default name for the file to which the UI component will be exported.
    */
  var fileName: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a set of export formats.
    */
  var formats: js.UndefOr[js.Array[ExportFormat]] = js.undefined
  
  /**
    * Adds an empty space around the exported UI component; measured in pixels.
    */
  var margin: js.UndefOr[Double] = js.undefined
  
  /**
    * Enables the printing feature in the UI component. Applies only if the export.enabled property is true.
    */
  var printingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the URL of the server-side proxy that streams the resulting file to the end user to enable exporting in the Safari browser.
    * @deprecated Since v10, Safari browser supports API for saving files, and this property is no longer required.
    */
  var proxyUrl: js.UndefOr[String] = js.undefined
  
  /**
    * A function that renders SVG markup on the HTML canvas. Required to export custom SVG elements (for example, markerTemplate).
    */
  var svgToCanvas: js.UndefOr[
    js.Function2[/* svg */ SVGElement, /* canvas */ HTMLCanvasElement, PromiseLike[Unit]]
  ] = js.undefined
}
object BaseWidgetExport {
  
  inline def apply(): BaseWidgetExport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseWidgetExport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseWidgetExport] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setFormats(value: js.Array[ExportFormat]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
    
    inline def setFormatsVarargs(value: ExportFormat*): Self = StObject.set(x, "formats", js.Array(value*))
    
    inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setPrintingEnabled(value: Boolean): Self = StObject.set(x, "printingEnabled", value.asInstanceOf[js.Any])
    
    inline def setPrintingEnabledUndefined: Self = StObject.set(x, "printingEnabled", js.undefined)
    
    inline def setProxyUrl(value: String): Self = StObject.set(x, "proxyUrl", value.asInstanceOf[js.Any])
    
    inline def setProxyUrlUndefined: Self = StObject.set(x, "proxyUrl", js.undefined)
    
    inline def setSvgToCanvas(value: (/* svg */ SVGElement, /* canvas */ HTMLCanvasElement) => PromiseLike[Unit]): Self = StObject.set(x, "svgToCanvas", js.Any.fromFunction2(value))
    
    inline def setSvgToCanvasUndefined: Self = StObject.set(x, "svgToCanvas", js.undefined)
  }
}
