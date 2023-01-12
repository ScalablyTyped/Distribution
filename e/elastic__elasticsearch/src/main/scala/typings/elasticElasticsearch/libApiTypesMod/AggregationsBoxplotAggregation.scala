package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsBoxplotAggregation
  extends StObject
     with AggregationsMetricAggregationBase {
  
  var compression: js.UndefOr[double] = js.undefined
}
object AggregationsBoxplotAggregation {
  
  inline def apply(): AggregationsBoxplotAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsBoxplotAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsBoxplotAggregation] (val x: Self) extends AnyVal {
    
    inline def setCompression(value: double): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
  }
}
