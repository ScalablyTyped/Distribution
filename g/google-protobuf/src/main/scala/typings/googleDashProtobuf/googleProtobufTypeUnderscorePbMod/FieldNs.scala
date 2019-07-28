package typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod

import typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.FieldNs.Cardinality
import typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.FieldNs.Kind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/type_pb", "Field")
@js.native
object FieldNs extends js.Object {
  trait AsObject extends js.Object {
    var cardinality: Cardinality
    var defaultValue: String
    var jsonName: String
    var kind: Kind
    var name: String
    var number: Double
    var oneofIndex: Double
    var optionsList: js.Array[typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.OptionNs.AsObject]
    var packed: Boolean
    var typeUrl: String
  }
  
  @js.native
  sealed trait Cardinality extends js.Object
  
  @js.native
  sealed trait Kind extends js.Object
  
  @js.native
  object Cardinality extends js.Object {
    @js.native
    sealed trait CARDINALITY_OPTIONAL extends Cardinality
    
    @js.native
    sealed trait CARDINALITY_REPEATED extends Cardinality
    
    @js.native
    sealed trait CARDINALITY_REQUIRED extends Cardinality
    
    @js.native
    sealed trait CARDINALITY_UNKNOWN extends Cardinality
    
    /* 1 */ val CARDINALITY_OPTIONAL: typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.FieldNs.Cardinality.CARDINALITY_OPTIONAL with Double = js.native
    /* 3 */ val CARDINALITY_REPEATED: typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.FieldNs.Cardinality.CARDINALITY_REPEATED with Double = js.native
    /* 2 */ val CARDINALITY_REQUIRED: typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.FieldNs.Cardinality.CARDINALITY_REQUIRED with Double = js.native
    /* 0 */ val CARDINALITY_UNKNOWN: typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.FieldNs.Cardinality.CARDINALITY_UNKNOWN with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Cardinality with Double] = js.native
  }
  
  @js.native
  object Kind extends js.Object {
    @js.native
    sealed trait TYPE_BOOL extends Kind
    
    @js.native
    sealed trait TYPE_BYTES extends Kind
    
    @js.native
    sealed trait TYPE_DOUBLE extends Kind
    
    @js.native
    sealed trait TYPE_ENUM extends Kind
    
    @js.native
    sealed trait TYPE_FIXED32 extends Kind
    
    @js.native
    sealed trait TYPE_FIXED64 extends Kind
    
    @js.native
    sealed trait TYPE_FLOAT extends Kind
    
    @js.native
    sealed trait TYPE_GROUP extends Kind
    
    @js.native
    sealed trait TYPE_INT32 extends Kind
    
    @js.native
    sealed trait TYPE_INT64 extends Kind
    
    @js.native
    sealed trait TYPE_MESSAGE extends Kind
    
    @js.native
    sealed trait TYPE_SFIXED32 extends Kind
    
    @js.native
    sealed trait TYPE_SFIXED64 extends Kind
    
    @js.native
    sealed trait TYPE_SINT32 extends Kind
    
    @js.native
    sealed trait TYPE_SINT64 extends Kind
    
    @js.native
    sealed trait TYPE_STRING extends Kind
    
    @js.native
    sealed trait TYPE_UINT32 extends Kind
    
    @js.native
    sealed trait TYPE_UINT64 extends Kind
    
    @js.native
    sealed trait TYPE_UNKNOWN extends Kind
    
    /* 8 */ val TYPE_BOOL: typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.FieldNs.Kind.TYPE_BOOL with Double = js.native
    /* 12 */ val TYPE_BYTES: typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.FieldNs.Kind.TYPE_BYTES with Double = js.native
    /* 1 */ val TYPE_DOUBLE: typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.FieldNs.Kind.TYPE_DOUBLE with Double = js.native
    /* 14 */ val TYPE_ENUM: typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.FieldNs.Kind.TYPE_ENUM with Double = js.native
    /* 7 */ val TYPE_FIXED32: typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.FieldNs.Kind.TYPE_FIXED32 with Double = js.native
    /* 6 */ val TYPE_FIXED64: typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.FieldNs.Kind.TYPE_FIXED64 with Double = js.native
    /* 2 */ val TYPE_FLOAT: typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.FieldNs.Kind.TYPE_FLOAT with Double = js.native
    /* 10 */ val TYPE_GROUP: typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.FieldNs.Kind.TYPE_GROUP with Double = js.native
    /* 5 */ val TYPE_INT32: typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.FieldNs.Kind.TYPE_INT32 with Double = js.native
    /* 3 */ val TYPE_INT64: typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.FieldNs.Kind.TYPE_INT64 with Double = js.native
    /* 11 */ val TYPE_MESSAGE: typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.FieldNs.Kind.TYPE_MESSAGE with Double = js.native
    /* 15 */ val TYPE_SFIXED32: typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.FieldNs.Kind.TYPE_SFIXED32 with Double = js.native
    /* 16 */ val TYPE_SFIXED64: typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.FieldNs.Kind.TYPE_SFIXED64 with Double = js.native
    /* 17 */ val TYPE_SINT32: typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.FieldNs.Kind.TYPE_SINT32 with Double = js.native
    /* 18 */ val TYPE_SINT64: typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.FieldNs.Kind.TYPE_SINT64 with Double = js.native
    /* 9 */ val TYPE_STRING: typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.FieldNs.Kind.TYPE_STRING with Double = js.native
    /* 13 */ val TYPE_UINT32: typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.FieldNs.Kind.TYPE_UINT32 with Double = js.native
    /* 4 */ val TYPE_UINT64: typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.FieldNs.Kind.TYPE_UINT64 with Double = js.native
    /* 0 */ val TYPE_UNKNOWN: typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.FieldNs.Kind.TYPE_UNKNOWN with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Kind with Double] = js.native
  }
  
}

