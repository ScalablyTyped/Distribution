package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIntegrationConfigMutation extends StObject {
  
  /**
    * Add an app using its identifier.
    */
  var addApp: js.UndefOr[SchemaAppId] = js.undefined
  
  /**
    * Add a pinned tab using its identifier.
    */
  var addPinnedItem: js.UndefOr[SchemaPinnedItemId] = js.undefined
  
  /**
    * Remove an active app using its identifier.
    */
  var removeApp: js.UndefOr[SchemaAppId] = js.undefined
  
  /**
    * Remove an active pinned tab using its identifier.
    */
  var removePinnedItem: js.UndefOr[SchemaPinnedItemId] = js.undefined
}
object SchemaIntegrationConfigMutation {
  
  inline def apply(): SchemaIntegrationConfigMutation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIntegrationConfigMutation]
  }
  
  extension [Self <: SchemaIntegrationConfigMutation](x: Self) {
    
    inline def setAddApp(value: SchemaAppId): Self = StObject.set(x, "addApp", value.asInstanceOf[js.Any])
    
    inline def setAddAppUndefined: Self = StObject.set(x, "addApp", js.undefined)
    
    inline def setAddPinnedItem(value: SchemaPinnedItemId): Self = StObject.set(x, "addPinnedItem", value.asInstanceOf[js.Any])
    
    inline def setAddPinnedItemUndefined: Self = StObject.set(x, "addPinnedItem", js.undefined)
    
    inline def setRemoveApp(value: SchemaAppId): Self = StObject.set(x, "removeApp", value.asInstanceOf[js.Any])
    
    inline def setRemoveAppUndefined: Self = StObject.set(x, "removeApp", js.undefined)
    
    inline def setRemovePinnedItem(value: SchemaPinnedItemId): Self = StObject.set(x, "removePinnedItem", value.asInstanceOf[js.Any])
    
    inline def setRemovePinnedItemUndefined: Self = StObject.set(x, "removePinnedItem", js.undefined)
  }
}
