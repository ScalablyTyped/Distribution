package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CcrStatsAutoFollowedCluster extends StObject {
  
  var cluster_name: Name
  
  var last_seen_metadata_version: VersionNumber
  
  var time_since_last_check_millis: DurationValue[UnitMillis]
}
object CcrStatsAutoFollowedCluster {
  
  inline def apply(
    cluster_name: Name,
    last_seen_metadata_version: VersionNumber,
    time_since_last_check_millis: DurationValue[UnitMillis]
  ): CcrStatsAutoFollowedCluster = {
    val __obj = js.Dynamic.literal(cluster_name = cluster_name.asInstanceOf[js.Any], last_seen_metadata_version = last_seen_metadata_version.asInstanceOf[js.Any], time_since_last_check_millis = time_since_last_check_millis.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcrStatsAutoFollowedCluster]
  }
  
  extension [Self <: CcrStatsAutoFollowedCluster](x: Self) {
    
    inline def setCluster_name(value: Name): Self = StObject.set(x, "cluster_name", value.asInstanceOf[js.Any])
    
    inline def setLast_seen_metadata_version(value: VersionNumber): Self = StObject.set(x, "last_seen_metadata_version", value.asInstanceOf[js.Any])
    
    inline def setTime_since_last_check_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "time_since_last_check_millis", value.asInstanceOf[js.Any])
  }
}
