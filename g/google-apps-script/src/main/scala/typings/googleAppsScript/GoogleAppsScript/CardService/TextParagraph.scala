package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A widget that displays text and supports basic HTML formatting.
  *
  *     var textParagraph = CardService.newTextParagraph()
  *         .setText("This is a text paragraph widget. Multiple lines are allowed if needed.");
  */
trait TextParagraph extends StObject {
  
  def setText(text: String): TextParagraph
}
object TextParagraph {
  
  @scala.inline
  def apply(setText: String => TextParagraph): TextParagraph = {
    val __obj = js.Dynamic.literal(setText = js.Any.fromFunction1(setText))
    __obj.asInstanceOf[TextParagraph]
  }
  
  @scala.inline
  implicit class TextParagraphMutableBuilder[Self <: TextParagraph] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetText(value: String => TextParagraph): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
  }
}
