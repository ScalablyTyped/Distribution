package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.common.ExportFormat
import typings.devextreme.mod.DevExpress.common.VerticalAlignment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileName extends StObject {
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var fileName: js.UndefOr[String] = js.undefined
  
  var format: js.UndefOr[ExportFormat] = js.undefined
  
  var gridLayout: js.UndefOr[Boolean] = js.undefined
  
  var horizontalAlignment: js.UndefOr[typings.devextreme.mod.DevExpress.common.HorizontalAlignment] = js.undefined
  
  var margin: js.UndefOr[Double] = js.undefined
  
  var onExported: js.UndefOr[js.Function] = js.undefined
  
  var onExporting: js.UndefOr[js.Function] = js.undefined
  
  var onFileSaving: js.UndefOr[js.Function] = js.undefined
  
  var svgToCanvas: js.UndefOr[js.Function] = js.undefined
  
  var verticalAlignment: js.UndefOr[VerticalAlignment] = js.undefined
}
object FileName {
  
  inline def apply(): FileName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileName] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setFormat(value: ExportFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setGridLayout(value: Boolean): Self = StObject.set(x, "gridLayout", value.asInstanceOf[js.Any])
    
    inline def setGridLayoutUndefined: Self = StObject.set(x, "gridLayout", js.undefined)
    
    inline def setHorizontalAlignment(value: typings.devextreme.mod.DevExpress.common.HorizontalAlignment): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setOnExported(value: js.Function): Self = StObject.set(x, "onExported", value.asInstanceOf[js.Any])
    
    inline def setOnExportedUndefined: Self = StObject.set(x, "onExported", js.undefined)
    
    inline def setOnExporting(value: js.Function): Self = StObject.set(x, "onExporting", value.asInstanceOf[js.Any])
    
    inline def setOnExportingUndefined: Self = StObject.set(x, "onExporting", js.undefined)
    
    inline def setOnFileSaving(value: js.Function): Self = StObject.set(x, "onFileSaving", value.asInstanceOf[js.Any])
    
    inline def setOnFileSavingUndefined: Self = StObject.set(x, "onFileSaving", js.undefined)
    
    inline def setSvgToCanvas(value: js.Function): Self = StObject.set(x, "svgToCanvas", value.asInstanceOf[js.Any])
    
    inline def setSvgToCanvasUndefined: Self = StObject.set(x, "svgToCanvas", js.undefined)
    
    inline def setVerticalAlignment(value: VerticalAlignment): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
  }
}
