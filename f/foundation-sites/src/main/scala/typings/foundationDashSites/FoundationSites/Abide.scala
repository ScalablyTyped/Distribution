package typings.foundationDashSites.FoundationSites

import typings.foundationDashSites.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/sites/docs/abide.html#javascript-reference
trait Abide extends js.Object {
  def addErrorClasses(element: JQuery): Unit
  def destroy(): Unit
  def findFormError(element: JQuery): JQuery
  def findLabel(element: JQuery): Boolean
  def matchValidation(element: JQuery, validators: String, required: Boolean): Boolean
  def removeErrorClasses(element: JQuery): Unit
  def removeRadioErrorClasses(groupName: String): Unit
  def requiredChecked(element: JQuery): Boolean
  def resetForm(): Unit
  def validateForm(): Boolean
  def validateInput(element: JQuery): Boolean
  def validateRadio(groupName: String): Boolean
  def validateText(element: JQuery, pattern: String): Boolean
}

object Abide {
  @scala.inline
  def apply(
    addErrorClasses: JQuery => Unit,
    destroy: () => Unit,
    findFormError: JQuery => JQuery,
    findLabel: JQuery => Boolean,
    matchValidation: (JQuery, String, Boolean) => Boolean,
    removeErrorClasses: JQuery => Unit,
    removeRadioErrorClasses: String => Unit,
    requiredChecked: JQuery => Boolean,
    resetForm: () => Unit,
    validateForm: () => Boolean,
    validateInput: JQuery => Boolean,
    validateRadio: String => Boolean,
    validateText: (JQuery, String) => Boolean
  ): Abide = {
    val __obj = js.Dynamic.literal(addErrorClasses = js.Any.fromFunction1(addErrorClasses), destroy = js.Any.fromFunction0(destroy), findFormError = js.Any.fromFunction1(findFormError), findLabel = js.Any.fromFunction1(findLabel), matchValidation = js.Any.fromFunction3(matchValidation), removeErrorClasses = js.Any.fromFunction1(removeErrorClasses), removeRadioErrorClasses = js.Any.fromFunction1(removeRadioErrorClasses), requiredChecked = js.Any.fromFunction1(requiredChecked), resetForm = js.Any.fromFunction0(resetForm), validateForm = js.Any.fromFunction0(validateForm), validateInput = js.Any.fromFunction1(validateInput), validateRadio = js.Any.fromFunction1(validateRadio), validateText = js.Any.fromFunction2(validateText))
  
    __obj.asInstanceOf[Abide]
  }
}

