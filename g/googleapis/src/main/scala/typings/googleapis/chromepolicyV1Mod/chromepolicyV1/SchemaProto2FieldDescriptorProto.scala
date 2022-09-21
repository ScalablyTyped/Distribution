package typings.googleapis.chromepolicyV1Mod.chromepolicyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProto2FieldDescriptorProto extends StObject {
  
  /**
    * For numeric types, contains the original text representation of the value. For booleans, "true" or "false". For strings, contains the default text contents (not escaped in any way). For bytes, contains the C escaped value. All bytes \>= 128 are escaped.
    */
  var defaultValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * JSON name of this field. The value is set by protocol compiler. If the user has set a "json_name" option on this field, that option's value will be used. Otherwise, it's deduced from the field's name by converting it to camelCase.
    */
  var jsonName: js.UndefOr[String | Null] = js.undefined
  
  var label: js.UndefOr[String | Null] = js.undefined
  
  var name: js.UndefOr[String | Null] = js.undefined
  
  var number: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * If set, gives the index of a oneof in the containing type's oneof_decl list. This field is a member of that oneof.
    */
  var oneofIndex: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * If true, this is a proto3 "optional". When a proto3 field is optional, it tracks presence regardless of field type. When proto3_optional is true, this field must be belong to a oneof to signal to old proto3 clients that presence is tracked for this field. This oneof is known as a "synthetic" oneof, and this field must be its sole member (each proto3 optional field gets its own synthetic oneof). Synthetic oneofs exist in the descriptor only, and do not generate any API. Synthetic oneofs must be ordered after all "real" oneofs. For message fields, proto3_optional doesn't create any semantic change, since non-repeated message fields always track presence. However it still indicates the semantic detail of whether the user wrote "optional" or not. This can be useful for round-tripping the .proto file. For consistency we give message fields a synthetic oneof also, even though it is not required to track presence. This is especially important because the parser can't tell if a field is a message or an enum, so it must always create a synthetic oneof. Proto2 optional fields do not set this flag, because they already indicate optional with `LABEL_OPTIONAL`.
    */
  var proto3Optional: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If type_name is set, this need not be set. If both this and type_name are set, this must be one of TYPE_ENUM, TYPE_MESSAGE or TYPE_GROUP.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * For message and enum types, this is the name of the type. If the name starts with a '.', it is fully-qualified. Otherwise, C++-like scoping rules are used to find the type (i.e. first the nested types within this message are searched, then within the parent, on up to the root namespace).
    */
  var typeName: js.UndefOr[String | Null] = js.undefined
}
object SchemaProto2FieldDescriptorProto {
  
  inline def apply(): SchemaProto2FieldDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProto2FieldDescriptorProto]
  }
  
  extension [Self <: SchemaProto2FieldDescriptorProto](x: Self) {
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setJsonName(value: String): Self = StObject.set(x, "jsonName", value.asInstanceOf[js.Any])
    
    inline def setJsonNameNull: Self = StObject.set(x, "jsonName", null)
    
    inline def setJsonNameUndefined: Self = StObject.set(x, "jsonName", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberNull: Self = StObject.set(x, "number", null)
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setOneofIndex(value: Double): Self = StObject.set(x, "oneofIndex", value.asInstanceOf[js.Any])
    
    inline def setOneofIndexNull: Self = StObject.set(x, "oneofIndex", null)
    
    inline def setOneofIndexUndefined: Self = StObject.set(x, "oneofIndex", js.undefined)
    
    inline def setProto3Optional(value: Boolean): Self = StObject.set(x, "proto3Optional", value.asInstanceOf[js.Any])
    
    inline def setProto3OptionalNull: Self = StObject.set(x, "proto3Optional", null)
    
    inline def setProto3OptionalUndefined: Self = StObject.set(x, "proto3Optional", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: String): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameNull: Self = StObject.set(x, "typeName", null)
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
