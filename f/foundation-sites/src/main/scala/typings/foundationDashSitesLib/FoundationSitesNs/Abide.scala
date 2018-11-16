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

