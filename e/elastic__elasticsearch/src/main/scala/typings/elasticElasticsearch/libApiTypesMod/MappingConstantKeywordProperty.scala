package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.constant_keyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingConstantKeywordProperty
  extends StObject
     with MappingPropertyBase
     with MappingProperty {
  
  var `type`: constant_keyword
  
  var value: js.UndefOr[Any] = js.undefined
}
object MappingConstantKeywordProperty {
  
  inline def apply(): MappingConstantKeywordProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("constant_keyword")
    __obj.asInstanceOf[MappingConstantKeywordProperty]
  }
  
  extension [Self <: MappingConstantKeywordProperty](x: Self) {
    
    inline def setType(value: constant_keyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
