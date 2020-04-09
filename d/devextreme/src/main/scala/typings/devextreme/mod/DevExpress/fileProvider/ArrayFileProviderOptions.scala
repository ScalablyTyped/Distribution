package typings.devextreme.mod.DevExpress.fileProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayFileProviderOptions extends FileProviderOptions[ArrayFileProvider] {
  /** @name ArrayFileProvider.Options.data */
  var data: js.UndefOr[js.Array[_]] = js.undefined
  /** @name ArrayFileProvider.Options.itemsExpr */
  var itemsExpr: js.UndefOr[String | js.Function] = js.undefined
}

object ArrayFileProviderOptions {
  @scala.inline
  def apply(
    data: js.Array[_] = null,
    dateModifiedExpr: String | js.Function = null,
    isDirectoryExpr: String | js.Function = null,
    itemsExpr: String | js.Function = null,
    keyExpr: String | js.Function = null,
    nameExpr: String | js.Function = null,
    sizeExpr: String | js.Function = null,
    thumbnailExpr: String | js.Function = null
  ): ArrayFileProviderOptions = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dateModifiedExpr != null) __obj.updateDynamic("dateModifiedExpr")(dateModifiedExpr.asInstanceOf[js.Any])
    if (isDirectoryExpr != null) __obj.updateDynamic("isDirectoryExpr")(isDirectoryExpr.asInstanceOf[js.Any])
    if (itemsExpr != null) __obj.updateDynamic("itemsExpr")(itemsExpr.asInstanceOf[js.Any])
    if (keyExpr != null) __obj.updateDynamic("keyExpr")(keyExpr.asInstanceOf[js.Any])
    if (nameExpr != null) __obj.updateDynamic("nameExpr")(nameExpr.asInstanceOf[js.Any])
    if (sizeExpr != null) __obj.updateDynamic("sizeExpr")(sizeExpr.asInstanceOf[js.Any])
    if (thumbnailExpr != null) __obj.updateDynamic("thumbnailExpr")(thumbnailExpr.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayFileProviderOptions]
  }
}

