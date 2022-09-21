package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsCardV1SuggestionItem extends StObject {
  
  /**
    * The suggested autocomplete result.
    */
  var text: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAppsCardV1SuggestionItem {
  
  inline def apply(): SchemaGoogleAppsCardV1SuggestionItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsCardV1SuggestionItem]
  }
  
  extension [Self <: SchemaGoogleAppsCardV1SuggestionItem](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
