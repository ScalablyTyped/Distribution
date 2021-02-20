package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterAllocationExplainParams extends GenericParams {
  
  var includeDiskInfo: js.UndefOr[Boolean] = js.native
  
  var includeYesDecisions: js.UndefOr[Boolean] = js.native
}
object ClusterAllocationExplainParams {
  
  @scala.inline
  def apply(): ClusterAllocationExplainParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterAllocationExplainParams]
  }
  
  @scala.inline
  implicit class ClusterAllocationExplainParamsMutableBuilder[Self <: ClusterAllocationExplainParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeDiskInfo(value: Boolean): Self = StObject.set(x, "includeDiskInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDiskInfoUndefined: Self = StObject.set(x, "includeDiskInfo", js.undefined)
    
    @scala.inline
    def setIncludeYesDecisions(value: Boolean): Self = StObject.set(x, "includeYesDecisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeYesDecisionsUndefined: Self = StObject.set(x, "includeYesDecisions", js.undefined)
  }
}
