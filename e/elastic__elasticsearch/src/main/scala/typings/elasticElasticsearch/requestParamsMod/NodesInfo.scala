package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfo
  extends StObject
     with Generic {
  
  var flat_settings: js.UndefOr[Boolean] = js.undefined
  
  var metric: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var node_id: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var timeout: js.UndefOr[String] = js.undefined
}
object NodesInfo {
  
  @scala.inline
  def apply(): NodesInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesInfo]
  }
  
  @scala.inline
  implicit class NodesInfoMutableBuilder[Self <: NodesInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlat_settings(value: Boolean): Self = StObject.set(x, "flat_settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlat_settingsUndefined: Self = StObject.set(x, "flat_settings", js.undefined)
    
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
