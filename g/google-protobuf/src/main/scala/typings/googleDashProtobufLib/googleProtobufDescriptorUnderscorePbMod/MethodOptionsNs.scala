package typings
package googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "MethodOptions")
@js.native
object MethodOptionsNs extends js.Object {
  trait AsObject extends js.Object {
    var deprecated: js.UndefOr[scala.Boolean] = js.undefined
    var idempotencyLevel: js.UndefOr[IdempotencyLevel] = js.undefined
    var uninterpretedOptionList: js.Array[
        googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.UninterpretedOptionNs.AsObject
      ]
  }
  
  @js.native
  sealed trait IdempotencyLevel extends js.Object
  
  @js.native
  object IdempotencyLevel extends js.Object {
    @js.native
    sealed trait IDEMPOTENCY_UNKNOWN
      extends googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.MethodOptionsNs.IdempotencyLevel
    
    @js.native
    sealed trait IDEMPOTENT
      extends googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.MethodOptionsNs.IdempotencyLevel
    
    @js.native
    sealed trait NO_SIDE_EFFECTS
      extends googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.MethodOptionsNs.IdempotencyLevel
    
    /* 0 */ val IDEMPOTENCY_UNKNOWN: IDEMPOTENCY_UNKNOWN with scala.Double = js.native
    /* 2 */ val IDEMPOTENT: IDEMPOTENT with scala.Double = js.native
    /* 1 */ val NO_SIDE_EFFECTS: NO_SIDE_EFFECTS with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.MethodOptionsNs.IdempotencyLevel with scala.Double
      ] = js.native
  }
  
}

