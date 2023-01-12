package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.wildcard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingWildcardProperty
  extends StObject
     with MappingDocValuesPropertyBase
     with MappingProperty {
  
  var null_value: js.UndefOr[String] = js.undefined
  
  var `type`: wildcard
}
object MappingWildcardProperty {
  
  inline def apply(): MappingWildcardProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("wildcard")
    __obj.asInstanceOf[MappingWildcardProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MappingWildcardProperty] (val x: Self) extends AnyVal {
    
    inline def setNull_value(value: String): Self = StObject.set(x, "null_value", value.asInstanceOf[js.Any])
    
    inline def setNull_valueUndefined: Self = StObject.set(x, "null_value", js.undefined)
    
    inline def setType(value: wildcard): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
