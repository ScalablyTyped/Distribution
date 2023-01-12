package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingLongNumberProperty
  extends StObject
     with MappingNumberPropertyBase
     with MappingProperty {
  
  var null_value: js.UndefOr[long] = js.undefined
  
  var `type`: typings.elasticElasticsearch.elasticElasticsearchStrings.long
}
object MappingLongNumberProperty {
  
  inline def apply(): MappingLongNumberProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("long")
    __obj.asInstanceOf[MappingLongNumberProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MappingLongNumberProperty] (val x: Self) extends AnyVal {
    
    inline def setNull_value(value: long): Self = StObject.set(x, "null_value", value.asInstanceOf[js.Any])
    
    inline def setNull_valueUndefined: Self = StObject.set(x, "null_value", js.undefined)
    
    inline def setType(value: typings.elasticElasticsearch.elasticElasticsearchStrings.long): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
