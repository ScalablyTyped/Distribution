package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIntegrationConfigUpdatedMetadata extends StObject {
  
  /**
    * The user whose action triggered this system message.
    */
  var initiatorId: js.UndefOr[SchemaUserId] = js.undefined
  
  /**
    * A list of updates applied on the integration config.
    */
  var mutations: js.UndefOr[js.Array[SchemaIntegrationConfigMutation]] = js.undefined
}
object SchemaIntegrationConfigUpdatedMetadata {
  
  inline def apply(): SchemaIntegrationConfigUpdatedMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIntegrationConfigUpdatedMetadata]
  }
  
  extension [Self <: SchemaIntegrationConfigUpdatedMetadata](x: Self) {
    
    inline def setInitiatorId(value: SchemaUserId): Self = StObject.set(x, "initiatorId", value.asInstanceOf[js.Any])
    
    inline def setInitiatorIdUndefined: Self = StObject.set(x, "initiatorId", js.undefined)
    
    inline def setMutations(value: js.Array[SchemaIntegrationConfigMutation]): Self = StObject.set(x, "mutations", value.asInstanceOf[js.Any])
    
    inline def setMutationsUndefined: Self = StObject.set(x, "mutations", js.undefined)
    
    inline def setMutationsVarargs(value: SchemaIntegrationConfigMutation*): Self = StObject.set(x, "mutations", js.Array(value*))
  }
}
