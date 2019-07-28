package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod

import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.MethodOptionsNs.IdempotencyLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "MethodOptions")
@js.native
object MethodOptionsNs extends js.Object {
  trait AsObject extends js.Object {
    var deprecated: js.UndefOr[Boolean] = js.undefined
    var idempotencyLevel: js.UndefOr[IdempotencyLevel] = js.undefined
    var uninterpretedOptionList: js.Array[
        typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.UninterpretedOptionNs.AsObject
      ]
  }
  
  @js.native
  sealed trait IdempotencyLevel extends js.Object
  
  @js.native
  object IdempotencyLevel extends js.Object {
    @js.native
    sealed trait IDEMPOTENCY_UNKNOWN extends IdempotencyLevel
    
    @js.native
    sealed trait IDEMPOTENT extends IdempotencyLevel
    
    @js.native
    sealed trait NO_SIDE_EFFECTS extends IdempotencyLevel
    
    /* 0 */ val IDEMPOTENCY_UNKNOWN: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.MethodOptionsNs.IdempotencyLevel.IDEMPOTENCY_UNKNOWN with Double = js.native
    /* 2 */ val IDEMPOTENT: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.MethodOptionsNs.IdempotencyLevel.IDEMPOTENT with Double = js.native
    /* 1 */ val NO_SIDE_EFFECTS: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.MethodOptionsNs.IdempotencyLevel.NO_SIDE_EFFECTS with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[IdempotencyLevel with Double] = js.native
  }
  
}

