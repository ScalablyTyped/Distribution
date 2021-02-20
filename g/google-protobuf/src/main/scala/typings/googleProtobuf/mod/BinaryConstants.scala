package typings.googleProtobuf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BinaryConstants {
  
  @JSImport("google-protobuf", "BinaryConstants.FLOAT32_EPS")
  @js.native
  val FLOAT32_EPS: Double = js.native
  
  @JSImport("google-protobuf", "BinaryConstants.FLOAT32_MAX")
  @js.native
  val FLOAT32_MAX: Double = js.native
  
  @JSImport("google-protobuf", "BinaryConstants.FLOAT32_MIN")
  @js.native
  val FLOAT32_MIN: Double = js.native
  
  @JSImport("google-protobuf", "BinaryConstants.FLOAT64_EPS")
  @js.native
  val FLOAT64_EPS: Double = js.native
  
  @JSImport("google-protobuf", "BinaryConstants.FLOAT64_MAX")
  @js.native
  val FLOAT64_MAX: Double = js.native
  
  @JSImport("google-protobuf", "BinaryConstants.FLOAT64_MIN")
  @js.native
  val FLOAT64_MIN: Double = js.native
  
  @js.native
  sealed trait FieldType extends StObject
  @JSImport("google-protobuf", "BinaryConstants.FieldType")
  @js.native
  object FieldType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FieldType with Double] = js.native
    
    @js.native
    sealed trait BOOL extends FieldType
    /* 8 */ val BOOL: typings.googleProtobuf.mod.BinaryConstants.FieldType.BOOL with Double = js.native
    
    @js.native
    sealed trait BYTES extends FieldType
    /* 12 */ val BYTES: typings.googleProtobuf.mod.BinaryConstants.FieldType.BYTES with Double = js.native
    
    @js.native
    sealed trait DOUBLE extends FieldType
    /* 1 */ val DOUBLE: typings.googleProtobuf.mod.BinaryConstants.FieldType.DOUBLE with Double = js.native
    
    @js.native
    sealed trait ENUM extends FieldType
    /* 14 */ val ENUM: typings.googleProtobuf.mod.BinaryConstants.FieldType.ENUM with Double = js.native
    
    @js.native
    sealed trait FHASH64 extends FieldType
    /* 30 */ val FHASH64: typings.googleProtobuf.mod.BinaryConstants.FieldType.FHASH64 with Double = js.native
    
    @js.native
    sealed trait FIXED32 extends FieldType
    /* 7 */ val FIXED32: typings.googleProtobuf.mod.BinaryConstants.FieldType.FIXED32 with Double = js.native
    
    @js.native
    sealed trait FIXED64 extends FieldType
    /* 6 */ val FIXED64: typings.googleProtobuf.mod.BinaryConstants.FieldType.FIXED64 with Double = js.native
    
    @js.native
    sealed trait FLOAT extends FieldType
    /* 2 */ val FLOAT: typings.googleProtobuf.mod.BinaryConstants.FieldType.FLOAT with Double = js.native
    
    @js.native
    sealed trait GROUP extends FieldType
    /* 10 */ val GROUP: typings.googleProtobuf.mod.BinaryConstants.FieldType.GROUP with Double = js.native
    
    @js.native
    sealed trait INT32 extends FieldType
    /* 5 */ val INT32: typings.googleProtobuf.mod.BinaryConstants.FieldType.INT32 with Double = js.native
    
    @js.native
    sealed trait INT64 extends FieldType
    /* 3 */ val INT64: typings.googleProtobuf.mod.BinaryConstants.FieldType.INT64 with Double = js.native
    
    @js.native
    sealed trait INVALID extends FieldType
    /* -1 */ val INVALID: typings.googleProtobuf.mod.BinaryConstants.FieldType.INVALID with Double = js.native
    
    @js.native
    sealed trait MESSAGE extends FieldType
    /* 11 */ val MESSAGE: typings.googleProtobuf.mod.BinaryConstants.FieldType.MESSAGE with Double = js.native
    
    @js.native
    sealed trait SFIXED32 extends FieldType
    /* 15 */ val SFIXED32: typings.googleProtobuf.mod.BinaryConstants.FieldType.SFIXED32 with Double = js.native
    
    @js.native
    sealed trait SFIXED64 extends FieldType
    /* 16 */ val SFIXED64: typings.googleProtobuf.mod.BinaryConstants.FieldType.SFIXED64 with Double = js.native
    
    @js.native
    sealed trait SINT32 extends FieldType
    /* 17 */ val SINT32: typings.googleProtobuf.mod.BinaryConstants.FieldType.SINT32 with Double = js.native
    
    @js.native
    sealed trait SINT64 extends FieldType
    /* 18 */ val SINT64: typings.googleProtobuf.mod.BinaryConstants.FieldType.SINT64 with Double = js.native
    
    @js.native
    sealed trait STRING extends FieldType
    /* 9 */ val STRING: typings.googleProtobuf.mod.BinaryConstants.FieldType.STRING with Double = js.native
    
    @js.native
    sealed trait UINT32 extends FieldType
    /* 13 */ val UINT32: typings.googleProtobuf.mod.BinaryConstants.FieldType.UINT32 with Double = js.native
    
    @js.native
    sealed trait UINT64 extends FieldType
    /* 4 */ val UINT64: typings.googleProtobuf.mod.BinaryConstants.FieldType.UINT64 with Double = js.native
    
    @js.native
    sealed trait VHASH64 extends FieldType
    /* 31 */ val VHASH64: typings.googleProtobuf.mod.BinaryConstants.FieldType.VHASH64 with Double = js.native
  }
  
  @JSImport("google-protobuf", "BinaryConstants.FieldTypeToWireType")
  @js.native
  def FieldTypeToWireType(fieldType: FieldType): WireType = js.native
  
  @JSImport("google-protobuf", "BinaryConstants.INVALID_FIELD_NUMBER")
  @js.native
  val INVALID_FIELD_NUMBER: Double = js.native
  
  @JSImport("google-protobuf", "BinaryConstants.TWO_TO_20")
  @js.native
  val TWO_TO_20: Double = js.native
  
  @JSImport("google-protobuf", "BinaryConstants.TWO_TO_23")
  @js.native
  val TWO_TO_23: Double = js.native
  
  @JSImport("google-protobuf", "BinaryConstants.TWO_TO_31")
  @js.native
  val TWO_TO_31: Double = js.native
  
  @JSImport("google-protobuf", "BinaryConstants.TWO_TO_32")
  @js.native
  val TWO_TO_32: Double = js.native
  
  @JSImport("google-protobuf", "BinaryConstants.TWO_TO_52")
  @js.native
  val TWO_TO_52: Double = js.native
  
  @JSImport("google-protobuf", "BinaryConstants.TWO_TO_63")
  @js.native
  val TWO_TO_63: Double = js.native
  
  @JSImport("google-protobuf", "BinaryConstants.TWO_TO_64")
  @js.native
  val TWO_TO_64: Double = js.native
  
  @js.native
  sealed trait WireType extends StObject
  @JSImport("google-protobuf", "BinaryConstants.WireType")
  @js.native
  object WireType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[WireType with Double] = js.native
    
    @js.native
    sealed trait DELIMITED extends WireType
    /* 2 */ val DELIMITED: typings.googleProtobuf.mod.BinaryConstants.WireType.DELIMITED with Double = js.native
    
    @js.native
    sealed trait END_GROUP extends WireType
    /* 4 */ val END_GROUP: typings.googleProtobuf.mod.BinaryConstants.WireType.END_GROUP with Double = js.native
    
    @js.native
    sealed trait FIXED32 extends WireType
    /* 5 */ val FIXED32: typings.googleProtobuf.mod.BinaryConstants.WireType.FIXED32 with Double = js.native
    
    @js.native
    sealed trait FIXED64 extends WireType
    /* 1 */ val FIXED64: typings.googleProtobuf.mod.BinaryConstants.WireType.FIXED64 with Double = js.native
    
    @js.native
    sealed trait INVALID extends WireType
    /* -1 */ val INVALID: typings.googleProtobuf.mod.BinaryConstants.WireType.INVALID with Double = js.native
    
    @js.native
    sealed trait START_GROUP extends WireType
    /* 3 */ val START_GROUP: typings.googleProtobuf.mod.BinaryConstants.WireType.START_GROUP with Double = js.native
    
    @js.native
    sealed trait VARINT extends WireType
    /* 0 */ val VARINT: typings.googleProtobuf.mod.BinaryConstants.WireType.VARINT with Double = js.native
  }
  
  @JSImport("google-protobuf", "BinaryConstants.ZERO_HASH")
  @js.native
  val ZERO_HASH: String = js.native
}
