package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A card action is the action associated with the card. For an invoice card,
  * a typical action would be: delete invoice, email invoice or open the
  * invoice in browser.
  */
trait SchemaCardAction extends StObject {
  
  /**
    * The label used to be displayed in the action menu item.
    */
  var actionLabel: js.UndefOr[String] = js.undefined
  
  /**
    * The onclick action for this action item.
    */
  var onClick: js.UndefOr[SchemaOnClick] = js.undefined
}
object SchemaCardAction {
  
  inline def apply(): SchemaCardAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCardAction]
  }
  
  extension [Self <: SchemaCardAction](x: Self) {
    
    inline def setActionLabel(value: String): Self = StObject.set(x, "actionLabel", value.asInstanceOf[js.Any])
    
    inline def setActionLabelUndefined: Self = StObject.set(x, "actionLabel", js.undefined)
    
    inline def setOnClick(value: SchemaOnClick): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
