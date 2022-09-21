package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaManagedConfigurationsSettingsListResponse extends StObject {
  
  /**
    * A managed configurations settings for an app that may be assigned to a group of users in an enterprise.
    */
  var managedConfigurationsSettings: js.UndefOr[js.Array[SchemaManagedConfigurationsSettings]] = js.undefined
}
object SchemaManagedConfigurationsSettingsListResponse {
  
  inline def apply(): SchemaManagedConfigurationsSettingsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedConfigurationsSettingsListResponse]
  }
  
  extension [Self <: SchemaManagedConfigurationsSettingsListResponse](x: Self) {
    
    inline def setManagedConfigurationsSettings(value: js.Array[SchemaManagedConfigurationsSettings]): Self = StObject.set(x, "managedConfigurationsSettings", value.asInstanceOf[js.Any])
    
    inline def setManagedConfigurationsSettingsUndefined: Self = StObject.set(x, "managedConfigurationsSettings", js.undefined)
    
    inline def setManagedConfigurationsSettingsVarargs(value: SchemaManagedConfigurationsSettings*): Self = StObject.set(x, "managedConfigurationsSettings", js.Array(value*))
  }
}
