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

