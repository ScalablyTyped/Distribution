package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CcrStatsFollowStats extends StObject {
  
  var indices: js.Array[CcrFollowIndexStats]
}
object CcrStatsFollowStats {
  
  inline def apply(indices: js.Array[CcrFollowIndexStats]): CcrStatsFollowStats = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcrStatsFollowStats]
  }
  
  extension [Self <: CcrStatsFollowStats](x: Self) {
    
    inline def setIndices(value: js.Array[CcrFollowIndexStats]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesVarargs(value: CcrFollowIndexStats*): Self = StObject.set(x, "indices", js.Array(value*))
  }
}
