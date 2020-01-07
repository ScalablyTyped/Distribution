package typings.ecol

import org.scalablytyped.runtime.Instantiable3
import typings.ecol.libBasicCollectionEventMod.CollectionEvent
import typings.ecol.libBasicCollectionEventMod.CollectionEvent.Listener
import typings.ecol.libBasicCollectionEventMod.CollectionEvent.Type
import typings.ecol.libBasicIEventDispatcherMod.IEventDispatcher
import typings.tstl.containerHashMultiSetMod.HashMultiSet
import typings.tstl.containerHashMultiSetMod.HashMultiSet.Iterator
import typings.tstl.containerHashMultiSetMod.HashMultiSet.ReverseIterator
import typings.tstl.tstlMod.base.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecol/lib/sets/HashMultiSetCollection", JSImport.Namespace)
@js.native
object libSetsHashMultiSetCollectionMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.std.Iterable because Already inherited
  - typings.tstl.baseContainerIContainerMod.IContainer because Already inherited
  - typings.tstl.baseContainerContainerMod.Container because Already inherited
  - typings.ecol.libBasicICollectionMod.ICollection because var conflicts: iterator, iterator_IContainer. Inlined refresh, refresh, refresh */ @js.native
  class HashMultiSetCollection[T] ()
    extends HashMultiSet[T]
       with IEventDispatcher[T, HashMultiSet[T], Iterator[T], ReverseIterator[T]] {
    /**
      * @hidden
      */
    var dispatcher_ : js.Any = js.native
    /* CompleteClass */
    override def addEventListener(`type`: Type, listener: Listener[T, HashMultiSet[T], Iterator[T], ReverseIterator[T]]): Unit = js.native
    /* CompleteClass */
    override def dispatchEvent(event: CollectionEvent[T, HashMultiSet[T], Iterator[T], ReverseIterator[T]]): Unit = js.native
    /* CompleteClass */
    override def hasEventListener(`type`: Type): Boolean = js.native
    /**
      * @inheritDoc
      */
    def refresh(): Unit = js.native
    /**
      * @inheritDoc
      */
    def refresh(first: Iterator[T], last: Iterator[T]): Unit = js.native
    /**
      * @inheritDoc
      */
    def refresh(it: Iterator[T]): Unit = js.native
    /* CompleteClass */
    override def removeEventListener(`type`: Type, listener: Listener[T, HashMultiSet[T], Iterator[T], ReverseIterator[T]]): Unit = js.native
  }
  
  @js.native
  object HashMultiSetCollection extends js.Object {
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
    val Iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SetElementList.Iterator */ js.Any = js.native
    val ReverseIterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SetElementList.ReverseIterator */ js.Any = js.native
    type Event[T] = CollectionEvent[
        T, 
        HashMultiSet[T], 
        typings.tstl.containerHashMultiSetMod.HashMultiSet.Iterator[T], 
        typings.tstl.containerHashMultiSetMod.HashMultiSet.ReverseIterator[T]
      ]
    type Iterator[Key] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SetElementList.Iterator<Key, false, HashMultiSet<Key>> */ js.Any
    type Listener[T] = typings.ecol.libBasicCollectionEventMod.CollectionEvent.Listener[
        T, 
        HashMultiSet[T], 
        typings.tstl.containerHashMultiSetMod.HashMultiSet.Iterator[T], 
        typings.tstl.containerHashMultiSetMod.HashMultiSet.ReverseIterator[T]
      ]
    type ReverseIterator[Key] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SetElementList.ReverseIterator<Key, false, HashMultiSet<Key>> */ js.Any
  }
  
}

