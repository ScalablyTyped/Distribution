package typings.foundationSites.FoundationSites

import typings.foundationSites.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://get.foundation/sites/docs/abide.html#javascript-reference
@js.native
trait Abide extends StObject {
  
  def addA11yAttributes(element: JQuery): Unit = js.native
  
  def addErrorClasses(element: JQuery): Unit = js.native
  def addErrorClasses(element: JQuery, failedValidators: js.Array[String]): Unit = js.native
  
  def addGlobalErrorA11yAttributes(element: JQuery): Unit = js.native
  
  def disableValidation(): Unit = js.native
  
  def enableValidation(): Unit = js.native
  
  def findCheckboxLabels(elements: JQuery): Boolean = js.native
  
  def findFormError(element: JQuery): JQuery = js.native
  def findFormError(element: JQuery, failedValidators: js.Array[String]): JQuery = js.native
  
  def findLabel(element: JQuery): Boolean = js.native
  
  def findRadioLabels(elements: JQuery): Boolean = js.native
  
  var initialized: Boolean = js.native
  
  def matchValidation(element: JQuery, validators: String, required: Boolean): Boolean = js.native
  
  def removeCheckboxErrorClasses(groupName: String): Unit = js.native
  
  def removeErrorClasses(element: JQuery): Unit = js.native
  
  def removeRadioErrorClasses(groupName: String): Unit = js.native
  
  def requiredCheck(element: JQuery): Boolean = js.native
  
  def resetForm(): Unit = js.native
  
  def validateCheckbox(groupName: String): Boolean = js.native
  
  def validateForm(): Boolean = js.native
  
  def validateInput(element: JQuery): Boolean = js.native
  
  def validateRadio(groupName: String): Boolean = js.native
  
  def validateText(element: JQuery, pattern: String): Boolean = js.native
}
