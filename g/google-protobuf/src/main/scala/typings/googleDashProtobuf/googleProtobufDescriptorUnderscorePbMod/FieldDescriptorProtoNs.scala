package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod

import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Label
import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FieldDescriptorProto")
@js.native
object FieldDescriptorProtoNs extends js.Object {
  trait AsObject extends js.Object {
    var defaultValue: js.UndefOr[String] = js.undefined
    var extendee: js.UndefOr[String] = js.undefined
    var jsonName: js.UndefOr[String] = js.undefined
    var label: js.UndefOr[Label] = js.undefined
    var name: js.UndefOr[String] = js.undefined
    var number: js.UndefOr[Double] = js.undefined
    var oneofIndex: js.UndefOr[Double] = js.undefined
    var options: js.UndefOr[
        typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldOptionsNs.AsObject
      ] = js.undefined
    var `type`: js.UndefOr[Type] = js.undefined
    var typeName: js.UndefOr[String] = js.undefined
  }
  
  @js.native
  sealed trait Label extends js.Object
  
  @js.native
  sealed trait Type extends js.Object
  
  @js.native
  object Label extends js.Object {
    @js.native
    sealed trait LABEL_OPTIONAL extends Label
    
    @js.native
    sealed trait LABEL_REPEATED extends Label
    
    @js.native
    sealed trait LABEL_REQUIRED extends Label
    
    /* 1 */ val LABEL_OPTIONAL: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Label.LABEL_OPTIONAL with Double = js.native
    /* 3 */ val LABEL_REPEATED: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Label.LABEL_REPEATED with Double = js.native
    /* 2 */ val LABEL_REQUIRED: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Label.LABEL_REQUIRED with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Label with Double] = js.native
  }
  
  @js.native
  object Type extends js.Object {
    @js.native
    sealed trait TYPE_BOOL extends Type
    
    @js.native
    sealed trait TYPE_BYTES extends Type
    
    @js.native
    sealed trait TYPE_DOUBLE extends Type
    
    @js.native
    sealed trait TYPE_ENUM extends Type
    
    @js.native
    sealed trait TYPE_FIXED32 extends Type
    
    @js.native
    sealed trait TYPE_FIXED64 extends Type
    
    @js.native
    sealed trait TYPE_FLOAT extends Type
    
    @js.native
    sealed trait TYPE_GROUP extends Type
    
    @js.native
    sealed trait TYPE_INT32 extends Type
    
    @js.native
    sealed trait TYPE_INT64 extends Type
    
    @js.native
    sealed trait TYPE_MESSAGE extends Type
    
    @js.native
    sealed trait TYPE_SFIXED32 extends Type
    
    @js.native
    sealed trait TYPE_SFIXED64 extends Type
    
    @js.native
    sealed trait TYPE_SINT32 extends Type
    
    @js.native
    sealed trait TYPE_SINT64 extends Type
    
    @js.native
    sealed trait TYPE_STRING extends Type
    
    @js.native
    sealed trait TYPE_UINT32 extends Type
    
    @js.native
    sealed trait TYPE_UINT64 extends Type
    
    /* 8 */ val TYPE_BOOL: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Type.TYPE_BOOL with Double = js.native
    /* 12 */ val TYPE_BYTES: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Type.TYPE_BYTES with Double = js.native
    /* 1 */ val TYPE_DOUBLE: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Type.TYPE_DOUBLE with Double = js.native
    /* 14 */ val TYPE_ENUM: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Type.TYPE_ENUM with Double = js.native
    /* 7 */ val TYPE_FIXED32: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Type.TYPE_FIXED32 with Double = js.native
    /* 6 */ val TYPE_FIXED64: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Type.TYPE_FIXED64 with Double = js.native
    /* 2 */ val TYPE_FLOAT: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Type.TYPE_FLOAT with Double = js.native
    /* 10 */ val TYPE_GROUP: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Type.TYPE_GROUP with Double = js.native
    /* 5 */ val TYPE_INT32: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Type.TYPE_INT32 with Double = js.native
    /* 3 */ val TYPE_INT64: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Type.TYPE_INT64 with Double = js.native
    /* 11 */ val TYPE_MESSAGE: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Type.TYPE_MESSAGE with Double = js.native
    /* 15 */ val TYPE_SFIXED32: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Type.TYPE_SFIXED32 with Double = js.native
    /* 16 */ val TYPE_SFIXED64: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Type.TYPE_SFIXED64 with Double = js.native
    /* 17 */ val TYPE_SINT32: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Type.TYPE_SINT32 with Double = js.native
    /* 18 */ val TYPE_SINT64: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Type.TYPE_SINT64 with Double = js.native
    /* 9 */ val TYPE_STRING: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Type.TYPE_STRING with Double = js.native
    /* 13 */ val TYPE_UINT32: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Type.TYPE_UINT32 with Double = js.native
    /* 4 */ val TYPE_UINT64: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Type.TYPE_UINT64 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Type with Double] = js.native
  }
  
}

