package typings.ecol

import typings.ecol.libBasicCollectionEventMod.CollectionEvent
import typings.ecol.libBasicCollectionEventMod.CollectionEvent.Listener
import typings.ecol.libBasicCollectionEventMod.CollectionEvent.Type
import typings.ecol.libBasicIEventDispatcherMod.IEventDispatcher
import typings.tstl.baseIteratorIteratorMod.Iterator
import typings.tstl.tstlMod.base.Container
import typings.tstl.tstlMod.base.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecol/lib/basic/EventDispatcher", JSImport.Namespace)
@js.native
object libBasicEventDispatcherMod extends js.Object {
  @js.native
  class EventDispatcher[T, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */] () extends IEventDispatcher[T, SourceT, IteratorT, ReverseT] {
    /**
      * @hidden
      */
    var listeners_ : js.Any = js.native
    /* CompleteClass */
    override def addEventListener(`type`: Type, listener: Listener[T, SourceT, IteratorT, ReverseT]): Unit = js.native
    /* CompleteClass */
    override def dispatchEvent(event: CollectionEvent[T, SourceT, IteratorT, ReverseT]): Unit = js.native
    /* CompleteClass */
    override def hasEventListener(`type`: Type): Boolean = js.native
    /* CompleteClass */
    override def removeEventListener(`type`: Type, listener: Listener[T, SourceT, IteratorT, ReverseT]): Unit = js.native
  }
  
}

