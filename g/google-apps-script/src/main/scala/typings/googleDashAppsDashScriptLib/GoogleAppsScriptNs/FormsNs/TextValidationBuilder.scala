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

