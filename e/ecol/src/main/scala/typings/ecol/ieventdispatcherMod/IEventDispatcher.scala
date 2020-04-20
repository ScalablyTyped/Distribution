package typings.ecol.ieventdispatcherMod

import typings.ecol.collectionEventMod.CollectionEvent
import typings.ecol.collectionEventMod.CollectionEvent.Listener
import typings.ecol.collectionEventMod.CollectionEvent.Type
import typings.tstl.icontainerMod.IContainer
import typings.tstl.icontainerMod.IContainer.Iterator
import typings.tstl.icontainerMod.IContainer.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventDispatcher[T, SourceT /* <: IContainer[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */] extends js.Object {
  def addEventListener(`type`: Type, listener: Listener[T, SourceT, IteratorT, ReverseT]): Unit
  def dispatchEvent(event: CollectionEvent[T, SourceT, IteratorT, ReverseT]): Unit
  def hasEventListener(`type`: Type): Boolean
  def removeEventListener(`type`: Type, listener: Listener[T, SourceT, IteratorT, ReverseT]): Unit
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
}

