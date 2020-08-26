package typings.exceljs.mod.stream.xlsx

import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookWriterOptions extends js.Object {
  /**
  			 * 	If stream not specified, this field specifies the path to a file to write the XLSX workbook to.
  			 */
  var filename: String = js.native
  /**
  			 * Specifies a writable stream to write the XLSX workbook to.
  			 */
  var stream: Stream = js.native
  /**
  			 * 	Specifies whether to use shared strings in the workbook. Default is false
  			 */
  var useSharedStrings: Boolean = js.native
  /**
  			 * Specifies whether to add style information to the workbook.
  			 * Styles can add some performance overhead. Default is false
  			 */
  var useStyles: Boolean = js.native
}

object WorkbookWriterOptions {
  @scala.inline
  def apply(filename: String, stream: Stream, useSharedStrings: Boolean, useStyles: Boolean): WorkbookWriterOptions = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], useSharedStrings = useSharedStrings.asInstanceOf[js.Any], useStyles = useStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookWriterOptions]
  }
  @scala.inline
  implicit class WorkbookWriterOptionsOps[Self <: WorkbookWriterOptions] (val x: Self) extends AnyVal {
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
    def setStream(value: Stream): Self = this.set("stream", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseSharedStrings(value: Boolean): Self = this.set("useSharedStrings", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseStyles(value: Boolean): Self = this.set("useStyles", value.asInstanceOf[js.Any])
  }
  
}

