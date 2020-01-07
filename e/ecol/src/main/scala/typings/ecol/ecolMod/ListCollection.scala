package typings.ecol.ecolMod

import org.scalablytyped.runtime.Instantiable3
import typings.tstl.tstlMod.base.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecol", "ListCollection")
@js.native
class ListCollection[T] ()
  extends typings.ecol.libLinearListCollectionMod.ListCollection[T]

@JSImport("ecol", "ListCollection")
@js.native
object ListCollection extends js.Object {
  /**
    * Iterator of the List.
    *
    * @author Jeongho Nam <http://samchon.org>
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ListIterator<T, List<T>, Iterator<T>, ReverseIterator<T>, T> * / any */ @js.native
  /**
    * @hidden
    */
  class Iterator[T] protected ()
    extends typings.ecol.libLinearListCollectionMod.ListCollection.Iterator[T]
  
  /**
    * Reverse iterator of the List.
    *
    * @author Jeongho Nam <http://samchon.org>
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReverseIteratorBase<T, List<T>, Iterator<T>, ReverseIterator<T>, T> * / any */ @js.native
  class ReverseIterator[T] ()
    extends typings.ecol.libLinearListCollectionMod.ListCollection.ReverseIterator[T]
  
  val Event: Instantiable3[
    /* type */ String, 
    /* import warning: RewrittenClass.unapply cls was tparam IteratorT */ /* first */ js.Any, 
    /* import warning: RewrittenClass.unapply cls was tparam IteratorT */ /* last */ js.Any, 
    typings.ecol.libBasicCollectionEventMod.CollectionEvent[
      js.Object, 
      Container[
        /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam SourceT */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam IteratorT */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam ReverseT */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any
      ], 
      typings.std.Iterator[
        /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam SourceT */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam IteratorT */ js.Any
      ], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any
    ]
  ] = js.native
}

