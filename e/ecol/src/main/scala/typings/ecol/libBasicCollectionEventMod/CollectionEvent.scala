package typings.ecol.libBasicCollectionEventMod

import typings.std.Iterable
import typings.std.IterableIterator
import typings.tstl.baseIteratorIteratorMod.Iterator
import typings.tstl.tstlMod.baseNs.Container
import typings.tstl.tstlMod.baseNs.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecol/lib/basic/CollectionEvent", "CollectionEvent")
@js.native
class CollectionEvent[T, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */] protected () extends Iterable[T] {
  def this(`type`: String, first: IteratorT, last: IteratorT) = this()
  val first: IteratorT = js.native
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator_CollectionEvent: js.Function0[IterableIterator[T]] = js.native
  val last: IteratorT = js.native
  val `type`: String = js.native
}

