package typings.ecol

import org.scalablytyped.runtime.Instantiable3
import typings.ecol.libBasicCollectionEventMod.CollectionEvent
import typings.ecol.libBasicCollectionEventMod.CollectionEvent.Listener
import typings.ecol.libBasicCollectionEventMod.CollectionEvent.Type
import typings.ecol.libBasicIEventDispatcherMod.IEventDispatcher
import typings.tstl.baseContainerIContainerMod.IContainer
import typings.tstl.containerTreeSetMod.TreeSet
import typings.tstl.containerTreeSetMod.TreeSet.Iterator
import typings.tstl.containerTreeSetMod.TreeSet.ReverseIterator
import typings.tstl.tstlMod.base.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecol/lib/sets/TreeSetCollection", JSImport.Namespace)
@js.native
object libSetsTreeSetCollectionMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.tstl.baseContainerContainerMod.Container because Inheritance from two classes. Inlined 
  - typings.ecol.libBasicICollectionMod.ICollection because Inheritance from two classes. Inlined refresh, refresh, refresh */ @js.native
  class TreeSetCollection[T] ()
    extends TreeSet[T]
       with IEventDispatcher[T, TreeSet[T], Iterator[T], ReverseIterator[T]]
       with IContainer[T, TreeSet[T], Iterator[T], ReverseIterator[T], T] {
    /**
      * @hidden
      */
    var dispatcher_ : js.Any = js.native
    /* CompleteClass */
    override def addEventListener(`type`: Type, listener: Listener[T, TreeSet[T], Iterator[T], ReverseIterator[T]]): Unit = js.native
    /**
      * @inheritDoc
      */
    /* InferMemberOverrides */
    override def clear(): Unit = js.native
    /* CompleteClass */
    override def dispatchEvent(event: CollectionEvent[T, TreeSet[T], Iterator[T], ReverseIterator[T]]): Unit = js.native
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
    override def removeEventListener(`type`: Type, listener: Listener[T, TreeSet[T], Iterator[T], ReverseIterator[T]]): Unit = js.native
    /**
      * @inheritDoc
      */
    /* InferMemberOverrides */
    override def swap(obj: TreeSet[T]): Unit = js.native
  }
  
  @js.native
  object TreeSetCollection extends js.Object {
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
        TreeSet[T], 
        typings.tstl.containerTreeSetMod.TreeSet.Iterator[T], 
        typings.tstl.containerTreeSetMod.TreeSet.ReverseIterator[T]
      ]
    type Iterator[Key] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SetElementList.Iterator<Key, true, TreeSet<Key>> */ js.Any
    type Listener[T] = typings.ecol.libBasicCollectionEventMod.CollectionEvent.Listener[
        T, 
        TreeSet[T], 
        typings.tstl.containerTreeSetMod.TreeSet.Iterator[T], 
        typings.tstl.containerTreeSetMod.TreeSet.ReverseIterator[T]
      ]
    type ReverseIterator[Key] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SetElementList.ReverseIterator<Key, true, TreeSet<Key>> */ js.Any
  }
  
}

