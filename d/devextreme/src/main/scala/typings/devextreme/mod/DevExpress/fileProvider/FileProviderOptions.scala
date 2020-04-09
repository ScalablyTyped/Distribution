package typings.devextreme.mod.DevExpress.fileProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileProviderOptions[T] extends js.Object {
  /** @name FileProvider.Options.dateModifiedExpr */
  var dateModifiedExpr: js.UndefOr[String | js.Function] = js.undefined
  /** @name FileProvider.Options.isDirectoryExpr */
  var isDirectoryExpr: js.UndefOr[String | js.Function] = js.undefined
  /** @name FileProvider.Options.keyExpr */
  var keyExpr: js.UndefOr[String | js.Function] = js.undefined
  /** @name FileProvider.Options.nameExpr */
  var nameExpr: js.UndefOr[String | js.Function] = js.undefined
  /** @name FileProvider.Options.sizeExpr */
  var sizeExpr: js.UndefOr[String | js.Function] = js.undefined
  /** @name FileProvider.Options.thumbnailExpr */
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

