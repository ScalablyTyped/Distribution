package typings.ecol.collectionEventMod

import typings.std.Iterable
import typings.std.IterableIterator
import typings.std.Iterator
import typings.tstl.mod.base.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecol/lib/basic/CollectionEvent", "CollectionEvent")
@js.native
class CollectionEvent_[T, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT] */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */] protected () extends Iterable[T] {
  def this(`type`: String, first: IteratorT, last: IteratorT) = this()
  val first: IteratorT = js.native
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator_CollectionEvent_ : js.Function0[IterableIterator[T]] = js.native
  val last: IteratorT = js.native
  val `type`: String = js.native
}

