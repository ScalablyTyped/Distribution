package typings.falcor.falcorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("falcor", "ModelResponse")
@js.native
class ModelResponse[T] protected () extends Observable[T] {
  def this(observable: Observable[T]) = this()
  def progressively(): ModelResponse[T] = js.native
  def `then`(): Thenable[_] = js.native
  def `then`(onFulfilled: js.Function1[/* value */ T, _ | Thenable[_]]): Thenable[_] = js.native
  def `then`(
    onFulfilled: js.Function1[/* value */ T, _ | Thenable[_]],
    onRejected: js.Function1[/* error */ js.Any, Unit]
  ): Thenable[_] = js.native
  @JSName("then")
  def then_U[U](): Thenable[U] = js.native
  @JSName("then")
  def then_U[U](onFulfilled: js.Function1[/* value */ T, U | Thenable[U]]): Thenable[U] = js.native
  @JSName("then")
  def then_U[U](
    onFulfilled: js.Function1[/* value */ T, U | Thenable[U]],
    onRejected: js.Function1[/* error */ js.Any, Unit]
  ): Thenable[U] = js.native
}

