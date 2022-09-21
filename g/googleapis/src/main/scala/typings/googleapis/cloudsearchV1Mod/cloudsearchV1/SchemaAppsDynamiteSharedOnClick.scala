package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedOnClick extends StObject {
  
  /**
    * If specified, an action is triggered by this onClick.
    */
  var action: js.UndefOr[SchemaAppsDynamiteSharedAction] = js.undefined
  
  /**
    * An add-on triggers this action when the action needs to open a link. This differs from the open_link above in that this needs to talk to server to get the link. Thus some preparation work is required for web client to do before the open link action response comes back.
    */
  var openDynamicLinkAction: js.UndefOr[SchemaAppsDynamiteSharedAction] = js.undefined
  
  /**
    * If specified, this onClick triggers an open link action.
    */
  var openLink: js.UndefOr[SchemaAppsDynamiteSharedOpenLink] = js.undefined
}
object SchemaAppsDynamiteSharedOnClick {
  
  inline def apply(): SchemaAppsDynamiteSharedOnClick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedOnClick]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedOnClick](x: Self) {
    
    inline def setAction(value: SchemaAppsDynamiteSharedAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setOpenDynamicLinkAction(value: SchemaAppsDynamiteSharedAction): Self = StObject.set(x, "openDynamicLinkAction", value.asInstanceOf[js.Any])
    
    inline def setOpenDynamicLinkActionUndefined: Self = StObject.set(x, "openDynamicLinkAction", js.undefined)
    
    inline def setOpenLink(value: SchemaAppsDynamiteSharedOpenLink): Self = StObject.set(x, "openLink", value.asInstanceOf[js.Any])
    
    inline def setOpenLinkUndefined: Self = StObject.set(x, "openLink", js.undefined)
  }
}
