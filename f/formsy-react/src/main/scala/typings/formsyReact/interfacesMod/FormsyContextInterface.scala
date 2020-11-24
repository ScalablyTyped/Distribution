package typings.formsyReact.interfacesMod

import typings.formsyReact.anon.IsRequired
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormsyContextInterface extends js.Object {
  
  def attachToForm(component: InputComponent[_]): Unit = js.native
  
  def detachFromForm(component: InputComponent[_]): Unit = js.native
  
  var isFormDisabled: Boolean = js.native
  
  def isValidValue(component: InputComponent[_], value: js.Any): Boolean = js.native
  
  def runValidation(component: InputComponent[_]): IsRequired = js.native
  
  def validate(component: InputComponent[_]): Unit = js.native
}
object FormsyContextInterface {
  
  @scala.inline
  def apply(
    attachToForm: InputComponent[_] => Unit,
    detachFromForm: InputComponent[_] => Unit,
    isFormDisabled: Boolean,
    isValidValue: (InputComponent[_], js.Any) => Boolean,
    runValidation: InputComponent[_] => IsRequired,
    validate: InputComponent[_] => Unit
  ): FormsyContextInterface = {
    val __obj = js.Dynamic.literal(attachToForm = js.Any.fromFunction1(attachToForm), detachFromForm = js.Any.fromFunction1(detachFromForm), isFormDisabled = isFormDisabled.asInstanceOf[js.Any], isValidValue = js.Any.fromFunction2(isValidValue), runValidation = js.Any.fromFunction1(runValidation), validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[FormsyContextInterface]
  }
  
  @scala.inline
  implicit class FormsyContextInterfaceOps[Self <: FormsyContextInterface] (val x: Self) extends AnyVal {
    
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
    def setAttachToForm(value: InputComponent[_] => Unit): Self = this.set("attachToForm", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDetachFromForm(value: InputComponent[_] => Unit): Self = this.set("detachFromForm", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsFormDisabled(value: Boolean): Self = this.set("isFormDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValidValue(value: (InputComponent[_], js.Any) => Boolean): Self = this.set("isValidValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRunValidation(value: InputComponent[_] => IsRequired): Self = this.set("runValidation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidate(value: InputComponent[_] => Unit): Self = this.set("validate", js.Any.fromFunction1(value))
  }
}
