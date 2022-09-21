package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaManagedConfigurationsSettings extends StObject {
  
  /**
    * The last updated time of the managed configuration settings in milliseconds since 1970-01-01T00:00:00Z.
    */
  var lastUpdatedTimestampMillis: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the managed configurations settings.
    */
  var mcmId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the managed configurations settings.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaManagedConfigurationsSettings {
  
  inline def apply(): SchemaManagedConfigurationsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedConfigurationsSettings]
  }
  
  extension [Self <: SchemaManagedConfigurationsSettings](x: Self) {
    
    inline def setLastUpdatedTimestampMillis(value: String): Self = StObject.set(x, "lastUpdatedTimestampMillis", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimestampMillisNull: Self = StObject.set(x, "lastUpdatedTimestampMillis", null)
    
    inline def setLastUpdatedTimestampMillisUndefined: Self = StObject.set(x, "lastUpdatedTimestampMillis", js.undefined)
    
    inline def setMcmId(value: String): Self = StObject.set(x, "mcmId", value.asInstanceOf[js.Any])
    
    inline def setMcmIdNull: Self = StObject.set(x, "mcmId", null)
    
    inline def setMcmIdUndefined: Self = StObject.set(x, "mcmId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
