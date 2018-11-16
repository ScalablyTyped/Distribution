package typings
package googleDashProtobufLib.googleDashProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf", "BinaryConstants")
@js.native
object BinaryConstantsNs extends js.Object {
  @js.native
  sealed trait FieldType extends js.Object
  
  @js.native
  sealed trait WireType extends js.Object
  
  val FLOAT32_EPS: scala.Double = js.native
  val FLOAT32_MAX: scala.Double = js.native
  val FLOAT32_MIN: scala.Double = js.native
  val FLOAT64_EPS: scala.Double = js.native
  val FLOAT64_MAX: scala.Double = js.native
  val FLOAT64_MIN: scala.Double = js.native
  val FieldTypeToWireType: js.Function1[/* fieldType */ FieldType, WireType] = js.native
  val INVALID_FIELD_NUMBER: scala.Double = js.native
  val TWO_TO_20: scala.Double = js.native
  val TWO_TO_23: scala.Double = js.native
  val TWO_TO_31: scala.Double = js.native
  val TWO_TO_32: scala.Double = js.native
  val TWO_TO_52: scala.Double = js.native
  val TWO_TO_63: scala.Double = js.native
  val TWO_TO_64: scala.Double = js.native
  val ZERO_HASH: java.lang.String = js.native
  @js.native
  object FieldType extends js.Object {
    @js.native
    sealed trait BOOL
      extends googleDashProtobufLib.googleDashProtobufMod.BinaryConstantsNs.FieldType
    
    @js.native
    sealed trait BYTES
      extends googleDashProtobufLib.googleDashProtobufMod.BinaryConstantsNs.FieldType
    
    @js.native
    sealed trait DOUBLE
      extends googleDashProtobufLib.googleDashProtobufMod.BinaryConstantsNs.FieldType
    
    @js.native
    sealed trait ENUM
      extends googleDashProtobufLib.googleDashProtobufMod.BinaryConstantsNs.FieldType
    
    @js.native
    sealed trait FHASH64
      extends googleDashProtobufLib.googleDashProtobufMod.BinaryConstantsNs.FieldType
    
    @js.native
    sealed trait FIXED32
      extends googleDashProtobufLib.googleDashProtobufMod.BinaryConstantsNs.FieldType
    
    @js.native
    sealed trait FIXED64
      extends googleDashProtobufLib.googleDashProtobufMod.BinaryConstantsNs.FieldType
    
    @js.native
    sealed trait FLOAT
      extends googleDashProtobufLib.googleDashProtobufMod.BinaryConstantsNs.FieldType
    
    @js.native
    sealed trait GROUP
      extends googleDashProtobufLib.googleDashProtobufMod.BinaryConstantsNs.FieldType
    
    @js.native
    sealed trait INT32
      extends googleDashProtobufLib.googleDashProtobufMod.BinaryConstantsNs.FieldType
    
    @js.native
    sealed trait INT64
      extends googleDashProtobufLib.googleDashProtobufMod.BinaryConstantsNs.FieldType
    
    @js.native
    sealed trait INVALID
      extends googleDashProtobufLib.googleDashProtobufMod.BinaryConstantsNs.FieldType
    
    @js.native
    sealed trait MESSAGE
      extends googleDashProtobufLib.googleDashProtobufMod.BinaryConstantsNs.FieldType
    
    @js.native
    sealed trait SFIXED32
      extends googleDashProtobufLib.googleDashProtobufMod.BinaryConstantsNs.FieldType
    
    @js.native
    sealed trait SFIXED64
      extends googleDashProtobufLib.googleDashProtobufMod.BinaryConstantsNs.FieldType
    
    @js.native
    sealed trait SINT32
      extends googleDashProtobufLib.googleDashProtobufMod.BinaryConstantsNs.FieldType
    
    @js.native
    sealed trait SINT64
      extends googleDashProtobufLib.googleDashProtobufMod.BinaryConstantsNs.FieldType
    
    @js.native
    sealed trait STRING
      extends googleDashProtobufLib.googleDashProtobufMod.BinaryConstantsNs.FieldType
    
