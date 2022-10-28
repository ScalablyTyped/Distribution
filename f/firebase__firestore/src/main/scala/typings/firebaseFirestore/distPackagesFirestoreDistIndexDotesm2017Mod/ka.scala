package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ka extends StObject {
  
  var Bc: js.Promise[Unit] = js.native
  
  var Gc: Boolean = js.native
  
  def Hc(t: Any): js.Promise[Any] = js.native
  
  /**
    * Runs the next operation from the retryable queue. If the operation fails,
    * reschedules with backoff.
    */ def Jc(): js.Promise[Unit] = js.native
  
  var Kc: Any = js.native
  
  var Lc: js.Array[Any] = js.native
  
  var Qc: Boolean = js.native
  
  var Uc: Boolean = js.native
  
  def Wc(): Unit = js.native
  
  /**
    * Waits until all currently queued tasks are finished executing. Delayed
    * operations are not run.
    */ def Xc(): js.Promise[Unit] = js.native
  
  /** Called once a DelayedOperation is run or canceled. */ def Yc(t: Any): Unit = js.native
  
  /**
    * For Tests: Determine if a delayed operation with a particular TimerId
    * exists.
    */ def Zc(t: Any): Boolean = js.native
  
  /**
    * For Tests: Skip all subsequent delays for a timer id.
    */ def ea(t: Any): Unit = js.native
  
  def enqueue(t: Any): js.Promise[Any] = js.native
  
  def enqueueAfterDelay(t: Any, e: Any, n: Any): Mu = js.native
  
  /**
    * Adds a new operation to the queue without waiting for it to complete (i.e.
    * we ignore the Promise result).
    */ def enqueueAndForget(t: Any): Unit = js.native
  
  def enqueueAndForgetEvenWhileRestricted(t: Any): Unit = js.native
  
  def enqueueRetryable(t: Any): Unit = js.native
  
  def enterRestrictedMode(t: Any): Unit = js.native
  
  def isShuttingDown: Boolean = js.native
  
  var jc: js.Array[Any] = js.native
  
  var qc: js.Array[Any] = js.native
  
  /**
    * For Tests: Runs some or all delayed operations early.
    *
    * @param lastTimerId - Delayed operations up to and including this TimerId
    * will be drained. Pass TimerId.All to run all delayed operations.
    * @returns a Promise that resolves once all operations have been run.
    */ def ta(t: Any): js.Promise[Unit] = js.native
  
  def verifyOperationInProgress(): Unit = js.native
  
  var xo: tu = js.native
  
  def zc(): Unit = js.native
}
