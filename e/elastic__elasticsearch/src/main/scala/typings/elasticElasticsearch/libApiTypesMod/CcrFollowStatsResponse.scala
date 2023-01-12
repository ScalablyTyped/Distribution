package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CcrFollowStatsResponse extends StObject {
  
  var indices: js.Array[CcrFollowIndexStats]
}
object CcrFollowStatsResponse {
  
  inline def apply(indices: js.Array[CcrFollowIndexStats]): CcrFollowStatsResponse = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcrFollowStatsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CcrFollowStatsResponse] (val x: Self) extends AnyVal {
    
    inline def setIndices(value: js.Array[CcrFollowIndexStats]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesVarargs(value: CcrFollowIndexStats*): Self = StObject.set(x, "indices", js.Array(value*))
  }
}
