package typings.ecol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libBasicCollectionEventMod {
  import typings.std.Iterator
  import typings.tstl.tstlMod.base.Container

  type CollectionEvent[T, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT] */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */] = CollectionEvent_[T, SourceT, IteratorT, ReverseT]
}
