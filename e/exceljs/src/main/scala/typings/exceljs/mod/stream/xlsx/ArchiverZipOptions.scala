package typings.exceljs.mod.stream.xlsx

import typings.exceljs.PartialZlibOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArchiverZipOptions extends js.Object {
  var comment: String
  var forceLocalTime: Boolean
  var forceZip64: Boolean
  var store: Boolean
  var zlib: PartialZlibOptions
}

object ArchiverZipOptions {
  @scala.inline
  def apply(
    comment: String,
    forceLocalTime: Boolean,
    forceZip64: Boolean,
    store: Boolean,
    zlib: PartialZlibOptions
  ): ArchiverZipOptions = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], forceLocalTime = forceLocalTime.asInstanceOf[js.Any], forceZip64 = forceZip64.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], zlib = zlib.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArchiverZipOptions]
  }
}

