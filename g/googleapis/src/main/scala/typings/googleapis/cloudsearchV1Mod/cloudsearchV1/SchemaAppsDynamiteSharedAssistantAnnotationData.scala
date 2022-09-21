package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedAssistantAnnotationData extends StObject {
  
  /**
    * The suggestion to render in the card.
    */
  var suggestion: js.UndefOr[SchemaAppsDynamiteSharedAssistantSuggestion] = js.undefined
  
  /**
    * Set when the initial query was unfulfillable. Only an on-demand unfulfillable query will result in a response (not a proactive query). 1. On-demand: user explicitly invokes the bot 2. Proactive: bot makes proactive suggestion (when available) by listening to all user messages.
    */
  var unfulfillable: js.UndefOr[SchemaAppsDynamiteSharedAssistantUnfulfillableRequest] = js.undefined
}
object SchemaAppsDynamiteSharedAssistantAnnotationData {
  
  inline def apply(): SchemaAppsDynamiteSharedAssistantAnnotationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedAssistantAnnotationData]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedAssistantAnnotationData](x: Self) {
    
    inline def setSuggestion(value: SchemaAppsDynamiteSharedAssistantSuggestion): Self = StObject.set(x, "suggestion", value.asInstanceOf[js.Any])
    
    inline def setSuggestionUndefined: Self = StObject.set(x, "suggestion", js.undefined)
    
    inline def setUnfulfillable(value: SchemaAppsDynamiteSharedAssistantUnfulfillableRequest): Self = StObject.set(x, "unfulfillable", value.asInstanceOf[js.Any])
    
    inline def setUnfulfillableUndefined: Self = StObject.set(x, "unfulfillable", js.undefined)
  }
}
