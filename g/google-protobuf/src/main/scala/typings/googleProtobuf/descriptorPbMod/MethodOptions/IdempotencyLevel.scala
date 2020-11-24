package typings.googleProtobuf.descriptorPbMod.MethodOptions

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IdempotencyLevel extends js.Object
@JSImport("google-protobuf/google/protobuf/descriptor_pb", "MethodOptions.IdempotencyLevel")
@js.native
object IdempotencyLevel extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IdempotencyLevel with Double] = js.native
  
  @js.native
  sealed trait IDEMPOTENCY_UNKNOWN extends IdempotencyLevel
  /* 0 */ @js.native
  object IDEMPOTENCY_UNKNOWN extends TopLevel[IDEMPOTENCY_UNKNOWN with Double]
  
  @js.native
  sealed trait IDEMPOTENT extends IdempotencyLevel
  /* 2 */ @js.native
  object IDEMPOTENT extends TopLevel[IDEMPOTENT with Double]
  
  @js.native
  sealed trait NO_SIDE_EFFECTS extends IdempotencyLevel
  /* 1 */ @js.native
  object NO_SIDE_EFFECTS extends TopLevel[NO_SIDE_EFFECTS with Double]
}
