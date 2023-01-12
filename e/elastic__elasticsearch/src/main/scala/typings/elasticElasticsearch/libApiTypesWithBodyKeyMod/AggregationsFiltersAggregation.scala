package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsFiltersAggregation
  extends StObject
     with AggregationsAggregation {
  
  var filters: js.UndefOr[AggregationsBuckets[QueryDslQueryContainer]] = js.undefined
  
  var keyed: js.UndefOr[Boolean] = js.undefined
  
  var other_bucket: js.UndefOr[Boolean] = js.undefined
  
  var other_bucket_key: js.UndefOr[String] = js.undefined
}
object AggregationsFiltersAggregation {
  
  inline def apply(): AggregationsFiltersAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsFiltersAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsFiltersAggregation] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: AggregationsBuckets[QueryDslQueryContainer]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: QueryDslQueryContainer*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setKeyed(value: Boolean): Self = StObject.set(x, "keyed", value.asInstanceOf[js.Any])
    
    inline def setKeyedUndefined: Self = StObject.set(x, "keyed", js.undefined)
    
    inline def setOther_bucket(value: Boolean): Self = StObject.set(x, "other_bucket", value.asInstanceOf[js.Any])
    
    inline def setOther_bucketUndefined: Self = StObject.set(x, "other_bucket", js.undefined)
    
    inline def setOther_bucket_key(value: String): Self = StObject.set(x, "other_bucket_key", value.asInstanceOf[js.Any])
    
    inline def setOther_bucket_keyUndefined: Self = StObject.set(x, "other_bucket_key", js.undefined)
  }
}
