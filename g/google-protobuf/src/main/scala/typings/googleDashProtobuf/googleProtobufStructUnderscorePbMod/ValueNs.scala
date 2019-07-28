package typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod

import typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod.ValueNs.KindCase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/struct_pb", "Value")
@js.native
object ValueNs extends js.Object {
  trait AsObject extends js.Object {
    var boolValue: Boolean
    var listValue: js.UndefOr[
        typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod.ListValueNs.AsObject
      ] = js.undefined
    var nullValue: NullValue
    var numberValue: Double
    var stringValue: String
    var structValue: js.UndefOr[typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod.StructNs.AsObject] = js.undefined
  }
  
  @js.native
  sealed trait KindCase extends js.Object
  
  @js.native
  object KindCase extends js.Object {
    @js.native
    sealed trait BOOL_VALUE extends KindCase
    
    @js.native
    sealed trait KIND_NOT_SET extends KindCase
    
    @js.native
    sealed trait LIST_VALUE extends KindCase
    
    @js.native
    sealed trait NULL_VALUE extends KindCase
    
    @js.native
    sealed trait NUMBER_VALUE extends KindCase
    
    @js.native
    sealed trait STRING_VALUE extends KindCase
    
    @js.native
    sealed trait STRUCT_VALUE extends KindCase
    
    /* 4 */ val BOOL_VALUE: typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod.ValueNs.KindCase.BOOL_VALUE with Double = js.native
    /* 0 */ val KIND_NOT_SET: typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod.ValueNs.KindCase.KIND_NOT_SET with Double = js.native
    /* 6 */ val LIST_VALUE: typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod.ValueNs.KindCase.LIST_VALUE with Double = js.native
    /* 1 */ val NULL_VALUE: typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod.ValueNs.KindCase.NULL_VALUE with Double = js.native
    /* 2 */ val NUMBER_VALUE: typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod.ValueNs.KindCase.NUMBER_VALUE with Double = js.native
    /* 3 */ val STRING_VALUE: typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod.ValueNs.KindCase.STRING_VALUE with Double = js.native
    /* 5 */ val STRUCT_VALUE: typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod.ValueNs.KindCase.STRUCT_VALUE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[KindCase with Double] = js.native
  }
  
}

