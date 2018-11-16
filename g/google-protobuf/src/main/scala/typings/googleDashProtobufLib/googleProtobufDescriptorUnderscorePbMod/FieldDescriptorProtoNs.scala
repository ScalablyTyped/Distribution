package typings
package googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FieldDescriptorProto")
@js.native
object FieldDescriptorProtoNs extends js.Object {
  
  trait AsObject extends js.Object {
    var defaultValue: js.UndefOr[java.lang.String] = js.undefined
    var extendee: js.UndefOr[java.lang.String] = js.undefined
    var jsonName: js.UndefOr[java.lang.String] = js.undefined
    var label: js.UndefOr[Label] = js.undefined
    var name: js.UndefOr[java.lang.String] = js.undefined
    var number: js.UndefOr[scala.Double] = js.undefined
    var oneofIndex: js.UndefOr[scala.Double] = js.undefined
    var options: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldOptionsNs.AsObject
    var `type`: js.UndefOr[Type] = js.undefined
    var typeName: js.UndefOr[java.lang.String] = js.undefined
  }
  
  @js.native
  sealed trait Label extends js.Object
  
  @js.native
  sealed trait Type extends js.Object
  
  @js.native
  object Label extends js.Object {
    @js.native
    sealed trait LABEL_OPTIONAL
      extends googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Label
    
    @js.native
    sealed trait LABEL_REPEATED
      extends googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Label
    
    @js.native
    sealed trait LABEL_REQUIRED
      extends googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Label
    
    /* 1 */ val LABEL_OPTIONAL: LABEL_OPTIONAL with scala.Double = js.native
    /* 3 */ val LABEL_REPEATED: LABEL_REPEATED with scala.Double = js.native
    /* 2 */ val LABEL_REQUIRED: LABEL_REQUIRED with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Label with scala.Double
      ] = js.native
  }
  
  @js.native
  object Type extends js.Object {
    @js.native
    sealed trait TYPE_BOOL
      extends googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Type
    
    @js.native
    sealed trait TYPE_BYTES
      extends googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Type
    
    @js.native
    sealed trait TYPE_DOUBLE
      extends googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Type
    
    @js.native
    sealed trait TYPE_ENUM
      extends googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Type
    
    @js.native
    sealed trait TYPE_FIXED32
      extends googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Type
    
    @js.native
    sealed trait TYPE_FIXED64
      extends googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Type
    
    @js.native
    sealed trait TYPE_FLOAT
      extends googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Type
    
    @js.native
    sealed trait TYPE_GROUP
      extends googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Type
    
    @js.native
    sealed trait TYPE_INT32
      extends googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Type
    
    @js.native
    sealed trait TYPE_INT64
      extends googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Type
    
    @js.native
    sealed trait TYPE_MESSAGE
      extends googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Type
    
    @js.native
    sealed trait TYPE_SFIXED32
      extends googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Type
    
    @js.native
    sealed trait TYPE_SFIXED64
      extends googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Type
    
    @js.native
    sealed trait TYPE_SINT32
      extends googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Type
    
    @js.native
    sealed trait TYPE_SINT64
      extends googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Type
    
    @js.native
    sealed trait TYPE_STRING
      extends googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Type
    
    @js.native
    sealed trait TYPE_UINT32
      extends googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Type
    
    @js.native
    sealed trait TYPE_UINT64
      extends googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Type
    
    /* 8 */ val TYPE_BOOL: TYPE_BOOL with scala.Double = js.native
    /* 12 */ val TYPE_BYTES: TYPE_BYTES with scala.Double = js.native
    /* 1 */ val TYPE_DOUBLE: TYPE_DOUBLE with scala.Double = js.native
    /* 14 */ val TYPE_ENUM: TYPE_ENUM with scala.Double = js.native
    /* 7 */ val TYPE_FIXED32: TYPE_FIXED32 with scala.Double = js.native
    /* 6 */ val TYPE_FIXED64: TYPE_FIXED64 with scala.Double = js.native
    /* 2 */ val TYPE_FLOAT: TYPE_FLOAT with scala.Double = js.native
    /* 10 */ val TYPE_GROUP: TYPE_GROUP with scala.Double = js.native
    /* 5 */ val TYPE_INT32: TYPE_INT32 with scala.Double = js.native
    /* 3 */ val TYPE_INT64: TYPE_INT64 with scala.Double = js.native
    /* 11 */ val TYPE_MESSAGE: TYPE_MESSAGE with scala.Double = js.native
    /* 15 */ val TYPE_SFIXED32: TYPE_SFIXED32 with scala.Double = js.native
    /* 16 */ val TYPE_SFIXED64: TYPE_SFIXED64 with scala.Double = js.native
    /* 17 */ val TYPE_SINT32: TYPE_SINT32 with scala.Double = js.native
    /* 18 */ val TYPE_SINT64: TYPE_SINT64 with scala.Double = js.native
    /* 9 */ val TYPE_STRING: TYPE_STRING with scala.Double = js.native
    /* 13 */ val TYPE_UINT32: TYPE_UINT32 with scala.Double = js.native
    /* 4 */ val TYPE_UINT64: TYPE_UINT64 with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProtoNs.Type with scala.Double
      ] = js.native
  }
  
}

