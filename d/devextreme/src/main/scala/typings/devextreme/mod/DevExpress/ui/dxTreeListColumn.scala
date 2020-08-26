package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.ColumnColumnIndexComponent
import typings.devextreme.anon.DisplayValueOldValue
import typings.devextreme.anon.DisplayValueRow
import typings.devextreme.devextremeStrings.adaptive
import typings.devextreme.devextremeStrings.add
import typings.devextreme.devextremeStrings.buttons
import typings.devextreme.devextremeStrings.cancel
import typings.devextreme.devextremeStrings.delete
import typings.devextreme.devextremeStrings.drag
import typings.devextreme.devextremeStrings.edit
import typings.devextreme.devextremeStrings.save
import typings.devextreme.devextremeStrings.undelete
import typings.devextreme.mod.DevExpress.core.dxElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxTreeListColumn extends GridBaseColumn {
  /** @name dxTreeListColumn.buttons */
  var buttons: js.UndefOr[
    js.Array[add | cancel | delete | edit | save | undelete | dxTreeListColumnButton]
  ] = js.native
  /** @name dxTreeListColumn.cellTemplate */
  var cellTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* cellElement */ dxElement, /* cellInfo */ DisplayValueOldValue, _])
  ] = js.native
  /** @name dxTreeListColumn.columns */
  var columns: js.UndefOr[js.Array[dxTreeListColumn | String]] = js.native
  /** @name dxTreeListColumn.editCellTemplate */
  var editCellTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* cellElement */ dxElement, /* cellInfo */ DisplayValueRow, _])
  ] = js.native
  /** @name dxTreeListColumn.headerCellTemplate */
  var headerCellTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* columnHeader */ dxElement, /* headerInfo */ ColumnColumnIndexComponent, _])
  ] = js.native
  /** @name dxTreeListColumn.type */
  var `type`: js.UndefOr[adaptive | buttons | drag] = js.native
}

object dxTreeListColumn {
  @scala.inline
  def apply(): dxTreeListColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTreeListColumn]
  }
  @scala.inline
  implicit class dxTreeListColumnOps[Self <: dxTreeListColumn] (val x: Self) extends AnyVal {
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
    def setButtonsVarargs(value: (add | cancel | delete | edit | save | undelete | dxTreeListColumnButton)*): Self = this.set("buttons", js.Array(value :_*))
    @scala.inline
    def setButtons(value: js.Array[add | cancel | delete | edit | save | undelete | dxTreeListColumnButton]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    @scala.inline
    def setCellTemplateFunction2(value: (/* cellElement */ dxElement, /* cellInfo */ DisplayValueOldValue) => _): Self = this.set("cellTemplate", js.Any.fromFunction2(value))
    @scala.inline
    def setCellTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* cellElement */ dxElement, /* cellInfo */ DisplayValueOldValue, _])
    ): Self = this.set("cellTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellTemplate: Self = this.set("cellTemplate", js.undefined)
    @scala.inline
    def setColumnsVarargs(value: (dxTreeListColumn | String)*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[dxTreeListColumn | String]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setEditCellTemplateFunction2(value: (/* cellElement */ dxElement, /* cellInfo */ DisplayValueRow) => _): Self = this.set("editCellTemplate", js.Any.fromFunction2(value))
    @scala.inline
    def setEditCellTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* cellElement */ dxElement, /* cellInfo */ DisplayValueRow, _])
    ): Self = this.set("editCellTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditCellTemplate: Self = this.set("editCellTemplate", js.undefined)
    @scala.inline
    def setHeaderCellTemplateFunction2(value: (/* columnHeader */ dxElement, /* headerInfo */ ColumnColumnIndexComponent) => _): Self = this.set("headerCellTemplate", js.Any.fromFunction2(value))
    @scala.inline
    def setHeaderCellTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* columnHeader */ dxElement, /* headerInfo */ ColumnColumnIndexComponent, _])
    ): Self = this.set("headerCellTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderCellTemplate: Self = this.set("headerCellTemplate", js.undefined)
    @scala.inline
    def setType(value: adaptive | buttons | drag): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

