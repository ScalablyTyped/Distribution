package typings
package ecolLib.libBasicCollectionEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecol/lib/basic/CollectionEvent", "CollectionEvent")
@js.native
class CollectionEvent[T, SourceT /* <: tstlLib.baseContainerContainerMod.Container[T, SourceT, IteratorT, ReverseT] */, IteratorT /* <: tstlLib.baseIteratorIteratorMod.Iterator[T, SourceT, IteratorT, ReverseT] */, ReverseT /* <: tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[T, SourceT, IteratorT, ReverseT] */] protected ()
  extends stdLib.Iterable[T] {
  def this(`type`: java.lang.String, first: IteratorT, last: IteratorT) = this()
  val first: IteratorT = js.native
  /* CompleteClass */
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  override var iterator: js.Function0[stdLib.Iterator[T]] = js.native
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator_CollectionEvent: js.Function0[stdLib.IterableIterator[T]] = js.native
  val last: IteratorT = js.native
  val `type`: java.lang.String = js.native
}

