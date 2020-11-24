package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterAllocationExplain[T] extends Generic {
  
  var body: js.UndefOr[T] = js.native
  
  var include_disk_info: js.UndefOr[Boolean] = js.native
  
  var include_yes_decisions: js.UndefOr[Boolean] = js.native
}
object ClusterAllocationExplain {
  
  @scala.inline
  def apply[T](): ClusterAllocationExplain[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterAllocationExplain[T]]
  }
  
  @scala.inline
  implicit class ClusterAllocationExplainOps[Self <: ClusterAllocationExplain[_], T] (val x: Self with ClusterAllocationExplain[T]) extends AnyVal {
    
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
    def setBody(value: T): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setInclude_disk_info(value: Boolean): Self = this.set("include_disk_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude_disk_info: Self = this.set("include_disk_info", js.undefined)
    
    @scala.inline
    def setInclude_yes_decisions(value: Boolean): Self = this.set("include_yes_decisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude_yes_decisions: Self = this.set("include_yes_decisions", js.undefined)
  }
}
