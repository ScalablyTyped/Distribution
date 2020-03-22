package typings.formsyReact.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormsyContextInterface extends js.Object {
  var isFormDisabled: Boolean
  def attachToForm(component: InputComponent[_]): Unit
  def detachFromForm(component: InputComponent[_]): Unit
  def isValidValue(component: InputComponent[_], value: js.Any): Boolean
  def validate(component: InputComponent[_]): Unit
}

object FormsyContextInterface {
  @scala.inline
  def apply(
    attachToForm: InputComponent[_] => Unit,
    detachFromForm: InputComponent[_] => Unit,
    isFormDisabled: Boolean,
    isValidValue: (InputComponent[_], js.Any) => Boolean,
    validate: InputComponent[_] => Unit
  ): FormsyContextInterface = {
    val __obj = js.Dynamic.literal(attachToForm = js.Any.fromFunction1(attachToForm), detachFromForm = js.Any.fromFunction1(detachFromForm), isFormDisabled = isFormDisabled.asInstanceOf[js.Any], isValidValue = js.Any.fromFunction2(isValidValue), validate = js.Any.fromFunction1(validate))
  
    __obj.asInstanceOf[FormsyContextInterface]
  }
}

