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
    requireTextContainsPattern: js.Function1[java.lang.String, ParagraphTextValidationBuilder],
    requireTextDoesNotContainPattern: js.Function1[java.lang.String, ParagraphTextValidationBuilder],
    requireTextDoesNotMatchPattern: js.Function1[java.lang.String, ParagraphTextValidationBuilder],
    requireTextLengthGreaterThanOrEqualTo: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      ParagraphTextValidationBuilder
    ],
    requireTextLengthLessThanOrEqualTo: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      ParagraphTextValidationBuilder
    ],
    requireTextMatchesPattern: js.Function1[java.lang.String, ParagraphTextValidationBuilder]
  ): ParagraphTextValidationBuilder = {
    val __obj = js.Dynamic.literal(requireTextContainsPattern = requireTextContainsPattern, requireTextDoesNotContainPattern = requireTextDoesNotContainPattern, requireTextDoesNotMatchPattern = requireTextDoesNotMatchPattern, requireTextLengthGreaterThanOrEqualTo = requireTextLengthGreaterThanOrEqualTo, requireTextLengthLessThanOrEqualTo = requireTextLengthLessThanOrEqualTo, requireTextMatchesPattern = requireTextMatchesPattern)
  
    __obj.asInstanceOf[ParagraphTextValidationBuilder]
  }
}

