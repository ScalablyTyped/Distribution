package typings
package foundationDashSitesLib.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/sites/docs/abide.html#javascript-reference
trait Abide extends js.Object {
  def addErrorClasses(element: foundationDashSitesLib.JQuery): scala.Unit
  def destroy(): scala.Unit
  def findFormError(element: foundationDashSitesLib.JQuery): foundationDashSitesLib.JQuery
  def findLabel(element: foundationDashSitesLib.JQuery): scala.Boolean
  def matchValidation(element: foundationDashSitesLib.JQuery, validators: java.lang.String, required: scala.Boolean): scala.Boolean
  def removeErrorClasses(element: foundationDashSitesLib.JQuery): scala.Unit
  def removeRadioErrorClasses(groupName: java.lang.String): scala.Unit
  def requiredChecked(element: foundationDashSitesLib.JQuery): scala.Boolean
  def resetForm(): scala.Unit
  def validateForm(): scala.Boolean
  def validateInput(element: foundationDashSitesLib.JQuery): scala.Boolean
  def validateRadio(groupName: java.lang.String): scala.Boolean
  def validateText(element: foundationDashSitesLib.JQuery, pattern: java.lang.String): scala.Boolean
}

object Abide {
  @scala.inline
  def apply(
    addErrorClasses: foundationDashSitesLib.JQuery => scala.Unit,
    destroy: () => scala.Unit,
    findFormError: foundationDashSitesLib.JQuery => foundationDashSitesLib.JQuery,
    findLabel: foundationDashSitesLib.JQuery => scala.Boolean,
    matchValidation: (foundationDashSitesLib.JQuery, java.lang.String, scala.Boolean) => scala.Boolean,
    removeErrorClasses: foundationDashSitesLib.JQuery => scala.Unit,
    removeRadioErrorClasses: java.lang.String => scala.Unit,
    requiredChecked: foundationDashSitesLib.JQuery => scala.Boolean,
    resetForm: () => scala.Unit,
    validateForm: () => scala.Boolean,
    validateInput: foundationDashSitesLib.JQuery => scala.Boolean,
    validateRadio: java.lang.String => scala.Boolean,
    validateText: (foundationDashSitesLib.JQuery, java.lang.String) => scala.Boolean
  ): Abide = {
    val __obj = js.Dynamic.literal(addErrorClasses = js.Any.fromFunction1(addErrorClasses), destroy = js.Any.fromFunction0(destroy), findFormError = js.Any.fromFunction1(findFormError), findLabel = js.Any.fromFunction1(findLabel), matchValidation = js.Any.fromFunction3(matchValidation), removeErrorClasses = js.Any.fromFunction1(removeErrorClasses), removeRadioErrorClasses = js.Any.fromFunction1(removeRadioErrorClasses), requiredChecked = js.Any.fromFunction1(requiredChecked), resetForm = js.Any.fromFunction0(resetForm), validateForm = js.Any.fromFunction0(validateForm), validateInput = js.Any.fromFunction1(validateInput), validateRadio = js.Any.fromFunction1(validateRadio), validateText = js.Any.fromFunction2(validateText))
  
    __obj.asInstanceOf[Abide]
  }
}

