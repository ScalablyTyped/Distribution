package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCard extends StObject {
  
  /**
    * The actions of this card.
    */
  var cardActions: js.UndefOr[js.Array[SchemaCardAction]] = js.undefined
  
  /**
    * The header of the card. A header usually contains a title and an image.
    */
  var header: js.UndefOr[SchemaCardHeader] = js.undefined
  
  /**
    * Name of the card.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Sections are separated by a line divider.
    */
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
    
    inline def setHeader(value: SchemaCardHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSections(value: js.Array[SchemaSection]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    inline def setSectionsUndefined: Self = StObject.set(x, "sections", js.undefined)
    
    inline def setSectionsVarargs(value: SchemaSection*): Self = StObject.set(x, "sections", js.Array(value*))
  }
}
