package typings.firebaseDatabase

import typings.firebaseDatabase.dataSnapshotMod.DataSnapshot
import typings.firebaseDatabase.pathMod.Path
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repoTransactionMod {
  
  @js.native
  sealed trait TransactionStatus extends StObject
  @JSImport("@firebase/database/dist/src/core/Repo_transaction", "TransactionStatus")
  @js.native
  object TransactionStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TransactionStatus & Double] = js.native
    
    @js.native
    sealed trait COMPLETED
      extends StObject
         with TransactionStatus
    /* 2 */ val COMPLETED: typings.firebaseDatabase.repoTransactionMod.TransactionStatus.COMPLETED & Double = js.native
    
    @js.native
    sealed trait NEEDS_ABORT
      extends StObject
         with TransactionStatus
    /* 4 */ val NEEDS_ABORT: typings.firebaseDatabase.repoTransactionMod.TransactionStatus.NEEDS_ABORT & Double = js.native
    
    @js.native
    sealed trait RUN
      extends StObject
         with TransactionStatus
    /* 0 */ val RUN: typings.firebaseDatabase.repoTransactionMod.TransactionStatus.RUN & Double = js.native
    
    @js.native
    sealed trait SENT
      extends StObject
         with TransactionStatus
    /* 1 */ val SENT: typings.firebaseDatabase.repoTransactionMod.TransactionStatus.SENT & Double = js.native
    
    @js.native
    sealed trait SENT_NEEDS_ABORT
      extends StObject
         with TransactionStatus
    /* 3 */ val SENT_NEEDS_ABORT: typings.firebaseDatabase.repoTransactionMod.TransactionStatus.SENT_NEEDS_ABORT & Double = js.native
  }
  
  /* augmented module */
  object firebaseDatabaseDistSrcCoreRepoAugmentingMod {
    
    @js.native
    trait Repo extends StObject {
      
      def startTransaction(
        path: Path,
        transactionUpdate: js.Function1[/* a */ js.Any, Unit],
        onComplete: js.Function3[/* a */ Error, /* b */ Boolean, /* c */ DataSnapshot, Unit],
        applyLocally: Boolean
      ): Unit = js.native
      def startTransaction(
        path: Path,
        transactionUpdate: js.Function1[/* a */ js.Any, Unit],
        onComplete: Null,
        applyLocally: Boolean
      ): Unit = js.native
    }
  }
}
