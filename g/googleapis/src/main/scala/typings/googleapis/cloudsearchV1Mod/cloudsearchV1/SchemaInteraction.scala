package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an interaction between a user and an item.
  */
trait SchemaInteraction extends StObject {
  
  /**
    * The time when the user acted on the item.  If multiple actions of the
    * same type exist for a single user, only the most recent action is
    * recorded.
    */
  var interactionTime: js.UndefOr[String] = js.undefined
  
  /**
    * The user that acted on the item.
    */
  var principal: js.UndefOr[SchemaPrincipal] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaInteraction {
  
  inline def apply(): SchemaInteraction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInteraction]
  }
  
  extension [Self <: SchemaInteraction](x: Self) {
    
    inline def setInteractionTime(value: String): Self = StObject.set(x, "interactionTime", value.asInstanceOf[js.Any])
    
    inline def setInteractionTimeUndefined: Self = StObject.set(x, "interactionTime", js.undefined)
    
    inline def setPrincipal(value: SchemaPrincipal): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
    
    inline def setPrincipalUndefined: Self = StObject.set(x, "principal", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
