package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterPostVotingConfigExclusions
  extends StObject
     with Generic {
  
  var node_ids: js.UndefOr[String] = js.undefined
  
  var node_names: js.UndefOr[String] = js.undefined
  
  var timeout: js.UndefOr[String] = js.undefined
}
object ClusterPostVotingConfigExclusions {
  
  inline def apply(): ClusterPostVotingConfigExclusions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterPostVotingConfigExclusions]
  }
  
  extension [Self <: ClusterPostVotingConfigExclusions](x: Self) {
    
    inline def setNode_ids(value: String): Self = StObject.set(x, "node_ids", value.asInstanceOf[js.Any])
    
    inline def setNode_idsUndefined: Self = StObject.set(x, "node_ids", js.undefined)
    
    inline def setNode_names(value: String): Self = StObject.set(x, "node_names", value.asInstanceOf[js.Any])
    
    inline def setNode_namesUndefined: Self = StObject.set(x, "node_names", js.undefined)
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
