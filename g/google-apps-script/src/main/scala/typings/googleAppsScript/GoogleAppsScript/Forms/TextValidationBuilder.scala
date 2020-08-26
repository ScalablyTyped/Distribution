package typings.googleAppsScript.GoogleAppsScript.Forms

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A DataValidationBuilder for a TextValidation.
  *
  *     // Add a text item to a form and require it to be a number within a range.
  *     var textItem = form.addTextItem().setTitle('Pick a number between 1 and 100?');
  *     var textValidation = FormApp.createTextValidation()
  *       .setHelpText(“Input was not a number between 1 and 100.”)
  *       .requireNumberBetween(1, 100);
  *     textItem.setValidation(textValidation);
  */
@js.native
trait TextValidationBuilder extends js.Object {
  def requireNumber(): TextValidationBuilder = js.native
  def requireNumberBetween(start: Double, end: Double): TextValidationBuilder = js.native
  def requireNumberEqualTo(number: Double): TextValidationBuilder = js.native
  def requireNumberGreaterThan(number: Double): TextValidationBuilder = js.native
  def requireNumberGreaterThanOrEqualTo(number: Double): TextValidationBuilder = js.native
  def requireNumberLessThan(number: Double): TextValidationBuilder = js.native
  def requireNumberLessThanOrEqualTo(number: Double): TextValidationBuilder = js.native
  def requireNumberNotBetween(start: Double, end: Double): TextValidationBuilder = js.native
  def requireNumberNotEqualTo(number: Double): TextValidationBuilder = js.native
  def requireTextContainsPattern(pattern: String): TextValidationBuilder = js.native
  def requireTextDoesNotContainPattern(pattern: String): TextValidationBuilder = js.native
  def requireTextDoesNotMatchPattern(pattern: String): TextValidationBuilder = js.native
  def requireTextIsEmail(): TextValidationBuilder = js.native
  def requireTextIsUrl(): TextValidationBuilder = js.native
  def requireTextLengthGreaterThanOrEqualTo(number: Integer): TextValidationBuilder = js.native
  def requireTextLengthLessThanOrEqualTo(number: Integer): TextValidationBuilder = js.native
  def requireTextMatchesPattern(pattern: String): TextValidationBuilder = js.native
  def requireWholeNumber(): TextValidationBuilder = js.native
}

