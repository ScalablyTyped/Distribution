package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParagraphTextValidationBuilder extends js.Object {
  def requireTextContainsPattern(pattern: java.lang.String): ParagraphTextValidationBuilder
  def requireTextDoesNotContainPattern(pattern: java.lang.String): ParagraphTextValidationBuilder
  def requireTextDoesNotMatchPattern(pattern: java.lang.String): ParagraphTextValidationBuilder
  def requireTextLengthGreaterThanOrEqualTo(number: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): ParagraphTextValidationBuilder
  def requireTextLengthLessThanOrEqualTo(number: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): ParagraphTextValidationBuilder
  def requireTextMatchesPattern(pattern: java.lang.String): ParagraphTextValidationBuilder
}

object ParagraphTextValidationBuilder {
  @scala.inline
  def apply(
    requireTextContainsPattern: java.lang.String => ParagraphTextValidationBuilder,
    requireTextDoesNotContainPattern: java.lang.String => ParagraphTextValidationBuilder,
    requireTextDoesNotMatchPattern: java.lang.String => ParagraphTextValidationBuilder,
    requireTextLengthGreaterThanOrEqualTo: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => ParagraphTextValidationBuilder,
    requireTextLengthLessThanOrEqualTo: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => ParagraphTextValidationBuilder,
    requireTextMatchesPattern: java.lang.String => ParagraphTextValidationBuilder
  ): ParagraphTextValidationBuilder = {
    val __obj = js.Dynamic.literal(requireTextContainsPattern = js.Any.fromFunction1(requireTextContainsPattern), requireTextDoesNotContainPattern = js.Any.fromFunction1(requireTextDoesNotContainPattern), requireTextDoesNotMatchPattern = js.Any.fromFunction1(requireTextDoesNotMatchPattern), requireTextLengthGreaterThanOrEqualTo = js.Any.fromFunction1(requireTextLengthGreaterThanOrEqualTo), requireTextLengthLessThanOrEqualTo = js.Any.fromFunction1(requireTextLengthLessThanOrEqualTo), requireTextMatchesPattern = js.Any.fromFunction1(requireTextMatchesPattern))
  
    __obj.asInstanceOf[ParagraphTextValidationBuilder]
  }
}

