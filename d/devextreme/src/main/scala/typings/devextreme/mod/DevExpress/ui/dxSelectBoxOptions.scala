package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.CustomItem
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxSelectBoxOptions[T] extends dxDropDownListOptions[T] {
  
  /**
    * [descr:dxSelectBox.Options.fieldTemplate]
    */
  var fieldTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* selectedItem */ js.Any, /* fieldElement */ dxElement, String | Element | JQuery])
  ] = js.native
  
  /**
    * [descr:dxSelectBox.Options.onCustomItemCreating]
    */
  var onCustomItemCreating: js.UndefOr[js.Function1[/* e */ CustomItem[T], _]] = js.native
  
  /**
    * [descr:dxSelectBox.Options.showSelectionControls]
    */
  var showSelectionControls: js.UndefOr[Boolean] = js.native
}
object dxSelectBoxOptions {
  
  @scala.inline
  def apply[T](): dxSelectBoxOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSelectBoxOptions[T]]
  }
  
  @scala.inline
  implicit class dxSelectBoxOptionsOps[Self <: dxSelectBoxOptions[_], T] (val x: Self with dxSelectBoxOptions[T]) extends AnyVal {
    
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
    def setFieldTemplateFunction2(value: (/* selectedItem */ js.Any, /* fieldElement */ dxElement) => String | Element | JQuery): Self = this.set("fieldTemplate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFieldTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* selectedItem */ js.Any, /* fieldElement */ dxElement, String | Element | JQuery])
    ): Self = this.set("fieldTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldTemplate: Self = this.set("fieldTemplate", js.undefined)
    
    @scala.inline
    def setOnCustomItemCreating(value: /* e */ CustomItem[T] => _): Self = this.set("onCustomItemCreating", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCustomItemCreating: Self = this.set("onCustomItemCreating", js.undefined)
    
    @scala.inline
    def setShowSelectionControls(value: Boolean): Self = this.set("showSelectionControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSelectionControls: Self = this.set("showSelectionControls", js.undefined)
  }
}
