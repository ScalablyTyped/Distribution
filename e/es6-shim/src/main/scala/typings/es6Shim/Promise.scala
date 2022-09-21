package typings.es6Shim

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the completion of an asynchronous operation
  */
@js.native
trait Promise[T] extends StObject {
  
  /**
    * Attaches a callback for only the rejection of the Promise.
    * @param onrejected The callback to execute when the Promise is rejected.
    * @returns A Promise for the completion of the callback.
    */
  def `catch`(): Promise[T] = js.native
  def `catch`(onrejected: js.Function1[/* reason */ Any, PromiseLike[T] | T | Unit]): Promise[T] = js.native
  
  /**
    * Attaches callbacks for the resolution and/or rejection of the Promise.
    * @param onfulfilled The callback to execute when the Promise is resolved.
    * @param onrejected The callback to execute when the Promise is rejected.
    * @returns A Promise for the completion of which ever callback is executed.
    */
  def `then`[TResult](): Promise[TResult] = js.native
  def `then`[TResult](onfulfilled: js.Function1[/* value */ T, TResult | PromiseLike[TResult]]): Promise[TResult] = js.native
  def `then`[TResult](
    onfulfilled: js.Function1[/* value */ T, PromiseLike[TResult] | TResult],
    onrejected: js.Function1[/* reason */ Any, PromiseLike[TResult] | TResult | Unit]
  ): Promise[TResult] = js.native
  def `then`[TResult](
    onfulfilled: Unit,
    onrejected: js.Function1[/* reason */ Any, PromiseLike[TResult] | TResult | Unit]
  ): Promise[TResult] = js.native
}
