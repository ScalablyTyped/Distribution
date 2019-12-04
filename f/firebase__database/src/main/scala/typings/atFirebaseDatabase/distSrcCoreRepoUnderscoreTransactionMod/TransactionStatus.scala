package typings.atFirebaseDatabase.distSrcCoreRepoUnderscoreTransactionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TransactionStatus extends js.Object

@JSImport("@firebase/database/dist/src/core/Repo_transaction", "TransactionStatus")
@js.native
object TransactionStatus extends js.Object {
  @js.native
  sealed trait COMPLETED extends TransactionStatus
  
  @js.native
  sealed trait NEEDS_ABORT extends TransactionStatus
  
  @js.native
  sealed trait RUN extends TransactionStatus
  
  @js.native
  sealed trait SENT extends TransactionStatus
  
  @js.native
  sealed trait SENT_NEEDS_ABORT extends TransactionStatus
  
  /* 2 */ val COMPLETED: typings.atFirebaseDatabase.distSrcCoreRepoUnderscoreTransactionMod.TransactionStatus.COMPLETED with Double = js.native
  /* 4 */ val NEEDS_ABORT: typings.atFirebaseDatabase.distSrcCoreRepoUnderscoreTransactionMod.TransactionStatus.NEEDS_ABORT with Double = js.native
  /* 0 */ val RUN: typings.atFirebaseDatabase.distSrcCoreRepoUnderscoreTransactionMod.TransactionStatus.RUN with Double = js.native
  /* 1 */ val SENT: typings.atFirebaseDatabase.distSrcCoreRepoUnderscoreTransactionMod.TransactionStatus.SENT with Double = js.native
  /* 3 */ val SENT_NEEDS_ABORT: typings.atFirebaseDatabase.distSrcCoreRepoUnderscoreTransactionMod.TransactionStatus.SENT_NEEDS_ABORT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TransactionStatus with Double] = js.native
}

