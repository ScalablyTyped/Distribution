package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxGantt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HiddenFields extends js.Object {
  
  var cancel: js.UndefOr[Boolean] = js.native
  
  var component: js.UndefOr[dxGantt] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var hiddenFields: js.UndefOr[js.Array[String]] = js.native
  
  var key: js.UndefOr[js.Any] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
  
  var readOnlyFields: js.UndefOr[js.Array[String]] = js.native
  
  var values: js.UndefOr[js.Any] = js.native
}
object HiddenFields {
  
  @scala.inline
  def apply(): HiddenFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HiddenFields]
  }
  
  @scala.inline
  implicit class HiddenFieldsOps[Self <: HiddenFields] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setComponent(value: dxGantt): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setHiddenFieldsVarargs(value: String*): Self = this.set("hiddenFields", js.Array(value :_*))
    
    @scala.inline
    def setHiddenFields(value: js.Array[String]): Self = this.set("hiddenFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHiddenFields: Self = this.set("hiddenFields", js.undefined)
    
    @scala.inline
    def setKey(value: js.Any): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setReadOnlyFieldsVarargs(value: String*): Self = this.set("readOnlyFields", js.Array(value :_*))
    
    @scala.inline
    def setReadOnlyFields(value: js.Array[String]): Self = this.set("readOnlyFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnlyFields: Self = this.set("readOnlyFields", js.undefined)
    
    @scala.inline
    def setValues(value: js.Any): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
