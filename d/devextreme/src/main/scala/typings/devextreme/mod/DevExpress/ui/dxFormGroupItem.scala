package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.FormData
import typings.devextreme.devextremeStrings.button
import typings.devextreme.devextremeStrings.empty
import typings.devextreme.devextremeStrings.group
import typings.devextreme.devextremeStrings.simple
import typings.devextreme.devextremeStrings.tabbed
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxFormGroupItem extends js.Object {
  /** @name dxFormGroupItem.alignItemLabels */
  var alignItemLabels: js.UndefOr[Boolean] = js.native
  /** @name dxFormGroupItem.caption */
  var caption: js.UndefOr[String] = js.native
  /** @name dxFormGroupItem.colCount */
  var colCount: js.UndefOr[Double] = js.native
  /** @name dxFormGroupItem.colCountByScreen */
  var colCountByScreen: js.UndefOr[js.Any] = js.native
  /** @name dxFormGroupItem.colSpan */
  var colSpan: js.UndefOr[Double] = js.native
  /** @name dxFormGroupItem.cssClass */
  var cssClass: js.UndefOr[String] = js.native
  /** @name dxFormGroupItem.itemType */
  var itemType: js.UndefOr[empty | group | simple | tabbed | button] = js.native
  /** @name dxFormGroupItem.items */
  var items: js.UndefOr[
    js.Array[
      dxFormSimpleItem | dxFormGroupItem | dxFormTabbedItem | dxFormEmptyItem | dxFormButtonItem
    ]
  ] = js.native
  /** @name dxFormGroupItem.name */
  var name: js.UndefOr[String] = js.native
  /** @name dxFormGroupItem.template */
  var template: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* data */ FormData, /* itemElement */ dxElement, String | Element | JQuery])
  ] = js.native
  /** @name dxFormGroupItem.visible */
  var visible: js.UndefOr[Boolean] = js.native
  /** @name dxFormGroupItem.visibleIndex */
  var visibleIndex: js.UndefOr[Double] = js.native
}

object dxFormGroupItem {
  @scala.inline
  def apply(): dxFormGroupItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFormGroupItem]
  }
  @scala.inline
  implicit class dxFormGroupItemOps[Self <: dxFormGroupItem] (val x: Self) extends AnyVal {
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
    def setAlignItemLabels(value: Boolean): Self = this.set("alignItemLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignItemLabels: Self = this.set("alignItemLabels", js.undefined)
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    @scala.inline
    def setColCount(value: Double): Self = this.set("colCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColCount: Self = this.set("colCount", js.undefined)
    @scala.inline
    def setColCountByScreen(value: js.Any): Self = this.set("colCountByScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColCountByScreen: Self = this.set("colCountByScreen", js.undefined)
    @scala.inline
    def setColSpan(value: Double): Self = this.set("colSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColSpan: Self = this.set("colSpan", js.undefined)
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setItemType(value: empty | group | simple | tabbed | button): Self = this.set("itemType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemType: Self = this.set("itemType", js.undefined)
    @scala.inline
    def setItemsVarargs(
      value: (dxFormSimpleItem | dxFormGroupItem | dxFormTabbedItem | dxFormEmptyItem | dxFormButtonItem)*
    ): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(
      value: js.Array[
          dxFormSimpleItem | dxFormGroupItem | dxFormTabbedItem | dxFormEmptyItem | dxFormButtonItem
        ]
    ): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTemplateFunction2(value: (/* data */ FormData, /* itemElement */ dxElement) => String | Element | JQuery): Self = this.set("template", js.Any.fromFunction2(value))
    @scala.inline
    def setTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* data */ FormData, /* itemElement */ dxElement, String | Element | JQuery])
    ): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setVisibleIndex(value: Double): Self = this.set("visibleIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibleIndex: Self = this.set("visibleIndex", js.undefined)
  }
  
}

