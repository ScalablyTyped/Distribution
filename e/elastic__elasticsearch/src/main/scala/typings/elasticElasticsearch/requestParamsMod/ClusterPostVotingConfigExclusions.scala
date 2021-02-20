package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterPostVotingConfigExclusions extends Generic {
  
  var node_ids: js.UndefOr[String] = js.native
  
  var node_names: js.UndefOr[String] = js.native
  
  var timeout: js.UndefOr[String] = js.native
}
object ClusterPostVotingConfigExclusions {
  
  @scala.inline
  def apply(): ClusterPostVotingConfigExclusions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterPostVotingConfigExclusions]
  }
  
  @scala.inline
  implicit class ClusterPostVotingConfigExclusionsMutableBuilder[Self <: ClusterPostVotingConfigExclusions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNode_ids(value: String): Self = StObject.set(x, "node_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_idsUndefined: Self = StObject.set(x, "node_ids", js.undefined)
    
    @scala.inline
    def setNode_names(value: String): Self = StObject.set(x, "node_names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_namesUndefined: Self = StObject.set(x, "node_names", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
