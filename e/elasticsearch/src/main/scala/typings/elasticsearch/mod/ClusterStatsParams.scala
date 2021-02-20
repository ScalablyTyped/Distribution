package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterStatsParams extends GenericParams {
  
  var flatSettings: js.UndefOr[Boolean] = js.native
  
  var human: js.UndefOr[Boolean] = js.native
  
  var nodeId: js.UndefOr[NameList] = js.native
  
  var timeout: js.UndefOr[TimeSpan] = js.native
}
object ClusterStatsParams {
  
  @scala.inline
  def apply(): ClusterStatsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterStatsParams]
  }
  
  @scala.inline
  implicit class ClusterStatsParamsMutableBuilder[Self <: ClusterStatsParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlatSettings(value: Boolean): Self = StObject.set(x, "flatSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlatSettingsUndefined: Self = StObject.set(x, "flatSettings", js.undefined)
    
    @scala.inline
    def setHuman(value: Boolean): Self = StObject.set(x, "human", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumanUndefined: Self = StObject.set(x, "human", js.undefined)
    
    @scala.inline
    def setNodeId(value: NameList): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
    
    @scala.inline
    def setNodeIdVarargs(value: String*): Self = StObject.set(x, "nodeId", js.Array(value :_*))
    
    @scala.inline
    def setTimeout(value: TimeSpan): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
