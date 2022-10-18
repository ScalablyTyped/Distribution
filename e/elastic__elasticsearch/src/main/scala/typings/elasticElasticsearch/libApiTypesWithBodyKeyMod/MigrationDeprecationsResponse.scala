package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MigrationDeprecationsResponse extends StObject {
  
  var cluster_settings: js.Array[MigrationDeprecationsDeprecation]
  
  var index_settings: Record[String, js.Array[MigrationDeprecationsDeprecation]]
  
  var ml_settings: js.Array[MigrationDeprecationsDeprecation]
  
  var node_settings: js.Array[MigrationDeprecationsDeprecation]
}
object MigrationDeprecationsResponse {
  
  inline def apply(
    cluster_settings: js.Array[MigrationDeprecationsDeprecation],
    index_settings: Record[String, js.Array[MigrationDeprecationsDeprecation]],
    ml_settings: js.Array[MigrationDeprecationsDeprecation],
    node_settings: js.Array[MigrationDeprecationsDeprecation]
  ): MigrationDeprecationsResponse = {
    val __obj = js.Dynamic.literal(cluster_settings = cluster_settings.asInstanceOf[js.Any], index_settings = index_settings.asInstanceOf[js.Any], ml_settings = ml_settings.asInstanceOf[js.Any], node_settings = node_settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationDeprecationsResponse]
  }
  
  extension [Self <: MigrationDeprecationsResponse](x: Self) {
    
    inline def setCluster_settings(value: js.Array[MigrationDeprecationsDeprecation]): Self = StObject.set(x, "cluster_settings", value.asInstanceOf[js.Any])
    
    inline def setCluster_settingsVarargs(value: MigrationDeprecationsDeprecation*): Self = StObject.set(x, "cluster_settings", js.Array(value*))
    
    inline def setIndex_settings(value: Record[String, js.Array[MigrationDeprecationsDeprecation]]): Self = StObject.set(x, "index_settings", value.asInstanceOf[js.Any])
    
    inline def setMl_settings(value: js.Array[MigrationDeprecationsDeprecation]): Self = StObject.set(x, "ml_settings", value.asInstanceOf[js.Any])
    
    inline def setMl_settingsVarargs(value: MigrationDeprecationsDeprecation*): Self = StObject.set(x, "ml_settings", js.Array(value*))
    
    inline def setNode_settings(value: js.Array[MigrationDeprecationsDeprecation]): Self = StObject.set(x, "node_settings", value.asInstanceOf[js.Any])
    
    inline def setNode_settingsVarargs(value: MigrationDeprecationsDeprecation*): Self = StObject.set(x, "node_settings", js.Array(value*))
  }
}
