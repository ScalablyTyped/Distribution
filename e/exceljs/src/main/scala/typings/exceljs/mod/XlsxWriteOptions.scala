package typings.exceljs.mod

import typings.exceljs.mod.stream.xlsx.WorkbookWriterOptions
import typings.node.streamMod.Stream
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
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], useSharedStrings = useSharedStrings.asInstanceOf[js.Any], useStyles = useStyles.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[XlsxWriteOptions]
  }
}

