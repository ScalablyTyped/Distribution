package typings.googleCloudPaginator.resourceStreamMod

import typings.googleCloudPaginator.googleCloudPaginatorStrings.data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceEvents[T] extends js.Object {
  
  @JSName("addListener")
  def addListener_data(event: data, listener: js.Function1[/* data */ T, Unit]): this.type = js.native
  
  @JSName("emit")
  def emit_data(event: data, data: T): Boolean = js.native
  
  @JSName("on")
  def on_data(event: data, listener: js.Function1[/* data */ T, Unit]): this.type = js.native
  
  @JSName("once")
  def once_data(event: data, listener: js.Function1[/* data */ T, Unit]): this.type = js.native
  
  @JSName("prependListener")
  def prependListener_data(event: data, listener: js.Function1[/* data */ T, Unit]): this.type = js.native
  
  @JSName("prependOnceListener")
  def prependOnceListener_data(event: data, listener: js.Function1[/* data */ T, Unit]): this.type = js.native
  
  @JSName("removeListener")
  def removeListener_data(event: data, listener: js.Function1[/* data */ T, Unit]): this.type = js.native
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
  
  @scala.inline
  implicit class ResourceEventsOps[Self <: ResourceEvents[_], T] (val x: Self with ResourceEvents[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddListener(value: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T]): Self = this.set("addListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEmit(value: (data, T) => Boolean): Self = this.set("emit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOn(value: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T]): Self = this.set("on", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnce(value: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T]): Self = this.set("once", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPrependListener(value: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T]): Self = this.set("prependListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPrependOnceListener(value: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T]): Self = this.set("prependOnceListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveListener(value: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T]): Self = this.set("removeListener", js.Any.fromFunction2(value))
  }
}
