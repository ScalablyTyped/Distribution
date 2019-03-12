package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextValidationBuilder extends js.Object {
  def requireNumber(): TextValidationBuilder
  def requireNumberBetween(start: stdLib.Number, end: stdLib.Number): TextValidationBuilder
  def requireNumberEqualTo(number: stdLib.Number): TextValidationBuilder
  def requireNumberGreaterThan(number: stdLib.Number): TextValidationBuilder
  def requireNumberGreaterThanOrEqualTo(number: stdLib.Number): TextValidationBuilder
  def requireNumberLessThan(number: stdLib.Number): TextValidationBuilder
  def requireNumberLessThanOrEqualTo(number: stdLib.Number): TextValidationBuilder
  def requireNumberNotBetween(start: stdLib.Number, end: stdLib.Number): TextValidationBuilder
  def requireNumberNotEqualTo(number: stdLib.Number): TextValidationBuilder
  def requireTextContainsPattern(pattern: java.lang.String): TextValidationBuilder
  def requireTextDoesNotContainPattern(pattern: java.lang.String): TextValidationBuilder
  def requireTextDoesNotMatchPattern(pattern: java.lang.String): TextValidationBuilder
  def requireTextIsEmail(): TextValidationBuilder
  def requireTextIsUrl(): TextValidationBuilder
  def requireTextLengthGreaterThanOrEqualTo(number: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): TextValidationBuilder
  def requireTextLengthLessThanOrEqualTo(number: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): TextValidationBuilder
  def requireTextMatchesPattern(pattern: java.lang.String): TextValidationBuilder
  def requireWholeNumber(): TextValidationBuilder
}

object TextValidationBuilder {
  @scala.inline
  def apply(
    requireNumber: () => TextValidationBuilder,
    requireNumberBetween: (stdLib.Number, stdLib.Number) => TextValidationBuilder,
    requireNumberEqualTo: stdLib.Number => TextValidationBuilder,
    requireNumberGreaterThan: stdLib.Number => TextValidationBuilder,
    requireNumberGreaterThanOrEqualTo: stdLib.Number => TextValidationBuilder,
    requireNumberLessThan: stdLib.Number => TextValidationBuilder,
    requireNumberLessThanOrEqualTo: stdLib.Number => TextValidationBuilder,
    requireNumberNotBetween: (stdLib.Number, stdLib.Number) => TextValidationBuilder,
    requireNumberNotEqualTo: stdLib.Number => TextValidationBuilder,
    requireTextContainsPattern: java.lang.String => TextValidationBuilder,
    requireTextDoesNotContainPattern: java.lang.String => TextValidationBuilder,
    requireTextDoesNotMatchPattern: java.lang.String => TextValidationBuilder,
    requireTextIsEmail: () => TextValidationBuilder,
    requireTextIsUrl: () => TextValidationBuilder,
    requireTextLengthGreaterThanOrEqualTo: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => TextValidationBuilder,
    requireTextLengthLessThanOrEqualTo: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => TextValidationBuilder,
    requireTextMatchesPattern: java.lang.String => TextValidationBuilder,
    requireWholeNumber: () => TextValidationBuilder
  ): TextValidationBuilder = {
    val __obj = js.Dynamic.literal(requireNumber = js.Any.fromFunction0(requireNumber), requireNumberBetween = js.Any.fromFunction2(requireNumberBetween), requireNumberEqualTo = js.Any.fromFunction1(requireNumberEqualTo), requireNumberGreaterThan = js.Any.fromFunction1(requireNumberGreaterThan), requireNumberGreaterThanOrEqualTo = js.Any.fromFunction1(requireNumberGreaterThanOrEqualTo), requireNumberLessThan = js.Any.fromFunction1(requireNumberLessThan), requireNumberLessThanOrEqualTo = js.Any.fromFunction1(requireNumberLessThanOrEqualTo), requireNumberNotBetween = js.Any.fromFunction2(requireNumberNotBetween), requireNumberNotEqualTo = js.Any.fromFunction1(requireNumberNotEqualTo), requireTextContainsPattern = js.Any.fromFunction1(requireTextContainsPattern), requireTextDoesNotContainPattern = js.Any.fromFunction1(requireTextDoesNotContainPattern), requireTextDoesNotMatchPattern = js.Any.fromFunction1(requireTextDoesNotMatchPattern), requireTextIsEmail = js.Any.fromFunction0(requireTextIsEmail), requireTextIsUrl = js.Any.fromFunction0(requireTextIsUrl), requireTextLengthGreaterThanOrEqualTo = js.Any.fromFunction1(requireTextLengthGreaterThanOrEqualTo), requireTextLengthLessThanOrEqualTo = js.Any.fromFunction1(requireTextLengthLessThanOrEqualTo), requireTextMatchesPattern = js.Any.fromFunction1(requireTextMatchesPattern), requireWholeNumber = js.Any.fromFunction0(requireWholeNumber))
  
    __obj.asInstanceOf[TextValidationBuilder]
  }
}

