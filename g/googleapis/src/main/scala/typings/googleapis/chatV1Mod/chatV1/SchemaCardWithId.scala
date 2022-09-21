package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCardWithId extends StObject {
  
  /**
    * Card proto that allows Chat apps to specify UI elements and editable widgets.
    */
  var card: js.UndefOr[SchemaGoogleAppsCardV1Card] = js.undefined
  
  /**
    * Required for `cardsV2` messages. Chat app-specified identifier for this widget. Scoped within a message.
    */
  var cardId: js.UndefOr[String | Null] = js.undefined
}
object SchemaCardWithId {
  
  inline def apply(): SchemaCardWithId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCardWithId]
  }
  
  extension [Self <: SchemaCardWithId](x: Self) {
    
    inline def setCard(value: SchemaGoogleAppsCardV1Card): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardId(value: String): Self = StObject.set(x, "cardId", value.asInstanceOf[js.Any])
    
    inline def setCardIdNull: Self = StObject.set(x, "cardId", null)
    
    inline def setCardIdUndefined: Self = StObject.set(x, "cardId", js.undefined)
    
    inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
  }
}
