package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsGeoBoundsAggregation
  extends StObject
     with AggregationsMetricAggregationBase {
  
  var wrap_longitude: js.UndefOr[Boolean] = js.undefined
}
object AggregationsGeoBoundsAggregation {
  
  inline def apply(): AggregationsGeoBoundsAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsGeoBoundsAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsGeoBoundsAggregation] (val x: Self) extends AnyVal {
    
    inline def setWrap_longitude(value: Boolean): Self = StObject.set(x, "wrap_longitude", value.asInstanceOf[js.Any])
    
    inline def setWrap_longitudeUndefined: Self = StObject.set(x, "wrap_longitude", js.undefined)
  }
}
