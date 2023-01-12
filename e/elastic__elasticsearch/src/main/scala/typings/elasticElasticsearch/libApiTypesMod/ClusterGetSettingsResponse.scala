package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterGetSettingsResponse extends StObject {
  
  var defaults: js.UndefOr[Record[String, Any]] = js.undefined
  
  var persistent: Record[String, Any]
  
  var transient: Record[String, Any]
}
object ClusterGetSettingsResponse {
  
  inline def apply(persistent: Record[String, Any], transient: Record[String, Any]): ClusterGetSettingsResponse = {
    val __obj = js.Dynamic.literal(persistent = persistent.asInstanceOf[js.Any], transient = transient.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterGetSettingsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterGetSettingsResponse] (val x: Self) extends AnyVal {
    
    inline def setDefaults(value: Record[String, Any]): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
    
    inline def setPersistent(value: Record[String, Any]): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    
    inline def setTransient(value: Record[String, Any]): Self = StObject.set(x, "transient", value.asInstanceOf[js.Any])
  }
}
