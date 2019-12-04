package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.MethodOptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IdempotencyLevel extends js.Object

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "MethodOptions.IdempotencyLevel")
@js.native
object IdempotencyLevel extends js.Object {
  @js.native
  sealed trait IDEMPOTENCY_UNKNOWN extends IdempotencyLevel
  
  @js.native
  sealed trait IDEMPOTENT extends IdempotencyLevel
  
  @js.native
  sealed trait NO_SIDE_EFFECTS extends IdempotencyLevel
  
  /* 0 */ val IDEMPOTENCY_UNKNOWN: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.MethodOptions.IdempotencyLevel.IDEMPOTENCY_UNKNOWN with Double = js.native
  /* 2 */ val IDEMPOTENT: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.MethodOptions.IdempotencyLevel.IDEMPOTENT with Double = js.native
  /* 1 */ val NO_SIDE_EFFECTS: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.MethodOptions.IdempotencyLevel.NO_SIDE_EFFECTS with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IdempotencyLevel with Double] = js.native
}

