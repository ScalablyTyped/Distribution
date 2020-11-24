package typings.elasticsearch.mod

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
  implicit class ClusterAllocationExplainParamsOps[Self <: ClusterAllocationExplainParams] (val x: Self) extends AnyVal {
    
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
    def setIncludeDiskInfo(value: Boolean): Self = this.set("includeDiskInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeDiskInfo: Self = this.set("includeDiskInfo", js.undefined)
    
    @scala.inline
    def setIncludeYesDecisions(value: Boolean): Self = this.set("includeYesDecisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeYesDecisions: Self = this.set("includeYesDecisions", js.undefined)
  }
}
