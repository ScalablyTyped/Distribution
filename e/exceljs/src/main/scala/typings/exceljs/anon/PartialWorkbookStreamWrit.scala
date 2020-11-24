package typings.exceljs.anon

import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.stream.xlsx.WorkbookStreamWriterOptions> */
@js.native
trait PartialWorkbookStreamWrit extends js.Object {
  
  var filename: js.UndefOr[String] = js.native
  
  var stream: js.UndefOr[Stream] = js.native
  
  var useSharedStrings: js.UndefOr[Boolean] = js.native
  
  var useStyles: js.UndefOr[Boolean] = js.native
  
  var zip: js.UndefOr[PartialArchiverZipOptions] = js.native
}
object PartialWorkbookStreamWrit {
  
  @scala.inline
  def apply(): PartialWorkbookStreamWrit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialWorkbookStreamWrit]
  }
  
  @scala.inline
  implicit class PartialWorkbookStreamWritOps[Self <: PartialWorkbookStreamWrit] (val x: Self) extends AnyVal {
    
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
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setStream(value: Stream): Self = this.set("stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
    
    @scala.inline
    def setUseSharedStrings(value: Boolean): Self = this.set("useSharedStrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseSharedStrings: Self = this.set("useSharedStrings", js.undefined)
    
    @scala.inline
    def setUseStyles(value: Boolean): Self = this.set("useStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseStyles: Self = this.set("useStyles", js.undefined)
    
    @scala.inline
    def setZip(value: PartialArchiverZipOptions): Self = this.set("zip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZip: Self = this.set("zip", js.undefined)
  }
}
