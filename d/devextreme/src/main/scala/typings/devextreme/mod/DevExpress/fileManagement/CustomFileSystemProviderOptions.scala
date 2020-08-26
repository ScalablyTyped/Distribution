package typings.devextreme.mod.DevExpress.fileManagement

import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomFileSystemProviderOptions extends FileSystemProviderBaseOptions[CustomFileSystemProvider] {
  /** @name CustomFileSystemProvider.Options.abortFileUpload */
  var abortFileUpload: js.UndefOr[
    js.Function3[
      /* file */ File, 
      /* uploadInfo */ UploadInfo, 
      /* destinationDirectory */ FileSystemItem, 
      Promise[_] | JQueryPromise[_] | _
    ]
  ] = js.native
  /** @name CustomFileSystemProvider.Options.copyItem */
  var copyItem: js.UndefOr[
    js.Function2[
      /* item */ FileSystemItem, 
      /* destinationDirectory */ FileSystemItem, 
      Promise[_] | JQueryPromise[_] | _
    ]
  ] = js.native
  /** @name CustomFileSystemProvider.Options.createDirectory */
  var createDirectory: js.UndefOr[
    js.Function2[
      /* parentDirectory */ FileSystemItem, 
      /* name */ String, 
      Promise[_] | JQueryPromise[_] | _
    ]
  ] = js.native
  /** @name CustomFileSystemProvider.Options.deleteItem */
  var deleteItem: js.UndefOr[js.Function1[/* item */ FileSystemItem, Promise[_] | JQueryPromise[_] | _]] = js.native
  /** @name CustomFileSystemProvider.Options.downloadItems */
  var downloadItems: js.UndefOr[js.Function1[/* items */ js.Array[FileSystemItem], _]] = js.native
  /** @name CustomFileSystemProvider.Options.getItems */
  var getItems: js.UndefOr[
    js.Function1[
      /* parentDirectory */ FileSystemItem, 
      Promise[js.Array[_]] | JQueryPromise[js.Array[_]] | js.Array[_]
    ]
  ] = js.native
  /** @name CustomFileSystemProvider.Options.getItemsContent */
  var getItemsContent: js.UndefOr[
    js.Function1[/* items */ js.Array[FileSystemItem], Promise[_] | JQueryPromise[_] | _]
  ] = js.native
  /** @name CustomFileSystemProvider.Options.hasSubDirectoriesExpr */
  var hasSubDirectoriesExpr: js.UndefOr[String | js.Function] = js.native
  /** @name CustomFileSystemProvider.Options.moveItem */
  var moveItem: js.UndefOr[
    js.Function2[
      /* item */ FileSystemItem, 
      /* destinationDirectory */ FileSystemItem, 
      Promise[_] | JQueryPromise[_] | _
    ]
  ] = js.native
  /** @name CustomFileSystemProvider.Options.renameItem */
  var renameItem: js.UndefOr[
    js.Function2[/* item */ FileSystemItem, /* newName */ String, Promise[_] | JQueryPromise[_] | _]
  ] = js.native
  /** @name CustomFileSystemProvider.Options.uploadFileChunk */
  var uploadFileChunk: js.UndefOr[
    js.Function3[
      /* file */ File, 
      /* uploadInfo */ UploadInfo, 
      /* destinationDirectory */ FileSystemItem, 
      Promise[_] | JQueryPromise[_] | _
    ]
  ] = js.native
}

object CustomFileSystemProviderOptions {
  @scala.inline
  def apply(): CustomFileSystemProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomFileSystemProviderOptions]
  }
  @scala.inline
  implicit class CustomFileSystemProviderOptionsOps[Self <: CustomFileSystemProviderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAbortFileUpload(
      value: (/* file */ File, /* uploadInfo */ UploadInfo, /* destinationDirectory */ FileSystemItem) => Promise[_] | JQueryPromise[_] | _
    ): Self = this.set("abortFileUpload", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAbortFileUpload: Self = this.set("abortFileUpload", js.undefined)
    @scala.inline
    def setCopyItem(
      value: (/* item */ FileSystemItem, /* destinationDirectory */ FileSystemItem) => Promise[_] | JQueryPromise[_] | _
    ): Self = this.set("copyItem", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCopyItem: Self = this.set("copyItem", js.undefined)
    @scala.inline
    def setCreateDirectory(
      value: (/* parentDirectory */ FileSystemItem, /* name */ String) => Promise[_] | JQueryPromise[_] | _
    ): Self = this.set("createDirectory", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCreateDirectory: Self = this.set("createDirectory", js.undefined)
    @scala.inline
    def setDeleteItem(value: /* item */ FileSystemItem => Promise[_] | JQueryPromise[_] | _): Self = this.set("deleteItem", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDeleteItem: Self = this.set("deleteItem", js.undefined)
    @scala.inline
    def setDownloadItems(value: /* items */ js.Array[FileSystemItem] => _): Self = this.set("downloadItems", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDownloadItems: Self = this.set("downloadItems", js.undefined)
    @scala.inline
    def setGetItems(
      value: /* parentDirectory */ FileSystemItem => Promise[js.Array[_]] | JQueryPromise[js.Array[_]] | js.Array[_]
    ): Self = this.set("getItems", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetItems: Self = this.set("getItems", js.undefined)
    @scala.inline
    def setGetItemsContent(value: /* items */ js.Array[FileSystemItem] => Promise[_] | JQueryPromise[_] | _): Self = this.set("getItemsContent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetItemsContent: Self = this.set("getItemsContent", js.undefined)
    @scala.inline
    def setHasSubDirectoriesExpr(value: String | js.Function): Self = this.set("hasSubDirectoriesExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasSubDirectoriesExpr: Self = this.set("hasSubDirectoriesExpr", js.undefined)
    @scala.inline
    def setMoveItem(
      value: (/* item */ FileSystemItem, /* destinationDirectory */ FileSystemItem) => Promise[_] | JQueryPromise[_] | _
    ): Self = this.set("moveItem", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMoveItem: Self = this.set("moveItem", js.undefined)
    @scala.inline
    def setRenameItem(value: (/* item */ FileSystemItem, /* newName */ String) => Promise[_] | JQueryPromise[_] | _): Self = this.set("renameItem", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRenameItem: Self = this.set("renameItem", js.undefined)
    @scala.inline
    def setUploadFileChunk(
      value: (/* file */ File, /* uploadInfo */ UploadInfo, /* destinationDirectory */ FileSystemItem) => Promise[_] | JQueryPromise[_] | _
    ): Self = this.set("uploadFileChunk", js.Any.fromFunction3(value))
    @scala.inline
    def deleteUploadFileChunk: Self = this.set("uploadFileChunk", js.undefined)
  }
  
}

