package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.geo_point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingGeoPointProperty
  extends StObject
     with MappingDocValuesPropertyBase
     with MappingProperty {
  
  var ignore_malformed: js.UndefOr[Boolean] = js.undefined
  
  var ignore_z_value: js.UndefOr[Boolean] = js.undefined
  
  var null_value: js.UndefOr[GeoLocation] = js.undefined
  
  var `type`: geo_point
}
object MappingGeoPointProperty {
  
  inline def apply(): MappingGeoPointProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("geo_point")
    __obj.asInstanceOf[MappingGeoPointProperty]
  }
  
  extension [Self <: MappingGeoPointProperty](x: Self) {
    
    inline def setIgnore_malformed(value: Boolean): Self = StObject.set(x, "ignore_malformed", value.asInstanceOf[js.Any])
    
    inline def setIgnore_malformedUndefined: Self = StObject.set(x, "ignore_malformed", js.undefined)
    
    inline def setIgnore_z_value(value: Boolean): Self = StObject.set(x, "ignore_z_value", value.asInstanceOf[js.Any])
    
    inline def setIgnore_z_valueUndefined: Self = StObject.set(x, "ignore_z_value", js.undefined)
    
    inline def setNull_value(value: GeoLocation): Self = StObject.set(x, "null_value", value.asInstanceOf[js.Any])
    
    inline def setNull_valueUndefined: Self = StObject.set(x, "null_value", js.undefined)
    
    inline def setNull_valueVarargs(value: double*): Self = StObject.set(x, "null_value", js.Array(value*))
    
    inline def setType(value: geo_point): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
