package typings.googleProtobuf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BinaryConstants {
  
  @JSImport("google-protobuf", "BinaryConstants")
  @js.native
  val ^ : js.Any = js.native
  
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
    def apply(value: Double): js.UndefOr[FieldType & Double] = js.native
    
    @js.native
    sealed trait BOOL
      extends StObject
         with FieldType
    /* 8 */ val BOOL: typings.googleProtobuf.mod.BinaryConstants.FieldType.BOOL & Double = js.native
    
    @js.native
    sealed trait BYTES
      extends StObject
         with FieldType
    /* 12 */ val BYTES: typings.googleProtobuf.mod.BinaryConstants.FieldType.BYTES & Double = js.native
    
    @js.native
    sealed trait DOUBLE
      extends StObject
         with FieldType
    /* 1 */ val DOUBLE: typings.googleProtobuf.mod.BinaryConstants.FieldType.DOUBLE & Double = js.native
    
    @js.native
    sealed trait ENUM
      extends StObject
         with FieldType
    /* 14 */ val ENUM: typings.googleProtobuf.mod.BinaryConstants.FieldType.ENUM & Double = js.native
    
    @js.native
    sealed trait FHASH64
      extends StObject
         with FieldType
    /* 30 */ val FHASH64: typings.googleProtobuf.mod.BinaryConstants.FieldType.FHASH64 & Double = js.native
    
    @js.native
    sealed trait FIXED32
      extends StObject
         with FieldType
    /* 7 */ val FIXED32: typings.googleProtobuf.mod.BinaryConstants.FieldType.FIXED32 & Double = js.native
    
    @js.native
    sealed trait FIXED64
      extends StObject
         with FieldType
    /* 6 */ val FIXED64: typings.googleProtobuf.mod.BinaryConstants.FieldType.FIXED64 & Double = js.native
    
    @js.native
    sealed trait FLOAT
      extends StObject
         with FieldType
    /* 2 */ val FLOAT: typings.googleProtobuf.mod.BinaryConstants.FieldType.FLOAT & Double = js.native
    
    @js.native
    sealed trait GROUP
      extends StObject
         with FieldType
    /* 10 */ val GROUP: typings.googleProtobuf.mod.BinaryConstants.FieldType.GROUP & Double = js.native
    
    @js.native
    sealed trait INT32
      extends StObject
         with FieldType
    /* 5 */ val INT32: typings.googleProtobuf.mod.BinaryConstants.FieldType.INT32 & Double = js.native
    
    @js.native
    sealed trait INT64
      extends StObject
         with FieldType
    /* 3 */ val INT64: typings.googleProtobuf.mod.BinaryConstants.FieldType.INT64 & Double = js.native
    
    @js.native
    sealed trait INVALID
      extends StObject
         with FieldType
    /* -1 */ val INVALID: typings.googleProtobuf.mod.BinaryConstants.FieldType.INVALID & Double = js.native
    
    @js.native
    sealed trait MESSAGE
      extends StObject
         with FieldType
    /* 11 */ val MESSAGE: typings.googleProtobuf.mod.BinaryConstants.FieldType.MESSAGE & Double = js.native
    
    @js.native
    sealed trait SFIXED32
      extends StObject
         with FieldType
    /* 15 */ val SFIXED32: typings.googleProtobuf.mod.BinaryConstants.FieldType.SFIXED32 & Double = js.native
    
    @js.native
    sealed trait SFIXED64
      extends StObject
         with FieldType
    /* 16 */ val SFIXED64: typings.googleProtobuf.mod.BinaryConstants.FieldType.SFIXED64 & Double = js.native
    
    @js.native
    sealed trait SINT32
      extends StObject
         with FieldType
    /* 17 */ val SINT32: typings.googleProtobuf.mod.BinaryConstants.FieldType.SINT32 & Double = js.native
    
    @js.native
    sealed trait SINT64
      extends StObject
         with FieldType
    /* 18 */ val SINT64: typings.googleProtobuf.mod.BinaryConstants.FieldType.SINT64 & Double = js.native
    
    @js.native
    sealed trait STRING
      extends StObject
         with FieldType
    /* 9 */ val STRING: typings.googleProtobuf.mod.BinaryConstants.FieldType.STRING & Double = js.native
    
    @js.native
    sealed trait UINT32
      extends StObject
         with FieldType
    /* 13 */ val UINT32: typings.googleProtobuf.mod.BinaryConstants.FieldType.UINT32 & Double = js.native
    
    @js.native
    sealed trait UINT64
      extends StObject
         with FieldType
    /* 4 */ val UINT64: typings.googleProtobuf.mod.BinaryConstants.FieldType.UINT64 & Double = js.native
    
    @js.native
    sealed trait VHASH64
      extends StObject
         with FieldType
    /* 31 */ val VHASH64: typings.googleProtobuf.mod.BinaryConstants.FieldType.VHASH64 & Double = js.native
  }
  
  inline def FieldTypeToWireType(fieldType: FieldType): WireType = ^.asInstanceOf[js.Dynamic].applyDynamic("FieldTypeToWireType")(fieldType.asInstanceOf[js.Any]).asInstanceOf[WireType]
  
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
    def apply(value: Double): js.UndefOr[WireType & Double] = js.native
    
    @js.native
    sealed trait DELIMITED
      extends StObject
         with WireType
    /* 2 */ val DELIMITED: typings.googleProtobuf.mod.BinaryConstants.WireType.DELIMITED & Double = js.native
    
    @js.native
    sealed trait END_GROUP
      extends StObject
         with WireType
    /* 4 */ val END_GROUP: typings.googleProtobuf.mod.BinaryConstants.WireType.END_GROUP & Double = js.native
    
    @js.native
    sealed trait FIXED32
      extends StObject
         with WireType
    /* 5 */ val FIXED32: typings.googleProtobuf.mod.BinaryConstants.WireType.FIXED32 & Double = js.native
    
    @js.native
    sealed trait FIXED64
      extends StObject
         with WireType
    /* 1 */ val FIXED64: typings.googleProtobuf.mod.BinaryConstants.WireType.FIXED64 & Double = js.native
    
    @js.native
    sealed trait INVALID
      extends StObject
         with WireType
    /* -1 */ val INVALID: typings.googleProtobuf.mod.BinaryConstants.WireType.INVALID & Double = js.native
    
    @js.native
    sealed trait START_GROUP
      extends StObject
         with WireType
    /* 3 */ val START_GROUP: typings.googleProtobuf.mod.BinaryConstants.WireType.START_GROUP & Double = js.native
    
    @js.native
    sealed trait VARINT
      extends StObject
         with WireType
    /* 0 */ val VARINT: typings.googleProtobuf.mod.BinaryConstants.WireType.VARINT & Double = js.native
  }
  
  @JSImport("google-protobuf", "BinaryConstants.ZERO_HASH")
  @js.native
  val ZERO_HASH: String = js.native
}
