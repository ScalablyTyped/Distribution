package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedAssistantFeedbackContext extends StObject {
  
  /**
    * Specifies a list of feedback chips to show
    */
  var feedbackChips: js.UndefOr[js.Array[SchemaAppsDynamiteSharedAssistantFeedbackContextFeedbackChip]] = js.undefined
  
  /**
    * Whether the thumbs feedback is provided
    */
  var thumbsFeedback: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppsDynamiteSharedAssistantFeedbackContext {
  
  inline def apply(): SchemaAppsDynamiteSharedAssistantFeedbackContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedAssistantFeedbackContext]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedAssistantFeedbackContext](x: Self) {
    
    inline def setFeedbackChips(value: js.Array[SchemaAppsDynamiteSharedAssistantFeedbackContextFeedbackChip]): Self = StObject.set(x, "feedbackChips", value.asInstanceOf[js.Any])
    
    inline def setFeedbackChipsUndefined: Self = StObject.set(x, "feedbackChips", js.undefined)
    
    inline def setFeedbackChipsVarargs(value: SchemaAppsDynamiteSharedAssistantFeedbackContextFeedbackChip*): Self = StObject.set(x, "feedbackChips", js.Array(value*))
    
    inline def setThumbsFeedback(value: String): Self = StObject.set(x, "thumbsFeedback", value.asInstanceOf[js.Any])
    
    inline def setThumbsFeedbackNull: Self = StObject.set(x, "thumbsFeedback", null)
    
    inline def setThumbsFeedbackUndefined: Self = StObject.set(x, "thumbsFeedback", js.undefined)
  }
}
