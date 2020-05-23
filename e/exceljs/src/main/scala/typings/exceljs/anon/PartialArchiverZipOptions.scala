package typings.exceljs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.stream.xlsx.ArchiverZipOptions> */
trait PartialArchiverZipOptions extends js.Object {
  var comment: js.UndefOr[String] = js.undefined
  var forceLocalTime: js.UndefOr[Boolean] = js.undefined
  var forceZip64: js.UndefOr[Boolean] = js.undefined
  var store: js.UndefOr[Boolean] = js.undefined
  var zlib: js.UndefOr[PartialZlibOptions] = js.undefined
}

object PartialArchiverZipOptions {
  @scala.inline
  def apply(
    comment: String = null,
    forceLocalTime: js.UndefOr[Boolean] = js.undefined,
    forceZip64: js.UndefOr[Boolean] = js.undefined,
    store: js.UndefOr[Boolean] = js.undefined,
    zlib: PartialZlibOptions = null
  ): PartialArchiverZipOptions = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (!js.isUndefined(forceLocalTime)) __obj.updateDynamic("forceLocalTime")(forceLocalTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceZip64)) __obj.updateDynamic("forceZip64")(forceZip64.get.asInstanceOf[js.Any])
    if (!js.isUndefined(store)) __obj.updateDynamic("store")(store.get.asInstanceOf[js.Any])
    if (zlib != null) __obj.updateDynamic("zlib")(zlib.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialArchiverZipOptions]
  }
}

