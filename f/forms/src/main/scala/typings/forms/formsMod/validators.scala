package typings.forms.formsMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forms", "validators")
@js.native
object validators extends js.Object {
  def alphanumeric(): ValidatorFunction = js.native
  def alphanumeric(errorMessage: String): ValidatorFunction = js.native
  def color(): ValidatorFunction = js.native
  def color(errorMessage: String): ValidatorFunction = js.native
  def date(): ValidatorFunction = js.native
  def date(errorMessage: String): ValidatorFunction = js.native
  def digits(): ValidatorFunction = js.native
  def digits(errorMessage: String): ValidatorFunction = js.native
  def email(): ValidatorFunction = js.native
  def email(errorMessage: String): ValidatorFunction = js.native
  def integer(): ValidatorFunction = js.native
  def integer(errorMessage: String): ValidatorFunction = js.native
  def matchField(matchedField: String): ValidatorFunction = js.native
  def matchField(matchedField: String, errorMessage: String): ValidatorFunction = js.native
  def matchValue(valueGetter: js.Function0[_]): ValidatorFunction = js.native
  def matchValue(valueGetter: js.Function0[_], errorMessage: String): ValidatorFunction = js.native
  def max(value: Double): ValidatorFunction = js.native
  def max(value: Double, errorMessage: String): ValidatorFunction = js.native
  def maxlength(value: Double): ValidatorFunction = js.native
  def maxlength(value: Double, errorMessage: String): ValidatorFunction = js.native
  def min(value: Double): ValidatorFunction = js.native
  def min(value: Double, errorMessage: String): ValidatorFunction = js.native
  def minlength(value: Double): ValidatorFunction = js.native
  def minlength(value: Double, errorMessage: String): ValidatorFunction = js.native
  def range(min: Double, max: Double): ValidatorFunction = js.native
  def range(min: Double, max: Double, errorMessage: String): ValidatorFunction = js.native
  def rangelength(min: Double, max: Double): ValidatorFunction = js.native
  def rangelength(min: Double, max: Double, errorMessage: String): ValidatorFunction = js.native
  def regexp(regexp: RegExp): ValidatorFunction = js.native
  def regexp(regexp: RegExp, errorMessage: String): ValidatorFunction = js.native
  def required(): ValidatorFunction = js.native
  def required(errorMessage: String): ValidatorFunction = js.native
  def requiresFieldIfEmpty(alternateField: String): ValidatorFunction = js.native
  def requiresFieldIfEmpty(alternateField: String, errorMessage: String): ValidatorFunction = js.native
  def url(): ValidatorFunction = js.native
  def url(errorMessage: String): ValidatorFunction = js.native
}

