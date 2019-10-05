package typings.dexie.dexieMod.Dexie

import org.scalablytyped.runtime.TopLevel
import typings.dexie.Anon_TError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Promise[T] extends js.Object {
  @JSName(scala.scalajs.js.Symbol.toStringTag)
  val toStringTag: typings.dexie.dexieStrings.Promise = js.native
  def `catch`(): Promise[T] = js.native
  /**
    * Catch errors where error => error.name === errorName. Other errors will remain uncaught.
    * 
    * @param errorName Name of the type of error to catch such as 'RangeError', 'TypeError', 'DatabaseClosedError', etc.
    * @param onrejected The callback to execute when the Promise is rejected.
    * @returns A Promise for the completion of the callback.
    */
  def `catch`(errorName: String, onrejected: js.Function1[/* reason */ Error, T | js.Thenable[T]]): Promise[T] = js.native
  def `catch`(onrejected: js.Function1[/* reason */ js.Any, T | js.Thenable[T]]): Promise[T] = js.native
  /**
    * Catch errors where error => error instanceof errorConstructor. Other errors will remain uncaught.
    * 
    * @param errorConstructor Type of error to catch such as RangeError, TypeError, etc.
    * @param onrejected The callback to execute when the Promise is rejected.
    * @returns A Promise for the completion of the callback.
    */
  def `catch`[TError](
    errorConstructor: Anon_TError[TError],
    onrejected: js.Function1[/* reason */ TError, T | js.Thenable[T]]
  ): Promise[T] = js.native
  // Extended methods provided by Dexie.Promise:
  /**
    * Catch errors where error => error.name === errorName. Other errors will remain uncaught.
    * 
    * @param errorName Name of the type of error to catch such as 'RangeError', 'TypeError', 'DatabaseClosedError', etc.
    * @param onrejected The callback to execute when the Promise is rejected.
    * @returns A Promise for the completion of the callback.
    */
  @JSName("catch")
  def catch_TResult[TResult](errorName: String, onrejected: js.Function1[/* reason */ Error, TResult | js.Thenable[TResult]]): Promise[T | TResult] = js.native
  @JSName("catch")
  def catch_TResult[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): Promise[T | TResult] = js.native
  /**
    * Catch errors where error => error instanceof errorConstructor. Other errors will remain uncaught.
    * 
    * @param errorConstructor Type of error to catch such as RangeError, TypeError, etc.
    * @param onrejected The callback to execute when the Promise is rejected.
    * @returns A Promise for the completion of the callback.
    */
  @JSName("catch")
  def catch_TResultTError[TResult, TError](
    errorConstructor: Anon_TError[TError],
    onrejected: js.Function1[/* reason */ TError, TResult | js.Thenable[TResult]]
  ): Promise[T | TResult] = js.native
  /**
    * Attaches a callback to be executed when promise is settled no matter if it was rejected
    * or resolved.
    * 
    * @param onFinally The callback to execute when promise is settled.
    * @returns A Promise for the completion of the callback.
    */
  def `finally`(onFinally: js.Function0[Unit]): Promise[T] = js.native
  // From Promise<T> in lib.es2015.d.ts and lib.es2015.symbol.wellknown.d.ts but with return type Dexie.Promise<T>:
  def `then`(): Promise[T] = js.native
  def `then`(
    onfulfilled: js.UndefOr[scala.Nothing],
    onrejected: js.Function1[/* reason */ js.Any, T | js.Thenable[T]]
  ): Promise[T] = js.native
  def `then`(onfulfilled: js.Function1[/* value */ T, T | js.Thenable[T]]): Promise[T] = js.native
  def `then`(
    onfulfilled: js.Function1[/* value */ T, T | js.Thenable[T]],
    onrejected: js.Function1[/* reason */ js.Any, T | js.Thenable[T]]
  ): Promise[T] = js.native
  def `then`(onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, T | js.Thenable[T]]): Promise[T] = js.native
  @JSName("then")
  def then_TResult[TResult](
    onfulfilled: js.UndefOr[scala.Nothing],
    onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]
  ): Promise[T | TResult] = js.native
  @JSName("then")
  def then_TResult[TResult](onfulfilled: js.Function1[/* value */ T, TResult | js.Thenable[TResult]]): Promise[TResult] = js.native
  @JSName("then")
  def then_TResult[TResult](
    onfulfilled: js.Function1[/* value */ T, T | TResult | (js.Thenable[T | TResult])],
    onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]
  ): Promise[T | TResult] = js.native
  @JSName("then")
  def then_TResult[TResult](onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): Promise[T | TResult] = js.native
  @JSName("then")
  def then_TResult1TResult2[TResult1, TResult2](
    onfulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): Promise[TResult1 | TResult2] = js.native
  /**
    * Apply a timeout limit for the promise. If timeout is reached before promise is settled,
    * the returned promise will reject with an Error object where name='TimeoutError'.
    * 
    * @param milliseconds Number of milliseconds for the timeout.
    * @returns A Promise that will resolve or reject identically to current Promise, but if timeout is reached,
    *          it will reject with TimeoutError.
    */
  def timeout(milliseconds: Double): Promise[T] = js.native
}

@JSImport("dexie", "Dexie.Promise")
@js.native
object Promise extends TopLevel[DexiePromiseConstructor]

