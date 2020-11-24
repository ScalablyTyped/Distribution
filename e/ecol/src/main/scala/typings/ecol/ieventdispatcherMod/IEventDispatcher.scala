package typings.ecol.ieventdispatcherMod

import typings.ecol.collectionEventMod.CollectionEvent
import typings.ecol.collectionEventMod.CollectionEvent.Listener
import typings.ecol.collectionEventMod.CollectionEvent.Type
import typings.tstl.icontainerMod.IContainer
import typings.tstl.icontainerMod.IContainer.Iterator
import typings.tstl.icontainerMod.IContainer.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEventDispatcher[T, SourceT /* <: IContainer[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */] extends js.Object {
  
  def addEventListener(`type`: Type, listener: Listener[T, SourceT, IteratorT, ReverseT]): Unit = js.native
  
  def dispatchEvent(event: CollectionEvent[T, SourceT, IteratorT, ReverseT]): Unit = js.native
  
  def hasEventListener(`type`: Type): Boolean = js.native
  
  def removeEventListener(`type`: Type, listener: Listener[T, SourceT, IteratorT, ReverseT]): Unit = js.native
}
object IEventDispatcher {
  
  @scala.inline
  def apply[T, SourceT /* <: IContainer[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */](
    addEventListener: (Type, Listener[T, SourceT, IteratorT, ReverseT]) => Unit,
    dispatchEvent: CollectionEvent[T, SourceT, IteratorT, ReverseT] => Unit,
    hasEventListener: Type => Boolean,
    removeEventListener: (Type, Listener[T, SourceT, IteratorT, ReverseT]) => Unit
  ): IEventDispatcher[T, SourceT, IteratorT, ReverseT] = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), dispatchEvent = js.Any.fromFunction1(dispatchEvent), hasEventListener = js.Any.fromFunction1(hasEventListener), removeEventListener = js.Any.fromFunction2(removeEventListener))
    __obj.asInstanceOf[IEventDispatcher[T, SourceT, IteratorT, ReverseT]]
  }
  
  @scala.inline
  implicit class IEventDispatcherOps[Self <: IEventDispatcher[_, _, _, _], T, SourceT /* <: IContainer[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */] (val x: Self with (IEventDispatcher[T, SourceT, IteratorT, ReverseT])) extends AnyVal {
    
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
    def setAddEventListener(value: (Type, Listener[T, SourceT, IteratorT, ReverseT]) => Unit): Self = this.set("addEventListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDispatchEvent(value: CollectionEvent[T, SourceT, IteratorT, ReverseT] => Unit): Self = this.set("dispatchEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasEventListener(value: Type => Boolean): Self = this.set("hasEventListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveEventListener(value: (Type, Listener[T, SourceT, IteratorT, ReverseT]) => Unit): Self = this.set("removeEventListener", js.Any.fromFunction2(value))
  }
}
