package typings
package googleDashProtobufLib.googleProtobufTypeUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/type_pb", "Field")
@js.native
object FieldNs extends js.Object {
  
  trait AsObject extends js.Object {
    var cardinality: Cardinality
    var defaultValue: java.lang.String
    var jsonName: java.lang.String
    var kind: Kind
    var name: java.lang.String
    var number: scala.Double
    var oneofIndex: scala.Double
    var optionsList: js.Array[googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.OptionNs.AsObject]
    var packed: scala.Boolean
    var typeUrl: java.lang.String
  }
  
  @js.native
  sealed trait Cardinality extends js.Object
  
  @js.native
  sealed trait Kind extends js.Object
  
  @js.native
  object Cardinality extends js.Object {
    @js.native
    sealed trait CARDINALITY_OPTIONAL
      extends googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.FieldNs.Cardinality
    
    @js.native
    sealed trait CARDINALITY_REPEATED
      extends googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.FieldNs.Cardinality
    
    @js.native
    sealed trait CARDINALITY_REQUIRED
      extends googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.FieldNs.Cardinality
    
    @js.native
    sealed trait CARDINALITY_UNKNOWN
      extends googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.FieldNs.Cardinality
    
    /* 1 */ val CARDINALITY_OPTIONAL: CARDINALITY_OPTIONAL with scala.Double = js.native
    /* 3 */ val CARDINALITY_REPEATED: CARDINALITY_REPEATED with scala.Double = js.native
    /* 2 */ val CARDINALITY_REQUIRED: CARDINALITY_REQUIRED with scala.Double = js.native
    /* 0 */ val CARDINALITY_UNKNOWN: CARDINALITY_UNKNOWN with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.FieldNs.Cardinality with scala.Double
      ] = js.native
  }
  
  @js.native
  object Kind extends js.Object {
    @js.native
    sealed trait TYPE_BOOL
      extends googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.FieldNs.Kind
    
    @js.native
    sealed trait TYPE_BYTES
      extends googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.FieldNs.Kind
    
    @js.native
    sealed trait TYPE_DOUBLE
      extends googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.FieldNs.Kind
    
    @js.native
    sealed trait TYPE_ENUM
      extends googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.FieldNs.Kind
    
    @js.native
    sealed trait TYPE_FIXED32
      extends googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.FieldNs.Kind
    
    @js.native
    sealed trait TYPE_FIXED64
      extends googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.FieldNs.Kind
    
    @js.native
    sealed trait TYPE_FLOAT
      extends googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.FieldNs.Kind
    
    @js.native
    sealed trait TYPE_GROUP
      extends googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.FieldNs.Kind
    
    @js.native
    sealed trait TYPE_INT32
      extends googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.FieldNs.Kind
    
    @js.native
    sealed trait TYPE_INT64
      extends googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.FieldNs.Kind
    
    @js.native
    sealed trait TYPE_MESSAGE
      extends googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.FieldNs.Kind
    
    @js.native
    sealed trait TYPE_SFIXED32
      extends googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.FieldNs.Kind
    
    @js.native
    sealed trait TYPE_SFIXED64
      extends googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.FieldNs.Kind
    
    @js.native
    sealed trait TYPE_SINT32
      extends googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.FieldNs.Kind
    
    @js.native
    sealed trait TYPE_SINT64
      extends googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.FieldNs.Kind
    
    @js.native
    sealed trait TYPE_STRING
      extends googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.FieldNs.Kind
    
    @js.native
    sealed trait TYPE_UINT32
      extends googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.FieldNs.Kind
    
    @js.native
    sealed trait TYPE_UINT64
      extends googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.FieldNs.Kind
    
    @js.native
    sealed trait TYPE_UNKNOWN
      extends googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.FieldNs.Kind
    
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
    /* 0 */ val TYPE_UNKNOWN: TYPE_UNKNOWN with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.FieldNs.Kind with scala.Double
      ] = js.native
  }
  
}

