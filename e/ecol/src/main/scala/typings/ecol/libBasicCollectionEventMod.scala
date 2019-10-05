package typings.ecol

import typings.ecol.libBasicCollectionEventMod.CollectionEvent
import typings.std.Iterable
import typings.std.IterableIterator
import typings.tstl.baseIteratorIteratorMod.Iterator
import typings.tstl.tstlMod.base.Container
import typings.tstl.tstlMod.base.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecol/lib/basic/CollectionEvent", JSImport.Namespace)
@js.native
object libBasicCollectionEventMod extends js.Object {
  @js.native
  class CollectionEvent[T, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */] protected () extends Iterable[T] {
    def this(`type`: String, first: IteratorT, last: IteratorT) = this()
    val first: IteratorT = js.native
    @JSName(scala.scalajs.js.Symbol.iterator)
    var iterator_CollectionEvent: js.Function0[IterableIterator[T]] = js.native
    val last: IteratorT = js.native
    val `type`: String = js.native
  }
  
  @js.native
  object CollectionEvent extends js.Object {
    /* Rewritten from type alias, can be one of: 
      - typings.ecol.ecolStrings.insert
      - typings.ecol.ecolStrings.erase
      - typings.ecol.ecolStrings.refresh
    */
    trait Type extends js.Object
    
    type Listener[T, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */] = js.Function1[/* event */ CollectionEvent[T, SourceT, IteratorT, ReverseT], Unit]
  }
  
}

