package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /** to export any custom region of diagram.
    */
  var bounds: js.UndefOr[js.Any] = js.native
  
  /** name of the file to be downloaded.
    */
  var fileName: js.UndefOr[String] = js.native
  
  /** format of the exported file/data.
    */
  var format: js.UndefOr[FileFormats] = js.native
  
  /** to set margin to the exported data.
    */
  var margin: js.UndefOr[js.Any] = js.native
  
  /** to set whether to export diagram as a file or as raw data.
    */
  var mode: js.UndefOr[ExportModes] = js.native
  
  /** to export the diagram into multiple pages
    */
  var multiplePage: js.UndefOr[Boolean] = js.native
  
  /** to set the page height of the diagram while exporting the diagram into multiple pages.
    */
  var pageHeight: js.UndefOr[Double] = js.native
  
  /** to sets the orientation of the page.
    */
  var pageOrientation: js.UndefOr[PageOrientations] = js.native
  
  /** to set the page width of the diagram while exporting the diagram into multiple pages.
    */
  var pageWidth: js.UndefOr[Double] = js.native
  
  /** to set the region of the diagram to be exported.
    */
  var region: js.UndefOr[Region] = js.native
  
  /** to resize the diagram content to fill its allocated space.
    */
  var stretch: js.UndefOr[Stretch] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setBounds(value: js.Any): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    
    @scala.inline
    def setFormat(value: FileFormats): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setMargin(value: js.Any): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setMode(value: ExportModes): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setMultiplePage(value: Boolean): Self = this.set("multiplePage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiplePage: Self = this.set("multiplePage", js.undefined)
    
    @scala.inline
    def setPageHeight(value: Double): Self = this.set("pageHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageHeight: Self = this.set("pageHeight", js.undefined)
    
    @scala.inline
    def setPageOrientation(value: PageOrientations): Self = this.set("pageOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageOrientation: Self = this.set("pageOrientation", js.undefined)
    
    @scala.inline
    def setPageWidth(value: Double): Self = this.set("pageWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageWidth: Self = this.set("pageWidth", js.undefined)
    
    @scala.inline
    def setRegion(value: Region): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setStretch(value: Stretch): Self = this.set("stretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStretch: Self = this.set("stretch", js.undefined)
  }
}
