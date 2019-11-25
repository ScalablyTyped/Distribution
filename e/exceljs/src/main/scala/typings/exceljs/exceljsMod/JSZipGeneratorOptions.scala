package typings.exceljs.exceljsMod

import typings.exceljs.Anon_Level
import typings.exceljs.exceljsStrings.DEFLATE
import typings.exceljs.exceljsStrings.STORE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSZipGeneratorOptions extends js.Object {
  /**
  	 * @default DEFLATE
  	 */
  var compression: STORE | DEFLATE
  var compressionOptions: Null | Anon_Level
}

object JSZipGeneratorOptions {
  @scala.inline
  def apply(compression: STORE | DEFLATE, compressionOptions: Anon_Level = null): JSZipGeneratorOptions = {
    val __obj = js.Dynamic.literal(compression = compression.asInstanceOf[js.Any])
    if (compressionOptions != null) __obj.updateDynamic("compressionOptions")(compressionOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSZipGeneratorOptions]
  }
}

