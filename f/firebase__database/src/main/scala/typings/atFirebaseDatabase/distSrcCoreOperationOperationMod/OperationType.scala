package typings.atFirebaseDatabase.distSrcCoreOperationOperationMod

import org.scalablytyped.runtime.TopLevel
import typings.atFirebaseDatabase.distSrcCoreOperationOperationMod.OperationType.ACK_USER_WRITE
import typings.atFirebaseDatabase.distSrcCoreOperationOperationMod.OperationType.LISTEN_COMPLETE
import typings.atFirebaseDatabase.distSrcCoreOperationOperationMod.OperationType.MERGE
import typings.atFirebaseDatabase.distSrcCoreOperationOperationMod.OperationType.OVERWRITE
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OperationType with Double] = js.native
  /* 2 */ @js.native
  object ACK_USER_WRITE extends TopLevel[ACK_USER_WRITE with Double]
  
  /* 3 */ @js.native
  object LISTEN_COMPLETE extends TopLevel[LISTEN_COMPLETE with Double]
  
  /* 1 */ @js.native
  object MERGE extends TopLevel[MERGE with Double]
  
  /* 0 */ @js.native
  object OVERWRITE extends TopLevel[OVERWRITE with Double]
  
}

