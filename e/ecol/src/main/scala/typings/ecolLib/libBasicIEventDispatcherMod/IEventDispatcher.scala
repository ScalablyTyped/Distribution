package typings
package ecolLib.libBasicIEventDispatcherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventDispatcher[T, SourceT /* <: tstlLib.baseContainerContainerMod.Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: tstlLib.baseIteratorIteratorMod.Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */] extends js.Object {
  def addEventListener(
    `type`: ecolLib.libBasicCollectionEventMod.CollectionEventNs.Type,
    listener: ecolLib.libBasicCollectionEventMod.CollectionEventNs.Listener[T, SourceT, IteratorT, ReverseT]
  ): scala.Unit
  def dispatchEvent(event: ecolLib.libBasicCollectionEventMod.CollectionEvent[T, SourceT, IteratorT, ReverseT]): scala.Unit
  def hasEventListener(`type`: ecolLib.libBasicCollectionEventMod.CollectionEventNs.Type): scala.Boolean
  def removeEventListener(
    `type`: ecolLib.libBasicCollectionEventMod.CollectionEventNs.Type,
    listener: ecolLib.libBasicCollectionEventMod.CollectionEventNs.Listener[T, SourceT, IteratorT, ReverseT]
  ): scala.Unit
}

object IEventDispatcher {
  @scala.inline
  def apply[T, SourceT /* <: tstlLib.baseContainerContainerMod.Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: tstlLib.baseIteratorIteratorMod.Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */](
    addEventListener: js.Function2[
      ecolLib.libBasicCollectionEventMod.CollectionEventNs.Type, 
      ecolLib.libBasicCollectionEventMod.CollectionEventNs.Listener[T, SourceT, IteratorT, ReverseT], 
      scala.Unit
    ],
    dispatchEvent: js.Function1[
      ecolLib.libBasicCollectionEventMod.CollectionEvent[T, SourceT, IteratorT, ReverseT], 
      scala.Unit
    ],
    hasEventListener: js.Function1[ecolLib.libBasicCollectionEventMod.CollectionEventNs.Type, scala.Boolean],
    removeEventListener: js.Function2[
      ecolLib.libBasicCollectionEventMod.CollectionEventNs.Type, 
      ecolLib.libBasicCollectionEventMod.CollectionEventNs.Listener[T, SourceT, IteratorT, ReverseT], 
      scala.Unit
    ]
  ): IEventDispatcher[T, SourceT, IteratorT, ReverseT] = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener, dispatchEvent = dispatchEvent, hasEventListener = hasEventListener, removeEventListener = removeEventListener)
  
    __obj.asInstanceOf[IEventDispatcher[T, SourceT, IteratorT, ReverseT]]
  }
}

