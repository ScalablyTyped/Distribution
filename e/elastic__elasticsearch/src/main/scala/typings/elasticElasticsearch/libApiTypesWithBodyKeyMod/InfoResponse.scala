package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InfoResponse extends StObject {
  
  var cluster_name: Name
  
  var cluster_uuid: Uuid
  
  var name: Name
  
  var tagline: String
  
  var version: ElasticsearchVersionInfo
}
object InfoResponse {
  
  inline def apply(
    cluster_name: Name,
    cluster_uuid: Uuid,
    name: Name,
    tagline: String,
    version: ElasticsearchVersionInfo
  ): InfoResponse = {
    val __obj = js.Dynamic.literal(cluster_name = cluster_name.asInstanceOf[js.Any], cluster_uuid = cluster_uuid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tagline = tagline.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfoResponse]
  }
  
  extension [Self <: InfoResponse](x: Self) {
    
    inline def setCluster_name(value: Name): Self = StObject.set(x, "cluster_name", value.asInstanceOf[js.Any])
    
    inline def setCluster_uuid(value: Uuid): Self = StObject.set(x, "cluster_uuid", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTagline(value: String): Self = StObject.set(x, "tagline", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: ElasticsearchVersionInfo): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
