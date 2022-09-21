package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChatV1ContextualAddOnMarkupCardSection extends StObject {
  
  /**
    * The header of the section, text formatted supported.
    */
  var header: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A section must contain at least 1 widget.
    */
  var widgets: js.UndefOr[js.Array[SchemaGoogleChatV1WidgetMarkup]] = js.undefined
}
object SchemaGoogleChatV1ContextualAddOnMarkupCardSection {
  
  inline def apply(): SchemaGoogleChatV1ContextualAddOnMarkupCardSection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChatV1ContextualAddOnMarkupCardSection]
  }
  
  extension [Self <: SchemaGoogleChatV1ContextualAddOnMarkupCardSection](x: Self) {
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderNull: Self = StObject.set(x, "header", null)
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setWidgets(value: js.Array[SchemaGoogleChatV1WidgetMarkup]): Self = StObject.set(x, "widgets", value.asInstanceOf[js.Any])
    
    inline def setWidgetsUndefined: Self = StObject.set(x, "widgets", js.undefined)
    
    inline def setWidgetsVarargs(value: SchemaGoogleChatV1WidgetMarkup*): Self = StObject.set(x, "widgets", js.Array(value*))
  }
}
