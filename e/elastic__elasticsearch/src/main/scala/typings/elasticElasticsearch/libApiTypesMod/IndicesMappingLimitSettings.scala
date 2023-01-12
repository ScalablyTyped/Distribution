package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesMappingLimitSettings extends StObject {
  
  var coerce: js.UndefOr[Boolean] = js.undefined
  
  var depth: js.UndefOr[IndicesMappingLimitSettingsDepth] = js.undefined
  
  var dimension_fields: js.UndefOr[IndicesMappingLimitSettingsDimensionFields] = js.undefined
  
  var field_name_length: js.UndefOr[IndicesMappingLimitSettingsFieldNameLength] = js.undefined
  
  var ignore_malformed: js.UndefOr[Boolean] = js.undefined
  
  var nested_fields: js.UndefOr[IndicesMappingLimitSettingsNestedFields] = js.undefined
  
  var nested_objects: js.UndefOr[IndicesMappingLimitSettingsNestedObjects] = js.undefined
  
  var total_fields: js.UndefOr[IndicesMappingLimitSettingsTotalFields] = js.undefined
}
object IndicesMappingLimitSettings {
  
  inline def apply(): IndicesMappingLimitSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesMappingLimitSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesMappingLimitSettings] (val x: Self) extends AnyVal {
    
    inline def setCoerce(value: Boolean): Self = StObject.set(x, "coerce", value.asInstanceOf[js.Any])
    
    inline def setCoerceUndefined: Self = StObject.set(x, "coerce", js.undefined)
    
    inline def setDepth(value: IndicesMappingLimitSettingsDepth): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setDimension_fields(value: IndicesMappingLimitSettingsDimensionFields): Self = StObject.set(x, "dimension_fields", value.asInstanceOf[js.Any])
    
    inline def setDimension_fieldsUndefined: Self = StObject.set(x, "dimension_fields", js.undefined)
    
    inline def setField_name_length(value: IndicesMappingLimitSettingsFieldNameLength): Self = StObject.set(x, "field_name_length", value.asInstanceOf[js.Any])
    
    inline def setField_name_lengthUndefined: Self = StObject.set(x, "field_name_length", js.undefined)
    
    inline def setIgnore_malformed(value: Boolean): Self = StObject.set(x, "ignore_malformed", value.asInstanceOf[js.Any])
    
    inline def setIgnore_malformedUndefined: Self = StObject.set(x, "ignore_malformed", js.undefined)
    
    inline def setNested_fields(value: IndicesMappingLimitSettingsNestedFields): Self = StObject.set(x, "nested_fields", value.asInstanceOf[js.Any])
    
    inline def setNested_fieldsUndefined: Self = StObject.set(x, "nested_fields", js.undefined)
    
    inline def setNested_objects(value: IndicesMappingLimitSettingsNestedObjects): Self = StObject.set(x, "nested_objects", value.asInstanceOf[js.Any])
    
    inline def setNested_objectsUndefined: Self = StObject.set(x, "nested_objects", js.undefined)
    
    inline def setTotal_fields(value: IndicesMappingLimitSettingsTotalFields): Self = StObject.set(x, "total_fields", value.asInstanceOf[js.Any])
    
    inline def setTotal_fieldsUndefined: Self = StObject.set(x, "total_fields", js.undefined)
  }
}
