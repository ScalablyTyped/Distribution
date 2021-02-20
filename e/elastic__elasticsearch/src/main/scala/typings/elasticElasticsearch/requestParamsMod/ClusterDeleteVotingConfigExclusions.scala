package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterDeleteVotingConfigExclusions extends Generic {
  
  var wait_for_removal: js.UndefOr[Boolean] = js.native
}
object ClusterDeleteVotingConfigExclusions {
  
  @scala.inline
  def apply(): ClusterDeleteVotingConfigExclusions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterDeleteVotingConfigExclusions]
  }
  
  @scala.inline
  implicit class ClusterDeleteVotingConfigExclusionsMutableBuilder[Self <: ClusterDeleteVotingConfigExclusions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWait_for_removal(value: Boolean): Self = StObject.set(x, "wait_for_removal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWait_for_removalUndefined: Self = StObject.set(x, "wait_for_removal", js.undefined)
  }
}
