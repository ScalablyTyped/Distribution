package typings.ecol

import typings.ecol.arrayCollectionMod.ArrayCollection.Event
import typings.ecol.collectionEventMod.CollectionEvent
import typings.ecol.collectionEventMod.CollectionEvent.Listener
import typings.ecol.collectionEventMod.CollectionEvent.Type
import typings.ecol.icollectionMod.ICollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayCollectionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vector<T> * / any */ @JSImport("ecol/lib/linear/ArrayCollection", "ArrayCollection")
  @js.native
  open class ArrayCollection[T] ()
    extends StObject
       with ICollection[
          T, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet<T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet.Iterator<T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet.ReverseIterator<T> */ Any
        ] {
    
    /**
      * @hidden
      */
    /* protected */ def _Erase_by_range(
      first: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vector.Iterator<T> */ Any,
      last: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vector.Iterator<T> */ Any
    ): Any = js.native
    
    /**
      * @hidden
      */
    /* protected */ def _Insert_by_range[U /* <: T */, InputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IForwardIterator<U, InputIterator> */ Any */](
      pos: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vector.Iterator<T> */ Any,
      first: InputIterator,
      last: InputIterator
    ): Any = js.native
    
    /**
      * @hidden
      */
    /* private */ var _Notify_erase: Any = js.native
    
    /**
      * @hidden
      */
    /* private */ var _Notify_insert: Any = js.native
    
    /* CompleteClass */
    override def addEventListener(
      `type`: Type,
      listener: Listener[
          T, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet<T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet.Iterator<T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet.ReverseIterator<T> */ Any
        ]
    ): Unit = js.native
    
    def clear(): Unit = js.native
    
    /**
      * @inheritdoc
      */
    def dispatchEvent(
      event: Event[
          T, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any
        ]
    ): Unit = js.native
    /* CompleteClass */
    override def dispatchEvent(
      event: CollectionEvent[
          T, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet<T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet.Iterator<T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet.ReverseIterator<T> */ Any
        ]
    ): Unit = js.native
    
    /**
      * @hidden
      */
    /* private */ var dispatcher_ : Any = js.native
    
    /* CompleteClass */
    override def hasEventListener(`type`: Type): Boolean = js.native
    
    /**
      * @inheritdoc
      */
    def pop_back(): Unit = js.native
    
    /**
      * @inheritdoc
      */
    def push(items: T*): Double = js.native
    
    /**
      * @inheritdoc
      */
    def push_back(`val`: T): Unit = js.native
    
    /* CompleteClass */
    override def removeEventListener(
      `type`: Type,
      listener: Listener[
          T, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet<T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet.Iterator<T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet.ReverseIterator<T> */ Any
        ]
    ): Unit = js.native
    
    /**
      * @inheritDoc
      */
    def set(index: Double, `val`: T): Unit = js.native
  }
  object ArrayCollection {
    
    /* was `typeof CollectionEvent` */
    @JSImport("ecol/lib/linear/ArrayCollection", "ArrayCollection.Event")
    @js.native
    open class Event[T, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */] protected () extends CollectionEvent[T, SourceT, IteratorT, ReverseT] {
      def this(`type`: String, first: IteratorT, last: IteratorT) = this()
    }
    
    type Listener[T] = typings.ecol.collectionEventMod.CollectionEvent.Listener[
        T, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vector<T> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vector.Iterator<T> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vector.ReverseIterator<T> */ Any
      ]
  }
}
