package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsCardV1CardAction extends StObject {
  
  /**
    * The label that displays as the action menu item.
    */
  var actionLabel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The `onClick` action for this action item.
    */
  var onClick: js.UndefOr[SchemaGoogleAppsCardV1OnClick] = js.undefined
}
object SchemaGoogleAppsCardV1CardAction {
  
  inline def apply(): SchemaGoogleAppsCardV1CardAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsCardV1CardAction]
  }
  
  extension [Self <: SchemaGoogleAppsCardV1CardAction](x: Self) {
    
    inline def setActionLabel(value: String): Self = StObject.set(x, "actionLabel", value.asInstanceOf[js.Any])
    
    inline def setActionLabelNull: Self = StObject.set(x, "actionLabel", null)
    
    inline def setActionLabelUndefined: Self = StObject.set(x, "actionLabel", js.undefined)
    
    inline def setOnClick(value: SchemaGoogleAppsCardV1OnClick): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
