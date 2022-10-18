package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoDistanceSortKeys extends StObject {
  
  var distance_type: js.UndefOr[GeoDistanceType] = js.undefined
  
  var ignore_unmapped: js.UndefOr[Boolean] = js.undefined
  
  var mode: js.UndefOr[SortMode] = js.undefined
  
  var order: js.UndefOr[SortOrder] = js.undefined
  
  var unit: js.UndefOr[DistanceUnit] = js.undefined
}
object GeoDistanceSortKeys {
  
  inline def apply(): GeoDistanceSortKeys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoDistanceSortKeys]
  }
  
  extension [Self <: GeoDistanceSortKeys](x: Self) {
    
    inline def setDistance_type(value: GeoDistanceType): Self = StObject.set(x, "distance_type", value.asInstanceOf[js.Any])
    
    inline def setDistance_typeUndefined: Self = StObject.set(x, "distance_type", js.undefined)
    
    inline def setIgnore_unmapped(value: Boolean): Self = StObject.set(x, "ignore_unmapped", value.asInstanceOf[js.Any])
    
    inline def setIgnore_unmappedUndefined: Self = StObject.set(x, "ignore_unmapped", js.undefined)
    
    inline def setMode(value: SortMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setUnit(value: DistanceUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
