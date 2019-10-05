package typings.ecol.ecolMod

import typings.tstl.baseIteratorIteratorMod.Iterator
import typings.tstl.tstlMod.base.Container
import typings.tstl.tstlMod.base.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecol", "CollectionEvent")
@js.native
class CollectionEvent[T, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */] protected ()
  extends typings.ecol.libBasicCollectionEventMod.CollectionEvent[T, SourceT, IteratorT, ReverseT] {
  def this(`type`: String, first: IteratorT, last: IteratorT) = this()
}

