package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.unsigned_long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingUnsignedLongNumberProperty
  extends StObject
     with MappingNumberPropertyBase
     with MappingProperty {
  
  var null_value: js.UndefOr[ulong] = js.undefined
  
  var `type`: unsigned_long
}
object MappingUnsignedLongNumberProperty {
  
  inline def apply(): MappingUnsignedLongNumberProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("unsigned_long")
    __obj.asInstanceOf[MappingUnsignedLongNumberProperty]
  }
  
  extension [Self <: MappingUnsignedLongNumberProperty](x: Self) {
    
    inline def setNull_value(value: ulong): Self = StObject.set(x, "null_value", value.asInstanceOf[js.Any])
    
    inline def setNull_valueUndefined: Self = StObject.set(x, "null_value", js.undefined)
    
    inline def setType(value: unsigned_long): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
