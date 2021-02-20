package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodesUsage extends Generic {
  
  var metric: js.UndefOr[String | js.Array[String]] = js.native
  
  var node_id: js.UndefOr[String | js.Array[String]] = js.native
  
  var timeout: js.UndefOr[String] = js.native
}
object NodesUsage {
  
  @scala.inline
  def apply(): NodesUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesUsage]
  }
  
  @scala.inline
  implicit class NodesUsageMutableBuilder[Self <: NodesUsage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetric(value: String | js.Array[String]): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    @scala.inline
    def setMetricVarargs(value: String*): Self = StObject.set(x, "metric", js.Array(value :_*))
    
    @scala.inline
    def setNode_id(value: String | js.Array[String]): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_idUndefined: Self = StObject.set(x, "node_id", js.undefined)
    
    @scala.inline
    def setNode_idVarargs(value: String*): Self = StObject.set(x, "node_id", js.Array(value :_*))
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
