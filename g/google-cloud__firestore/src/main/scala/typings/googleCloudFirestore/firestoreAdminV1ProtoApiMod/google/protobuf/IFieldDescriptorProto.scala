package typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.protobuf

import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.protobuf.FieldDescriptorProto.Label
import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.protobuf.FieldDescriptorProto.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a FieldDescriptorProto. */
trait IFieldDescriptorProto extends StObject {
  
  /** FieldDescriptorProto defaultValue */
  var defaultValue: js.UndefOr[String | Null] = js.undefined
  
  /** FieldDescriptorProto extendee */
  var extendee: js.UndefOr[String | Null] = js.undefined
  
  /** FieldDescriptorProto jsonName */
  var jsonName: js.UndefOr[String | Null] = js.undefined
  
  /** FieldDescriptorProto label */
  var label: js.UndefOr[Label | Null] = js.undefined
  
  /** FieldDescriptorProto name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** FieldDescriptorProto number */
  var number: js.UndefOr[Double | Null] = js.undefined
  
  /** FieldDescriptorProto oneofIndex */
  var oneofIndex: js.UndefOr[Double | Null] = js.undefined
  
  /** FieldDescriptorProto options */
  var options: js.UndefOr[IFieldOptions | Null] = js.undefined
  
  /** FieldDescriptorProto type */
  var `type`: js.UndefOr[Type | Null] = js.undefined
  
  /** FieldDescriptorProto typeName */
  var typeName: js.UndefOr[String | Null] = js.undefined
}
object IFieldDescriptorProto {
  
  inline def apply(): IFieldDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldDescriptorProto]
  }
  
  extension [Self <: IFieldDescriptorProto](x: Self) {
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setExtendee(value: String): Self = StObject.set(x, "extendee", value.asInstanceOf[js.Any])
    
    inline def setExtendeeNull: Self = StObject.set(x, "extendee", null)
    
    inline def setExtendeeUndefined: Self = StObject.set(x, "extendee", js.undefined)
    
    inline def setJsonName(value: String): Self = StObject.set(x, "jsonName", value.asInstanceOf[js.Any])
    
    inline def setJsonNameNull: Self = StObject.set(x, "jsonName", null)
    
    inline def setJsonNameUndefined: Self = StObject.set(x, "jsonName", js.undefined)
    
    inline def setLabel(value: Label): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
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
    
    inline def setOptions(value: IFieldOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsNull: Self = StObject.set(x, "options", null)
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: String): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameNull: Self = StObject.set(x, "typeName", null)
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
