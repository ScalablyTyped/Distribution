package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterGetSettingsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var flat_settings: js.UndefOr[Boolean] = js.undefined
  
  var include_defaults: js.UndefOr[Boolean] = js.undefined
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
  
  var timeout: js.UndefOr[Duration] = js.undefined
}
object ClusterGetSettingsRequest {
  
  inline def apply(): ClusterGetSettingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterGetSettingsRequest]
  }
  
  extension [Self <: ClusterGetSettingsRequest](x: Self) {
    
    inline def setFlat_settings(value: Boolean): Self = StObject.set(x, "flat_settings", value.asInstanceOf[js.Any])
    
    inline def setFlat_settingsUndefined: Self = StObject.set(x, "flat_settings", js.undefined)
    
    inline def setInclude_defaults(value: Boolean): Self = StObject.set(x, "include_defaults", value.asInstanceOf[js.Any])
    
    inline def setInclude_defaultsUndefined: Self = StObject.set(x, "include_defaults", js.undefined)
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
