package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.MethodOptions

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IdempotencyLevel with Double] = js.native
  /* 0 */ @js.native
  object IDEMPOTENCY_UNKNOWN extends TopLevel[IDEMPOTENCY_UNKNOWN with Double]
  
  /* 2 */ @js.native
  object IDEMPOTENT extends TopLevel[IDEMPOTENT with Double]
  
  /* 1 */ @js.native
  object NO_SIDE_EFFECTS extends TopLevel[NO_SIDE_EFFECTS with Double]
  
}

