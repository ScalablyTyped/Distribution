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
    addErrorClasses: js.Function1[foundationDashSitesLib.JQuery, scala.Unit],
    destroy: js.Function0[scala.Unit],
    findFormError: js.Function1[foundationDashSitesLib.JQuery, foundationDashSitesLib.JQuery],
    findLabel: js.Function1[foundationDashSitesLib.JQuery, scala.Boolean],
    matchValidation: js.Function3[foundationDashSitesLib.JQuery, java.lang.String, scala.Boolean, scala.Boolean],
    removeErrorClasses: js.Function1[foundationDashSitesLib.JQuery, scala.Unit],
    removeRadioErrorClasses: js.Function1[java.lang.String, scala.Unit],
    requiredChecked: js.Function1[foundationDashSitesLib.JQuery, scala.Boolean],
    resetForm: js.Function0[scala.Unit],
    validateForm: js.Function0[scala.Boolean],
    validateInput: js.Function1[foundationDashSitesLib.JQuery, scala.Boolean],
    validateRadio: js.Function1[java.lang.String, scala.Boolean],
    validateText: js.Function2[foundationDashSitesLib.JQuery, java.lang.String, scala.Boolean]
  ): Abide = {
    val __obj = js.Dynamic.literal(addErrorClasses = addErrorClasses, destroy = destroy, findFormError = findFormError, findLabel = findLabel, matchValidation = matchValidation, removeErrorClasses = removeErrorClasses, removeRadioErrorClasses = removeRadioErrorClasses, requiredChecked = requiredChecked, resetForm = resetForm, validateForm = validateForm, validateInput = validateInput, validateRadio = validateRadio, validateText = validateText)
  
    __obj.asInstanceOf[Abide]
  }
}

