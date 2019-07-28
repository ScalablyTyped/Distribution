package typings.ecol.libBasicIEventDispatcherMod

import typings.ecol.libBasicCollectionEventMod.CollectionEvent
import typings.ecol.libBasicCollectionEventMod.CollectionEventNs.Listener
import typings.ecol.libBasicCollectionEventMod.CollectionEventNs.Type
import typings.tstl.baseContainerContainerMod.Container
import typings.tstl.baseIteratorIteratorMod.Iterator
import typings.tstl.baseIteratorReverseIteratorMod.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventDispatcher[T, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */] extends js.Object {
  def addEventListener(`type`: Type, listener: Listener[T, SourceT, IteratorT, ReverseT]): Unit
  def dispatchEvent(event: CollectionEvent[T, SourceT, IteratorT, ReverseT]): Unit
  def hasEventListener(`type`: Type): Boolean
  def removeEventListener(`type`: Type, listener: Listener[T, SourceT, IteratorT, ReverseT]): Unit
}

object IEventDispatcher {
  @scala.inline
  def apply[T, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */](
    addEventListener: (Type, Listener[T, SourceT, IteratorT, ReverseT]) => Unit,
    dispatchEvent: CollectionEvent[T, SourceT, IteratorT, ReverseT] => Unit,
    hasEventListener: Type => Boolean,
    removeEventListener: (Type, Listener[T, SourceT, IteratorT, ReverseT]) => Unit
  ): IEventDispatcher[T, SourceT, IteratorT, ReverseT] = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), dispatchEvent = js.Any.fromFunction1(dispatchEvent), hasEventListener = js.Any.fromFunction1(hasEventListener), removeEventListener = js.Any.fromFunction2(removeEventListener))
  
    __obj.asInstanceOf[IEventDispatcher[T, SourceT, IteratorT, ReverseT]]
  }
}

