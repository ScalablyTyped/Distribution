package typings.ecol.libBasicCollectionEventMod

import typings.ecol.libBasicCollectionEventMod.CollectionEvent
import typings.tstl.baseContainerContainerMod.Container
import typings.tstl.baseIteratorIteratorMod.Iterator
import typings.tstl.baseIteratorReverseIteratorMod.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CollectionEventNs {
  type Listener[T, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */] = js.Function1[/* event */ CollectionEvent[T, SourceT, IteratorT, ReverseT], Unit]
}
