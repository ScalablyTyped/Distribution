package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingDoubleNumberProperty
  extends StObject
     with MappingNumberPropertyBase
     with MappingProperty {
  
  var null_value: js.UndefOr[double] = js.undefined
  
  var `type`: typings.elasticElasticsearch.elasticElasticsearchStrings.double
}
object MappingDoubleNumberProperty {
  
  inline def apply(): MappingDoubleNumberProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("double")
    __obj.asInstanceOf[MappingDoubleNumberProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MappingDoubleNumberProperty] (val x: Self) extends AnyVal {
    
    inline def setNull_value(value: double): Self = StObject.set(x, "null_value", value.asInstanceOf[js.Any])
    
    inline def setNull_valueUndefined: Self = StObject.set(x, "null_value", js.undefined)
    
    inline def setType(value: typings.elasticElasticsearch.elasticElasticsearchStrings.double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
