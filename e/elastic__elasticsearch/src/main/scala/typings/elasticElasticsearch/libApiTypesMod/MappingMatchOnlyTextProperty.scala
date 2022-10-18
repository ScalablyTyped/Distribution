package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.match_only_text
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingMatchOnlyTextProperty
  extends StObject
     with MappingProperty {
  
  var copy_to: js.UndefOr[Fields] = js.undefined
  
  var fields: js.UndefOr[Record[PropertyName, MappingProperty]] = js.undefined
  
  var meta: js.UndefOr[Record[String, String]] = js.undefined
  
  var `type`: match_only_text
}
object MappingMatchOnlyTextProperty {
  
  inline def apply(): MappingMatchOnlyTextProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("match_only_text")
    __obj.asInstanceOf[MappingMatchOnlyTextProperty]
  }
  
  extension [Self <: MappingMatchOnlyTextProperty](x: Self) {
    
    inline def setCopy_to(value: Fields): Self = StObject.set(x, "copy_to", value.asInstanceOf[js.Any])
    
    inline def setCopy_toUndefined: Self = StObject.set(x, "copy_to", js.undefined)
    
    inline def setCopy_toVarargs(value: Field*): Self = StObject.set(x, "copy_to", js.Array(value*))
    
    inline def setFields(value: Record[PropertyName, MappingProperty]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setMeta(value: Record[String, String]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setType(value: match_only_text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
