package typings.devextreme.mod.DevExpress.fileProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomFileProviderOptions extends FileProviderOptions[CustomFileProvider] {
  /** @name CustomFileProvider.Options.abortFileUpload */
  var abortFileUpload: js.UndefOr[js.Function] = js.undefined
  /** @name CustomFileProvider.Options.copyItem */
  var copyItem: js.UndefOr[js.Function] = js.undefined
  /** @name CustomFileProvider.Options.createDirectory */
  var createDirectory: js.UndefOr[js.Function] = js.undefined
  /** @name CustomFileProvider.Options.deleteItem */
  var deleteItem: js.UndefOr[js.Function] = js.undefined
  /** @name CustomFileProvider.Options.downloadItems */
  var downloadItems: js.UndefOr[js.Function] = js.undefined
  /** @name CustomFileProvider.Options.getItems */
  var getItems: js.UndefOr[js.Function] = js.undefined
  /** @name CustomFileProvider.Options.getItemsContent */
  var getItemsContent: js.UndefOr[js.Function] = js.undefined
  /** @name CustomFileProvider.Options.hasSubDirectoriesExpr */
  var hasSubDirectoriesExpr: js.UndefOr[String | js.Function] = js.undefined
  /** @name CustomFileProvider.Options.moveItem */
  var moveItem: js.UndefOr[js.Function] = js.undefined
  /** @name CustomFileProvider.Options.renameItem */
  var renameItem: js.UndefOr[js.Function] = js.undefined
  /** @name CustomFileProvider.Options.uploadChunkSize */
  var uploadChunkSize: js.UndefOr[Double] = js.undefined
  /** @name CustomFileProvider.Options.uploadFileChunk */
  var uploadFileChunk: js.UndefOr[js.Function] = js.undefined
}

object CustomFileProviderOptions {
  @scala.inline
  def apply(
    abortFileUpload: js.Function = null,
    copyItem: js.Function = null,
    createDirectory: js.Function = null,
    dateModifiedExpr: String | js.Function = null,
    deleteItem: js.Function = null,
    downloadItems: js.Function = null,
    getItems: js.Function = null,
    getItemsContent: js.Function = null,
    hasSubDirectoriesExpr: String | js.Function = null,
    isDirectoryExpr: String | js.Function = null,
    keyExpr: String | js.Function = null,
    moveItem: js.Function = null,
    nameExpr: String | js.Function = null,
    renameItem: js.Function = null,
    sizeExpr: String | js.Function = null,
    thumbnailExpr: String | js.Function = null,
    uploadChunkSize: Int | Double = null,
    uploadFileChunk: js.Function = null
  ): CustomFileProviderOptions = {
    val __obj = js.Dynamic.literal()
    if (abortFileUpload != null) __obj.updateDynamic("abortFileUpload")(abortFileUpload.asInstanceOf[js.Any])
    if (copyItem != null) __obj.updateDynamic("copyItem")(copyItem.asInstanceOf[js.Any])
    if (createDirectory != null) __obj.updateDynamic("createDirectory")(createDirectory.asInstanceOf[js.Any])
    if (dateModifiedExpr != null) __obj.updateDynamic("dateModifiedExpr")(dateModifiedExpr.asInstanceOf[js.Any])
    if (deleteItem != null) __obj.updateDynamic("deleteItem")(deleteItem.asInstanceOf[js.Any])
    if (downloadItems != null) __obj.updateDynamic("downloadItems")(downloadItems.asInstanceOf[js.Any])
    if (getItems != null) __obj.updateDynamic("getItems")(getItems.asInstanceOf[js.Any])
    if (getItemsContent != null) __obj.updateDynamic("getItemsContent")(getItemsContent.asInstanceOf[js.Any])
    if (hasSubDirectoriesExpr != null) __obj.updateDynamic("hasSubDirectoriesExpr")(hasSubDirectoriesExpr.asInstanceOf[js.Any])
    if (isDirectoryExpr != null) __obj.updateDynamic("isDirectoryExpr")(isDirectoryExpr.asInstanceOf[js.Any])
    if (keyExpr != null) __obj.updateDynamic("keyExpr")(keyExpr.asInstanceOf[js.Any])
    if (moveItem != null) __obj.updateDynamic("moveItem")(moveItem.asInstanceOf[js.Any])
    if (nameExpr != null) __obj.updateDynamic("nameExpr")(nameExpr.asInstanceOf[js.Any])
    if (renameItem != null) __obj.updateDynamic("renameItem")(renameItem.asInstanceOf[js.Any])
    if (sizeExpr != null) __obj.updateDynamic("sizeExpr")(sizeExpr.asInstanceOf[js.Any])
    if (thumbnailExpr != null) __obj.updateDynamic("thumbnailExpr")(thumbnailExpr.asInstanceOf[js.Any])
    if (uploadChunkSize != null) __obj.updateDynamic("uploadChunkSize")(uploadChunkSize.asInstanceOf[js.Any])
    if (uploadFileChunk != null) __obj.updateDynamic("uploadFileChunk")(uploadFileChunk.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomFileProviderOptions]
  }
}

