package typings.googleapis.chromepolicyV1Mod.chromepolicyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProto2DescriptorProto extends StObject {
  
  var enumType: js.UndefOr[js.Array[SchemaProto2EnumDescriptorProto]] = js.undefined
  
  var field: js.UndefOr[js.Array[SchemaProto2FieldDescriptorProto]] = js.undefined
  
  var name: js.UndefOr[String | Null] = js.undefined
  
  var nestedType: js.UndefOr[js.Array[SchemaProto2DescriptorProto]] = js.undefined
  
  var oneofDecl: js.UndefOr[js.Array[SchemaProto2OneofDescriptorProto]] = js.undefined
}
object SchemaProto2DescriptorProto {
  
  inline def apply(): SchemaProto2DescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProto2DescriptorProto]
  }
  
  extension [Self <: SchemaProto2DescriptorProto](x: Self) {
    
    inline def setEnumType(value: js.Array[SchemaProto2EnumDescriptorProto]): Self = StObject.set(x, "enumType", value.asInstanceOf[js.Any])
    
    inline def setEnumTypeUndefined: Self = StObject.set(x, "enumType", js.undefined)
    
    inline def setEnumTypeVarargs(value: SchemaProto2EnumDescriptorProto*): Self = StObject.set(x, "enumType", js.Array(value*))
    
    inline def setField(value: js.Array[SchemaProto2FieldDescriptorProto]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setFieldVarargs(value: SchemaProto2FieldDescriptorProto*): Self = StObject.set(x, "field", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNestedType(value: js.Array[SchemaProto2DescriptorProto]): Self = StObject.set(x, "nestedType", value.asInstanceOf[js.Any])
    
    inline def setNestedTypeUndefined: Self = StObject.set(x, "nestedType", js.undefined)
    
    inline def setNestedTypeVarargs(value: SchemaProto2DescriptorProto*): Self = StObject.set(x, "nestedType", js.Array(value*))
    
    inline def setOneofDecl(value: js.Array[SchemaProto2OneofDescriptorProto]): Self = StObject.set(x, "oneofDecl", value.asInstanceOf[js.Any])
    
    inline def setOneofDeclUndefined: Self = StObject.set(x, "oneofDecl", js.undefined)
    
    inline def setOneofDeclVarargs(value: SchemaProto2OneofDescriptorProto*): Self = StObject.set(x, "oneofDecl", js.Array(value*))
  }
}
