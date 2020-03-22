package typings.exceljs

import typings.exceljs.exceljsStrings.DEFLATE
import typings.exceljs.exceljsStrings.STORE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.JSZipGeneratorOptions> */
trait PartialJSZipGeneratorOpti extends js.Object {
  var compression: js.UndefOr[STORE | DEFLATE] = js.undefined
  var compressionOptions: js.UndefOr[AnonLevel] = js.undefined
}

object PartialJSZipGeneratorOpti {
  @scala.inline
  def apply(compression: STORE | DEFLATE = null, compressionOptions: AnonLevel = null): PartialJSZipGeneratorOpti = {
    val __obj = js.Dynamic.literal()
    if (compression != null) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (compressionOptions != null) __obj.updateDynamic("compressionOptions")(compressionOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialJSZipGeneratorOpti]
  }
}

