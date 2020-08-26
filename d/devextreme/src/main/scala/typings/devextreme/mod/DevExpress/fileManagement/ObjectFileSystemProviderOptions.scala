package typings.devextreme.mod.DevExpress.fileManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectFileSystemProviderOptions extends FileSystemProviderBaseOptions[ObjectFileSystemProvider] {
  /** @name ObjectFileSystemProvider.Options.contentExpr */
  var contentExpr: js.UndefOr[String | js.Function] = js.native
  /** @name ObjectFileSystemProvider.Options.data */
  var data: js.UndefOr[js.Array[_]] = js.native
  /** @name ObjectFileSystemProvider.Options.itemsExpr */
  var itemsExpr: js.UndefOr[String | js.Function] = js.native
}

object ObjectFileSystemProviderOptions {
  @scala.inline
  def apply(): ObjectFileSystemProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectFileSystemProviderOptions]
  }
  @scala.inline
  implicit class ObjectFileSystemProviderOptionsOps[Self <: ObjectFileSystemProviderOptions] (val x: Self) extends AnyVal {
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
    def setContentExpr(value: String | js.Function): Self = this.set("contentExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentExpr: Self = this.set("contentExpr", js.undefined)
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setItemsExpr(value: String | js.Function): Self = this.set("itemsExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemsExpr: Self = this.set("itemsExpr", js.undefined)
  }
  
}

