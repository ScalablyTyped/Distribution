package typings
package ecolLib.libBasicEventDispatcherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecol/lib/basic/EventDispatcher", "EventDispatcher")
@js.native
class EventDispatcher[T, SourceT /* <: tstlLib.baseContainerContainerMod.Container[T, SourceT, IteratorT, ReverseT] */, IteratorT /* <: tstlLib.baseIteratorIteratorMod.Iterator[T, SourceT, IteratorT, ReverseT] */, ReverseT /* <: tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[T, SourceT, IteratorT, ReverseT] */] ()
  extends ecolLib.libBasicIEventDispatcherMod.IEventDispatcher[T, SourceT, IteratorT, ReverseT] {
  /**
    * @hidden
    */
  var `listeners_`: js.Any = js.native
  /* CompleteClass */
  override def addEventListener(
    `type`: ecolLib.libBasicCollectionEventMod.CollectionEventNs.Type,
    listener: ecolLib.libBasicCollectionEventMod.CollectionEventNs.Listener[T, SourceT, IteratorT, ReverseT]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def dispatchEvent(event: ecolLib.libBasicCollectionEventMod.CollectionEvent[T, SourceT, IteratorT, ReverseT]): scala.Unit = js.native
  /* CompleteClass */
  override def hasEventListener(`type`: ecolLib.libBasicCollectionEventMod.CollectionEventNs.Type): scala.Boolean = js.native
  /* CompleteClass */
  override def removeEventListener(
    `type`: ecolLib.libBasicCollectionEventMod.CollectionEventNs.Type,
    listener: ecolLib.libBasicCollectionEventMod.CollectionEventNs.Listener[T, SourceT, IteratorT, ReverseT]
  ): scala.Unit = js.native
}

