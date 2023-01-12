package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterPostVotingConfigExclusionsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var node_ids: js.UndefOr[Ids] = js.undefined
  
  var node_names: js.UndefOr[Names] = js.undefined
  
  var timeout: js.UndefOr[Duration] = js.undefined
}
object ClusterPostVotingConfigExclusionsRequest {
  
  inline def apply(): ClusterPostVotingConfigExclusionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterPostVotingConfigExclusionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterPostVotingConfigExclusionsRequest] (val x: Self) extends AnyVal {
    
    inline def setNode_ids(value: Ids): Self = StObject.set(x, "node_ids", value.asInstanceOf[js.Any])
    
    inline def setNode_idsUndefined: Self = StObject.set(x, "node_ids", js.undefined)
    
    inline def setNode_idsVarargs(value: Id*): Self = StObject.set(x, "node_ids", js.Array(value*))
    
    inline def setNode_names(value: Names): Self = StObject.set(x, "node_names", value.asInstanceOf[js.Any])
    
    inline def setNode_namesUndefined: Self = StObject.set(x, "node_names", js.undefined)
    
    inline def setNode_namesVarargs(value: Name*): Self = StObject.set(x, "node_names", js.Array(value*))
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
