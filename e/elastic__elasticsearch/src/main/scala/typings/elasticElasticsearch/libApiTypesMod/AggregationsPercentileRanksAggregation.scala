package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsPercentileRanksAggregation
  extends StObject
     with AggregationsFormatMetricAggregationBase {
  
  var hdr: js.UndefOr[AggregationsHdrMethod] = js.undefined
  
  var keyed: js.UndefOr[Boolean] = js.undefined
  
  var tdigest: js.UndefOr[AggregationsTDigest] = js.undefined
  
  var values: js.UndefOr[js.Array[double] | Null] = js.undefined
}
object AggregationsPercentileRanksAggregation {
  
  inline def apply(): AggregationsPercentileRanksAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsPercentileRanksAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsPercentileRanksAggregation] (val x: Self) extends AnyVal {
    
    inline def setHdr(value: AggregationsHdrMethod): Self = StObject.set(x, "hdr", value.asInstanceOf[js.Any])
    
    inline def setHdrUndefined: Self = StObject.set(x, "hdr", js.undefined)
    
    inline def setKeyed(value: Boolean): Self = StObject.set(x, "keyed", value.asInstanceOf[js.Any])
    
    inline def setKeyedUndefined: Self = StObject.set(x, "keyed", js.undefined)
    
    inline def setTdigest(value: AggregationsTDigest): Self = StObject.set(x, "tdigest", value.asInstanceOf[js.Any])
    
    inline def setTdigestUndefined: Self = StObject.set(x, "tdigest", js.undefined)
    
    inline def setValues(value: js.Array[double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesNull: Self = StObject.set(x, "values", null)
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: double*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
