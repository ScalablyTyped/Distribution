package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterPutSettingsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var flat_settings: js.UndefOr[Boolean] = js.undefined
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
  
  var persistent: js.UndefOr[Record[String, Any]] = js.undefined
  
  var timeout: js.UndefOr[Duration] = js.undefined
  
  var transient: js.UndefOr[Record[String, Any]] = js.undefined
}
object ClusterPutSettingsRequest {
  
  inline def apply(): ClusterPutSettingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterPutSettingsRequest]
  }
  
  extension [Self <: ClusterPutSettingsRequest](x: Self) {
    
    inline def setFlat_settings(value: Boolean): Self = StObject.set(x, "flat_settings", value.asInstanceOf[js.Any])
    
    inline def setFlat_settingsUndefined: Self = StObject.set(x, "flat_settings", js.undefined)
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setPersistent(value: Record[String, Any]): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    
    inline def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTransient(value: Record[String, Any]): Self = StObject.set(x, "transient", value.asInstanceOf[js.Any])
    
    inline def setTransientUndefined: Self = StObject.set(x, "transient", js.undefined)
  }
}
