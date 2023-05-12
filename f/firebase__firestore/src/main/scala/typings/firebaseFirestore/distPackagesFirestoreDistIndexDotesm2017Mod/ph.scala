package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @license
  * Copyright 2020 Google LLC
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
  *
  *   http://www.apache.org/licenses/LICENSE-2.0
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  * See the License for the specific language governing permissions and
  * limitations under the License.
  */ @js.native
trait ph extends StObject {
  
  var Gc: js.Array[Any] = js.native
  
  var Hc: Boolean = js.native
  
  var Jc: js.Array[Any] = js.native
  
  var Kc: js.Promise[Unit] = js.native
  
  var Lo: Bu_ = js.native
  
  var Qc: Boolean = js.native
  
  var Wc: Boolean = js.native
  
  def Xc(): Unit = js.native
  
  def Yc(): Unit = js.native
  
  def Zc(t: Any): js.Promise[Any] = js.native
  
  /** Called once a DelayedOperation is run or canceled. */ def ea(t: Any): Unit = js.native
  
  def enqueue(t: Any): js.Promise[Any] = js.native
  
  def enqueueAfterDelay(t: Any, e: Any, n: Any): Tc = js.native
  
  /**
    * Adds a new operation to the queue without waiting for it to complete (i.e.
    * we ignore the Promise result).
    */ def enqueueAndForget(t: Any): Unit = js.native
  
  def enqueueAndForgetEvenWhileRestricted(t: Any): Unit = js.native
  
  def enqueueRetryable(t: Any): Unit = js.native
  
  def enterRestrictedMode(t: Any): Unit = js.native
  
  /**
    * For Tests: Runs some or all delayed operations early.
    *
    * @param lastTimerId - Delayed operations up to and including this TimerId
    * will be drained. Pass TimerId.All to run all delayed operations.
    * @returns a Promise that resolves once all operations have been run.
    */ def ia(t: Any): js.Promise[Unit] = js.native
  
  def isShuttingDown: Boolean = js.native
  
  var jc: js.Array[Any] = js.native
  
  /**
    * Waits until all currently queued tasks are finished executing. Delayed
    * operations are not run.
    */ def na(): js.Promise[Unit] = js.native
  
  /**
    * For Tests: Skip all subsequent delays for a timer id.
    */ def ra(t: Any): Unit = js.native
  
  /**
    * For Tests: Determine if a delayed operation with a particular TimerId
    * exists.
    */ def sa(t: Any): Boolean = js.native
  
  /**
    * Runs the next operation from the retryable queue. If the operation fails,
    * reschedules with backoff.
    */ def ta(): js.Promise[Unit] = js.native
  
  def verifyOperationInProgress(): Unit = js.native
  
  var zc: Any = js.native
}
