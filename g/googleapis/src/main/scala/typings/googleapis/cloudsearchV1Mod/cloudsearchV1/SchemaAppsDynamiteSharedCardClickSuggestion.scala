package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedCardClickSuggestion extends StObject {
  
  /**
    * Identify the button/action that created the suggestion. A simple example would be a card button within the stream, or the id which can identify a specific suggestion.
    */
  var actionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The message_id for the message that was posted by the app/bot.
    */
  var suggestionMessageId: js.UndefOr[SchemaMessageId] = js.undefined
}
object SchemaAppsDynamiteSharedCardClickSuggestion {
  
  inline def apply(): SchemaAppsDynamiteSharedCardClickSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedCardClickSuggestion]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedCardClickSuggestion](x: Self) {
    
    inline def setActionId(value: String): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
    
    inline def setActionIdNull: Self = StObject.set(x, "actionId", null)
    
    inline def setActionIdUndefined: Self = StObject.set(x, "actionId", js.undefined)
    
    inline def setSuggestionMessageId(value: SchemaMessageId): Self = StObject.set(x, "suggestionMessageId", value.asInstanceOf[js.Any])
    
    inline def setSuggestionMessageIdUndefined: Self = StObject.set(x, "suggestionMessageId", js.undefined)
  }
}
