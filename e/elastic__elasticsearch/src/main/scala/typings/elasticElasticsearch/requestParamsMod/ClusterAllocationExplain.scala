package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterAllocationExplain[T]
  extends StObject
     with Generic {
  
  var body: js.UndefOr[T] = js.undefined
  
  var include_disk_info: js.UndefOr[Boolean] = js.undefined
  
  var include_yes_decisions: js.UndefOr[Boolean] = js.undefined
}
object ClusterAllocationExplain {
  
  @scala.inline
  def apply[T](): ClusterAllocationExplain[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterAllocationExplain[T]]
  }
  
  @scala.inline
  implicit class ClusterAllocationExplainMutableBuilder[Self <: ClusterAllocationExplain[?], T] (val x: Self & ClusterAllocationExplain[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setInclude_disk_info(value: Boolean): Self = StObject.set(x, "include_disk_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude_disk_infoUndefined: Self = StObject.set(x, "include_disk_info", js.undefined)
    
    @scala.inline
    def setInclude_yes_decisions(value: Boolean): Self = StObject.set(x, "include_yes_decisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude_yes_decisionsUndefined: Self = StObject.set(x, "include_yes_decisions", js.undefined)
  }
}
