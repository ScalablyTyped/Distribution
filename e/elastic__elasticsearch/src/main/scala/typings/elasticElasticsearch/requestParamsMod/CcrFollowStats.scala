package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CcrFollowStats extends Generic {
  
  var index: String | js.Array[String] = js.native
}
object CcrFollowStats {
  
  @scala.inline
  def apply(index: String | js.Array[String]): CcrFollowStats = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcrFollowStats]
  }
  
  @scala.inline
  implicit class CcrFollowStatsMutableBuilder[Self <: CcrFollowStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: String | js.Array[String]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
  }
}
