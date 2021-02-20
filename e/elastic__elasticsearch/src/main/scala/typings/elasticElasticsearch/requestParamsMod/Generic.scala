package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Generic extends StObject {
  
  var error_trace: js.UndefOr[Boolean] = js.native
  
  var filter_path: js.UndefOr[String | js.Array[String]] = js.native
  
  var human: js.UndefOr[Boolean] = js.native
  
  var method: js.UndefOr[String] = js.native
  
  var pretty: js.UndefOr[Boolean] = js.native
  
  var source: js.UndefOr[String] = js.native
}
object Generic {
  
  @scala.inline
  def apply(): Generic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Generic]
  }
  
  @scala.inline
  implicit class GenericMutableBuilder[Self <: Generic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError_trace(value: Boolean): Self = StObject.set(x, "error_trace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError_traceUndefined: Self = StObject.set(x, "error_trace", js.undefined)
    
    @scala.inline
    def setFilter_path(value: String | js.Array[String]): Self = StObject.set(x, "filter_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter_pathUndefined: Self = StObject.set(x, "filter_path", js.undefined)
    
    @scala.inline
    def setFilter_pathVarargs(value: String*): Self = StObject.set(x, "filter_path", js.Array(value :_*))
    
    @scala.inline
    def setHuman(value: Boolean): Self = StObject.set(x, "human", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumanUndefined: Self = StObject.set(x, "human", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
