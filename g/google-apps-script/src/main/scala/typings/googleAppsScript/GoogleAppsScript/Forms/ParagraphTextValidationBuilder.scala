package typings.googleAppsScript.GoogleAppsScript.Forms

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A DataValidationBuilder for a ParagraphTextValidation.
  *
  *     // Add a paragraph text item to a form and require the answer to be at least 100 characters.
  *     var paragraphTextItem = form.addParagraphTextItem().setTitle('Describe yourself:');
  *     var paragraphtextValidation = FormApp.createParagraphTextValidation()
  *       .setHelpText(“Answer must be more than 100 characters.”)
  *       .requireTextLengthGreatherThan(100);
  *     paragraphTextItem.setValidation(paragraphtextValidation);
  */
trait ParagraphTextValidationBuilder extends js.Object {
  def requireTextContainsPattern(pattern: String): ParagraphTextValidationBuilder
  def requireTextDoesNotContainPattern(pattern: String): ParagraphTextValidationBuilder
  def requireTextDoesNotMatchPattern(pattern: String): ParagraphTextValidationBuilder
  def requireTextLengthGreaterThanOrEqualTo(number: Integer): ParagraphTextValidationBuilder
  def requireTextLengthLessThanOrEqualTo(number: Integer): ParagraphTextValidationBuilder
  def requireTextMatchesPattern(pattern: String): ParagraphTextValidationBuilder
}

object ParagraphTextValidationBuilder {
  @scala.inline
  def apply(
    requireTextContainsPattern: String => ParagraphTextValidationBuilder,
    requireTextDoesNotContainPattern: String => ParagraphTextValidationBuilder,
    requireTextDoesNotMatchPattern: String => ParagraphTextValidationBuilder,
    requireTextLengthGreaterThanOrEqualTo: Integer => ParagraphTextValidationBuilder,
    requireTextLengthLessThanOrEqualTo: Integer => ParagraphTextValidationBuilder,
    requireTextMatchesPattern: String => ParagraphTextValidationBuilder
  ): ParagraphTextValidationBuilder = {
    val __obj = js.Dynamic.literal(requireTextContainsPattern = js.Any.fromFunction1(requireTextContainsPattern), requireTextDoesNotContainPattern = js.Any.fromFunction1(requireTextDoesNotContainPattern), requireTextDoesNotMatchPattern = js.Any.fromFunction1(requireTextDoesNotMatchPattern), requireTextLengthGreaterThanOrEqualTo = js.Any.fromFunction1(requireTextLengthGreaterThanOrEqualTo), requireTextLengthLessThanOrEqualTo = js.Any.fromFunction1(requireTextLengthLessThanOrEqualTo), requireTextMatchesPattern = js.Any.fromFunction1(requireTextMatchesPattern))
    __obj.asInstanceOf[ParagraphTextValidationBuilder]
  }
}

