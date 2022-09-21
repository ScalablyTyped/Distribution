package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedAssistantSuggestion extends StObject {
  
  /**
    * Info regarding suggestion debug information.
    */
  var debugContext: js.UndefOr[SchemaAppsDynamiteSharedAssistantDebugContext] = js.undefined
  
  /**
    * Data for rendering feedback.
    */
  var feedbackContext: js.UndefOr[SchemaAppsDynamiteSharedAssistantFeedbackContext] = js.undefined
  
  /**
    * Suggestion type that suggests documents (docs, slides, sheets).
    */
  var findDocumentSuggestion: js.UndefOr[SchemaAppsDynamiteSharedFindDocumentSuggestion] = js.undefined
  
  /**
    * String representation of the suggestions provided.
    */
  var serializedSuggestions: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Session context specific to the Assistant suggestion.
    */
  var sessionContext: js.UndefOr[SchemaAppsDynamiteSharedAssistantSessionContext] = js.undefined
}
object SchemaAppsDynamiteSharedAssistantSuggestion {
  
  inline def apply(): SchemaAppsDynamiteSharedAssistantSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedAssistantSuggestion]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedAssistantSuggestion](x: Self) {
    
    inline def setDebugContext(value: SchemaAppsDynamiteSharedAssistantDebugContext): Self = StObject.set(x, "debugContext", value.asInstanceOf[js.Any])
    
    inline def setDebugContextUndefined: Self = StObject.set(x, "debugContext", js.undefined)
    
    inline def setFeedbackContext(value: SchemaAppsDynamiteSharedAssistantFeedbackContext): Self = StObject.set(x, "feedbackContext", value.asInstanceOf[js.Any])
    
    inline def setFeedbackContextUndefined: Self = StObject.set(x, "feedbackContext", js.undefined)
    
    inline def setFindDocumentSuggestion(value: SchemaAppsDynamiteSharedFindDocumentSuggestion): Self = StObject.set(x, "findDocumentSuggestion", value.asInstanceOf[js.Any])
    
    inline def setFindDocumentSuggestionUndefined: Self = StObject.set(x, "findDocumentSuggestion", js.undefined)
    
    inline def setSerializedSuggestions(value: String): Self = StObject.set(x, "serializedSuggestions", value.asInstanceOf[js.Any])
    
    inline def setSerializedSuggestionsNull: Self = StObject.set(x, "serializedSuggestions", null)
    
    inline def setSerializedSuggestionsUndefined: Self = StObject.set(x, "serializedSuggestions", js.undefined)
    
    inline def setSessionContext(value: SchemaAppsDynamiteSharedAssistantSessionContext): Self = StObject.set(x, "sessionContext", value.asInstanceOf[js.Any])
    
    inline def setSessionContextUndefined: Self = StObject.set(x, "sessionContext", js.undefined)
  }
}
