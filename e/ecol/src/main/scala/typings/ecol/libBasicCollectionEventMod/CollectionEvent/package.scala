package typings.ecol.libBasicCollectionEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CollectionEvent {
  import typings.std.Iterator
  import typings.tstl.tstlMod.base.Container

  type Listener[T, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT] */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */] = js.Function1[
    /* event */ typings.ecol.libBasicCollectionEventMod.CollectionEvent[T, SourceT, IteratorT, ReverseT], 
    Unit
  ]
}
