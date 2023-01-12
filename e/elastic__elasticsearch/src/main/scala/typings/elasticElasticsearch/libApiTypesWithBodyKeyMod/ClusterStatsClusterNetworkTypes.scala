package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterStatsClusterNetworkTypes extends StObject {
  
  var http_types: Record[String, integer]
  
  var transport_types: Record[String, integer]
}
object ClusterStatsClusterNetworkTypes {
  
  inline def apply(http_types: Record[String, integer], transport_types: Record[String, integer]): ClusterStatsClusterNetworkTypes = {
    val __obj = js.Dynamic.literal(http_types = http_types.asInstanceOf[js.Any], transport_types = transport_types.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStatsClusterNetworkTypes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterStatsClusterNetworkTypes] (val x: Self) extends AnyVal {
    
    inline def setHttp_types(value: Record[String, integer]): Self = StObject.set(x, "http_types", value.asInstanceOf[js.Any])
    
    inline def setTransport_types(value: Record[String, integer]): Self = StObject.set(x, "transport_types", value.asInstanceOf[js.Any])
  }
}
