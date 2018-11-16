package typings
package formsLib.formsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forms", "validators")
@js.native
object validatorsNs extends js.Object {
  def alphanumeric(): formsLib.formsMod.ValidatorFunction = js.native
  def alphanumeric(errorMessage: java.lang.String): formsLib.formsMod.ValidatorFunction = js.native
  def color(): formsLib.formsMod.ValidatorFunction = js.native
  def color(errorMessage: java.lang.String): formsLib.formsMod.ValidatorFunction = js.native
  def date(): formsLib.formsMod.ValidatorFunction = js.native
  def date(errorMessage: java.lang.String): formsLib.formsMod.ValidatorFunction = js.native
  def digits(): formsLib.formsMod.ValidatorFunction = js.native
  def digits(errorMessage: java.lang.String): formsLib.formsMod.ValidatorFunction = js.native
  def email(): formsLib.formsMod.ValidatorFunction = js.native
  def email(errorMessage: java.lang.String): formsLib.formsMod.ValidatorFunction = js.native
  def integer(): formsLib.formsMod.ValidatorFunction = js.native
  def integer(errorMessage: java.lang.String): formsLib.formsMod.ValidatorFunction = js.native
  def matchField(matchedField: java.lang.String): formsLib.formsMod.ValidatorFunction = js.native
  def matchField(matchedField: java.lang.String, errorMessage: java.lang.String): formsLib.formsMod.ValidatorFunction = js.native
  def matchValue(valueGetter: js.Function0[_]): formsLib.formsMod.ValidatorFunction = js.native
  def matchValue(valueGetter: js.Function0[_], errorMessage: java.lang.String): formsLib.formsMod.ValidatorFunction = js.native
  def max(value: scala.Double): formsLib.formsMod.ValidatorFunction = js.native
  def max(value: scala.Double, errorMessage: java.lang.String): formsLib.formsMod.ValidatorFunction = js.native
  def maxlength(value: scala.Double): formsLib.formsMod.ValidatorFunction = js.native
  def maxlength(value: scala.Double, errorMessage: java.lang.String): formsLib.formsMod.ValidatorFunction = js.native
  def min(value: scala.Double): formsLib.formsMod.ValidatorFunction = js.native
  def min(value: scala.Double, errorMessage: java.lang.String): formsLib.formsMod.ValidatorFunction = js.native
  def minlength(value: scala.Double): formsLib.formsMod.ValidatorFunction = js.native
  def minlength(value: scala.Double, errorMessage: java.lang.String): formsLib.formsMod.ValidatorFunction = js.native
  def range(min: scala.Double, max: scala.Double): formsLib.formsMod.ValidatorFunction = js.native
  def range(min: scala.Double, max: scala.Double, errorMessage: java.lang.String): formsLib.formsMod.ValidatorFunction = js.native
  def rangelength(min: scala.Double, max: scala.Double): formsLib.formsMod.ValidatorFunction = js.native
  def rangelength(min: scala.Double, max: scala.Double, errorMessage: java.lang.String): formsLib.formsMod.ValidatorFunction = js.native
  def regexp(regexp: stdLib.RegExp): formsLib.formsMod.ValidatorFunction = js.native
  def regexp(regexp: stdLib.RegExp, errorMessage: java.lang.String): formsLib.formsMod.ValidatorFunction = js.native
  def required(): formsLib.formsMod.ValidatorFunction = js.native
  def required(errorMessage: java.lang.String): formsLib.formsMod.ValidatorFunction = js.native
  def requiresFieldIfEmpty(alternateField: java.lang.String): formsLib.formsMod.ValidatorFunction = js.native
  def requiresFieldIfEmpty(alternateField: java.lang.String, errorMessage: java.lang.String): formsLib.formsMod.ValidatorFunction = js.native
  def url(): formsLib.formsMod.ValidatorFunction = js.native
  def url(errorMessage: java.lang.String): formsLib.formsMod.ValidatorFunction = js.native
}

