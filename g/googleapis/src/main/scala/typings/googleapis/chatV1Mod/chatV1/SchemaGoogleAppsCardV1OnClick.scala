package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsCardV1OnClick extends StObject {
  
  /**
    * If specified, an action is triggered by this `onClick`.
    */
  var action: js.UndefOr[SchemaGoogleAppsCardV1Action] = js.undefined
  
  /**
    * A new card is pushed to the card stack after clicking if specified.
    */
  var card: js.UndefOr[SchemaGoogleAppsCardV1Card] = js.undefined
  
  /**
    * An add-on triggers this action when the action needs to open a link. This differs from the `open_link` above in that this needs to talk to server to get the link. Thus some preparation work is required for web client to do before the open link action response comes back.
    */
  var openDynamicLinkAction: js.UndefOr[SchemaGoogleAppsCardV1Action] = js.undefined
  
  /**
    * If specified, this `onClick` triggers an open link action.
    */
  var openLink: js.UndefOr[SchemaGoogleAppsCardV1OpenLink] = js.undefined
}
object SchemaGoogleAppsCardV1OnClick {
  
  inline def apply(): SchemaGoogleAppsCardV1OnClick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsCardV1OnClick]
  }
  
  extension [Self <: SchemaGoogleAppsCardV1OnClick](x: Self) {
    
    inline def setAction(value: SchemaGoogleAppsCardV1Action): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setCard(value: SchemaGoogleAppsCardV1Card): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    
    inline def setOpenDynamicLinkAction(value: SchemaGoogleAppsCardV1Action): Self = StObject.set(x, "openDynamicLinkAction", value.asInstanceOf[js.Any])
    
    inline def setOpenDynamicLinkActionUndefined: Self = StObject.set(x, "openDynamicLinkAction", js.undefined)
    
    inline def setOpenLink(value: SchemaGoogleAppsCardV1OpenLink): Self = StObject.set(x, "openLink", value.asInstanceOf[js.Any])
    
    inline def setOpenLinkUndefined: Self = StObject.set(x, "openLink", js.undefined)
  }
}
