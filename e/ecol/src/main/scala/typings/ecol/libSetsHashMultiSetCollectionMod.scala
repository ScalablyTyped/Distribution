package typings.ecol

import typings.ecol.libBasicCollectionEventMod.CollectionEvent
import typings.ecol.libBasicCollectionEventMod.CollectionEvent.Listener
import typings.ecol.libBasicCollectionEventMod.CollectionEvent.Type
import typings.ecol.libBasicIcollectionMod.ICollection
import typings.ecol.libSetsHashMultiSetCollectionMod.HashMultiSetCollection.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSetsHashMultiSetCollectionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet<T> * / any */ @JSImport("ecol/lib/sets/HashMultiSetCollection", "HashMultiSetCollection")
  @js.native
  open class HashMultiSetCollection[T] ()
    extends StObject
       with ICollection[
          T, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeSet<T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeSet.Iterator<T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeSet.ReverseIterator<T> */ Any
        ] {
    
    /**
      * @hidden
      */
    /* protected */ def _Handle_erase(
      first: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet.Iterator<T> */ Any,
      last: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet.Iterator<T> */ Any
    ): Unit = js.native
    
    /**
      * @hidden
      */
    /* protected */ def _Handle_insert(
      first: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet.Iterator<T> */ Any,
      last: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet.Iterator<T> */ Any
    ): Unit = js.native
    
    /* CompleteClass */
    override def addEventListener(
      `type`: Type,
      listener: Listener[
          T, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeSet<T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeSet.Iterator<T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeSet.ReverseIterator<T> */ Any
        ]
    ): Unit = js.native
    
    def clear(): Unit = js.native
    
    /* CompleteClass */
    override def dispatchEvent(
      event: CollectionEvent[
          T, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeSet<T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeSet.Iterator<T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeSet.ReverseIterator<T> */ Any
        ]
    ): Unit = js.native
    /**
      * @inheritDoc
      */
    def dispatchEvent(
      event: Event[
          T, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any
        ]
    ): Unit = js.native
    
    /**
      * @hidden
      */
    /* private */ var dispatcher_ : Any = js.native
    
    /* CompleteClass */
    override def hasEventListener(`type`: Type): Boolean = js.native
    
    /* CompleteClass */
    override def removeEventListener(
      `type`: Type,
      listener: Listener[
          T, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeSet<T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeSet.Iterator<T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeSet.ReverseIterator<T> */ Any
        ]
    ): Unit = js.native
  }
  object HashMultiSetCollection {
    
    /* was `typeof CollectionEvent` */
    @JSImport("ecol/lib/sets/HashMultiSetCollection", "HashMultiSetCollection.Event")
    @js.native
    open class Event[T, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */] protected () extends CollectionEvent[T, SourceT, IteratorT, ReverseT] {
      def this(`type`: String, first: IteratorT, last: IteratorT) = this()
    }
    
    type Listener[T] = typings.ecol.libBasicCollectionEventMod.CollectionEvent.Listener[
        T, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet<T> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet.Iterator<T> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet.ReverseIterator<T> */ Any
      ]
  }
}
