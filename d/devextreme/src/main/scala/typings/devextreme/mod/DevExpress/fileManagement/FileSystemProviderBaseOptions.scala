package typings.devextreme.mod.DevExpress.fileManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSystemProviderBaseOptions[T] extends js.Object {
  /** @name FileSystemProviderBase.Options.dateModifiedExpr */
  var dateModifiedExpr: js.UndefOr[String | js.Function] = js.native
  /** @name FileSystemProviderBase.Options.isDirectoryExpr */
  var isDirectoryExpr: js.UndefOr[String | js.Function] = js.native
  /** @name FileSystemProviderBase.Options.keyExpr */
  var keyExpr: js.UndefOr[String | js.Function] = js.native
  /** @name FileSystemProviderBase.Options.nameExpr */
  var nameExpr: js.UndefOr[String | js.Function] = js.native
  /** @name FileSystemProviderBase.Options.sizeExpr */
  var sizeExpr: js.UndefOr[String | js.Function] = js.native
  /** @name FileSystemProviderBase.Options.thumbnailExpr */
  var thumbnailExpr: js.UndefOr[String | js.Function] = js.native
}

object FileSystemProviderBaseOptions {
  @scala.inline
  def apply[T](): FileSystemProviderBaseOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystemProviderBaseOptions[T]]
  }
  @scala.inline
  implicit class FileSystemProviderBaseOptionsOps[Self <: FileSystemProviderBaseOptions[_], T] (val x: Self with FileSystemProviderBaseOptions[T]) extends AnyVal {
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
    def setDateModifiedExpr(value: String | js.Function): Self = this.set("dateModifiedExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateModifiedExpr: Self = this.set("dateModifiedExpr", js.undefined)
    @scala.inline
    def setIsDirectoryExpr(value: String | js.Function): Self = this.set("isDirectoryExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDirectoryExpr: Self = this.set("isDirectoryExpr", js.undefined)
    @scala.inline
    def setKeyExpr(value: String | js.Function): Self = this.set("keyExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyExpr: Self = this.set("keyExpr", js.undefined)
    @scala.inline
    def setNameExpr(value: String | js.Function): Self = this.set("nameExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameExpr: Self = this.set("nameExpr", js.undefined)
    @scala.inline
    def setSizeExpr(value: String | js.Function): Self = this.set("sizeExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeExpr: Self = this.set("sizeExpr", js.undefined)
    @scala.inline
    def setThumbnailExpr(value: String | js.Function): Self = this.set("thumbnailExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnailExpr: Self = this.set("thumbnailExpr", js.undefined)
  }
  
}

