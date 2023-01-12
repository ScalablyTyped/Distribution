package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsScriptedMetricAggregation
  extends StObject
     with AggregationsMetricAggregationBase {
  
  var combine_script: js.UndefOr[Script] = js.undefined
  
  var init_script: js.UndefOr[Script] = js.undefined
  
  var map_script: js.UndefOr[Script] = js.undefined
  
  var params: js.UndefOr[Record[String, Any]] = js.undefined
  
  var reduce_script: js.UndefOr[Script] = js.undefined
}
object AggregationsScriptedMetricAggregation {
  
  inline def apply(): AggregationsScriptedMetricAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsScriptedMetricAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsScriptedMetricAggregation] (val x: Self) extends AnyVal {
    
    inline def setCombine_script(value: Script): Self = StObject.set(x, "combine_script", value.asInstanceOf[js.Any])
    
    inline def setCombine_scriptUndefined: Self = StObject.set(x, "combine_script", js.undefined)
    
    inline def setInit_script(value: Script): Self = StObject.set(x, "init_script", value.asInstanceOf[js.Any])
    
    inline def setInit_scriptUndefined: Self = StObject.set(x, "init_script", js.undefined)
    
    inline def setMap_script(value: Script): Self = StObject.set(x, "map_script", value.asInstanceOf[js.Any])
    
    inline def setMap_scriptUndefined: Self = StObject.set(x, "map_script", js.undefined)
    
    inline def setParams(value: Record[String, Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setReduce_script(value: Script): Self = StObject.set(x, "reduce_script", value.asInstanceOf[js.Any])
    
    inline def setReduce_scriptUndefined: Self = StObject.set(x, "reduce_script", js.undefined)
  }
}
