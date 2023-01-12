package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CcrStatsAutoFollowStats extends StObject {
  
  var auto_followed_clusters: js.Array[CcrStatsAutoFollowedCluster]
  
  var number_of_failed_follow_indices: long
  
  var number_of_failed_remote_cluster_state_requests: long
  
  var number_of_successful_follow_indices: long
  
  var recent_auto_follow_errors: js.Array[ErrorCause]
}
object CcrStatsAutoFollowStats {
  
  inline def apply(
    auto_followed_clusters: js.Array[CcrStatsAutoFollowedCluster],
    number_of_failed_follow_indices: long,
    number_of_failed_remote_cluster_state_requests: long,
    number_of_successful_follow_indices: long,
    recent_auto_follow_errors: js.Array[ErrorCause]
  ): CcrStatsAutoFollowStats = {
    val __obj = js.Dynamic.literal(auto_followed_clusters = auto_followed_clusters.asInstanceOf[js.Any], number_of_failed_follow_indices = number_of_failed_follow_indices.asInstanceOf[js.Any], number_of_failed_remote_cluster_state_requests = number_of_failed_remote_cluster_state_requests.asInstanceOf[js.Any], number_of_successful_follow_indices = number_of_successful_follow_indices.asInstanceOf[js.Any], recent_auto_follow_errors = recent_auto_follow_errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcrStatsAutoFollowStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CcrStatsAutoFollowStats] (val x: Self) extends AnyVal {
    
    inline def setAuto_followed_clusters(value: js.Array[CcrStatsAutoFollowedCluster]): Self = StObject.set(x, "auto_followed_clusters", value.asInstanceOf[js.Any])
    
    inline def setAuto_followed_clustersVarargs(value: CcrStatsAutoFollowedCluster*): Self = StObject.set(x, "auto_followed_clusters", js.Array(value*))
    
    inline def setNumber_of_failed_follow_indices(value: long): Self = StObject.set(x, "number_of_failed_follow_indices", value.asInstanceOf[js.Any])
    
    inline def setNumber_of_failed_remote_cluster_state_requests(value: long): Self = StObject.set(x, "number_of_failed_remote_cluster_state_requests", value.asInstanceOf[js.Any])
    
    inline def setNumber_of_successful_follow_indices(value: long): Self = StObject.set(x, "number_of_successful_follow_indices", value.asInstanceOf[js.Any])
    
    inline def setRecent_auto_follow_errors(value: js.Array[ErrorCause]): Self = StObject.set(x, "recent_auto_follow_errors", value.asInstanceOf[js.Any])
    
    inline def setRecent_auto_follow_errorsVarargs(value: ErrorCause*): Self = StObject.set(x, "recent_auto_follow_errors", js.Array(value*))
  }
}
