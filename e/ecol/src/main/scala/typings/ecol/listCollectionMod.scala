package typings.ecol

import typings.ecol.collectionEventMod.CollectionEvent
import typings.ecol.icollectionMod.ICollection
import typings.ecol.listCollectionMod.ListCollection.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listCollectionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify List<T> * / any */ @JSImport("ecol/lib/linear/ListCollection", "ListCollection")
  @js.native
  class ListCollection[T] ()
    extends ICollection[
          T, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet<T> */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet.Iterator<T> */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet.ReverseIterator<T> */ js.Any
        ] {
    
    /**
      * @hidden
      */
    /* protected */ def _Erase_by_range(
      first: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify List.Iterator<T> */ js.Any,
      last: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify List.Iterator<T> */ js.Any
    ): js.Any = js.native
    
    /**
      * @hidden
      */
    /* protected */ def _Insert_by_range[U /* <: T */, InputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IForwardIterator<U, InputIterator> */ js.Any */](
      pos: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify List.Iterator<T> */ js.Any,
      first: InputIterator,
      last: InputIterator
    ): js.Any = js.native
    
    /**
      * @hidden
      */
    var _Notify_erase: js.Any = js.native
    
    /**
      * @hidden
      */
    var _Notify_insert: js.Any = js.native
    
    def clear(): Unit = js.native
    
    /**
      * @inheritdoc
      */
    def dispatchEvent(
      event: Event[
          T, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ _, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ _, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ _
        ]
    ): Unit = js.native
    
    /**
      * @hidden
      */
    var dispatcher_ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    def reverse(): Unit = js.native
    
    /**
      * @inheritDoc
      */
    def sort(): Unit = js.native
    /**
      * @inheritDoc
      */
    def sort(comp: js.Function2[/* x */ T, /* y */ T, Boolean]): Unit = js.native
  }
  object ListCollection {
    
    /* was `typeof CollectionEvent` */
    @JSImport("ecol/lib/linear/ListCollection", "ListCollection.Event")
    @js.native
    class Event[T, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ js.Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */] protected () extends CollectionEvent[T, SourceT, IteratorT, ReverseT] {
      def this(`type`: String, first: IteratorT, last: IteratorT) = this()
    }
    /* was `typeof CollectionEvent` */
    object Event
    
    type Listener[T] = typings.ecol.collectionEventMod.CollectionEvent.Listener[
        T, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify List<T> */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify List.Iterator<T> */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify List.ReverseIterator<T> */ js.Any
      ]
  }
}
