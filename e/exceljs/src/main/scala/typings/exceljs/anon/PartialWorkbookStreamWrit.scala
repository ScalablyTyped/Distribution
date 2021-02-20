package typings.exceljs.anon

import typings.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.stream.xlsx.WorkbookStreamWriterOptions> */
@js.native
trait PartialWorkbookStreamWrit extends StObject {
  
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
  implicit class PartialWorkbookStreamWritMutableBuilder[Self <: PartialWorkbookStreamWrit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    @scala.inline
    def setStream(value: Stream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    
    @scala.inline
    def setUseSharedStrings(value: Boolean): Self = StObject.set(x, "useSharedStrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseSharedStringsUndefined: Self = StObject.set(x, "useSharedStrings", js.undefined)
    
    @scala.inline
    def setUseStyles(value: Boolean): Self = StObject.set(x, "useStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseStylesUndefined: Self = StObject.set(x, "useStyles", js.undefined)
    
    @scala.inline
    def setZip(value: PartialArchiverZipOptions): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZipUndefined: Self = StObject.set(x, "zip", js.undefined)
  }
}
