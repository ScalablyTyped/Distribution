package typings.ecol

import org.scalablytyped.runtime.Instantiable3
import typings.ecol.libBasicCollectionEventMod.CollectionEvent
import typings.ecol.libBasicCollectionEventMod.CollectionEvent.Listener
import typings.ecol.libBasicCollectionEventMod.CollectionEvent.Type
import typings.ecol.libBasicIEventDispatcherMod.IEventDispatcher
import typings.tstl.containerHashMultiMapMod.HashMultiMap
import typings.tstl.containerHashMultiMapMod.HashMultiMap.Iterator
import typings.tstl.containerHashMultiMapMod.HashMultiMap.ReverseIterator
import typings.tstl.tstlMod.base.Container
import typings.tstl.utilityEntryMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecol/lib/maps/HashMultiMapCollection", JSImport.Namespace)
@js.native
object libMapsHashMultiMapCollectionMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.std.Iterable because Already inherited
  - typings.tstl.baseContainerIContainerMod.IContainer because Already inherited
  - typings.tstl.baseContainerContainerMod.Container because Inheritance from two classes. Inlined 
  - typings.ecol.libBasicICollectionMod.ICollection because Inheritance from two classes. Inlined refresh, refresh, refresh */ @js.native
  class HashMultiMapCollection[Key, T] ()
    extends HashMultiMap[Key, T]
       with IEventDispatcher[Entry[Key, T], HashMultiMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]] {
    /**
      * @hidden
      */
    var dispatcher_ : js.Any = js.native
    /* CompleteClass */
    override def addEventListener(
      `type`: Type,
      listener: Listener[Entry[Key, T], HashMultiMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]]
    ): Unit = js.native
    /* CompleteClass */
    override def dispatchEvent(
      event: CollectionEvent[Entry[Key, T], HashMultiMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]]
    ): Unit = js.native
    /* CompleteClass */
    override def hasEventListener(`type`: Type): Boolean = js.native
    /**
      * @inheritDoc
      */
    def refresh(): Unit = js.native
    /**
      * @inheritDoc
      */
    def refresh(first: Iterator[Key, T], last: Iterator[Key, T]): Unit = js.native
    /**
      * @inheritDoc
      */
    def refresh(it: Iterator[Key, T]): Unit = js.native
    /* CompleteClass */
    override def removeEventListener(
      `type`: Type,
      listener: Listener[Entry[Key, T], HashMultiMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]]
    ): Unit = js.native
  }
  
  @js.native
  object HashMultiMapCollection extends js.Object {
    val Event: Instantiable3[
        /* type */ String, 
        /* import warning: RewrittenClass.unapply cls was tparam IteratorT */ /* first */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam IteratorT */ /* last */ js.Any, 
        CollectionEvent[
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
    val Iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MapElementList.Iterator */ js.Any = js.native
    val ReverseIterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MapElementList.ReverseIterator */ js.Any = js.native
    type Event[Key, T] = CollectionEvent[
        Entry[Key, T], 
        HashMultiMap[Key, T], 
        typings.tstl.containerHashMultiMapMod.HashMultiMap.Iterator[Key, T], 
        typings.tstl.containerHashMultiMapMod.HashMultiMap.ReverseIterator[Key, T]
      ]
    type Iterator[Key, T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MapElementList.Iterator<Key, T, false, HashMultiMap<Key, T>> */ js.Any
    type Listener[Key, T] = typings.ecol.libBasicCollectionEventMod.CollectionEvent.Listener[
        Entry[Key, T], 
        HashMultiMap[Key, T], 
        typings.tstl.containerHashMultiMapMod.HashMultiMap.Iterator[Key, T], 
        typings.tstl.containerHashMultiMapMod.HashMultiMap.ReverseIterator[Key, T]
      ]
    type ReverseIterator[Key, T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MapElementList.ReverseIterator<Key, T, false, HashMultiMap<Key, T>> */ js.Any
  }
  
}

