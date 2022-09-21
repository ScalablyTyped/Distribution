package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsCardV1Suggestions extends StObject {
  
  /**
    * A list of suggestions used for autocomplete recommendations.
    */
  var items: js.UndefOr[js.Array[SchemaGoogleAppsCardV1SuggestionItem]] = js.undefined
}
object SchemaGoogleAppsCardV1Suggestions {
  
  inline def apply(): SchemaGoogleAppsCardV1Suggestions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsCardV1Suggestions]
  }
  
  extension [Self <: SchemaGoogleAppsCardV1Suggestions](x: Self) {
    
    inline def setItems(value: js.Array[SchemaGoogleAppsCardV1SuggestionItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaGoogleAppsCardV1SuggestionItem*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
