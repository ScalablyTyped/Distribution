package typings.googleAppsScript.GoogleAppsScript.Forms

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait TextValidationBuilder extends StObject {
  
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
  implicit class TextValidationBuilderMutableBuilder[Self <: TextValidationBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequireNumber(value: () => TextValidationBuilder): Self = StObject.set(x, "requireNumber", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRequireNumberBetween(value: (Double, Double) => TextValidationBuilder): Self = StObject.set(x, "requireNumberBetween", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRequireNumberEqualTo(value: Double => TextValidationBuilder): Self = StObject.set(x, "requireNumberEqualTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequireNumberGreaterThan(value: Double => TextValidationBuilder): Self = StObject.set(x, "requireNumberGreaterThan", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequireNumberGreaterThanOrEqualTo(value: Double => TextValidationBuilder): Self = StObject.set(x, "requireNumberGreaterThanOrEqualTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequireNumberLessThan(value: Double => TextValidationBuilder): Self = StObject.set(x, "requireNumberLessThan", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequireNumberLessThanOrEqualTo(value: Double => TextValidationBuilder): Self = StObject.set(x, "requireNumberLessThanOrEqualTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequireNumberNotBetween(value: (Double, Double) => TextValidationBuilder): Self = StObject.set(x, "requireNumberNotBetween", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRequireNumberNotEqualTo(value: Double => TextValidationBuilder): Self = StObject.set(x, "requireNumberNotEqualTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequireTextContainsPattern(value: String => TextValidationBuilder): Self = StObject.set(x, "requireTextContainsPattern", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequireTextDoesNotContainPattern(value: String => TextValidationBuilder): Self = StObject.set(x, "requireTextDoesNotContainPattern", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequireTextDoesNotMatchPattern(value: String => TextValidationBuilder): Self = StObject.set(x, "requireTextDoesNotMatchPattern", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequireTextIsEmail(value: () => TextValidationBuilder): Self = StObject.set(x, "requireTextIsEmail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRequireTextIsUrl(value: () => TextValidationBuilder): Self = StObject.set(x, "requireTextIsUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRequireTextLengthGreaterThanOrEqualTo(value: Integer => TextValidationBuilder): Self = StObject.set(x, "requireTextLengthGreaterThanOrEqualTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequireTextLengthLessThanOrEqualTo(value: Integer => TextValidationBuilder): Self = StObject.set(x, "requireTextLengthLessThanOrEqualTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequireTextMatchesPattern(value: String => TextValidationBuilder): Self = StObject.set(x, "requireTextMatchesPattern", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequireWholeNumber(value: () => TextValidationBuilder): Self = StObject.set(x, "requireWholeNumber", js.Any.fromFunction0(value))
  }
}
