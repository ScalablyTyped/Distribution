package typings
package ecolLib.libBasicIEventDispatcherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventDispatcher[T, SourceT /* <: tstlLib.baseContainerContainerMod.Container[T, SourceT, IteratorT, ReverseT] */, IteratorT /* <: tstlLib.baseIteratorIteratorMod.Iterator[T, SourceT, IteratorT, ReverseT] */, ReverseT /* <: tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[T, SourceT, IteratorT, ReverseT] */] extends js.Object {
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

