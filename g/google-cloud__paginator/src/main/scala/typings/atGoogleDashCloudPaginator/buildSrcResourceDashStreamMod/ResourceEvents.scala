package typings.atGoogleDashCloudPaginator.buildSrcResourceDashStreamMod

import typings.atGoogleDashCloudPaginator.atGoogleDashCloudPaginatorStrings.data
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
    addListener_data: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T],
    emit_data: (data, T) => Boolean,
    on_data: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T],
    once_data: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T],
    prependListener_data: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T],
    prependOnceListener_data: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T],
    removeListener_data: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T]
  ): ResourceEvents[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addListener")(js.Any.fromFunction2(addListener_data))
    __obj.updateDynamic("emit")(js.Any.fromFunction2(emit_data))
    __obj.updateDynamic("on")(js.Any.fromFunction2(on_data))
    __obj.updateDynamic("once")(js.Any.fromFunction2(once_data))
    __obj.updateDynamic("prependListener")(js.Any.fromFunction2(prependListener_data))
    __obj.updateDynamic("prependOnceListener")(js.Any.fromFunction2(prependOnceListener_data))
    __obj.updateDynamic("removeListener")(js.Any.fromFunction2(removeListener_data))
    __obj.asInstanceOf[ResourceEvents[T]]
  }
}

