package typings.firebaseFirestore

import typings.firebaseFirestore.distPackagesFirestoreSrcUtilAsyncQueueMod.AsyncQueue
import typings.firebaseFirestore.distPackagesFirestoreSrcUtilAsyncQueueMod.TimerId
import typings.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcUtilAsyncQueueImplMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/util/async_queue_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/util/async_queue_impl", "AsyncQueueImpl")
  @js.native
  open class AsyncQueueImpl ()
    extends StObject
       with AsyncQueue {
    
    /* private */ var _isShuttingDown: Any = js.native
    
    /* private */ var backoff: Any = js.native
    
    /**
      * For Tests: Determine if a delayed operation with a particular TimerId
      * exists.
      */
    def containsDelayedOperation(timerId: TimerId): Boolean = js.native
    
    /* private */ var delayedOperations: Any = js.native
    
    /**
      * Waits until all currently queued tasks are finished executing. Delayed
      * operations are not run.
      */
    def drain(): js.Promise[Unit] = js.native
    
    /* private */ var enqueueInternal: Any = js.native
    
    var failure: FirestoreError | Null = js.native
    
    @JSName("isShuttingDown")
    def isShuttingDown_MAsyncQueueImpl: Boolean = js.native
    
    /* private */ var operationInProgress: Any = js.native
    
    /** Called once a DelayedOperation is run or canceled. */
    /* private */ var removeDelayedOperation: Any = js.native
    
    /**
      * Runs the next operation from the retryable queue. If the operation fails,
      * reschedules with backoff.
      */
    /* private */ var retryNextOp: Any = js.native
    
    /* private */ var retryableOps: Any = js.native
    
    /**
      * For Tests: Runs some or all delayed operations early.
      *
      * @param lastTimerId - Delayed operations up to and including this TimerId
      * will be drained. Pass TimerId.All to run all delayed operations.
      * @returns a Promise that resolves once all operations have been run.
      */
    def runAllDelayedOperationsUntil(lastTimerId: TimerId): js.Promise[Unit] = js.native
    
    /**
      * For Tests: Skip all subsequent delays for a timer id.
      */
    def skipDelaysForTimerId(timerId: TimerId): Unit = js.native
    
    /* private */ var skipNonRestrictedTasks: Any = js.native
    
    /* private */ var tail: Any = js.native
    
    /* private */ var timerIdsToSkip: Any = js.native
    
    /* private */ var verifyNotFailed: Any = js.native
    
    /* private */ var visibilityHandler: Any = js.native
  }
  
  inline def newAsyncQueue(): AsyncQueue = ^.asInstanceOf[js.Dynamic].applyDynamic("newAsyncQueue")().asInstanceOf[AsyncQueue]
}
