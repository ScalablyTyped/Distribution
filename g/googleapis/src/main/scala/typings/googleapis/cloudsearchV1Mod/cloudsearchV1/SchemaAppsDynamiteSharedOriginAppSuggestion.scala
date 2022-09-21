package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedOriginAppSuggestion extends StObject {
  
  var appId: js.UndefOr[SchemaAppId] = js.undefined
  
  var cardClickSuggestion: js.UndefOr[SchemaAppsDynamiteSharedCardClickSuggestion] = js.undefined
}
object SchemaAppsDynamiteSharedOriginAppSuggestion {
  
  inline def apply(): SchemaAppsDynamiteSharedOriginAppSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedOriginAppSuggestion]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedOriginAppSuggestion](x: Self) {
    
    inline def setAppId(value: SchemaAppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setCardClickSuggestion(value: SchemaAppsDynamiteSharedCardClickSuggestion): Self = StObject.set(x, "cardClickSuggestion", value.asInstanceOf[js.Any])
    
    inline def setCardClickSuggestionUndefined: Self = StObject.set(x, "cardClickSuggestion", js.undefined)
  }
}
