package typings.ecol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libBasicCollectionEventMod {
  import typings.tstl.baseIteratorIteratorMod.Iterator
  import typings.tstl.tstlMod.base.Container
  import typings.tstl.tstlMod.base.ReverseIterator

  type CollectionEvent[T, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */] = CollectionEvent_[T, SourceT, IteratorT, ReverseT]
}
