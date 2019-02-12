package typings
package ecolLib.ecolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecol", "CollectionEvent")
@js.native
class CollectionEvent[T, SourceT /* <: tstlLib.baseContainerContainerMod.Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: tstlLib.baseIteratorIteratorMod.Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */] protected ()
  extends ecolLib.libBasicCollectionEventMod.CollectionEvent[T, SourceT, IteratorT, ReverseT] {
  def this(`type`: java.lang.String, first: IteratorT, last: IteratorT) = this()
}

