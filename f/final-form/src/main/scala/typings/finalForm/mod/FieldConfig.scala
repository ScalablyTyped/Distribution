package typings.finalForm.mod

import typings.finalForm.finalFormBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldConfig[FieldValue] extends js.Object {
  
  var afterSubmit: js.UndefOr[js.Function0[Unit]] = js.native
  
  var beforeSubmit: js.UndefOr[js.Function0[Unit | `false`]] = js.native
  
  var data: js.UndefOr[js.Any] = js.native
  
  var defaultValue: js.UndefOr[js.Any] = js.native
  
  var getValidator: js.UndefOr[GetFieldValidator[FieldValue]] = js.native
  
  var initialValue: js.UndefOr[js.Any] = js.native
  
  var isEqual: js.UndefOr[IsEqual] = js.native
  
  var silent: js.UndefOr[Boolean] = js.native
  
  var validateFields: js.UndefOr[js.Array[String]] = js.native
}
object FieldConfig {
  
  @scala.inline
  def apply[FieldValue](): FieldConfig[FieldValue] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldConfig[FieldValue]]
  }
  
  @scala.inline
  implicit class FieldConfigOps[Self <: FieldConfig[_], FieldValue] (val x: Self with FieldConfig[FieldValue]) extends AnyVal {
    
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
    def setAfterSubmit(value: () => Unit): Self = this.set("afterSubmit", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteAfterSubmit: Self = this.set("afterSubmit", js.undefined)
    
    @scala.inline
    def setBeforeSubmit(value: () => Unit | `false`): Self = this.set("beforeSubmit", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteBeforeSubmit: Self = this.set("beforeSubmit", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setGetValidator(value: () => js.UndefOr[FieldValidator[FieldValue]]): Self = this.set("getValidator", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetValidator: Self = this.set("getValidator", js.undefined)
    
    @scala.inline
    def setInitialValue(value: js.Any): Self = this.set("initialValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialValue: Self = this.set("initialValue", js.undefined)
    
    @scala.inline
    def setIsEqual(value: (/* a */ js.Any, /* b */ js.Any) => Boolean): Self = this.set("isEqual", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteIsEqual: Self = this.set("isEqual", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    
    @scala.inline
    def setValidateFieldsVarargs(value: String*): Self = this.set("validateFields", js.Array(value :_*))
    
    @scala.inline
    def setValidateFields(value: js.Array[String]): Self = this.set("validateFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateFields: Self = this.set("validateFields", js.undefined)
  }
}
