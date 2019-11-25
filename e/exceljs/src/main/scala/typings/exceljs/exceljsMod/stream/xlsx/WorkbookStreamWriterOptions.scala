package typings.exceljs.exceljsMod.stream.xlsx

import typings.exceljs.exceljsMod.Stream
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookStreamWriterOptions extends WorkbookWriterOptions {
  /**
    * Specifies whether to add style information to the workbook.
    * Styles can add some performance overhead. Default is false
    */
  var zip: Partial[ArchiverZipOptions]
}

object WorkbookStreamWriterOptions {
  @scala.inline
  def apply(
    filename: String,
    stream: Stream,
    useSharedStrings: Boolean,
    useStyles: Boolean,
    zip: Partial[ArchiverZipOptions]
  ): WorkbookStreamWriterOptions = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], useSharedStrings = useSharedStrings.asInstanceOf[js.Any], useStyles = useStyles.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorkbookStreamWriterOptions]
  }
}

