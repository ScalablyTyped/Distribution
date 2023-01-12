package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CcrFollowInfoResponse extends StObject {
  
  var follower_indices: js.Array[CcrFollowInfoFollowerIndex]
}
object CcrFollowInfoResponse {
  
  inline def apply(follower_indices: js.Array[CcrFollowInfoFollowerIndex]): CcrFollowInfoResponse = {
    val __obj = js.Dynamic.literal(follower_indices = follower_indices.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcrFollowInfoResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CcrFollowInfoResponse] (val x: Self) extends AnyVal {
    
    inline def setFollower_indices(value: js.Array[CcrFollowInfoFollowerIndex]): Self = StObject.set(x, "follower_indices", value.asInstanceOf[js.Any])
    
    inline def setFollower_indicesVarargs(value: CcrFollowInfoFollowerIndex*): Self = StObject.set(x, "follower_indices", js.Array(value*))
  }
}
