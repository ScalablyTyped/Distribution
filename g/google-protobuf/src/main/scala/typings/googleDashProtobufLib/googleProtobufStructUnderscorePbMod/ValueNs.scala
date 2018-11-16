package typings
package googleDashProtobufLib.googleProtobufStructUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/struct_pb", "Value")
@js.native
object ValueNs extends js.Object {
  
  trait AsObject extends js.Object {
    var boolValue: scala.Boolean
    var listValue: js.UndefOr[googleDashProtobufLib.googleProtobufStructUnderscorePbMod.ListValueNs.AsObject] = js.undefined
    var nullValue: googleDashProtobufLib.googleProtobufStructUnderscorePbMod.NullValue
    var numberValue: scala.Double
    var stringValue: java.lang.String
    var structValue: js.UndefOr[googleDashProtobufLib.googleProtobufStructUnderscorePbMod.StructNs.AsObject] = js.undefined
  }
  
  @js.native
  sealed trait KindCase extends js.Object
  
  @js.native
  object KindCase extends js.Object {
    @js.native
    sealed trait BOOL_VALUE
      extends googleDashProtobufLib.googleProtobufStructUnderscorePbMod.ValueNs.KindCase
    
    @js.native
    sealed trait KIND_NOT_SET
      extends googleDashProtobufLib.googleProtobufStructUnderscorePbMod.ValueNs.KindCase
    
    @js.native
    sealed trait LIST_VALUE
      extends googleDashProtobufLib.googleProtobufStructUnderscorePbMod.ValueNs.KindCase
    
    @js.native
    sealed trait NULL_VALUE
      extends googleDashProtobufLib.googleProtobufStructUnderscorePbMod.ValueNs.KindCase
    
    @js.native
    sealed trait NUMBER_VALUE
      extends googleDashProtobufLib.googleProtobufStructUnderscorePbMod.ValueNs.KindCase
    
    @js.native
    sealed trait STRING_VALUE
      extends googleDashProtobufLib.googleProtobufStructUnderscorePbMod.ValueNs.KindCase
    
    @js.native
    sealed trait STRUCT_VALUE
      extends googleDashProtobufLib.googleProtobufStructUnderscorePbMod.ValueNs.KindCase
    
    /* 4 */ val BOOL_VALUE: BOOL_VALUE with scala.Double = js.native
    /* 0 */ val KIND_NOT_SET: KIND_NOT_SET with scala.Double = js.native
    /* 6 */ val LIST_VALUE: LIST_VALUE with scala.Double = js.native
    /* 1 */ val NULL_VALUE: NULL_VALUE with scala.Double = js.native
    /* 2 */ val NUMBER_VALUE: NUMBER_VALUE with scala.Double = js.native
    /* 3 */ val STRING_VALUE: STRING_VALUE with scala.Double = js.native
    /* 5 */ val STRUCT_VALUE: STRUCT_VALUE with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        googleDashProtobufLib.googleProtobufStructUnderscorePbMod.ValueNs.KindCase with scala.Double
      ] = js.native
  }
  
}

