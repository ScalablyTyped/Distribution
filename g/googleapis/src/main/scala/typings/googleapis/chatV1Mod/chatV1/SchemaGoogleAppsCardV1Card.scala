package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsCardV1Card extends StObject {
  
  /**
    * The card's actions. Actions are added to the card's generated toolbar menu. For example, the following JSON constructs a card action menu with Settings and Send Feedback options: ``` "card_actions": [ { "actionLabel": "Settings", "onClick": { "action": { "functionName": "goToView", "parameters": [ { "key": "viewType", "value": "SETTING" \} ], "loadIndicator": "LoadIndicator.SPINNER" \} \} \}, { "actionLabel": "Send Feedback", "onClick": { "openLink": { "url": "https://example.com/feedback" \} \} \} ] ```
    */
  var cardActions: js.UndefOr[js.Array[SchemaGoogleAppsCardV1CardAction]] = js.undefined
  
  /**
    * The `peekCardHeader` display style for. Not supported by Google Chat apps.
    */
  var displayStyle: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The fixed footer shown at the bottom of this card.
    */
  var fixedFooter: js.UndefOr[SchemaGoogleAppsCardV1CardFixedFooter] = js.undefined
  
  /**
    * The header of the card. A header usually contains a title and an image.
    */
  var header: js.UndefOr[SchemaGoogleAppsCardV1CardHeader] = js.undefined
  
  /**
    * Name of the card. Used as a card identifier in card navigation.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * When displaying contextual content, the peek card header acts as a placeholder so that the user can navigate forward between the homepage cards and the contextual cards. Not supported by Google Chat apps.
    */
  var peekCardHeader: js.UndefOr[SchemaGoogleAppsCardV1CardHeader] = js.undefined
  
  /**
    * Sections are separated by a line divider.
    */
  var sections: js.UndefOr[js.Array[SchemaGoogleAppsCardV1Section]] = js.undefined
}
object SchemaGoogleAppsCardV1Card {
  
  inline def apply(): SchemaGoogleAppsCardV1Card = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsCardV1Card]
  }
  
  extension [Self <: SchemaGoogleAppsCardV1Card](x: Self) {
    
    inline def setCardActions(value: js.Array[SchemaGoogleAppsCardV1CardAction]): Self = StObject.set(x, "cardActions", value.asInstanceOf[js.Any])
    
    inline def setCardActionsUndefined: Self = StObject.set(x, "cardActions", js.undefined)
    
    inline def setCardActionsVarargs(value: SchemaGoogleAppsCardV1CardAction*): Self = StObject.set(x, "cardActions", js.Array(value*))
    
    inline def setDisplayStyle(value: String): Self = StObject.set(x, "displayStyle", value.asInstanceOf[js.Any])
    
    inline def setDisplayStyleNull: Self = StObject.set(x, "displayStyle", null)
    
    inline def setDisplayStyleUndefined: Self = StObject.set(x, "displayStyle", js.undefined)
    
    inline def setFixedFooter(value: SchemaGoogleAppsCardV1CardFixedFooter): Self = StObject.set(x, "fixedFooter", value.asInstanceOf[js.Any])
    
    inline def setFixedFooterUndefined: Self = StObject.set(x, "fixedFooter", js.undefined)
    
    inline def setHeader(value: SchemaGoogleAppsCardV1CardHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPeekCardHeader(value: SchemaGoogleAppsCardV1CardHeader): Self = StObject.set(x, "peekCardHeader", value.asInstanceOf[js.Any])
    
    inline def setPeekCardHeaderUndefined: Self = StObject.set(x, "peekCardHeader", js.undefined)
    
    inline def setSections(value: js.Array[SchemaGoogleAppsCardV1Section]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    inline def setSectionsUndefined: Self = StObject.set(x, "sections", js.undefined)
    
    inline def setSectionsVarargs(value: SchemaGoogleAppsCardV1Section*): Self = StObject.set(x, "sections", js.Array(value*))
  }
}
