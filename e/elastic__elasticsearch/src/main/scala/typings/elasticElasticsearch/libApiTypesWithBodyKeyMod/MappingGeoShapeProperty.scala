package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.geo_shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingGeoShapeProperty
  extends StObject
     with MappingDocValuesPropertyBase
     with MappingProperty {
  
  var coerce: js.UndefOr[Boolean] = js.undefined
  
  var ignore_malformed: js.UndefOr[Boolean] = js.undefined
  
  var ignore_z_value: js.UndefOr[Boolean] = js.undefined
  
  var orientation: js.UndefOr[MappingGeoOrientation] = js.undefined
  
  var strategy: js.UndefOr[MappingGeoStrategy] = js.undefined
  
  var `type`: geo_shape
}
object MappingGeoShapeProperty {
  
  inline def apply(): MappingGeoShapeProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("geo_shape")
    __obj.asInstanceOf[MappingGeoShapeProperty]
  }
  
  extension [Self <: MappingGeoShapeProperty](x: Self) {
    
    inline def setCoerce(value: Boolean): Self = StObject.set(x, "coerce", value.asInstanceOf[js.Any])
    
    inline def setCoerceUndefined: Self = StObject.set(x, "coerce", js.undefined)
    
    inline def setIgnore_malformed(value: Boolean): Self = StObject.set(x, "ignore_malformed", value.asInstanceOf[js.Any])
    
    inline def setIgnore_malformedUndefined: Self = StObject.set(x, "ignore_malformed", js.undefined)
    
    inline def setIgnore_z_value(value: Boolean): Self = StObject.set(x, "ignore_z_value", value.asInstanceOf[js.Any])
    
    inline def setIgnore_z_valueUndefined: Self = StObject.set(x, "ignore_z_value", js.undefined)
    
    inline def setOrientation(value: MappingGeoOrientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setStrategy(value: MappingGeoStrategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    
    inline def setType(value: geo_shape): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
