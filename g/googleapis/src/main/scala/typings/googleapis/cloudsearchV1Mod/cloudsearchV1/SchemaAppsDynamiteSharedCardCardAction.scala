package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedCardCardAction extends StObject {
  
  /**
    * The label that displays as the action menu item.
    */
  var actionLabel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The onclick action for this action item.
    */
  var onClick: js.UndefOr[SchemaAppsDynamiteSharedOnClick] = js.undefined
}
object SchemaAppsDynamiteSharedCardCardAction {
  
  inline def apply(): SchemaAppsDynamiteSharedCardCardAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedCardCardAction]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedCardCardAction](x: Self) {
    
    inline def setActionLabel(value: String): Self = StObject.set(x, "actionLabel", value.asInstanceOf[js.Any])
    
    inline def setActionLabelNull: Self = StObject.set(x, "actionLabel", null)
    
    inline def setActionLabelUndefined: Self = StObject.set(x, "actionLabel", js.undefined)
    
    inline def setOnClick(value: SchemaAppsDynamiteSharedOnClick): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
