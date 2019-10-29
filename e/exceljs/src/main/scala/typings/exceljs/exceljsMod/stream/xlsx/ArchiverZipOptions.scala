package typings.exceljs.exceljsMod.stream.xlsx

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArchiverZipOptions extends js.Object {
  var comment: String
  var forceLocalTime: Boolean
  var forceZip64: Boolean
  var store: Boolean
  var zlib: Partial[ZlibOptions]
}

object ArchiverZipOptions {
  @scala.inline
  def apply(
    comment: String,
    forceLocalTime: Boolean,
    forceZip64: Boolean,
    store: Boolean,
    zlib: Partial[ZlibOptions]
  ): ArchiverZipOptions = {
    val __obj = js.Dynamic.literal(comment = comment, forceLocalTime = forceLocalTime, forceZip64 = forceZip64, store = store, zlib = zlib)
  
    __obj.asInstanceOf[ArchiverZipOptions]
  }
}

