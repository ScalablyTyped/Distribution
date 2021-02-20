package typings.ecol

import typings.ecol.collectionEventMod.CollectionEvent
import typings.ecol.hashMapCollectionMod.HashMapCollection.Event
import typings.ecol.icollectionMod.ICollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hashMapCollectionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMap<Key, T> * / any */ @JSImport("ecol/lib/maps/HashMapCollection", "HashMapCollection")
  @js.native
  class HashMapCollection[Key, T] ()
    extends ICollection[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entry<Key, T> */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMap<Key, T> */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMap.Iterator<Key, T> */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMap.ReverseIterator<Key, T> */ js.Any
        ] {
    
    /**
      * @hidden
      */
    /* protected */ def _Handle_erase(
      first: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMap.Iterator<Key, T> */ js.Any,
      last: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMap.Iterator<Key, T> */ js.Any
    ): Unit = js.native
    
    /**
      * @hidden
      */
    /* protected */ def _Handle_insert(
      first: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMap.Iterator<Key, T> */ js.Any,
      last: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMap.Iterator<Key, T> */ js.Any
    ): Unit = js.native
    
    def clear(): Unit = js.native
    
    /**
      * @inheritDoc
      */
    def dispatchEvent(
      event: Event[
          Key, 
          T, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ _, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ _
        ]
    ): Unit = js.native
    
    /**
      * @hidden
      */
    var dispatcher_ : js.Any = js.native
  }
  object HashMapCollection {
    
    /* was `typeof CollectionEvent` */
    @JSImport("ecol/lib/maps/HashMapCollection", "HashMapCollection.Event")
    @js.native
    class Event[T, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ js.Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */] protected () extends CollectionEvent[T, SourceT, IteratorT, ReverseT] {
      def this(`type`: String, first: IteratorT, last: IteratorT) = this()
    }
    /* was `typeof CollectionEvent` */
    object Event
    
    type Listener[Key, T] = typings.ecol.collectionEventMod.CollectionEvent.Listener[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entry<Key, T> */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMap<Key, T> */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMap.Iterator<Key, T> */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMap.ReverseIterator<Key, T> */ js.Any
      ]
  }
}
