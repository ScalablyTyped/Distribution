package typings.es6DashShim

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the completion of an asynchronous operation
  */
@js.native
trait Promise[T] extends js.Object {
  /**
    * Attaches a callback for only the rejection of the Promise.
    * @param onrejected The callback to execute when the Promise is rejected.
    * @returns A Promise for the completion of the callback.
    */
  def `catch`(): Promise[T] = js.native
  def `catch`(onrejected: js.Function1[/* reason */ js.Any, PromiseLike[T] | T | Unit]): Promise[T] = js.native
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
    onrejected: js.Function1[/* reason */ js.Any, PromiseLike[TResult] | TResult | Unit]
  ): Promise[TResult] = js.native
}

@JSGlobal("Promise")
@js.native
class PromiseCls[T] protected () extends Promise[T] {
  /**
    * Creates a new Promise.
    * @param executor A callback used to initialize the promise. This callback is passed two arguments:
    * a resolve callback used to resolve the promise with a value or the result of another promise,
    * and a reject callback used to reject the promise with a provided reason or error.
    */
  def this(executor: js.Function2[
        /* resolve */ js.Function1[/* value */ js.UndefOr[T | PromiseLike[T]], Unit], 
        /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
        Unit
      ]) = this()
}

