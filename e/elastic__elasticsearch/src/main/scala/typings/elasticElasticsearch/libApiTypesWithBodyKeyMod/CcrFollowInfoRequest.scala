package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CcrFollowInfoRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var index: Indices
}
object CcrFollowInfoRequest {
  
  inline def apply(index: Indices): CcrFollowInfoRequest = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcrFollowInfoRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CcrFollowInfoRequest] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: Indices): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexVarargs(value: IndexName*): Self = StObject.set(x, "index", js.Array(value*))
  }
}
