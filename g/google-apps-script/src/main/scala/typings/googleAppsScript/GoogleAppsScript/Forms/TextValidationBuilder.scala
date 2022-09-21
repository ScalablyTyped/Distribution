package typings.googleAppsScript.GoogleAppsScript.Forms

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait TextValidationBuilder extends StObject {
  
  def build(): TextValidation
  
  def requireNumber(): TextValidationBuilder
  
  def requireNumberBetween(start: Double, end: Double): TextValidationBuilder
  
  def requireNumberEqualTo(number: Double): TextValidationBuilder
  
  def requireNumberGreaterThan(number: Double): TextValidationBuilder
  
  def requireNumberGreaterThanOrEqualTo(number: Double): TextValidationBuilder
  
  def requireNumberLessThan(number: Double): TextValidationBuilder
  
  def requireNumberLessThanOrEqualTo(number: Double): TextValidationBuilder
  
  def requireNumberNotBetween(start: Double, end: Double): TextValidationBuilder
  
  def requireNumberNotEqualTo(number: Double): TextValidationBuilder
  
  def requireTextContainsPattern(pattern: String): TextValidationBuilder
  
  def requireTextDoesNotContainPattern(pattern: String): TextValidationBuilder
  
  def requireTextDoesNotMatchPattern(pattern: String): TextValidationBuilder
  
  def requireTextIsEmail(): TextValidationBuilder
  
  def requireTextIsUrl(): TextValidationBuilder
  
  def requireTextLengthGreaterThanOrEqualTo(number: Integer): TextValidationBuilder
  
  def requireTextLengthLessThanOrEqualTo(number: Integer): TextValidationBuilder
  
  def requireTextMatchesPattern(pattern: String): TextValidationBuilder
  
  def requireWholeNumber(): TextValidationBuilder
}
object TextValidationBuilder {
  
  inline def apply(
    build: () => TextValidation,
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
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), requireNumber = js.Any.fromFunction0(requireNumber), requireNumberBetween = js.Any.fromFunction2(requireNumberBetween), requireNumberEqualTo = js.Any.fromFunction1(requireNumberEqualTo), requireNumberGreaterThan = js.Any.fromFunction1(requireNumberGreaterThan), requireNumberGreaterThanOrEqualTo = js.Any.fromFunction1(requireNumberGreaterThanOrEqualTo), requireNumberLessThan = js.Any.fromFunction1(requireNumberLessThan), requireNumberLessThanOrEqualTo = js.Any.fromFunction1(requireNumberLessThanOrEqualTo), requireNumberNotBetween = js.Any.fromFunction2(requireNumberNotBetween), requireNumberNotEqualTo = js.Any.fromFunction1(requireNumberNotEqualTo), requireTextContainsPattern = js.Any.fromFunction1(requireTextContainsPattern), requireTextDoesNotContainPattern = js.Any.fromFunction1(requireTextDoesNotContainPattern), requireTextDoesNotMatchPattern = js.Any.fromFunction1(requireTextDoesNotMatchPattern), requireTextIsEmail = js.Any.fromFunction0(requireTextIsEmail), requireTextIsUrl = js.Any.fromFunction0(requireTextIsUrl), requireTextLengthGreaterThanOrEqualTo = js.Any.fromFunction1(requireTextLengthGreaterThanOrEqualTo), requireTextLengthLessThanOrEqualTo = js.Any.fromFunction1(requireTextLengthLessThanOrEqualTo), requireTextMatchesPattern = js.Any.fromFunction1(requireTextMatchesPattern), requireWholeNumber = js.Any.fromFunction0(requireWholeNumber))
    __obj.asInstanceOf[TextValidationBuilder]
  }
  
  extension [Self <: TextValidationBuilder](x: Self) {
    
    inline def setBuild(value: () => TextValidation): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    inline def setRequireNumber(value: () => TextValidationBuilder): Self = StObject.set(x, "requireNumber", js.Any.fromFunction0(value))
    
    inline def setRequireNumberBetween(value: (Double, Double) => TextValidationBuilder): Self = StObject.set(x, "requireNumberBetween", js.Any.fromFunction2(value))
    
    inline def setRequireNumberEqualTo(value: Double => TextValidationBuilder): Self = StObject.set(x, "requireNumberEqualTo", js.Any.fromFunction1(value))
    
    inline def setRequireNumberGreaterThan(value: Double => TextValidationBuilder): Self = StObject.set(x, "requireNumberGreaterThan", js.Any.fromFunction1(value))
    
    inline def setRequireNumberGreaterThanOrEqualTo(value: Double => TextValidationBuilder): Self = StObject.set(x, "requireNumberGreaterThanOrEqualTo", js.Any.fromFunction1(value))
    
    inline def setRequireNumberLessThan(value: Double => TextValidationBuilder): Self = StObject.set(x, "requireNumberLessThan", js.Any.fromFunction1(value))
    
    inline def setRequireNumberLessThanOrEqualTo(value: Double => TextValidationBuilder): Self = StObject.set(x, "requireNumberLessThanOrEqualTo", js.Any.fromFunction1(value))
    
    inline def setRequireNumberNotBetween(value: (Double, Double) => TextValidationBuilder): Self = StObject.set(x, "requireNumberNotBetween", js.Any.fromFunction2(value))
    
    inline def setRequireNumberNotEqualTo(value: Double => TextValidationBuilder): Self = StObject.set(x, "requireNumberNotEqualTo", js.Any.fromFunction1(value))
    
    inline def setRequireTextContainsPattern(value: String => TextValidationBuilder): Self = StObject.set(x, "requireTextContainsPattern", js.Any.fromFunction1(value))
    
    inline def setRequireTextDoesNotContainPattern(value: String => TextValidationBuilder): Self = StObject.set(x, "requireTextDoesNotContainPattern", js.Any.fromFunction1(value))
    
    inline def setRequireTextDoesNotMatchPattern(value: String => TextValidationBuilder): Self = StObject.set(x, "requireTextDoesNotMatchPattern", js.Any.fromFunction1(value))
    
    inline def setRequireTextIsEmail(value: () => TextValidationBuilder): Self = StObject.set(x, "requireTextIsEmail", js.Any.fromFunction0(value))
    
    inline def setRequireTextIsUrl(value: () => TextValidationBuilder): Self = StObject.set(x, "requireTextIsUrl", js.Any.fromFunction0(value))
    
    inline def setRequireTextLengthGreaterThanOrEqualTo(value: Integer => TextValidationBuilder): Self = StObject.set(x, "requireTextLengthGreaterThanOrEqualTo", js.Any.fromFunction1(value))
    
    inline def setRequireTextLengthLessThanOrEqualTo(value: Integer => TextValidationBuilder): Self = StObject.set(x, "requireTextLengthLessThanOrEqualTo", js.Any.fromFunction1(value))
    
    inline def setRequireTextMatchesPattern(value: String => TextValidationBuilder): Self = StObject.set(x, "requireTextMatchesPattern", js.Any.fromFunction1(value))
    
    inline def setRequireWholeNumber(value: () => TextValidationBuilder): Self = StObject.set(x, "requireWholeNumber", js.Any.fromFunction0(value))
  }
}
