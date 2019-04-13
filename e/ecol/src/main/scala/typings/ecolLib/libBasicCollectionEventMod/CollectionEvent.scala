package typings
package ecolLib.libBasicCollectionEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecol/lib/basic/CollectionEvent", "CollectionEvent")
@js.native
class CollectionEvent[T, SourceT /* <: tstlLib.baseContainerContainerMod.Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: tstlLib.baseIteratorIteratorMod.Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */] protected ()
  extends stdLib.Iterable[T] {
  def this(`type`: java.lang.String, first: IteratorT, last: IteratorT) = this()
  val first: IteratorT = js.native
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator_CollectionEvent: js.Function0[stdLib.IterableIterator[T]] = js.native
  val last: IteratorT = js.native
  val `type`: java.lang.String = js.native
}

