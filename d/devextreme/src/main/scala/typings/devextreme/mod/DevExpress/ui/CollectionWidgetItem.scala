package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionWidgetItem extends js.Object {
  
  /**
    * [descr:CollectionWidgetItem.disabled]
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:CollectionWidgetItem.html]
    */
  var html: js.UndefOr[String] = js.native
  
  /**
    * [descr:CollectionWidgetItem.template]
    */
  var template: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function0[String | Element | JQuery])
  ] = js.native
  
  /**
    * [descr:CollectionWidgetItem.text]
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    * [descr:CollectionWidgetItem.visible]
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object CollectionWidgetItem {
  
  @scala.inline
  def apply(): CollectionWidgetItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionWidgetItem]
  }
  
  @scala.inline
  implicit class CollectionWidgetItemOps[Self <: CollectionWidgetItem] (val x: Self) extends AnyVal {
    
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    
    @scala.inline
    def setTemplateFunction0(value: () => String | Element | JQuery): Self = this.set("template", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTemplate(value: typings.devextreme.mod.DevExpress.core.template | (js.Function0[String | Element | JQuery])): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
