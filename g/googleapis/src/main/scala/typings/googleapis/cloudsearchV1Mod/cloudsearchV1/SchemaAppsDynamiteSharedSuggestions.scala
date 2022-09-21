package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedSuggestions extends StObject {
  
  /**
    * A list of suggestions items which will be used in are used in autocomplete.
    */
  var items: js.UndefOr[js.Array[SchemaAppsDynamiteSharedSuggestionsSuggestionItem]] = js.undefined
}
object SchemaAppsDynamiteSharedSuggestions {
  
  inline def apply(): SchemaAppsDynamiteSharedSuggestions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedSuggestions]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedSuggestions](x: Self) {
    
    inline def setItems(value: js.Array[SchemaAppsDynamiteSharedSuggestionsSuggestionItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaAppsDynamiteSharedSuggestionsSuggestionItem*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
