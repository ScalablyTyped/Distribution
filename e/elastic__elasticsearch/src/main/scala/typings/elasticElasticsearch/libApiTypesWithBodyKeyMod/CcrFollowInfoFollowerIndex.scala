package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CcrFollowInfoFollowerIndex extends StObject {
  
  var follower_index: IndexName
  
  var leader_index: IndexName
  
  var parameters: js.UndefOr[CcrFollowInfoFollowerIndexParameters] = js.undefined
  
  var remote_cluster: Name
  
  var status: CcrFollowInfoFollowerIndexStatus
}
object CcrFollowInfoFollowerIndex {
  
  inline def apply(
    follower_index: IndexName,
    leader_index: IndexName,
    remote_cluster: Name,
    status: CcrFollowInfoFollowerIndexStatus
  ): CcrFollowInfoFollowerIndex = {
    val __obj = js.Dynamic.literal(follower_index = follower_index.asInstanceOf[js.Any], leader_index = leader_index.asInstanceOf[js.Any], remote_cluster = remote_cluster.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcrFollowInfoFollowerIndex]
  }
  
  extension [Self <: CcrFollowInfoFollowerIndex](x: Self) {
    
    inline def setFollower_index(value: IndexName): Self = StObject.set(x, "follower_index", value.asInstanceOf[js.Any])
    
    inline def setLeader_index(value: IndexName): Self = StObject.set(x, "leader_index", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: CcrFollowInfoFollowerIndexParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setRemote_cluster(value: Name): Self = StObject.set(x, "remote_cluster", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: CcrFollowInfoFollowerIndexStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
