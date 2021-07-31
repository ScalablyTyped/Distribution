package typings.ecol

import typings.ecol.collectionEventMod.CollectionEvent
import typings.ecol.collectionEventMod.CollectionEvent.Listener
import typings.ecol.collectionEventMod.CollectionEvent.Type
import typings.ecol.dequeCollectionMod.DequeCollection.Event
import typings.ecol.icollectionMod.ICollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dequeCollectionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Deque<T> * / any */ @JSImport("ecol/lib/linear/DequeCollection", "DequeCollection")
  @js.native
  class DequeCollection[T] ()
    extends StObject
       with ICollection[
          T, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet<T> */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet.Iterator<T> */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet.ReverseIterator<T> */ js.Any
        ] {
    
    /**
      * @hidden
      */
    /* protected */ def _Erase_by_range(
      first: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Deque.Iterator<T> */ js.Any,
      last: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Deque.Iterator<T> */ js.Any
    ): js.Any = js.native
    
    /**
      * @hidden
      */
    /* protected */ def _Insert_by_range[U /* <: T */, InputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IForwardIterator<U, InputIterator> */ js.Any */](
      pos: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Deque.Iterator<T> */ js.Any,
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
    
    /* CompleteClass */
    override def addEventListener(
      `type`: Type,
      listener: Listener[
          T, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet<T> */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet.Iterator<T> */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet.ReverseIterator<T> */ js.Any
        ]
    ): Unit = js.native
    
    def clear(): Unit = js.native
    
    /* CompleteClass */
    override def dispatchEvent(
      event: CollectionEvent[
          T, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet<T> */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet.Iterator<T> */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet.ReverseIterator<T> */ js.Any
        ]
    ): Unit = js.native
    /**
      * @inheritdoc
      */
    def dispatchEvent(
      event: Event[
          T, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any
        ]
    ): Unit = js.native
    
    /**
      * @hidden
      */
    var dispatcher_ : js.Any = js.native
    
    /* CompleteClass */
    override def hasEventListener(`type`: Type): Boolean = js.native
    
    /**
      * @inheritdoc
      */
    def pop_back(): Unit = js.native
    
    /**
      * @inheritdoc
      */
    def pop_front(): Unit = js.native
    
    /**
      * @inheritdoc
      */
    def push_back(`val`: T): Unit = js.native
    
    /**
      * @inheritdoc
      */
    def push_front(`val`: T): Unit = js.native
    
    /* CompleteClass */
    override def removeEventListener(
      `type`: Type,
      listener: Listener[
          T, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet<T> */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet.Iterator<T> */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet.ReverseIterator<T> */ js.Any
        ]
    ): Unit = js.native
    
    /**
      * @inheritdoc
      */
    def set(index: Double, `val`: T): Unit = js.native
  }
  object DequeCollection {
    
    /* was `typeof CollectionEvent` */
    @JSImport("ecol/lib/linear/DequeCollection", "DequeCollection.Event")
    @js.native
    class Event[T, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ js.Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */] protected () extends CollectionEvent[T, SourceT, IteratorT, ReverseT] {
      def this(`type`: String, first: IteratorT, last: IteratorT) = this()
    }
    /* was `typeof CollectionEvent` */
    object Event
    
    type Listener[T] = typings.ecol.collectionEventMod.CollectionEvent.Listener[
        T, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Deque<T> */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Deque.Iterator<T> */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Deque.ReverseIterator<T> */ js.Any
      ]
  }
}
