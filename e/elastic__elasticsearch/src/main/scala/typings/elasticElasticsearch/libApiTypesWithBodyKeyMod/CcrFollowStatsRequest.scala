package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CcrFollowStatsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var index: Indices
}
object CcrFollowStatsRequest {
  
  inline def apply(index: Indices): CcrFollowStatsRequest = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcrFollowStatsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CcrFollowStatsRequest] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: Indices): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexVarargs(value: IndexName*): Self = StObject.set(x, "index", js.Array(value*))
  }
}
