package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGroupRetentionSettingsUpdatedMetaData extends StObject {
  
  /**
    * The user who triggered the retention settings update
    */
  var initiator: js.UndefOr[SchemaUserId] = js.undefined
  
  /**
    * The updated space retention settings
    */
  var retentionSettings: js.UndefOr[SchemaAppsDynamiteSharedRetentionSettings] = js.undefined
}
object SchemaGroupRetentionSettingsUpdatedMetaData {
  
  inline def apply(): SchemaGroupRetentionSettingsUpdatedMetaData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupRetentionSettingsUpdatedMetaData]
  }
  
  extension [Self <: SchemaGroupRetentionSettingsUpdatedMetaData](x: Self) {
    
    inline def setInitiator(value: SchemaUserId): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
    
    inline def setInitiatorUndefined: Self = StObject.set(x, "initiator", js.undefined)
    
    inline def setRetentionSettings(value: SchemaAppsDynamiteSharedRetentionSettings): Self = StObject.set(x, "retentionSettings", value.asInstanceOf[js.Any])
    
    inline def setRetentionSettingsUndefined: Self = StObject.set(x, "retentionSettings", js.undefined)
  }
}
