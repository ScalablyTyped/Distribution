package typings.firebaseFirestore.indexEsm2017Mod

import typings.node.timersMod.global.NodeJS.Timeout
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @license
  * Copyright 2017 Google LLC
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
  */
/**
  * Represents an operation scheduled to be run in the future on an AsyncQueue.
  *
  * It is created via DelayedOperation.createAndSchedule().
  *
  * Supports cancellation (via cancel()) and early execution (via skipDelay()).
  *
  * Note: We implement `PromiseLike` instead of `Promise`, as the `Promise` type
  * in newer versions of TypeScript defines `finally`, which is not available in
  * IE.
  */
@js.native
trait ku extends StObject {
  
  var asyncQueue: Any = js.native
  
  /**
    * Cancels the operation if it hasn't already been executed or canceled. The
    * promise will be rejected.
    *
    * As long as the operation has not yet been run, calling cancel() provides a
    * guarantee that the operation will not be run.
    */ def cancel(t: Any): Unit = js.native
  
  def clearTimeout(): Unit = js.native
  
  var deferred: L = js.native
  
  def handleDelayElapsed(): Unit = js.native
  
  var op: Any = js.native
  
  var removalCallback: Any = js.native
  
  /**
    * Queues the operation to run immediately (if it hasn't already been run or
    * canceled).
    */ def skipDelay(): Unit = js.native
  
  /**
    * Starts the timer. This is called immediately after construction by
    * createAndSchedule().
    */ def start(t: Any): Unit = js.native
  
  var targetTimeMs: Any = js.native
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ Any, TResult1 | PromiseLike[TResult1]]): js.Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: js.Function1[/* value */ Any, TResult1 | PromiseLike[TResult1]],
    onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]
  ): js.Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onfulfilled: Unit, onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
  
  var timerHandle: js.UndefOr[Timeout | Null] = js.native
  
  var timerId: Any = js.native
}
