package typings.devextreme.mod.DevExpress.fileProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxFileProviderOptions extends FileProviderOptions[AjaxFileProvider] {
  /** Specifies which data field provides information about nested files and directories. */
  var itemsExpr: js.UndefOr[String | js.Function] = js.undefined
  /** Specifies the URL used to load an array of JSON objects that represent files and directories. */
  var url: js.UndefOr[String] = js.undefined
}

object AjaxFileProviderOptions {
  @scala.inline
  def apply(
    dateModifiedExpr: String | js.Function = null,
    isDirectoryExpr: String | js.Function = null,
    itemsExpr: String | js.Function = null,
    keyExpr: String | js.Function = null,
    nameExpr: String | js.Function = null,
    sizeExpr: String | js.Function = null,
    thumbnailExpr: String | js.Function = null,
    url: String = null
  ): AjaxFileProviderOptions = {
    val __obj = js.Dynamic.literal()
    if (dateModifiedExpr != null) __obj.updateDynamic("dateModifiedExpr")(dateModifiedExpr.asInstanceOf[js.Any])
    if (isDirectoryExpr != null) __obj.updateDynamic("isDirectoryExpr")(isDirectoryExpr.asInstanceOf[js.Any])
    if (itemsExpr != null) __obj.updateDynamic("itemsExpr")(itemsExpr.asInstanceOf[js.Any])
    if (keyExpr != null) __obj.updateDynamic("keyExpr")(keyExpr.asInstanceOf[js.Any])
    if (nameExpr != null) __obj.updateDynamic("nameExpr")(nameExpr.asInstanceOf[js.Any])
    if (sizeExpr != null) __obj.updateDynamic("sizeExpr")(sizeExpr.asInstanceOf[js.Any])
    if (thumbnailExpr != null) __obj.updateDynamic("thumbnailExpr")(thumbnailExpr.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxFileProviderOptions]
  }
}

