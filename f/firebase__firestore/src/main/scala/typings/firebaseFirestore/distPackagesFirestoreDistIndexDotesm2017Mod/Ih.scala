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
trait Ih extends StObject {
  
  var Gc: js.Promise[Unit] = js.native
  
  var Hc: Boolean = js.native
  
  var Jc: Boolean = js.native
  
  var Qc: js.Array[Any] = js.native
  
  var Wc: Any = js.native
  
  def Xc(): Unit = js.native
  
  var Yc: js.Array[Any] = js.native
  
  def Zc(): Unit = js.native
  
  /**
    * Runs the next operation from the retryable queue. If the operation fails,
    * reschedules with backoff.
    */ def ea(): js.Promise[Unit] = js.native
  
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
    * For Tests: Determine if a delayed operation with a particular TimerId
    * exists.
    */ def ia(t: Any): Boolean = js.native
  
  def isShuttingDown: Boolean = js.native
  
  var jc: Boolean = js.native
  
  /** Called once a DelayedOperation is run or canceled. */ def na(t: Any): Unit = js.native
  
  /**
    * For Tests: Skip all subsequent delays for a timer id.
    */ def oa(t: Any): Unit = js.native
  
  var qo: Bu_ = js.native
  
  /**
    * For Tests: Runs some or all delayed operations early.
    *
    * @param lastTimerId - Delayed operations up to and including this TimerId
    * will be drained. Pass TimerId.All to run all delayed operations.
    * @returns a Promise that resolves once all operations have been run.
    */ def ra(t: Any): js.Promise[Unit] = js.native
  
  /**
    * Waits until all currently queued tasks are finished executing. Delayed
    * operations are not run.
    */ def sa(): js.Promise[Unit] = js.native
  
  def ta(t: Any): js.Promise[Any] = js.native
  
  def verifyOperationInProgress(): Unit = js.native
  
  var zc: js.Array[Any] = js.native
}
