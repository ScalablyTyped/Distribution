package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CcrStatsResponse extends StObject {
  
  var auto_follow_stats: CcrStatsAutoFollowStats
  
  var follow_stats: CcrStatsFollowStats
}
object CcrStatsResponse {
  
  inline def apply(auto_follow_stats: CcrStatsAutoFollowStats, follow_stats: CcrStatsFollowStats): CcrStatsResponse = {
    val __obj = js.Dynamic.literal(auto_follow_stats = auto_follow_stats.asInstanceOf[js.Any], follow_stats = follow_stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcrStatsResponse]
  }
  
  extension [Self <: CcrStatsResponse](x: Self) {
    
    inline def setAuto_follow_stats(value: CcrStatsAutoFollowStats): Self = StObject.set(x, "auto_follow_stats", value.asInstanceOf[js.Any])
    
    inline def setFollow_stats(value: CcrStatsFollowStats): Self = StObject.set(x, "follow_stats", value.asInstanceOf[js.Any])
  }
}
