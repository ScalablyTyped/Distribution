package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CcrGetAutoFollowPatternAutoFollowPatternSummary extends StObject {
  
  var active: Boolean
  
  var follow_index_pattern: js.UndefOr[IndexPattern] = js.undefined
  
  var leader_index_exclusion_patterns: IndexPatterns
  
  var leader_index_patterns: IndexPatterns
  
  var max_outstanding_read_requests: integer
  
  var remote_cluster: String
}
object CcrGetAutoFollowPatternAutoFollowPatternSummary {
  
  inline def apply(
    active: Boolean,
    leader_index_exclusion_patterns: IndexPatterns,
    leader_index_patterns: IndexPatterns,
    max_outstanding_read_requests: integer,
    remote_cluster: String
  ): CcrGetAutoFollowPatternAutoFollowPatternSummary = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], leader_index_exclusion_patterns = leader_index_exclusion_patterns.asInstanceOf[js.Any], leader_index_patterns = leader_index_patterns.asInstanceOf[js.Any], max_outstanding_read_requests = max_outstanding_read_requests.asInstanceOf[js.Any], remote_cluster = remote_cluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcrGetAutoFollowPatternAutoFollowPatternSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CcrGetAutoFollowPatternAutoFollowPatternSummary] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setFollow_index_pattern(value: IndexPattern): Self = StObject.set(x, "follow_index_pattern", value.asInstanceOf[js.Any])
    
    inline def setFollow_index_patternUndefined: Self = StObject.set(x, "follow_index_pattern", js.undefined)
    
    inline def setLeader_index_exclusion_patterns(value: IndexPatterns): Self = StObject.set(x, "leader_index_exclusion_patterns", value.asInstanceOf[js.Any])
    
    inline def setLeader_index_exclusion_patternsVarargs(value: IndexPattern*): Self = StObject.set(x, "leader_index_exclusion_patterns", js.Array(value*))
    
    inline def setLeader_index_patterns(value: IndexPatterns): Self = StObject.set(x, "leader_index_patterns", value.asInstanceOf[js.Any])
    
    inline def setLeader_index_patternsVarargs(value: IndexPattern*): Self = StObject.set(x, "leader_index_patterns", js.Array(value*))
    
    inline def setMax_outstanding_read_requests(value: integer): Self = StObject.set(x, "max_outstanding_read_requests", value.asInstanceOf[js.Any])
    
    inline def setRemote_cluster(value: String): Self = StObject.set(x, "remote_cluster", value.asInstanceOf[js.Any])
  }
}
