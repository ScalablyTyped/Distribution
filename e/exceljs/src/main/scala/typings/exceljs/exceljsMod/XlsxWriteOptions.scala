package typings.exceljs.exceljsMod

import typings.exceljs.exceljsMod.stream.xlsx.WorkbookWriterOptions
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XlsxWriteOptions extends WorkbookWriterOptions {
  /**
  	 * The option passed to JsZip#generateAsync(options)
  	 */
  var zip: Partial[JSZipGeneratorOptions]
}

object XlsxWriteOptions {
  @scala.inline
  def apply(
    filename: String,
    stream: Stream,
    useSharedStrings: Boolean,
    useStyles: Boolean,
    zip: Partial[JSZipGeneratorOptions]
  ): XlsxWriteOptions = {
    val __obj = js.Dynamic.literal(filename = filename, stream = stream, useSharedStrings = useSharedStrings, useStyles = useStyles, zip = zip)
  
    __obj.asInstanceOf[XlsxWriteOptions]
  }
}

