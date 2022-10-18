package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingPropertyBase extends StObject {
  
  var dynamic: js.UndefOr[MappingDynamicMapping] = js.undefined
  
  var fields: js.UndefOr[Record[PropertyName, MappingProperty]] = js.undefined
  
  var ignore_above: js.UndefOr[integer] = js.undefined
  
  var local_metadata: js.UndefOr[Metadata] = js.undefined
  
  var meta: js.UndefOr[Record[String, String]] = js.undefined
  
  var properties: js.UndefOr[Record[PropertyName, MappingProperty]] = js.undefined
}
object MappingPropertyBase {
  
  inline def apply(): MappingPropertyBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MappingPropertyBase]
  }
  
  extension [Self <: MappingPropertyBase](x: Self) {
    
    inline def setDynamic(value: MappingDynamicMapping): Self = StObject.set(x, "dynamic", value.asInstanceOf[js.Any])
    
    inline def setDynamicUndefined: Self = StObject.set(x, "dynamic", js.undefined)
    
    inline def setFields(value: Record[PropertyName, MappingProperty]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setIgnore_above(value: integer): Self = StObject.set(x, "ignore_above", value.asInstanceOf[js.Any])
    
    inline def setIgnore_aboveUndefined: Self = StObject.set(x, "ignore_above", js.undefined)
    
    inline def setLocal_metadata(value: Metadata): Self = StObject.set(x, "local_metadata", value.asInstanceOf[js.Any])
    
    inline def setLocal_metadataUndefined: Self = StObject.set(x, "local_metadata", js.undefined)
    
    inline def setMeta(value: Record[String, String]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setProperties(value: Record[PropertyName, MappingProperty]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
