package typings.googleCloudTextToSpeech.mod.google.protobuf

import typings.googleCloudTextToSpeech.mod.google.protobuf.FieldDescriptorProto.Label
import typings.googleCloudTextToSpeech.mod.google.protobuf.FieldDescriptorProto.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a FieldDescriptorProto. */
@js.native
trait IFieldDescriptorProto extends StObject {
  
  /** FieldDescriptorProto defaultValue */
  var defaultValue: js.UndefOr[String | Null] = js.native
  
  /** FieldDescriptorProto extendee */
  var extendee: js.UndefOr[String | Null] = js.native
  
  /** FieldDescriptorProto jsonName */
  var jsonName: js.UndefOr[String | Null] = js.native
  
  /** FieldDescriptorProto label */
  var label: js.UndefOr[
    Label | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.FieldDescriptorProto.Label * / any */ String) | Null
  ] = js.native
  
  /** FieldDescriptorProto name */
  var name: js.UndefOr[String | Null] = js.native
  
  /** FieldDescriptorProto number */
  var number: js.UndefOr[Double | Null] = js.native
  
  /** FieldDescriptorProto oneofIndex */
  var oneofIndex: js.UndefOr[Double | Null] = js.native
  
  /** FieldDescriptorProto options */
  var options: js.UndefOr[IFieldOptions | Null] = js.native
  
  /** FieldDescriptorProto proto3Optional */
  var proto3Optional: js.UndefOr[Boolean | Null] = js.native
  
  /** FieldDescriptorProto type */
  var `type`: js.UndefOr[
    Type | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.FieldDescriptorProto.Type * / any */ String) | Null
  ] = js.native
  
  /** FieldDescriptorProto typeName */
  var typeName: js.UndefOr[String | Null] = js.native
}
object IFieldDescriptorProto {
  
  @scala.inline
  def apply(): IFieldDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldDescriptorProto]
  }
  
  @scala.inline
  implicit class IFieldDescriptorProtoMutableBuilder[Self <: IFieldDescriptorProto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setExtendee(value: String): Self = StObject.set(x, "extendee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendeeNull: Self = StObject.set(x, "extendee", null)
    
    @scala.inline
    def setExtendeeUndefined: Self = StObject.set(x, "extendee", js.undefined)
    
    @scala.inline
    def setJsonName(value: String): Self = StObject.set(x, "jsonName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonNameNull: Self = StObject.set(x, "jsonName", null)
    
    @scala.inline
    def setJsonNameUndefined: Self = StObject.set(x, "jsonName", js.undefined)
    
    @scala.inline
    def setLabel(
      value: Label | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.FieldDescriptorProto.Label * / any */ String)
    ): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelNull: Self = StObject.set(x, "label", null)
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberNull: Self = StObject.set(x, "number", null)
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    @scala.inline
    def setOneofIndex(value: Double): Self = StObject.set(x, "oneofIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneofIndexNull: Self = StObject.set(x, "oneofIndex", null)
    
    @scala.inline
    def setOneofIndexUndefined: Self = StObject.set(x, "oneofIndex", js.undefined)
    
    @scala.inline
    def setOptions(value: IFieldOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsNull: Self = StObject.set(x, "options", null)
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setProto3Optional(value: Boolean): Self = StObject.set(x, "proto3Optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProto3OptionalNull: Self = StObject.set(x, "proto3Optional", null)
    
    @scala.inline
    def setProto3OptionalUndefined: Self = StObject.set(x, "proto3Optional", js.undefined)
    
    @scala.inline
    def setType(
      value: Type | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.FieldDescriptorProto.Type * / any */ String)
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeName(value: String): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNameNull: Self = StObject.set(x, "typeName", null)
    
    @scala.inline
    def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
    
    @scala.inline
    def setTypeNull: Self = StObject.set(x, "type", null)
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
