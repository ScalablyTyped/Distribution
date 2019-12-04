package typings.atFirebaseDatabase.distSrcCoreOperationOperationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OperationType extends js.Object

@JSImport("@firebase/database/dist/src/core/operation/Operation", "OperationType")
@js.native
object OperationType extends js.Object {
  @js.native
  sealed trait ACK_USER_WRITE extends OperationType
  
  @js.native
  sealed trait LISTEN_COMPLETE extends OperationType
  
  @js.native
  sealed trait MERGE extends OperationType
  
  @js.native
  sealed trait OVERWRITE extends OperationType
  
  /* 2 */ val ACK_USER_WRITE: typings.atFirebaseDatabase.distSrcCoreOperationOperationMod.OperationType.ACK_USER_WRITE with Double = js.native
  /* 3 */ val LISTEN_COMPLETE: typings.atFirebaseDatabase.distSrcCoreOperationOperationMod.OperationType.LISTEN_COMPLETE with Double = js.native
  /* 1 */ val MERGE: typings.atFirebaseDatabase.distSrcCoreOperationOperationMod.OperationType.MERGE with Double = js.native
  /* 0 */ val OVERWRITE: typings.atFirebaseDatabase.distSrcCoreOperationOperationMod.OperationType.OVERWRITE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OperationType with Double] = js.native
}

