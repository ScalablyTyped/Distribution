package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsPercentilesAggregation
  extends StObject
     with AggregationsFormatMetricAggregationBase {
  
  var hdr: js.UndefOr[AggregationsHdrMethod] = js.undefined
  
  var keyed: js.UndefOr[Boolean] = js.undefined
  
  var percents: js.UndefOr[js.Array[double]] = js.undefined
  
  var tdigest: js.UndefOr[AggregationsTDigest] = js.undefined
}
object AggregationsPercentilesAggregation {
  
  inline def apply(): AggregationsPercentilesAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsPercentilesAggregation]
  }
  
  extension [Self <: AggregationsPercentilesAggregation](x: Self) {
    
    inline def setHdr(value: AggregationsHdrMethod): Self = StObject.set(x, "hdr", value.asInstanceOf[js.Any])
    
    inline def setHdrUndefined: Self = StObject.set(x, "hdr", js.undefined)
    
    inline def setKeyed(value: Boolean): Self = StObject.set(x, "keyed", value.asInstanceOf[js.Any])
    
    inline def setKeyedUndefined: Self = StObject.set(x, "keyed", js.undefined)
    
    inline def setPercents(value: js.Array[double]): Self = StObject.set(x, "percents", value.asInstanceOf[js.Any])
    
    inline def setPercentsUndefined: Self = StObject.set(x, "percents", js.undefined)
    
    inline def setPercentsVarargs(value: double*): Self = StObject.set(x, "percents", js.Array(value*))
    
    inline def setTdigest(value: AggregationsTDigest): Self = StObject.set(x, "tdigest", value.asInstanceOf[js.Any])
    
    inline def setTdigestUndefined: Self = StObject.set(x, "tdigest", js.undefined)
  }
}
