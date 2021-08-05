package typings.foundationSites.FoundationSites

import typings.foundationSites.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://get.foundation/sites/docs/abide.html#javascript-reference
trait Abide extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: Abide](x: Self) {
    
    inline def setAddErrorClasses(value: JQuery => Unit): Self = StObject.set(x, "addErrorClasses", js.Any.fromFunction1(value))
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setFindFormError(value: JQuery => JQuery): Self = StObject.set(x, "findFormError", js.Any.fromFunction1(value))
    
    inline def setFindLabel(value: JQuery => Boolean): Self = StObject.set(x, "findLabel", js.Any.fromFunction1(value))
    
    inline def setMatchValidation(value: (JQuery, String, Boolean) => Boolean): Self = StObject.set(x, "matchValidation", js.Any.fromFunction3(value))
    
    inline def setRemoveErrorClasses(value: JQuery => Unit): Self = StObject.set(x, "removeErrorClasses", js.Any.fromFunction1(value))
    
    inline def setRemoveRadioErrorClasses(value: String => Unit): Self = StObject.set(x, "removeRadioErrorClasses", js.Any.fromFunction1(value))
    
    inline def setRequiredChecked(value: JQuery => Boolean): Self = StObject.set(x, "requiredChecked", js.Any.fromFunction1(value))
    
    inline def setResetForm(value: () => Unit): Self = StObject.set(x, "resetForm", js.Any.fromFunction0(value))
    
    inline def setValidateForm(value: () => Boolean): Self = StObject.set(x, "validateForm", js.Any.fromFunction0(value))
    
    inline def setValidateInput(value: JQuery => Boolean): Self = StObject.set(x, "validateInput", js.Any.fromFunction1(value))
    
    inline def setValidateRadio(value: String => Boolean): Self = StObject.set(x, "validateRadio", js.Any.fromFunction1(value))
    
    inline def setValidateText(value: (JQuery, String) => Boolean): Self = StObject.set(x, "validateText", js.Any.fromFunction2(value))
  }
}
