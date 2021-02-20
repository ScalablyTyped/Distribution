package typings.ecol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ecol", "DequeCollection")
@js.native
class DequeCollection[T] ()
  extends typings.ecol.dequeCollectionMod.DequeCollection[T]
object DequeCollection {
  
  /* was `typeof CollectionEvent` */
  @JSImport("ecol", "DequeCollection.Event")
  @js.native
  class Event[T, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ js.Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */] protected ()
    extends typings.ecol.dequeCollectionMod.DequeCollection.Event[T, SourceT, IteratorT, ReverseT] {
    def this(`type`: String, first: IteratorT, last: IteratorT) = this()
  }
  /* was `typeof CollectionEvent` */
  object Event
}
