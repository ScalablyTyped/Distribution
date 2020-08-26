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
@js.native
trait ParagraphTextValidationBuilder extends js.Object {
  def requireTextContainsPattern(pattern: String): ParagraphTextValidationBuilder = js.native
  def requireTextDoesNotContainPattern(pattern: String): ParagraphTextValidationBuilder = js.native
  def requireTextDoesNotMatchPattern(pattern: String): ParagraphTextValidationBuilder = js.native
  def requireTextLengthGreaterThanOrEqualTo(number: Integer): ParagraphTextValidationBuilder = js.native
  def requireTextLengthLessThanOrEqualTo(number: Integer): ParagraphTextValidationBuilder = js.native
  def requireTextMatchesPattern(pattern: String): ParagraphTextValidationBuilder = js.native
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
  @scala.inline
  implicit class ParagraphTextValidationBuilderOps[Self <: ParagraphTextValidationBuilder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRequireTextContainsPattern(value: String => ParagraphTextValidationBuilder): Self = this.set("requireTextContainsPattern", js.Any.fromFunction1(value))
    @scala.inline
    def setRequireTextDoesNotContainPattern(value: String => ParagraphTextValidationBuilder): Self = this.set("requireTextDoesNotContainPattern", js.Any.fromFunction1(value))
    @scala.inline
    def setRequireTextDoesNotMatchPattern(value: String => ParagraphTextValidationBuilder): Self = this.set("requireTextDoesNotMatchPattern", js.Any.fromFunction1(value))
    @scala.inline
    def setRequireTextLengthGreaterThanOrEqualTo(value: Integer => ParagraphTextValidationBuilder): Self = this.set("requireTextLengthGreaterThanOrEqualTo", js.Any.fromFunction1(value))
    @scala.inline
    def setRequireTextLengthLessThanOrEqualTo(value: Integer => ParagraphTextValidationBuilder): Self = this.set("requireTextLengthLessThanOrEqualTo", js.Any.fromFunction1(value))
    @scala.inline
    def setRequireTextMatchesPattern(value: String => ParagraphTextValidationBuilder): Self = this.set("requireTextMatchesPattern", js.Any.fromFunction1(value))
  }
  
}

