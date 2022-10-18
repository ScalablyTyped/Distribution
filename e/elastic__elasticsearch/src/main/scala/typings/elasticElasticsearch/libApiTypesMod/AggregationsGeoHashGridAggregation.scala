package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsGeoHashGridAggregation
  extends StObject
     with AggregationsAggregation {
  
  var bounds: js.UndefOr[GeoBounds] = js.undefined
  
  var field: js.UndefOr[Field] = js.undefined
  
  var precision: js.UndefOr[GeoHashPrecision] = js.undefined
  
  var shard_size: js.UndefOr[integer] = js.undefined
  
  var size: js.UndefOr[integer] = js.undefined
}
object AggregationsGeoHashGridAggregation {
  
  inline def apply(): AggregationsGeoHashGridAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsGeoHashGridAggregation]
  }
  
  extension [Self <: AggregationsGeoHashGridAggregation](x: Self) {
    
    inline def setBounds(value: GeoBounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setPrecision(value: GeoHashPrecision): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setShard_size(value: integer): Self = StObject.set(x, "shard_size", value.asInstanceOf[js.Any])
    
    inline def setShard_sizeUndefined: Self = StObject.set(x, "shard_size", js.undefined)
    
    inline def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
