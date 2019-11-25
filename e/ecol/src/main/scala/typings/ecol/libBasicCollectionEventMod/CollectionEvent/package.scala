package typings.ecol.libBasicCollectionEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CollectionEvent {
  import typings.tstl.baseIteratorIteratorMod.Iterator
  import typings.tstl.tstlMod.base.Container
  import typings.tstl.tstlMod.base.ReverseIterator

  type Listener[T, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */] = js.Function1[
    /* event */ typings.ecol.libBasicCollectionEventMod.CollectionEvent[T, SourceT, IteratorT, ReverseT], 
    Unit
  ]
}
