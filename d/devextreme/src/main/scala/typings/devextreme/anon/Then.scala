package typings.devextreme.anon

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Then[T] extends StObject {
  
  def `then`[TResult1, TResult2](): PromiseLike[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onFulfilled: js.Function2[
      /* value */ T, 
      /* extraParameters */ js.UndefOr[Any], 
      TResult1 | PromiseLike[TResult1]
    ]
  ): PromiseLike[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onFulfilled: js.Function2[
      /* value */ T, 
      /* extraParameters */ js.UndefOr[Any], 
      TResult1 | PromiseLike[TResult1]
    ],
    onRejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]
  ): PromiseLike[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onFulfilled: Null, onRejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]): PromiseLike[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onFulfilled: Unit, onRejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]): PromiseLike[TResult1 | TResult2] = js.native
}
