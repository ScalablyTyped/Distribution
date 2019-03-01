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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("requireNumber")(requireNumber)
    __obj.updateDynamic("requireNumberBetween")(requireNumberBetween)
    __obj.updateDynamic("requireNumberEqualTo")(requireNumberEqualTo)
    __obj.updateDynamic("requireNumberGreaterThan")(requireNumberGreaterThan)
    __obj.updateDynamic("requireNumberGreaterThanOrEqualTo")(requireNumberGreaterThanOrEqualTo)
    __obj.updateDynamic("requireNumberLessThan")(requireNumberLessThan)
    __obj.updateDynamic("requireNumberLessThanOrEqualTo")(requireNumberLessThanOrEqualTo)
    __obj.updateDynamic("requireNumberNotBetween")(requireNumberNotBetween)
    __obj.updateDynamic("requireNumberNotEqualTo")(requireNumberNotEqualTo)
    __obj.updateDynamic("requireTextContainsPattern")(requireTextContainsPattern)
    __obj.updateDynamic("requireTextDoesNotContainPattern")(requireTextDoesNotContainPattern)
    __obj.updateDynamic("requireTextDoesNotMatchPattern")(requireTextDoesNotMatchPattern)
    __obj.updateDynamic("requireTextIsEmail")(requireTextIsEmail)
    __obj.updateDynamic("requireTextIsUrl")(requireTextIsUrl)
    __obj.updateDynamic("requireTextLengthGreaterThanOrEqualTo")(requireTextLengthGreaterThanOrEqualTo)
    __obj.updateDynamic("requireTextLengthLessThanOrEqualTo")(requireTextLengthLessThanOrEqualTo)
    __obj.updateDynamic("requireTextMatchesPattern")(requireTextMatchesPattern)
    __obj.updateDynamic("requireWholeNumber")(requireWholeNumber)
    __obj.asInstanceOf[TextValidationBuilder]
  }
}

