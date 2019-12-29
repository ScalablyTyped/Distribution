package typings.atFirebaseDatabase.distSrcCoreRepoUnderscoreTransactionMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TransactionStatus with Double] = js.native
  /* 2 */ @js.native
  object COMPLETED extends TopLevel[COMPLETED with Double]
  
  /* 4 */ @js.native
  object NEEDS_ABORT extends TopLevel[NEEDS_ABORT with Double]
  
  /* 0 */ @js.native
  object RUN extends TopLevel[RUN with Double]
  
  /* 1 */ @js.native
  object SENT extends TopLevel[SENT with Double]
  
  /* 3 */ @js.native
  object SENT_NEEDS_ABORT extends TopLevel[SENT_NEEDS_ABORT with Double]
  
}

