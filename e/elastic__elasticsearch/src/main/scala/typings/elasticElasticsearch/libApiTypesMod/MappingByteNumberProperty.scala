package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingByteNumberProperty
  extends StObject
     with MappingNumberPropertyBase
     with MappingProperty {
  
  var null_value: js.UndefOr[byte] = js.undefined
  
  var `type`: typings.elasticElasticsearch.elasticElasticsearchStrings.byte
}
object MappingByteNumberProperty {
  
  inline def apply(): MappingByteNumberProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("byte")
    __obj.asInstanceOf[MappingByteNumberProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MappingByteNumberProperty] (val x: Self) extends AnyVal {
    
    inline def setNull_value(value: byte): Self = StObject.set(x, "null_value", value.asInstanceOf[js.Any])
    
    inline def setNull_valueUndefined: Self = StObject.set(x, "null_value", js.undefined)
    
    inline def setType(value: typings.elasticElasticsearch.elasticElasticsearchStrings.byte): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
