package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentDeselectedRowKeys[T] extends js.Object {
  var component: js.UndefOr[T] = js.native
  var currentDeselectedRowKeys: js.UndefOr[js.Array[_]] = js.native
  var currentSelectedRowKeys: js.UndefOr[js.Array[_]] = js.native
  var element: js.UndefOr[dxElement] = js.native
  var model: js.UndefOr[js.Any] = js.native
  var selectedRowKeys: js.UndefOr[js.Array[_]] = js.native
  var selectedRowsData: js.UndefOr[js.Array[_]] = js.native
}

object CurrentDeselectedRowKeys {
  @scala.inline
  def apply[T](): CurrentDeselectedRowKeys[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentDeselectedRowKeys[T]]
  }
  @scala.inline
  implicit class CurrentDeselectedRowKeysOps[Self <: CurrentDeselectedRowKeys[_], T] (val x: Self with CurrentDeselectedRowKeys[T]) extends AnyVal {
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
    def setComponent(value: T): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setCurrentDeselectedRowKeysVarargs(value: js.Any*): Self = this.set("currentDeselectedRowKeys", js.Array(value :_*))
    @scala.inline
    def setCurrentDeselectedRowKeys(value: js.Array[_]): Self = this.set("currentDeselectedRowKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentDeselectedRowKeys: Self = this.set("currentDeselectedRowKeys", js.undefined)
    @scala.inline
    def setCurrentSelectedRowKeysVarargs(value: js.Any*): Self = this.set("currentSelectedRowKeys", js.Array(value :_*))
    @scala.inline
    def setCurrentSelectedRowKeys(value: js.Array[_]): Self = this.set("currentSelectedRowKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentSelectedRowKeys: Self = this.set("currentSelectedRowKeys", js.undefined)
    @scala.inline
    def setElement(value: dxElement): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setSelectedRowKeysVarargs(value: js.Any*): Self = this.set("selectedRowKeys", js.Array(value :_*))
    @scala.inline
    def setSelectedRowKeys(value: js.Array[_]): Self = this.set("selectedRowKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedRowKeys: Self = this.set("selectedRowKeys", js.undefined)
    @scala.inline
    def setSelectedRowsDataVarargs(value: js.Any*): Self = this.set("selectedRowsData", js.Array(value :_*))
    @scala.inline
    def setSelectedRowsData(value: js.Array[_]): Self = this.set("selectedRowsData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedRowsData: Self = this.set("selectedRowsData", js.undefined)
  }
  
}

