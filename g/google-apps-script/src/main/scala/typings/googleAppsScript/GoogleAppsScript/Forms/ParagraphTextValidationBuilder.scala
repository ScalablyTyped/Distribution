package typings.googleAppsScript.GoogleAppsScript.Forms

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A DataValidationBuilder for a ParagraphTextValidation.
  *
  *     // Add a paragraph text item to a form and require the answer to be at least 100 characters.
  *     var paragraphTextItem = form.addParagraphTextItem().setTitle('Describe yourself:');
  *     var paragraphtextValidation = FormApp.createParagraphTextValidation()
  *       .setHelpText(“Answer must be more than 100 characters.”)
  *       .requireTextLengthLessThanOrEqualTo(100)
  *       .build();
  *     paragraphTextItem.setValidation(paragraphtextValidation);
  */
trait ParagraphTextValidationBuilder extends StObject {
  
  def build(): ParagraphTextValidation
  
  def requireTextContainsPattern(pattern: String): ParagraphTextValidationBuilder
  
  def requireTextDoesNotContainPattern(pattern: String): ParagraphTextValidationBuilder
  
  def requireTextDoesNotMatchPattern(pattern: String): ParagraphTextValidationBuilder
  
  def requireTextLengthGreaterThanOrEqualTo(number: Integer): ParagraphTextValidationBuilder
  
  def requireTextLengthLessThanOrEqualTo(number: Integer): ParagraphTextValidationBuilder
  
  def requireTextMatchesPattern(pattern: String): ParagraphTextValidationBuilder
}
object ParagraphTextValidationBuilder {
  
  inline def apply(
    build: () => ParagraphTextValidation,
    requireTextContainsPattern: String => ParagraphTextValidationBuilder,
    requireTextDoesNotContainPattern: String => ParagraphTextValidationBuilder,
    requireTextDoesNotMatchPattern: String => ParagraphTextValidationBuilder,
    requireTextLengthGreaterThanOrEqualTo: Integer => ParagraphTextValidationBuilder,
    requireTextLengthLessThanOrEqualTo: Integer => ParagraphTextValidationBuilder,
    requireTextMatchesPattern: String => ParagraphTextValidationBuilder
  ): ParagraphTextValidationBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), requireTextContainsPattern = js.Any.fromFunction1(requireTextContainsPattern), requireTextDoesNotContainPattern = js.Any.fromFunction1(requireTextDoesNotContainPattern), requireTextDoesNotMatchPattern = js.Any.fromFunction1(requireTextDoesNotMatchPattern), requireTextLengthGreaterThanOrEqualTo = js.Any.fromFunction1(requireTextLengthGreaterThanOrEqualTo), requireTextLengthLessThanOrEqualTo = js.Any.fromFunction1(requireTextLengthLessThanOrEqualTo), requireTextMatchesPattern = js.Any.fromFunction1(requireTextMatchesPattern))
    __obj.asInstanceOf[ParagraphTextValidationBuilder]
  }
  
  extension [Self <: ParagraphTextValidationBuilder](x: Self) {
    
    inline def setBuild(value: () => ParagraphTextValidation): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    inline def setRequireTextContainsPattern(value: String => ParagraphTextValidationBuilder): Self = StObject.set(x, "requireTextContainsPattern", js.Any.fromFunction1(value))
    
    inline def setRequireTextDoesNotContainPattern(value: String => ParagraphTextValidationBuilder): Self = StObject.set(x, "requireTextDoesNotContainPattern", js.Any.fromFunction1(value))
    
    inline def setRequireTextDoesNotMatchPattern(value: String => ParagraphTextValidationBuilder): Self = StObject.set(x, "requireTextDoesNotMatchPattern", js.Any.fromFunction1(value))
    
    inline def setRequireTextLengthGreaterThanOrEqualTo(value: Integer => ParagraphTextValidationBuilder): Self = StObject.set(x, "requireTextLengthGreaterThanOrEqualTo", js.Any.fromFunction1(value))
    
    inline def setRequireTextLengthLessThanOrEqualTo(value: Integer => ParagraphTextValidationBuilder): Self = StObject.set(x, "requireTextLengthLessThanOrEqualTo", js.Any.fromFunction1(value))
    
    inline def setRequireTextMatchesPattern(value: String => ParagraphTextValidationBuilder): Self = StObject.set(x, "requireTextMatchesPattern", js.Any.fromFunction1(value))
  }
}
