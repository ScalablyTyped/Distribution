package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedCard extends StObject {
  
  /**
    * The actions of this card. They are added to a card's generated toolbar menu. For example, the following JSON constructs a card action menu with Settings and Send Feedback options: ``` "card_actions": [ { "actionLabel": "Setting", "onClick": { "action": { "functionName": "goToView", "parameters": [ { "key": "viewType", "value": "SETTING" \} ], "loadIndicator": "LoadIndicator.SPINNER" \} \} \}, { "actionLabel": "Send Feedback", "onClick": { "openLink": { "url": "https://example.com/feedback" \} \} \} ] ```
    */
  var cardActions: js.UndefOr[js.Array[SchemaAppsDynamiteSharedCardCardAction]] = js.undefined
  
  /**
    * The header of the card. A header usually contains a title and an image.
    */
  var header: js.UndefOr[SchemaAppsDynamiteSharedCardCardHeader] = js.undefined
  
  /**
    * Name of the card, which is used as a identifier for the card in card navigation.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Sections are separated by a line divider.
    */
  var sections: js.UndefOr[js.Array[SchemaAppsDynamiteSharedCardSection]] = js.undefined
}
object SchemaAppsDynamiteSharedCard {
  
  inline def apply(): SchemaAppsDynamiteSharedCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedCard]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedCard](x: Self) {
    
    inline def setCardActions(value: js.Array[SchemaAppsDynamiteSharedCardCardAction]): Self = StObject.set(x, "cardActions", value.asInstanceOf[js.Any])
    
    inline def setCardActionsUndefined: Self = StObject.set(x, "cardActions", js.undefined)
    
    inline def setCardActionsVarargs(value: SchemaAppsDynamiteSharedCardCardAction*): Self = StObject.set(x, "cardActions", js.Array(value*))
    
    inline def setHeader(value: SchemaAppsDynamiteSharedCardCardHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSections(value: js.Array[SchemaAppsDynamiteSharedCardSection]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    inline def setSectionsUndefined: Self = StObject.set(x, "sections", js.undefined)
    
    inline def setSectionsVarargs(value: SchemaAppsDynamiteSharedCardSection*): Self = StObject.set(x, "sections", js.Array(value*))
  }
}
