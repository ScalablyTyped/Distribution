package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingPointProperty
  extends StObject
     with MappingDocValuesPropertyBase
     with MappingProperty {
  
  var ignore_malformed: js.UndefOr[Boolean] = js.undefined
  
  var ignore_z_value: js.UndefOr[Boolean] = js.undefined
  
  var null_value: js.UndefOr[String] = js.undefined
  
  var `type`: point
}
object MappingPointProperty {
  
  inline def apply(): MappingPointProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("point")
    __obj.asInstanceOf[MappingPointProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MappingPointProperty] (val x: Self) extends AnyVal {
    
    inline def setIgnore_malformed(value: Boolean): Self = StObject.set(x, "ignore_malformed", value.asInstanceOf[js.Any])
    
    inline def setIgnore_malformedUndefined: Self = StObject.set(x, "ignore_malformed", js.undefined)
    
    inline def setIgnore_z_value(value: Boolean): Self = StObject.set(x, "ignore_z_value", value.asInstanceOf[js.Any])
    
    inline def setIgnore_z_valueUndefined: Self = StObject.set(x, "ignore_z_value", js.undefined)
    
    inline def setNull_value(value: String): Self = StObject.set(x, "null_value", value.asInstanceOf[js.Any])
    
    inline def setNull_valueUndefined: Self = StObject.set(x, "null_value", js.undefined)
    
    inline def setType(value: point): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
