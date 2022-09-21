package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedFindDocumentSuggestion extends StObject {
  
  /**
    * List of documents to render as suggestions.
    */
  var documentSuggestions: js.UndefOr[js.Array[SchemaAppsDynamiteSharedDocument]] = js.undefined
  
  /**
    * Whether to show the action buttons in the card for the suggestions.
    */
  var showActionButtons: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaAppsDynamiteSharedFindDocumentSuggestion {
  
  inline def apply(): SchemaAppsDynamiteSharedFindDocumentSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedFindDocumentSuggestion]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedFindDocumentSuggestion](x: Self) {
    
    inline def setDocumentSuggestions(value: js.Array[SchemaAppsDynamiteSharedDocument]): Self = StObject.set(x, "documentSuggestions", value.asInstanceOf[js.Any])
    
    inline def setDocumentSuggestionsUndefined: Self = StObject.set(x, "documentSuggestions", js.undefined)
    
    inline def setDocumentSuggestionsVarargs(value: SchemaAppsDynamiteSharedDocument*): Self = StObject.set(x, "documentSuggestions", js.Array(value*))
    
    inline def setShowActionButtons(value: Boolean): Self = StObject.set(x, "showActionButtons", value.asInstanceOf[js.Any])
    
    inline def setShowActionButtonsNull: Self = StObject.set(x, "showActionButtons", null)
    
    inline def setShowActionButtonsUndefined: Self = StObject.set(x, "showActionButtons", js.undefined)
  }
}
