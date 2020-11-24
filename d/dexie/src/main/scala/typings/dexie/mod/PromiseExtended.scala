package typings.dexie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromiseExtended[T]
  extends js.Promise[T] {
  
  def `catch`[TResult](): PromiseExtended[T | TResult] = js.native
  def `catch`[TResult](ErrorConstructor: js.Function): PromiseExtended[T | TResult] = js.native
  def `catch`[TResult](
    ErrorConstructor: js.Function,
    onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]
  ): PromiseExtended[T | TResult] = js.native
  def `catch`[TResult](errorName: String): PromiseExtended[T | TResult] = js.native
  def `catch`[TResult](errorName: String, onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): PromiseExtended[T | TResult] = js.native
  def `catch`[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): PromiseExtended[T | TResult] = js.native
  
  def `finally`[U](): PromiseExtended[T] = js.native
  def `finally`[U](onFinally: js.Function0[U | js.Thenable[U]]): PromiseExtended[T] = js.native
  
  def `then`[TResult1, TResult2](): PromiseExtended[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: js.UndefOr[scala.Nothing],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): PromiseExtended[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]]): PromiseExtended[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): PromiseExtended[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]): PromiseExtended[TResult1 | TResult2] = js.native
  
  def timeout(ms: Double): PromiseExtended[T] = js.native
  def timeout(ms: Double, msg: String): PromiseExtended[T] = js.native
}
