package typings.googleDashProtobuf.googleDashProtobufMod

import typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstantsNs.FieldType
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstantsNs.WireType
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
  
  val FLOAT32_EPS: Double = js.native
  val FLOAT32_MAX: Double = js.native
  val FLOAT32_MIN: Double = js.native
  val FLOAT64_EPS: Double = js.native
  val FLOAT64_MAX: Double = js.native
  val FLOAT64_MIN: Double = js.native
  val INVALID_FIELD_NUMBER: Double = js.native
  val TWO_TO_20: Double = js.native
  val TWO_TO_23: Double = js.native
  val TWO_TO_31: Double = js.native
  val TWO_TO_32: Double = js.native
  val TWO_TO_52: Double = js.native
  val TWO_TO_63: Double = js.native
  val TWO_TO_64: Double = js.native
  val ZERO_HASH: String = js.native
  def FieldTypeToWireType(fieldType: FieldType): WireType = js.native
  @js.native
  object FieldType extends js.Object {
    @js.native
    sealed trait BOOL extends FieldType
    
    @js.native
    sealed trait BYTES extends FieldType
    
    @js.native
    sealed trait DOUBLE extends FieldType
    
    @js.native
    sealed trait ENUM extends FieldType
    
    @js.native
    sealed trait FHASH64 extends FieldType
    
    @js.native
    sealed trait FIXED32 extends FieldType
    
    @js.native
    sealed trait FIXED64 extends FieldType
    
    @js.native
    sealed trait FLOAT extends FieldType
    
    @js.native
    sealed trait GROUP extends FieldType
    
    @js.native
    sealed trait INT32 extends FieldType
    
    @js.native
    sealed trait INT64 extends FieldType
    
    @js.native
    sealed trait INVALID extends FieldType
    
    @js.native
    sealed trait MESSAGE extends FieldType
    
    @js.native
    sealed trait SFIXED32 extends FieldType
    
    @js.native
    sealed trait SFIXED64 extends FieldType
    
    @js.native
    sealed trait SINT32 extends FieldType
    
    @js.native
    sealed trait SINT64 extends FieldType
    
    @js.native
    sealed trait STRING extends FieldType
    
    @js.native
    sealed trait UINT32 extends FieldType
    
    @js.native
    sealed trait UINT64 extends FieldType
    
    @js.native
    sealed trait VHASH64 extends FieldType
    
    /* 8 */ val BOOL: typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstantsNs.FieldType.BOOL with Double = js.native
    /* 12 */ val BYTES: typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstantsNs.FieldType.BYTES with Double = js.native
    /* 1 */ val DOUBLE: typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstantsNs.FieldType.DOUBLE with Double = js.native
    /* 14 */ val ENUM: typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstantsNs.FieldType.ENUM with Double = js.native
    /* 30 */ val FHASH64: typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstantsNs.FieldType.FHASH64 with Double = js.native
    /* 7 */ val FIXED32: typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstantsNs.FieldType.FIXED32 with Double = js.native
    /* 6 */ val FIXED64: typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstantsNs.FieldType.FIXED64 with Double = js.native
    /* 2 */ val FLOAT: typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstantsNs.FieldType.FLOAT with Double = js.native
    /* 10 */ val GROUP: typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstantsNs.FieldType.GROUP with Double = js.native
    /* 5 */ val INT32: typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstantsNs.FieldType.INT32 with Double = js.native
    /* 3 */ val INT64: typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstantsNs.FieldType.INT64 with Double = js.native
    /* -1 */ val INVALID: typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstantsNs.FieldType.INVALID with Double = js.native
    /* 11 */ val MESSAGE: typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstantsNs.FieldType.MESSAGE with Double = js.native
    /* 15 */ val SFIXED32: typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstantsNs.FieldType.SFIXED32 with Double = js.native
    /* 16 */ val SFIXED64: typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstantsNs.FieldType.SFIXED64 with Double = js.native
    /* 17 */ val SINT32: typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstantsNs.FieldType.SINT32 with Double = js.native
    /* 18 */ val SINT64: typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstantsNs.FieldType.SINT64 with Double = js.native
    /* 9 */ val STRING: typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstantsNs.FieldType.STRING with Double = js.native
    /* 13 */ val UINT32: typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstantsNs.FieldType.UINT32 with Double = js.native
    /* 4 */ val UINT64: typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstantsNs.FieldType.UINT64 with Double = js.native
    /* 31 */ val VHASH64: typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstantsNs.FieldType.VHASH64 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FieldType with Double] = js.native
  }
  
  @js.native
  object WireType extends js.Object {
    @js.native
    sealed trait DELIMITED extends WireType
    
    @js.native
    sealed trait END_GROUP extends WireType
    
    @js.native
    sealed trait FIXED32 extends WireType
    
    @js.native
    sealed trait FIXED64 extends WireType
    
    @js.native
    sealed trait INVALID extends WireType
    
    @js.native
    sealed trait START_GROUP extends WireType
    
    @js.native
    sealed trait VARINT extends WireType
    
    /* 2 */ val DELIMITED: typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstantsNs.WireType.DELIMITED with Double = js.native
    /* 4 */ val END_GROUP: typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstantsNs.WireType.END_GROUP with Double = js.native
    /* 5 */ val FIXED32: typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstantsNs.WireType.FIXED32 with Double = js.native
    /* 1 */ val FIXED64: typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstantsNs.WireType.FIXED64 with Double = js.native
    /* -1 */ val INVALID: typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstantsNs.WireType.INVALID with Double = js.native
    /* 3 */ val START_GROUP: typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstantsNs.WireType.START_GROUP with Double = js.native
    /* 0 */ val VARINT: typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstantsNs.WireType.VARINT with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[WireType with Double] = js.native
  }
  
}

