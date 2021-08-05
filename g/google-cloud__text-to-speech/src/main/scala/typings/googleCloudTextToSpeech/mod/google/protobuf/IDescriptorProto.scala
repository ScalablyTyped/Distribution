package typings.googleCloudTextToSpeech.mod.google.protobuf

import typings.googleCloudTextToSpeech.mod.google.protobuf.DescriptorProto.IExtensionRange
import typings.googleCloudTextToSpeech.mod.google.protobuf.DescriptorProto.IReservedRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a DescriptorProto. */
trait IDescriptorProto extends StObject {
  
  /** DescriptorProto enumType */
  var enumType: js.UndefOr[js.Array[IEnumDescriptorProto] | Null] = js.undefined
  
  /** DescriptorProto extension */
  var `extension`: js.UndefOr[js.Array[IFieldDescriptorProto] | Null] = js.undefined
  
  /** DescriptorProto extensionRange */
  var extensionRange: js.UndefOr[js.Array[IExtensionRange] | Null] = js.undefined
  
  /** DescriptorProto field */
  var field: js.UndefOr[js.Array[IFieldDescriptorProto] | Null] = js.undefined
  
  /** DescriptorProto name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** DescriptorProto nestedType */
  var nestedType: js.UndefOr[js.Array[IDescriptorProto] | Null] = js.undefined
  
  /** DescriptorProto oneofDecl */
  var oneofDecl: js.UndefOr[js.Array[IOneofDescriptorProto] | Null] = js.undefined
  
  /** DescriptorProto options */
  var options: js.UndefOr[IMessageOptions | Null] = js.undefined
  
  /** DescriptorProto reservedName */
  var reservedName: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** DescriptorProto reservedRange */
  var reservedRange: js.UndefOr[js.Array[IReservedRange] | Null] = js.undefined
}
object IDescriptorProto {
  
  inline def apply(): IDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDescriptorProto]
  }
  
  extension [Self <: IDescriptorProto](x: Self) {
    
    inline def setEnumType(value: js.Array[IEnumDescriptorProto]): Self = StObject.set(x, "enumType", value.asInstanceOf[js.Any])
    
    inline def setEnumTypeNull: Self = StObject.set(x, "enumType", null)
    
    inline def setEnumTypeUndefined: Self = StObject.set(x, "enumType", js.undefined)
    
    inline def setEnumTypeVarargs(value: IEnumDescriptorProto*): Self = StObject.set(x, "enumType", js.Array(value :_*))
    
    inline def setExtension(value: js.Array[IFieldDescriptorProto]): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionNull: Self = StObject.set(x, "extension", null)
    
    inline def setExtensionRange(value: js.Array[IExtensionRange]): Self = StObject.set(x, "extensionRange", value.asInstanceOf[js.Any])
    
    inline def setExtensionRangeNull: Self = StObject.set(x, "extensionRange", null)
    
    inline def setExtensionRangeUndefined: Self = StObject.set(x, "extensionRange", js.undefined)
    
    inline def setExtensionRangeVarargs(value: IExtensionRange*): Self = StObject.set(x, "extensionRange", js.Array(value :_*))
    
    inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    inline def setExtensionVarargs(value: IFieldDescriptorProto*): Self = StObject.set(x, "extension", js.Array(value :_*))
    
    inline def setField(value: js.Array[IFieldDescriptorProto]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldNull: Self = StObject.set(x, "field", null)
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setFieldVarargs(value: IFieldDescriptorProto*): Self = StObject.set(x, "field", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNestedType(value: js.Array[IDescriptorProto]): Self = StObject.set(x, "nestedType", value.asInstanceOf[js.Any])
    
    inline def setNestedTypeNull: Self = StObject.set(x, "nestedType", null)
    
    inline def setNestedTypeUndefined: Self = StObject.set(x, "nestedType", js.undefined)
    
    inline def setNestedTypeVarargs(value: IDescriptorProto*): Self = StObject.set(x, "nestedType", js.Array(value :_*))
    
    inline def setOneofDecl(value: js.Array[IOneofDescriptorProto]): Self = StObject.set(x, "oneofDecl", value.asInstanceOf[js.Any])
    
    inline def setOneofDeclNull: Self = StObject.set(x, "oneofDecl", null)
    
    inline def setOneofDeclUndefined: Self = StObject.set(x, "oneofDecl", js.undefined)
    
    inline def setOneofDeclVarargs(value: IOneofDescriptorProto*): Self = StObject.set(x, "oneofDecl", js.Array(value :_*))
    
    inline def setOptions(value: IMessageOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsNull: Self = StObject.set(x, "options", null)
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setReservedName(value: js.Array[String]): Self = StObject.set(x, "reservedName", value.asInstanceOf[js.Any])
    
    inline def setReservedNameNull: Self = StObject.set(x, "reservedName", null)
    
    inline def setReservedNameUndefined: Self = StObject.set(x, "reservedName", js.undefined)
    
    inline def setReservedNameVarargs(value: String*): Self = StObject.set(x, "reservedName", js.Array(value :_*))
    
    inline def setReservedRange(value: js.Array[IReservedRange]): Self = StObject.set(x, "reservedRange", value.asInstanceOf[js.Any])
    
    inline def setReservedRangeNull: Self = StObject.set(x, "reservedRange", null)
    
    inline def setReservedRangeUndefined: Self = StObject.set(x, "reservedRange", js.undefined)
    
    inline def setReservedRangeVarargs(value: IReservedRange*): Self = StObject.set(x, "reservedRange", js.Array(value :_*))
  }
}
