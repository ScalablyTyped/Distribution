package typings
package googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FieldOptions")
@js.native
object FieldOptionsNs extends js.Object {
  trait AsObject extends js.Object {
    var ctype: js.UndefOr[CType] = js.undefined
    var deprecated: js.UndefOr[scala.Boolean] = js.undefined
    var jstype: js.UndefOr[JSType] = js.undefined
    var `lazy`: js.UndefOr[scala.Boolean] = js.undefined
    var packed: js.UndefOr[scala.Boolean] = js.undefined
    var uninterpretedOptionList: js.Array[
        googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.UninterpretedOptionNs.AsObject
      ]
    var weak: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  @js.native
  sealed trait CType extends js.Object
  
  @js.native
  sealed trait JSType extends js.Object
  
  @js.native
  object CType extends js.Object {
    @js.native
    sealed trait CORD
      extends googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldOptionsNs.CType
    
    @js.native
    sealed trait STRING
      extends googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldOptionsNs.CType
    
    @js.native
    sealed trait STRING_PIECE
      extends googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldOptionsNs.CType
    
    /* 1 */ val CORD: CORD with scala.Double = js.native
    /* 0 */ val STRING: STRING with scala.Double = js.native
    /* 2 */ val STRING_PIECE: STRING_PIECE with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldOptionsNs.CType with scala.Double
      ] = js.native
  }
  
  @js.native
  object JSType extends js.Object {
    @js.native
    sealed trait JS_NORMAL
      extends googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldOptionsNs.JSType
    
    @js.native
    sealed trait JS_NUMBER
      extends googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldOptionsNs.JSType
    
    @js.native
    sealed trait JS_STRING
      extends googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldOptionsNs.JSType
    
    /* 0 */ val JS_NORMAL: JS_NORMAL with scala.Double = js.native
    /* 2 */ val JS_NUMBER: JS_NUMBER with scala.Double = js.native
    /* 1 */ val JS_STRING: JS_STRING with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FieldOptionsNs.JSType with scala.Double
      ] = js.native
  }
  
}

