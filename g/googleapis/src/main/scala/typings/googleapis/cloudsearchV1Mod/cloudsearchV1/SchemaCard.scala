package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCard extends StObject {
  
  var cardActions: js.UndefOr[js.Array[SchemaCardAction]] = js.undefined
  
  var displayStyle: js.UndefOr[String | Null] = js.undefined
  
  var fixedFooter: js.UndefOr[SchemaFixedFooter] = js.undefined
  
  var header: js.UndefOr[SchemaCardHeader] = js.undefined
  
  /**
    * Name of the card used in CardNavigation.pop_to_card_name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * When displaying contextual content, the peek card header acts as a placeholder so that the user can navigate forward between the homepage cards and the contextual cards.
    */
  var peekCardHeader: js.UndefOr[SchemaCardHeader] = js.undefined
  
  var sections: js.UndefOr[js.Array[SchemaSection]] = js.undefined
}
object SchemaCard {
  
  inline def apply(): SchemaCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCard]
  }
  
  extension [Self <: SchemaCard](x: Self) {
    
    inline def setCardActions(value: js.Array[SchemaCardAction]): Self = StObject.set(x, "cardActions", value.asInstanceOf[js.Any])
    
    inline def setCardActionsUndefined: Self = StObject.set(x, "cardActions", js.undefined)
    
    inline def setCardActionsVarargs(value: SchemaCardAction*): Self = StObject.set(x, "cardActions", js.Array(value*))
    
    inline def setDisplayStyle(value: String): Self = StObject.set(x, "displayStyle", value.asInstanceOf[js.Any])
    
    inline def setDisplayStyleNull: Self = StObject.set(x, "displayStyle", null)
    
    inline def setDisplayStyleUndefined: Self = StObject.set(x, "displayStyle", js.undefined)
    
    inline def setFixedFooter(value: SchemaFixedFooter): Self = StObject.set(x, "fixedFooter", value.asInstanceOf[js.Any])
    
    inline def setFixedFooterUndefined: Self = StObject.set(x, "fixedFooter", js.undefined)
    
    inline def setHeader(value: SchemaCardHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPeekCardHeader(value: SchemaCardHeader): Self = StObject.set(x, "peekCardHeader", value.asInstanceOf[js.Any])
    
    inline def setPeekCardHeaderUndefined: Self = StObject.set(x, "peekCardHeader", js.undefined)
    
    inline def setSections(value: js.Array[SchemaSection]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    inline def setSectionsUndefined: Self = StObject.set(x, "sections", js.undefined)
    
    inline def setSectionsVarargs(value: SchemaSection*): Self = StObject.set(x, "sections", js.Array(value*))
  }
}
