package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterPutSettingsResponse extends StObject {
  
  var acknowledged: Boolean
  
  var persistent: Record[String, Any]
  
  var transient: Record[String, Any]
}
object ClusterPutSettingsResponse {
  
  inline def apply(acknowledged: Boolean, persistent: Record[String, Any], transient: Record[String, Any]): ClusterPutSettingsResponse = {
    val __obj = js.Dynamic.literal(acknowledged = acknowledged.asInstanceOf[js.Any], persistent = persistent.asInstanceOf[js.Any], transient = transient.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterPutSettingsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterPutSettingsResponse] (val x: Self) extends AnyVal {
    
    inline def setAcknowledged(value: Boolean): Self = StObject.set(x, "acknowledged", value.asInstanceOf[js.Any])
    
    inline def setPersistent(value: Record[String, Any]): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    
    inline def setTransient(value: Record[String, Any]): Self = StObject.set(x, "transient", value.asInstanceOf[js.Any])
  }
}
