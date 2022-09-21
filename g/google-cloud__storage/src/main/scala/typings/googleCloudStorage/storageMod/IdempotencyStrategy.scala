package typings.googleCloudStorage.storageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IdempotencyStrategy extends StObject
@JSImport("@google-cloud/storage/build/src/storage", "IdempotencyStrategy")
@js.native
object IdempotencyStrategy extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IdempotencyStrategy & Double] = js.native
  
  @js.native
  sealed trait RetryAlways
    extends StObject
       with IdempotencyStrategy
  /* 0 */ val RetryAlways: typings.googleCloudStorage.storageMod.IdempotencyStrategy.RetryAlways & Double = js.native
  
  @js.native
  sealed trait RetryConditional
    extends StObject
       with IdempotencyStrategy
  /* 1 */ val RetryConditional: typings.googleCloudStorage.storageMod.IdempotencyStrategy.RetryConditional & Double = js.native
  
  @js.native
  sealed trait RetryNever
    extends StObject
       with IdempotencyStrategy
  /* 2 */ val RetryNever: typings.googleCloudStorage.storageMod.IdempotencyStrategy.RetryNever & Double = js.native
}