    @js.native
    sealed trait UINT32
      extends googleDashProtobufLib.googleDashProtobufMod.BinaryConstantsNs.FieldType
    
    @js.native
    sealed trait UINT64
      extends googleDashProtobufLib.googleDashProtobufMod.BinaryConstantsNs.FieldType
    
    @js.native
    sealed trait VHASH64
      extends googleDashProtobufLib.googleDashProtobufMod.BinaryConstantsNs.FieldType
    
    /* 8 */ val BOOL: BOOL with scala.Double = js.native
    /* 12 */ val BYTES: BYTES with scala.Double = js.native
    /* 1 */ val DOUBLE: DOUBLE with scala.Double = js.native
    /* 14 */ val ENUM: ENUM with scala.Double = js.native
    /* 30 */ val FHASH64: FHASH64 with scala.Double = js.native
    /* 7 */ val FIXED32: FIXED32 with scala.Double = js.native
    /* 6 */ val FIXED64: FIXED64 with scala.Double = js.native
    /* 2 */ val FLOAT: FLOAT with scala.Double = js.native
    /* 10 */ val GROUP: GROUP with scala.Double = js.native
    /* 5 */ val INT32: INT32 with scala.Double = js.native
    /* 3 */ val INT64: INT64 with scala.Double = js.native
    /* -1 */ val INVALID: INVALID with scala.Double = js.native
    /* 11 */ val MESSAGE: MESSAGE with scala.Double = js.native
    /* 15 */ val SFIXED32: SFIXED32 with scala.Double = js.native
    /* 16 */ val SFIXED64: SFIXED64 with scala.Double = js.native
    /* 17 */ val SINT32: SINT32 with scala.Double = js.native
    /* 18 */ val SINT64: SINT64 with scala.Double = js.native
    /* 9 */ val STRING: STRING with scala.Double = js.native
    /* 13 */ val UINT32: UINT32 with scala.Double = js.native
    /* 4 */ val UINT64: UINT64 with scala.Double = js.native
    /* 31 */ val VHASH64: VHASH64 with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        googleDashProtobufLib.googleDashProtobufMod.BinaryConstantsNs.FieldType with scala.Double
      ] = js.native
  }
  
  @js.native
  object WireType extends js.Object {
    @js.native
    sealed trait DELIMITED
      extends googleDashProtobufLib.googleDashProtobufMod.BinaryConstantsNs.WireType
    
    @js.native
    sealed trait END_GROUP
      extends googleDashProtobufLib.googleDashProtobufMod.BinaryConstantsNs.WireType
    
    @js.native
    sealed trait FIXED32
      extends googleDashProtobufLib.googleDashProtobufMod.BinaryConstantsNs.WireType
    
    @js.native
    sealed trait FIXED64
      extends googleDashProtobufLib.googleDashProtobufMod.BinaryConstantsNs.WireType
    
    @js.native
    sealed trait INVALID
      extends googleDashProtobufLib.googleDashProtobufMod.BinaryConstantsNs.WireType
    
    @js.native
    sealed trait START_GROUP
      extends googleDashProtobufLib.googleDashProtobufMod.BinaryConstantsNs.WireType
    
    @js.native
    sealed trait VARINT
      extends googleDashProtobufLib.googleDashProtobufMod.BinaryConstantsNs.WireType
    
    /* 2 */ val DELIMITED: DELIMITED with scala.Double = js.native
    /* 4 */ val END_GROUP: END_GROUP with scala.Double = js.native
    /* 5 */ val FIXED32: FIXED32 with scala.Double = js.native
    /* 1 */ val FIXED64: FIXED64 with scala.Double = js.native
    /* -1 */ val INVALID: INVALID with scala.Double = js.native
    /* 3 */ val START_GROUP: START_GROUP with scala.Double = js.native
    /* 0 */ val VARINT: VARINT with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        googleDashProtobufLib.googleDashProtobufMod.BinaryConstantsNs.WireType with scala.Double
      ] = js.native
  }
  
}

