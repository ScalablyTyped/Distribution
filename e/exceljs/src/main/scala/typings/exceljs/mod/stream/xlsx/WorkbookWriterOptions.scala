package typings.exceljs.mod.stream.xlsx

import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookWriterOptions extends js.Object {
  /**
  			 * 	If stream not specified, this field specifies the path to a file to write the XLSX workbook to.
  			 */
  var filename: String
  /**
  			 * Specifies a writable stream to write the XLSX workbook to.
  			 */
  var stream: Stream
  /**
  			 * 	Specifies whether to use shared strings in the workbook. Default is false
  			 */
  var useSharedStrings: Boolean
  /**
  			 * Specifies whether to add style information to the workbook.
  			 * Styles can add some performance overhead. Default is false
  			 */
  var useStyles: Boolean
}

object WorkbookWriterOptions {
  @scala.inline
  def apply(filename: String, stream: Stream, useSharedStrings: Boolean, useStyles: Boolean): WorkbookWriterOptions = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], useSharedStrings = useSharedStrings.asInstanceOf[js.Any], useStyles = useStyles.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorkbookWriterOptions]
  }
}

