package typings.googleCloudPaginator.resourceStreamMod

import typings.googleCloudPaginator.googleCloudPaginatorStrings.data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceEvents[T] extends js.Object {
  @JSName("addListener")
  def addListener_data(event: data, listener: js.Function1[/* data */ T, Unit]): this.type
  @JSName("emit")
  def emit_data(event: data, data: T): Boolean
  @JSName("on")
  def on_data(event: data, listener: js.Function1[/* data */ T, Unit]): this.type
  @JSName("once")
  def once_data(event: data, listener: js.Function1[/* data */ T, Unit]): this.type
  @JSName("prependListener")
  def prependListener_data(event: data, listener: js.Function1[/* data */ T, Unit]): this.type
  @JSName("prependOnceListener")
  def prependOnceListener_data(event: data, listener: js.Function1[/* data */ T, Unit]): this.type
  @JSName("removeListener")
  def removeListener_data(event: data, listener: js.Function1[/* data */ T, Unit]): this.type
}

object ResourceEvents {
  @scala.inline
  def apply[T](
    addListener: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T],
    emit: (data, T) => Boolean,
    on: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T],
    once: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T],
    prependListener: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T],
    prependOnceListener: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T],
    removeListener: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T]
  ): ResourceEvents[T] = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), emit = js.Any.fromFunction2(emit), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), prependListener = js.Any.fromFunction2(prependListener), prependOnceListener = js.Any.fromFunction2(prependOnceListener), removeListener = js.Any.fromFunction2(removeListener))
    __obj.asInstanceOf[ResourceEvents[T]]
  }
}

