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
    val __obj = js.Dynamic.literal(filename = filename, stream = stream, useSharedStrings = useSharedStrings, useStyles = useStyles, zip = zip)
  
    __obj.asInstanceOf[WorkbookStreamWriterOptions]
  }
}

