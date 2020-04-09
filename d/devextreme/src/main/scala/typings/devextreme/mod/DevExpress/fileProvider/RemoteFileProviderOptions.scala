package typings.devextreme.mod.DevExpress.fileProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteFileProviderOptions extends FileProviderOptions[RemoteFileProvider] {
  /** @name RemoteFileProvider.Options.endpointUrl */
  var endpointUrl: js.UndefOr[String] = js.undefined
  /** @name RemoteFileProvider.Options.hasSubDirectoriesExpr */
  var hasSubDirectoriesExpr: js.UndefOr[String | js.Function] = js.undefined
}

object RemoteFileProviderOptions {
  @scala.inline
  def apply(
    dateModifiedExpr: String | js.Function = null,
    endpointUrl: String = null,
    hasSubDirectoriesExpr: String | js.Function = null,
    isDirectoryExpr: String | js.Function = null,
    keyExpr: String | js.Function = null,
    nameExpr: String | js.Function = null,
    sizeExpr: String | js.Function = null,
    thumbnailExpr: String | js.Function = null
  ): RemoteFileProviderOptions = {
    val __obj = js.Dynamic.literal()
    if (dateModifiedExpr != null) __obj.updateDynamic("dateModifiedExpr")(dateModifiedExpr.asInstanceOf[js.Any])
    if (endpointUrl != null) __obj.updateDynamic("endpointUrl")(endpointUrl.asInstanceOf[js.Any])
    if (hasSubDirectoriesExpr != null) __obj.updateDynamic("hasSubDirectoriesExpr")(hasSubDirectoriesExpr.asInstanceOf[js.Any])
    if (isDirectoryExpr != null) __obj.updateDynamic("isDirectoryExpr")(isDirectoryExpr.asInstanceOf[js.Any])
    if (keyExpr != null) __obj.updateDynamic("keyExpr")(keyExpr.asInstanceOf[js.Any])
    if (nameExpr != null) __obj.updateDynamic("nameExpr")(nameExpr.asInstanceOf[js.Any])
    if (sizeExpr != null) __obj.updateDynamic("sizeExpr")(sizeExpr.asInstanceOf[js.Any])
    if (thumbnailExpr != null) __obj.updateDynamic("thumbnailExpr")(thumbnailExpr.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteFileProviderOptions]
  }
}

