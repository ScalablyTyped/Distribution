package typings.devextreme.mod.DevExpress.fileProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileProviderOptions[T] extends js.Object {
  /** Specifies which data field provides timestamps that indicate when a file was last modified. */
  var dateModifiedExpr: js.UndefOr[String | js.Function] = js.undefined
  /** Specifies which data field provides information about whether a file system item is a directory. */
  var isDirectoryExpr: js.UndefOr[String | js.Function] = js.undefined
  /** Specifies the data field that provides keys. */
  var keyExpr: js.UndefOr[String | js.Function] = js.undefined
  /** Specifies which data field provides file and directory names. */
  var nameExpr: js.UndefOr[String | js.Function] = js.undefined
  /** Specifies which data field provides file sizes. */
  var sizeExpr: js.UndefOr[String | js.Function] = js.undefined
  /** Specifies which data field provides icons to be used as thumbnails. */
  var thumbnailExpr: js.UndefOr[String | js.Function] = js.undefined
}

object FileProviderOptions {
  @scala.inline
  def apply[T](
    dateModifiedExpr: String | js.Function = null,
    isDirectoryExpr: String | js.Function = null,
    keyExpr: String | js.Function = null,
    nameExpr: String | js.Function = null,
    sizeExpr: String | js.Function = null,
    thumbnailExpr: String | js.Function = null
  ): FileProviderOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (dateModifiedExpr != null) __obj.updateDynamic("dateModifiedExpr")(dateModifiedExpr.asInstanceOf[js.Any])
    if (isDirectoryExpr != null) __obj.updateDynamic("isDirectoryExpr")(isDirectoryExpr.asInstanceOf[js.Any])
    if (keyExpr != null) __obj.updateDynamic("keyExpr")(keyExpr.asInstanceOf[js.Any])
    if (nameExpr != null) __obj.updateDynamic("nameExpr")(nameExpr.asInstanceOf[js.Any])
    if (sizeExpr != null) __obj.updateDynamic("sizeExpr")(sizeExpr.asInstanceOf[js.Any])
    if (thumbnailExpr != null) __obj.updateDynamic("thumbnailExpr")(thumbnailExpr.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileProviderOptions[T]]
  }
}

