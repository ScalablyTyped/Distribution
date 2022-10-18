package typings.ecol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ecol", "ArrayCollection")
  @js.native
  open class ArrayCollection[T] ()
    extends typings.ecol.libLinearArrayCollectionMod.ArrayCollection[T]
  object ArrayCollection {
    
    /* was `typeof CollectionEvent` */
    @JSImport("ecol", "ArrayCollection.Event")
    @js.native
    open class Event[T, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */] protected ()
      extends typings.ecol.libLinearArrayCollectionMod.ArrayCollection.Event[T, SourceT, IteratorT, ReverseT] {
      def this(`type`: String, first: IteratorT, last: IteratorT) = this()
    }
  }
  
  @JSImport("ecol", "CollectionEvent")
  @js.native
  open class CollectionEvent[T, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */] protected ()
    extends typings.ecol.libBasicCollectionEventMod.CollectionEvent[T, SourceT, IteratorT, ReverseT] {
    def this(`type`: String, first: IteratorT, last: IteratorT) = this()
  }
  
  @JSImport("ecol", "DequeCollection")
  @js.native
  open class DequeCollection[T] ()
    extends typings.ecol.libLinearDequeCollectionMod.DequeCollection[T]
  object DequeCollection {
    
    /* was `typeof CollectionEvent` */
    @JSImport("ecol", "DequeCollection.Event")
    @js.native
    open class Event[T, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */] protected ()
      extends typings.ecol.libLinearDequeCollectionMod.DequeCollection.Event[T, SourceT, IteratorT, ReverseT] {
      def this(`type`: String, first: IteratorT, last: IteratorT) = this()
    }
  }
  
  @JSImport("ecol", "EventDispatcher")
  @js.native
  open class EventDispatcher[T, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */] ()
    extends typings.ecol.libBasicEventDispatcherMod.EventDispatcher[T, SourceT, IteratorT, ReverseT]
  
  @JSImport("ecol", "HashMapCollection")
  @js.native
  open class HashMapCollection[Key, T] ()
    extends typings.ecol.libMapsHashMapCollectionMod.HashMapCollection[Key, T]
  object HashMapCollection {
    
    /* was `typeof CollectionEvent` */
    @JSImport("ecol", "HashMapCollection.Event")
    @js.native
    open class Event[T, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */] protected ()
      extends typings.ecol.libMapsHashMapCollectionMod.HashMapCollection.Event[T, SourceT, IteratorT, ReverseT] {
      def this(`type`: String, first: IteratorT, last: IteratorT) = this()
    }
  }
  
  @JSImport("ecol", "HashMultiMapCollection")
  @js.native
  open class HashMultiMapCollection[Key, T] ()
    extends typings.ecol.libMapsHashMultiMapCollectionMod.HashMultiMapCollection[Key, T]
  object HashMultiMapCollection {
    
    /* was `typeof CollectionEvent` */
    @JSImport("ecol", "HashMultiMapCollection.Event")
    @js.native
    open class Event[T, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */] protected ()
      extends typings.ecol.libMapsHashMultiMapCollectionMod.HashMultiMapCollection.Event[T, SourceT, IteratorT, ReverseT] {
      def this(`type`: String, first: IteratorT, last: IteratorT) = this()
    }
  }
  
  @JSImport("ecol", "HashMultiSetCollection")
  @js.native
  open class HashMultiSetCollection[T] ()
    extends typings.ecol.libSetsHashMultiSetCollectionMod.HashMultiSetCollection[T]
  object HashMultiSetCollection {
    
    /* was `typeof CollectionEvent` */
    @JSImport("ecol", "HashMultiSetCollection.Event")
    @js.native
    open class Event[T, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */] protected ()
      extends typings.ecol.libSetsHashMultiSetCollectionMod.HashMultiSetCollection.Event[T, SourceT, IteratorT, ReverseT] {
      def this(`type`: String, first: IteratorT, last: IteratorT) = this()
    }
  }
  
  @JSImport("ecol", "HashSetCollection")
  @js.native
  open class HashSetCollection[T] ()
    extends typings.ecol.libSetsHashSetCollectionMod.HashSetCollection[T]
  object HashSetCollection {
    
    /* was `typeof CollectionEvent` */
    @JSImport("ecol", "HashSetCollection.Event")
    @js.native
    open class Event[T, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */] protected ()
      extends typings.ecol.libSetsHashSetCollectionMod.HashSetCollection.Event[T, SourceT, IteratorT, ReverseT] {
      def this(`type`: String, first: IteratorT, last: IteratorT) = this()
    }
  }
  
  @JSImport("ecol", "ListCollection")
  @js.native
  open class ListCollection[T] ()
    extends typings.ecol.libLinearListCollectionMod.ListCollection[T]
  object ListCollection {
    
    /* was `typeof CollectionEvent` */
    @JSImport("ecol", "ListCollection.Event")
    @js.native
    open class Event[T, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */] protected ()
      extends typings.ecol.libLinearListCollectionMod.ListCollection.Event[T, SourceT, IteratorT, ReverseT] {
      def this(`type`: String, first: IteratorT, last: IteratorT) = this()
    }
  }
  
  @JSImport("ecol", "TreeMapCollection")
  @js.native
  open class TreeMapCollection[Key, T] ()
    extends typings.ecol.libMapsTreeMapCollectionMod.TreeMapCollection[Key, T]
  object TreeMapCollection {
    
    /* was `typeof CollectionEvent` */
    @JSImport("ecol", "TreeMapCollection.Event")
    @js.native
    open class Event[T, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */] protected ()
      extends typings.ecol.libMapsTreeMapCollectionMod.TreeMapCollection.Event[T, SourceT, IteratorT, ReverseT] {
      def this(`type`: String, first: IteratorT, last: IteratorT) = this()
    }
  }
  
  @JSImport("ecol", "TreeMultiMapCollection")
  @js.native
  open class TreeMultiMapCollection[Key, T] ()
    extends typings.ecol.libMapsTreeMultiMapCollectionMod.TreeMultiMapCollection[Key, T]
  object TreeMultiMapCollection {
    
    /* was `typeof CollectionEvent` */
    @JSImport("ecol", "TreeMultiMapCollection.Event")
    @js.native
    open class Event[T, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */] protected ()
      extends typings.ecol.libMapsTreeMultiMapCollectionMod.TreeMultiMapCollection.Event[T, SourceT, IteratorT, ReverseT] {
      def this(`type`: String, first: IteratorT, last: IteratorT) = this()
    }
  }
  
  @JSImport("ecol", "TreeMultiSetCollection")
  @js.native
  open class TreeMultiSetCollection[T] ()
    extends typings.ecol.libSetsTreeMultiSetCollectionMod.TreeMultiSetCollection[T]
  object TreeMultiSetCollection {
    
    /* was `typeof CollectionEvent` */
    @JSImport("ecol", "TreeMultiSetCollection.Event")
    @js.native
    open class Event[T, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */] protected ()
      extends typings.ecol.libSetsTreeMultiSetCollectionMod.TreeMultiSetCollection.Event[T, SourceT, IteratorT, ReverseT] {
      def this(`type`: String, first: IteratorT, last: IteratorT) = this()
    }
  }
  
  @JSImport("ecol", "TreeSetCollection")
  @js.native
  open class TreeSetCollection[T] ()
    extends typings.ecol.libSetsTreeSetCollectionMod.TreeSetCollection[T]
  object TreeSetCollection {
    
    /* was `typeof CollectionEvent` */
    @JSImport("ecol", "TreeSetCollection.Event")
    @js.native
    open class Event[T, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */] protected ()
      extends typings.ecol.libSetsTreeSetCollectionMod.TreeSetCollection.Event[T, SourceT, IteratorT, ReverseT] {
      def this(`type`: String, first: IteratorT, last: IteratorT) = this()
    }
  }
}
