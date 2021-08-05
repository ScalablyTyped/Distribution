package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterGetSettingsParams
  extends StObject
     with GenericParams {
  
  var flatSettings: js.UndefOr[Boolean] = js.undefined
  
  var includeDefaults: js.UndefOr[Boolean] = js.undefined
  
  var masterTimeout: js.UndefOr[TimeSpan] = js.undefined
  
  var timeout: js.UndefOr[TimeSpan] = js.undefined
}
object ClusterGetSettingsParams {
  
  inline def apply(): ClusterGetSettingsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterGetSettingsParams]
  }
  
  extension [Self <: ClusterGetSettingsParams](x: Self) {
    
    inline def setFlatSettings(value: Boolean): Self = StObject.set(x, "flatSettings", value.asInstanceOf[js.Any])
    
    inline def setFlatSettingsUndefined: Self = StObject.set(x, "flatSettings", js.undefined)
    
    inline def setIncludeDefaults(value: Boolean): Self = StObject.set(x, "includeDefaults", value.asInstanceOf[js.Any])
    
    inline def setIncludeDefaultsUndefined: Self = StObject.set(x, "includeDefaults", js.undefined)
    
    inline def setMasterTimeout(value: TimeSpan): Self = StObject.set(x, "masterTimeout", value.asInstanceOf[js.Any])
    
    inline def setMasterTimeoutUndefined: Self = StObject.set(x, "masterTimeout", js.undefined)
    
    inline def setTimeout(value: TimeSpan): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
