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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileName extends StObject {
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var fileName: js.UndefOr[String] = js.native
  
  var format: js.UndefOr[GIF | JPEG | PDF | PNG | SVG] = js.native
  
  var gridLayout: js.UndefOr[Boolean] = js.native
  
  var horizontalAlignment: js.UndefOr[center | left | right] = js.native
  
  var margin: js.UndefOr[Double] = js.native
  
  var onExported: js.UndefOr[js.Function] = js.native
  
  var onExporting: js.UndefOr[js.Function] = js.native
  
  var onFileSaving: js.UndefOr[js.Function] = js.native
  
  var proxyUrl: js.UndefOr[String] = js.native
  
  var svgToCanvas: js.UndefOr[js.Function] = js.native
  
  var verticalAlignment: js.UndefOr[bottom | center | top] = js.native
}
object FileName {
  
  @scala.inline
  def apply(): FileName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileName]
  }
  
  @scala.inline
  implicit class FileNameMutableBuilder[Self <: FileName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    @scala.inline
    def setFormat(value: GIF | JPEG | PDF | PNG | SVG): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setGridLayout(value: Boolean): Self = StObject.set(x, "gridLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridLayoutUndefined: Self = StObject.set(x, "gridLayout", js.undefined)
    
    @scala.inline
    def setHorizontalAlignment(value: center | left | right): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    @scala.inline
    def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setOnExported(value: js.Function): Self = StObject.set(x, "onExported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnExportedUndefined: Self = StObject.set(x, "onExported", js.undefined)
    
    @scala.inline
    def setOnExporting(value: js.Function): Self = StObject.set(x, "onExporting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnExportingUndefined: Self = StObject.set(x, "onExporting", js.undefined)
    
    @scala.inline
    def setOnFileSaving(value: js.Function): Self = StObject.set(x, "onFileSaving", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFileSavingUndefined: Self = StObject.set(x, "onFileSaving", js.undefined)
    
    @scala.inline
    def setProxyUrl(value: String): Self = StObject.set(x, "proxyUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyUrlUndefined: Self = StObject.set(x, "proxyUrl", js.undefined)
    
    @scala.inline
    def setSvgToCanvas(value: js.Function): Self = StObject.set(x, "svgToCanvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgToCanvasUndefined: Self = StObject.set(x, "svgToCanvas", js.undefined)
    
    @scala.inline
    def setVerticalAlignment(value: bottom | center | top): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
  }
}
