package typings.ecol

import typings.ecol.libBasicIEventDispatcherMod.IEventDispatcher
import typings.std.Iterator
import typings.tstl.tstlMod.base.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecol/lib/basic/ICollection", JSImport.Namespace)
@js.native
object libBasicICollectionMod extends js.Object {
  @js.native
  trait ICollection[T, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT] */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */]
    extends typings.tstl.baseContainerContainerMod.Container[T, SourceT, IteratorT, ReverseT, T]
       with IEventDispatcher[T, SourceT, IteratorT, ReverseT] {
    def refresh(): Unit = js.native
    def refresh(first: IteratorT, last: IteratorT): Unit = js.native
    def refresh(it: IteratorT): Unit = js.native
  }
  
}

