package typings.elasticElasticsearch.requestParamsMod

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
  implicit class ClusterPostVotingConfigExclusionsOps[Self <: ClusterPostVotingConfigExclusions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNode_ids(value: String): Self = this.set("node_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNode_ids: Self = this.set("node_ids", js.undefined)
    
    @scala.inline
    def setNode_names(value: String): Self = this.set("node_names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNode_names: Self = this.set("node_names", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
