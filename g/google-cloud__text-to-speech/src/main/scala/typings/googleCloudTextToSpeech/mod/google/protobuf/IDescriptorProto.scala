package typings.googleCloudTextToSpeech.mod.google.protobuf

import typings.googleCloudTextToSpeech.mod.google.protobuf.DescriptorProto.IExtensionRange
import typings.googleCloudTextToSpeech.mod.google.protobuf.DescriptorProto.IReservedRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a DescriptorProto. */
@js.native
trait IDescriptorProto extends StObject {
  
  /** DescriptorProto enumType */
  var enumType: js.UndefOr[js.Array[IEnumDescriptorProto] | Null] = js.native
  
  /** DescriptorProto extension */
  var extension: js.UndefOr[js.Array[IFieldDescriptorProto] | Null] = js.native
  
  /** DescriptorProto extensionRange */
  var extensionRange: js.UndefOr[js.Array[IExtensionRange] | Null] = js.native
  
  /** DescriptorProto field */
  var field: js.UndefOr[js.Array[IFieldDescriptorProto] | Null] = js.native
  
  /** DescriptorProto name */
  var name: js.UndefOr[String | Null] = js.native
  
  /** DescriptorProto nestedType */
  var nestedType: js.UndefOr[js.Array[IDescriptorProto] | Null] = js.native
  
  /** DescriptorProto oneofDecl */
  var oneofDecl: js.UndefOr[js.Array[IOneofDescriptorProto] | Null] = js.native
  
  /** DescriptorProto options */
  var options: js.UndefOr[IMessageOptions | Null] = js.native
  
  /** DescriptorProto reservedName */
  var reservedName: js.UndefOr[js.Array[String] | Null] = js.native
  
  /** DescriptorProto reservedRange */
  var reservedRange: js.UndefOr[js.Array[IReservedRange] | Null] = js.native
}
object IDescriptorProto {
  
  @scala.inline
  def apply(): IDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDescriptorProto]
  }
  
  @scala.inline
  implicit class IDescriptorProtoMutableBuilder[Self <: IDescriptorProto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumType(value: js.Array[IEnumDescriptorProto]): Self = StObject.set(x, "enumType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumTypeNull: Self = StObject.set(x, "enumType", null)
    
    @scala.inline
    def setEnumTypeUndefined: Self = StObject.set(x, "enumType", js.undefined)
    
    @scala.inline
    def setEnumTypeVarargs(value: IEnumDescriptorProto*): Self = StObject.set(x, "enumType", js.Array(value :_*))
    
    @scala.inline
    def setExtension(value: js.Array[IFieldDescriptorProto]): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionNull: Self = StObject.set(x, "extension", null)
    
    @scala.inline
    def setExtensionRange(value: js.Array[IExtensionRange]): Self = StObject.set(x, "extensionRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionRangeNull: Self = StObject.set(x, "extensionRange", null)
    
    @scala.inline
    def setExtensionRangeUndefined: Self = StObject.set(x, "extensionRange", js.undefined)
    
    @scala.inline
    def setExtensionRangeVarargs(value: IExtensionRange*): Self = StObject.set(x, "extensionRange", js.Array(value :_*))
    
    @scala.inline
    def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    @scala.inline
    def setExtensionVarargs(value: IFieldDescriptorProto*): Self = StObject.set(x, "extension", js.Array(value :_*))
    
    @scala.inline
    def setField(value: js.Array[IFieldDescriptorProto]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldNull: Self = StObject.set(x, "field", null)
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setFieldVarargs(value: IFieldDescriptorProto*): Self = StObject.set(x, "field", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNestedType(value: js.Array[IDescriptorProto]): Self = StObject.set(x, "nestedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestedTypeNull: Self = StObject.set(x, "nestedType", null)
    
    @scala.inline
    def setNestedTypeUndefined: Self = StObject.set(x, "nestedType", js.undefined)
    
    @scala.inline
    def setNestedTypeVarargs(value: IDescriptorProto*): Self = StObject.set(x, "nestedType", js.Array(value :_*))
    
    @scala.inline
    def setOneofDecl(value: js.Array[IOneofDescriptorProto]): Self = StObject.set(x, "oneofDecl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneofDeclNull: Self = StObject.set(x, "oneofDecl", null)
    
    @scala.inline
    def setOneofDeclUndefined: Self = StObject.set(x, "oneofDecl", js.undefined)
    
    @scala.inline
    def setOneofDeclVarargs(value: IOneofDescriptorProto*): Self = StObject.set(x, "oneofDecl", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: IMessageOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsNull: Self = StObject.set(x, "options", null)
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setReservedName(value: js.Array[String]): Self = StObject.set(x, "reservedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedNameNull: Self = StObject.set(x, "reservedName", null)
    
    @scala.inline
    def setReservedNameUndefined: Self = StObject.set(x, "reservedName", js.undefined)
    
    @scala.inline
    def setReservedNameVarargs(value: String*): Self = StObject.set(x, "reservedName", js.Array(value :_*))
    
    @scala.inline
    def setReservedRange(value: js.Array[IReservedRange]): Self = StObject.set(x, "reservedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedRangeNull: Self = StObject.set(x, "reservedRange", null)
    
    @scala.inline
    def setReservedRangeUndefined: Self = StObject.set(x, "reservedRange", js.undefined)
    
    @scala.inline
    def setReservedRangeVarargs(value: IReservedRange*): Self = StObject.set(x, "reservedRange", js.Array(value :_*))
  }
}
