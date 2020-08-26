package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.ColumnComponent
import typings.devextreme.anon.ColumnComponentRow
import typings.devextreme.anon.RowType
import typings.devextreme.devextremeStrings.cancel
import typings.devextreme.devextremeStrings.delete
import typings.devextreme.devextremeStrings.edit
import typings.devextreme.devextremeStrings.save
import typings.devextreme.devextremeStrings.undelete
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxDataGridColumnButton extends GridBaseColumnButton {
  /** @name dxDataGridColumnButton.name */
  var name: js.UndefOr[cancel | delete | edit | save | undelete | String] = js.native
  /** @name dxDataGridColumnButton.onClick */
  var onClick: js.UndefOr[(js.Function1[/* e */ ColumnComponent, _]) | String] = js.native
  /** @name dxDataGridColumnButton.template */
  var template: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* cellElement */ dxElement, /* cellInfo */ RowType, String | Element | JQuery])
  ] = js.native
  /** @name dxDataGridColumnButton.visible */
  var visible: js.UndefOr[Boolean | (js.Function1[/* options */ ColumnComponentRow, Boolean])] = js.native
}

object dxDataGridColumnButton {
  @scala.inline
  def apply(): dxDataGridColumnButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDataGridColumnButton]
  }
  @scala.inline
  implicit class dxDataGridColumnButtonOps[Self <: dxDataGridColumnButton] (val x: Self) extends AnyVal {
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
    def setName(value: cancel | delete | edit | save | undelete | String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnClickFunction1(value: /* e */ ColumnComponent => _): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def setOnClick(value: (js.Function1[/* e */ ColumnComponent, _]) | String): Self = this.set("onClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setTemplateFunction2(value: (/* cellElement */ dxElement, /* cellInfo */ RowType) => String | Element | JQuery): Self = this.set("template", js.Any.fromFunction2(value))
    @scala.inline
    def setTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* cellElement */ dxElement, /* cellInfo */ RowType, String | Element | JQuery])
    ): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setVisibleFunction1(value: /* options */ ColumnComponentRow => Boolean): Self = this.set("visible", js.Any.fromFunction1(value))
    @scala.inline
    def setVisible(value: Boolean | (js.Function1[/* options */ ColumnComponentRow, Boolean])): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

