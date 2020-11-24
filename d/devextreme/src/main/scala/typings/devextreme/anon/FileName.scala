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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileName extends js.Object {
  
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
  implicit class FileNameOps[Self <: FileName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    
    @scala.inline
    def setFormat(value: GIF | JPEG | PDF | PNG | SVG): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setGridLayout(value: Boolean): Self = this.set("gridLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridLayout: Self = this.set("gridLayout", js.undefined)
    
    @scala.inline
    def setHorizontalAlignment(value: center | left | right): Self = this.set("horizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalAlignment: Self = this.set("horizontalAlignment", js.undefined)
    
    @scala.inline
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setOnExported(value: js.Function): Self = this.set("onExported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnExported: Self = this.set("onExported", js.undefined)
    
    @scala.inline
    def setOnExporting(value: js.Function): Self = this.set("onExporting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnExporting: Self = this.set("onExporting", js.undefined)
    
    @scala.inline
    def setOnFileSaving(value: js.Function): Self = this.set("onFileSaving", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnFileSaving: Self = this.set("onFileSaving", js.undefined)
    
    @scala.inline
    def setProxyUrl(value: String): Self = this.set("proxyUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxyUrl: Self = this.set("proxyUrl", js.undefined)
    
    @scala.inline
    def setSvgToCanvas(value: js.Function): Self = this.set("svgToCanvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSvgToCanvas: Self = this.set("svgToCanvas", js.undefined)
    
    @scala.inline
    def setVerticalAlignment(value: bottom | center | top): Self = this.set("verticalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalAlignment: Self = this.set("verticalAlignment", js.undefined)
  }
}
