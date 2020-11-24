package typings.exceljs.mod.stream.xlsx

import typings.exceljs.anon.PartialArchiverZipOptions
import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookStreamWriterOptions extends WorkbookWriterOptions {
  
  /**
  			 * Specifies whether to add style information to the workbook.
  			 * Styles can add some performance overhead. Default is false
  			 */
  var zip: PartialArchiverZipOptions = js.native
}
object WorkbookStreamWriterOptions {
  
  @scala.inline
  def apply(
    filename: String,
    stream: Stream,
    useSharedStrings: Boolean,
    useStyles: Boolean,
    zip: PartialArchiverZipOptions
  ): WorkbookStreamWriterOptions = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], useSharedStrings = useSharedStrings.asInstanceOf[js.Any], useStyles = useStyles.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookStreamWriterOptions]
  }
  
  @scala.inline
  implicit class WorkbookStreamWriterOptionsOps[Self <: WorkbookStreamWriterOptions] (val x: Self) extends AnyVal {
    
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
    def setZip(value: PartialArchiverZipOptions): Self = this.set("zip", value.asInstanceOf[js.Any])
  }
}
