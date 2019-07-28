package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod

import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldOptionsNs.CType
import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldOptionsNs.JSType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FieldOptions")
@js.native
object FieldOptionsNs extends js.Object {
  trait AsObject extends js.Object {
    var ctype: js.UndefOr[CType] = js.undefined
    var deprecated: js.UndefOr[Boolean] = js.undefined
    var jstype: js.UndefOr[JSType] = js.undefined
    var `lazy`: js.UndefOr[Boolean] = js.undefined
    var packed: js.UndefOr[Boolean] = js.undefined
    var uninterpretedOptionList: js.Array[
        typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.UninterpretedOptionNs.AsObject
      ]
    var weak: js.UndefOr[Boolean] = js.undefined
  }
  
  @js.native
  sealed trait CType extends js.Object
  
  @js.native
  sealed trait JSType extends js.Object
  
  @js.native
  object CType extends js.Object {
    @js.native
    sealed trait CORD extends CType
    
    @js.native
    sealed trait STRING extends CType
    
    @js.native
    sealed trait STRING_PIECE extends CType
    
    /* 1 */ val CORD: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldOptionsNs.CType.CORD with Double = js.native
    /* 0 */ val STRING: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldOptionsNs.CType.STRING with Double = js.native
    /* 2 */ val STRING_PIECE: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldOptionsNs.CType.STRING_PIECE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CType with Double] = js.native
  }
  
  @js.native
  object JSType extends js.Object {
    @js.native
    sealed trait JS_NORMAL extends JSType
    
    @js.native
    sealed trait JS_NUMBER extends JSType
    
    @js.native
    sealed trait JS_STRING extends JSType
    
    /* 0 */ val JS_NORMAL: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldOptionsNs.JSType.JS_NORMAL with Double = js.native
    /* 2 */ val JS_NUMBER: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldOptionsNs.JSType.JS_NUMBER with Double = js.native
    /* 1 */ val JS_STRING: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldOptionsNs.JSType.JS_STRING with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[JSType with Double] = js.native
  }
  
}

