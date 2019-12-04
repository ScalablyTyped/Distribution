package typings.atFirebaseFirestore

import typings.atFirebaseFirestore.distSrcCoreTransactionMod.Transaction
import typings.atFirebaseFirestore.distSrcRemoteRemoteUnderscoreStoreMod.RemoteStore
import typings.atFirebaseFirestore.distSrcUtilAsyncUnderscoreQueueMod.AsyncQueue
import typings.atFirebaseFirestore.distSrcUtilPromiseMod.Deferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/core/transaction_runner", JSImport.Namespace)
@js.native
object distSrcCoreTransactionUnderscoreRunnerMod extends js.Object {
  @js.native
  class TransactionRunner[T] protected () extends js.Object {
    def this(
      asyncQueue: AsyncQueue,
      remoteStore: RemoteStore,
      updateFunction: js.Function1[/* transaction */ Transaction, js.Promise[T]],
      deferred: Deferred[T]
    ) = this()
    val asyncQueue: js.Any = js.native
    var backoff: js.Any = js.native
    val deferred: js.Any = js.native
    var handleTransactionError: js.Any = js.native
    var isRetryableTransactionError: js.Any = js.native
    val remoteStore: js.Any = js.native
    var retries: js.Any = js.native
    var runWithBackOff: js.Any = js.native
    var tryRunUpdateFunction: js.Any = js.native
    val updateFunction: js.Any = js.native
    /** Runs the transaction and sets the result on deferred. */
    def run(): Unit = js.native
  }
  
}

