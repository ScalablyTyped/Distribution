package typings.dexie.mod

import typings.std.Promise
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromiseExtended[T]
  extends StObject
     with Promise[T] {
  
  def `catch`[TResult](ErrorConstructor: js.Function): PromiseExtended[T | TResult] = js.native
  def `catch`[TResult](
    ErrorConstructor: js.Function,
    onrejected: js.Function1[/* reason */ Any, TResult | PromiseLike[TResult]]
  ): PromiseExtended[T | TResult] = js.native
  def `catch`[TResult](errorName: String): PromiseExtended[T | TResult] = js.native
  def `catch`[TResult](errorName: String, onrejected: js.Function1[/* reason */ Any, TResult | PromiseLike[TResult]]): PromiseExtended[T | TResult] = js.native
  
  def timeout(ms: Double): PromiseExtended[T] = js.native
  def timeout(ms: Double, msg: String): PromiseExtended[T] = js.native
}