object TextValidationBuilder {
  @scala.inline
  def apply(
    requireNumber: () => TextValidationBuilder,
    requireNumberBetween: (Double, Double) => TextValidationBuilder,
    requireNumberEqualTo: Double => TextValidationBuilder,
    requireNumberGreaterThan: Double => TextValidationBuilder,
    requireNumberGreaterThanOrEqualTo: Double => TextValidationBuilder,
    requireNumberLessThan: Double => TextValidationBuilder,
    requireNumberLessThanOrEqualTo: Double => TextValidationBuilder,
    requireNumberNotBetween: (Double, Double) => TextValidationBuilder,
    requireNumberNotEqualTo: Double => TextValidationBuilder,
    requireTextContainsPattern: String => TextValidationBuilder,
    requireTextDoesNotContainPattern: String => TextValidationBuilder,
    requireTextDoesNotMatchPattern: String => TextValidationBuilder,
    requireTextIsEmail: () => TextValidationBuilder,
    requireTextIsUrl: () => TextValidationBuilder,
    requireTextLengthGreaterThanOrEqualTo: Integer => TextValidationBuilder,
    requireTextLengthLessThanOrEqualTo: Integer => TextValidationBuilder,
    requireTextMatchesPattern: String => TextValidationBuilder,
    requireWholeNumber: () => TextValidationBuilder
  ): TextValidationBuilder = {
    val __obj = js.Dynamic.literal(requireNumber = js.Any.fromFunction0(requireNumber), requireNumberBetween = js.Any.fromFunction2(requireNumberBetween), requireNumberEqualTo = js.Any.fromFunction1(requireNumberEqualTo), requireNumberGreaterThan = js.Any.fromFunction1(requireNumberGreaterThan), requireNumberGreaterThanOrEqualTo = js.Any.fromFunction1(requireNumberGreaterThanOrEqualTo), requireNumberLessThan = js.Any.fromFunction1(requireNumberLessThan), requireNumberLessThanOrEqualTo = js.Any.fromFunction1(requireNumberLessThanOrEqualTo), requireNumberNotBetween = js.Any.fromFunction2(requireNumberNotBetween), requireNumberNotEqualTo = js.Any.fromFunction1(requireNumberNotEqualTo), requireTextContainsPattern = js.Any.fromFunction1(requireTextContainsPattern), requireTextDoesNotContainPattern = js.Any.fromFunction1(requireTextDoesNotContainPattern), requireTextDoesNotMatchPattern = js.Any.fromFunction1(requireTextDoesNotMatchPattern), requireTextIsEmail = js.Any.fromFunction0(requireTextIsEmail), requireTextIsUrl = js.Any.fromFunction0(requireTextIsUrl), requireTextLengthGreaterThanOrEqualTo = js.Any.fromFunction1(requireTextLengthGreaterThanOrEqualTo), requireTextLengthLessThanOrEqualTo = js.Any.fromFunction1(requireTextLengthLessThanOrEqualTo), requireTextMatchesPattern = js.Any.fromFunction1(requireTextMatchesPattern), requireWholeNumber = js.Any.fromFunction0(requireWholeNumber))
    __obj.asInstanceOf[TextValidationBuilder]
  }
  @scala.inline
  implicit class TextValidationBuilderOps[Self <: TextValidationBuilder] (val x: Self) extends AnyVal {
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
    def setRequireNumber(value: () => TextValidationBuilder): Self = this.set("requireNumber", js.Any.fromFunction0(value))
    @scala.inline
    def setRequireNumberBetween(value: (Double, Double) => TextValidationBuilder): Self = this.set("requireNumberBetween", js.Any.fromFunction2(value))
    @scala.inline
    def setRequireNumberEqualTo(value: Double => TextValidationBuilder): Self = this.set("requireNumberEqualTo", js.Any.fromFunction1(value))
    @scala.inline
    def setRequireNumberGreaterThan(value: Double => TextValidationBuilder): Self = this.set("requireNumberGreaterThan", js.Any.fromFunction1(value))
    @scala.inline
    def setRequireNumberGreaterThanOrEqualTo(value: Double => TextValidationBuilder): Self = this.set("requireNumberGreaterThanOrEqualTo", js.Any.fromFunction1(value))
    @scala.inline
    def setRequireNumberLessThan(value: Double => TextValidationBuilder): Self = this.set("requireNumberLessThan", js.Any.fromFunction1(value))
    @scala.inline
    def setRequireNumberLessThanOrEqualTo(value: Double => TextValidationBuilder): Self = this.set("requireNumberLessThanOrEqualTo", js.Any.fromFunction1(value))
    @scala.inline
    def setRequireNumberNotBetween(value: (Double, Double) => TextValidationBuilder): Self = this.set("requireNumberNotBetween", js.Any.fromFunction2(value))
    @scala.inline
    def setRequireNumberNotEqualTo(value: Double => TextValidationBuilder): Self = this.set("requireNumberNotEqualTo", js.Any.fromFunction1(value))
    @scala.inline
    def setRequireTextContainsPattern(value: String => TextValidationBuilder): Self = this.set("requireTextContainsPattern", js.Any.fromFunction1(value))
    @scala.inline
    def setRequireTextDoesNotContainPattern(value: String => TextValidationBuilder): Self = this.set("requireTextDoesNotContainPattern", js.Any.fromFunction1(value))
    @scala.inline
    def setRequireTextDoesNotMatchPattern(value: String => TextValidationBuilder): Self = this.set("requireTextDoesNotMatchPattern", js.Any.fromFunction1(value))
    @scala.inline
    def setRequireTextIsEmail(value: () => TextValidationBuilder): Self = this.set("requireTextIsEmail", js.Any.fromFunction0(value))
    @scala.inline
    def setRequireTextIsUrl(value: () => TextValidationBuilder): Self = this.set("requireTextIsUrl", js.Any.fromFunction0(value))
    @scala.inline
    def setRequireTextLengthGreaterThanOrEqualTo(value: Integer => TextValidationBuilder): Self = this.set("requireTextLengthGreaterThanOrEqualTo", js.Any.fromFunction1(value))
    @scala.inline
    def setRequireTextLengthLessThanOrEqualTo(value: Integer => TextValidationBuilder): Self = this.set("requireTextLengthLessThanOrEqualTo", js.Any.fromFunction1(value))
    @scala.inline
    def setRequireTextMatchesPattern(value: String => TextValidationBuilder): Self = this.set("requireTextMatchesPattern", js.Any.fromFunction1(value))
    @scala.inline
    def setRequireWholeNumber(value: () => TextValidationBuilder): Self = this.set("requireWholeNumber", js.Any.fromFunction0(value))
  }
  
}

