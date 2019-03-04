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
    requireNumber: js.Function0[TextValidationBuilder],
    requireNumberBetween: js.Function2[stdLib.Number, stdLib.Number, TextValidationBuilder],
    requireNumberEqualTo: js.Function1[stdLib.Number, TextValidationBuilder],
    requireNumberGreaterThan: js.Function1[stdLib.Number, TextValidationBuilder],
    requireNumberGreaterThanOrEqualTo: js.Function1[stdLib.Number, TextValidationBuilder],
    requireNumberLessThan: js.Function1[stdLib.Number, TextValidationBuilder],
    requireNumberLessThanOrEqualTo: js.Function1[stdLib.Number, TextValidationBuilder],
    requireNumberNotBetween: js.Function2[stdLib.Number, stdLib.Number, TextValidationBuilder],
    requireNumberNotEqualTo: js.Function1[stdLib.Number, TextValidationBuilder],
    requireTextContainsPattern: js.Function1[java.lang.String, TextValidationBuilder],
    requireTextDoesNotContainPattern: js.Function1[java.lang.String, TextValidationBuilder],
    requireTextDoesNotMatchPattern: js.Function1[java.lang.String, TextValidationBuilder],
    requireTextIsEmail: js.Function0[TextValidationBuilder],
    requireTextIsUrl: js.Function0[TextValidationBuilder],
    requireTextLengthGreaterThanOrEqualTo: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, TextValidationBuilder],
    requireTextLengthLessThanOrEqualTo: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, TextValidationBuilder],
    requireTextMatchesPattern: js.Function1[java.lang.String, TextValidationBuilder],
    requireWholeNumber: js.Function0[TextValidationBuilder]
  ): TextValidationBuilder = {
    val __obj = js.Dynamic.literal(requireNumber = requireNumber, requireNumberBetween = requireNumberBetween, requireNumberEqualTo = requireNumberEqualTo, requireNumberGreaterThan = requireNumberGreaterThan, requireNumberGreaterThanOrEqualTo = requireNumberGreaterThanOrEqualTo, requireNumberLessThan = requireNumberLessThan, requireNumberLessThanOrEqualTo = requireNumberLessThanOrEqualTo, requireNumberNotBetween = requireNumberNotBetween, requireNumberNotEqualTo = requireNumberNotEqualTo, requireTextContainsPattern = requireTextContainsPattern, requireTextDoesNotContainPattern = requireTextDoesNotContainPattern, requireTextDoesNotMatchPattern = requireTextDoesNotMatchPattern, requireTextIsEmail = requireTextIsEmail, requireTextIsUrl = requireTextIsUrl, requireTextLengthGreaterThanOrEqualTo = requireTextLengthGreaterThanOrEqualTo, requireTextLengthLessThanOrEqualTo = requireTextLengthLessThanOrEqualTo, requireTextMatchesPattern = requireTextMatchesPattern, requireWholeNumber = requireWholeNumber)
  
    __obj.asInstanceOf[TextValidationBuilder]
  }
}

