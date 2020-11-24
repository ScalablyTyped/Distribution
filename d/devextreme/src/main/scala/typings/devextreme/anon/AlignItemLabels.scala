package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.ui.dxFormButtonItem
import typings.devextreme.mod.DevExpress.ui.dxFormEmptyItem
import typings.devextreme.mod.DevExpress.ui.dxFormGroupItem
import typings.devextreme.mod.DevExpress.ui.dxFormSimpleItem
import typings.devextreme.mod.DevExpress.ui.dxFormTabbedItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlignItemLabels extends js.Object {
  
  var alignItemLabels: js.UndefOr[Boolean] = js.native
  
  var badge: js.UndefOr[String] = js.native
  
  var colCount: js.UndefOr[Double] = js.native
  
  var colCountByScreen: js.UndefOr[js.Any] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var icon: js.UndefOr[String] = js.native
  
  var items: js.UndefOr[
    js.Array[
      dxFormSimpleItem | dxFormGroupItem | dxFormTabbedItem | dxFormEmptyItem | dxFormButtonItem
    ]
  ] = js.native
  
  var tabTemplate: js.UndefOr[
    template | (js.Function3[/* tabData */ js.Any, /* tabIndex */ Double, /* tabElement */ dxElement, _])
  ] = js.native
  
  var template: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[/* tabData */ js.Any, /* tabIndex */ Double, /* tabElement */ dxElement, _])
  ] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object AlignItemLabels {
  
  @scala.inline
  def apply(): AlignItemLabels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignItemLabels]
  }
  
  @scala.inline
  implicit class AlignItemLabelsOps[Self <: AlignItemLabels] (val x: Self) extends AnyVal {
    
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
    def setBadge(value: String): Self = this.set("badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadge: Self = this.set("badge", js.undefined)
    
    @scala.inline
    def setColCount(value: Double): Self = this.set("colCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColCount: Self = this.set("colCount", js.undefined)
    
    @scala.inline
    def setColCountByScreen(value: js.Any): Self = this.set("colCountByScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColCountByScreen: Self = this.set("colCountByScreen", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
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
    def setTabTemplateFunction3(value: (/* tabData */ js.Any, /* tabIndex */ Double, /* tabElement */ dxElement) => _): Self = this.set("tabTemplate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTabTemplate(
      value: template | (js.Function3[/* tabData */ js.Any, /* tabIndex */ Double, /* tabElement */ dxElement, _])
    ): Self = this.set("tabTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabTemplate: Self = this.set("tabTemplate", js.undefined)
    
    @scala.inline
    def setTemplateFunction3(value: (/* tabData */ js.Any, /* tabIndex */ Double, /* tabElement */ dxElement) => _): Self = this.set("template", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTemplate(
      value: template | (js.Function3[/* tabData */ js.Any, /* tabIndex */ Double, /* tabElement */ dxElement, _])
    ): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
