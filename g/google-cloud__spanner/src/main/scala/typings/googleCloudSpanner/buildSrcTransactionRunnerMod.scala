package typings.googleCloudSpanner

import typings.googleCloudSpanner.anon.PickanytransactionTag
import typings.googleCloudSpanner.buildSrcCommonMod.NormalCallback
import typings.googleCloudSpanner.buildSrcSessionMod.Session
import typings.googleCloudSpanner.buildSrcTransactionMod.Transaction
import typings.grpcGrpcJs.buildSrcCallMod.ServiceError
import typings.grpcGrpcJs.buildSrcConstantsMod.Status
import typings.grpcGrpcJs.buildSrcMetadataMod.Metadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTransactionRunnerMod {
  
  @JSImport("@google-cloud/spanner/build/src/transaction-runner", "AsyncTransactionRunner")
  @js.native
  open class AsyncTransactionRunner[T] protected () extends Runner[T] {
    def this(session: Session, transaction: Transaction, runFn: AsyncRunTransactionCallback[T]) = this()
    def this(
      session: Session,
      transaction: Transaction,
      runFn: AsyncRunTransactionCallback[T],
      options: RunTransactionOptions
    ) = this()
    
    @JSName("runFn")
    def runFn_MAsyncTransactionRunner(transaction: Transaction): js.Promise[T] = js.native
    @JSName("runFn")
    var runFn_Original: AsyncRunTransactionCallback[T] = js.native
  }
  
  @JSImport("@google-cloud/spanner/build/src/transaction-runner", "DeadlineError")
  @js.native
  open class DeadlineError ()
    extends StObject
       with ServiceError {
    def this(error: ServiceError) = this()
    
    /* CompleteClass */
    var code: Status = js.native
    
    /* CompleteClass */
    var details: String = js.native
    
    var errors: js.Array[ServiceError] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var metadata: Metadata = js.native
    @JSName("metadata")
    var metadata_DeadlineError: typings.googleGax.mod.grpc.Metadata = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  /* note: abstract class */ @JSImport("@google-cloud/spanner/build/src/transaction-runner", "Runner")
  @js.native
  open class Runner[T] protected () extends StObject {
    def this(session: Session, transaction: Transaction) = this()
    def this(session: Session, transaction: Transaction, options: RunTransactionOptions) = this()
    
    /**
      * Runs the user function against the provided transaction. Resolving the
      * returned Promise upon completion/error.
      *
      * @private
      *
      * @param {Transaction} transaction The transaction to run against.
      * @returns {Promise}
      */
    /* protected */ def _run(transaction: Transaction): js.Promise[T] = js.native
    
    var attempts: Double = js.native
    
    /**
      * Attempts to retrieve the retry delay from the supplied error. If absent it
      * will create one based on the number of attempts made thus far.
      *
      * @private
      *
      * @param {Error} err The service error.
      * @returns {number} Delay in milliseconds.
      */
    def getNextDelay(err: ServiceError): Double = js.native
    
    /**
      * Retrieves a transaction to run against.
      *
      * @private
      *
      * @returns Promise<Transaction>
      */
    def getTransaction(): js.Promise[Transaction] = js.native
    
    var options: RunTransactionOptions = js.native
    
    /**
      * This function is responsible for getting transactions, running them and
      * handling any errors, retrying if necessary.
      *
      * @private
      *
      * @returns {Promise}
      */
    def run(): js.Promise[T] = js.native
    
    var runFn: js.Function = js.native
    
    var session: Session = js.native
    
    /** Returns whether the given error should cause a transaction retry. */
    def shouldRetry(err: ServiceError): Boolean = js.native
    
    var transaction: js.UndefOr[Transaction] = js.native
  }
  
  @JSImport("@google-cloud/spanner/build/src/transaction-runner", "TransactionRunner")
  @js.native
  open class TransactionRunner protected () extends Runner[Unit] {
    def this(session: Session, transaction: Transaction, runFn: RunTransactionCallback) = this()
    def this(
      session: Session,
      transaction: Transaction,
      runFn: RunTransactionCallback,
      options: RunTransactionOptions
    ) = this()
    
    /**
      * Because the user has decided to use callback mode, we want to try and
      * intercept any ABORTED or UNKNOWN errors and stop the current function
      * execution.
      *
      * @private
      *
      * @param {Transaction} transaction The transaction to intercept errors for.
      * @param {Function} reject Function to call when a retryable error is found.
      */
    /* private */ var _interceptErrors: Any = js.native
    
    @JSName("runFn")
    def runFn_MTransactionRunner(): Unit = js.native
    @JSName("runFn")
    def runFn_MTransactionRunner(err: Null, res: Transaction): Unit = js.native
    @JSName("runFn")
    def runFn_MTransactionRunner(err: ServiceError): Unit = js.native
    @JSName("runFn")
    def runFn_MTransactionRunner(err: ServiceError, res: Transaction): Unit = js.native
    @JSName("runFn")
    var runFn_Original: RunTransactionCallback = js.native
  }
  
  type AsyncRunTransactionCallback[T] = js.Function1[/* transaction */ Transaction, js.Promise[T]]
  
  type RunTransactionCallback = NormalCallback[Transaction]
  
  trait RunTransactionOptions extends StObject {
    
    var requestOptions: js.UndefOr[PickanytransactionTag] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object RunTransactionOptions {
    
    inline def apply(): RunTransactionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RunTransactionOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RunTransactionOptions] (val x: Self) extends AnyVal {
      
      inline def setRequestOptions(value: PickanytransactionTag): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
      
      inline def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
