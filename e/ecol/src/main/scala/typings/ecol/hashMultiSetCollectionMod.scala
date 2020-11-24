package typings.ecol

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import typings.ecol.collectionEventMod.CollectionEvent
import typings.ecol.ieventdispatcherMod.IEventDispatcher
import typings.tstl.anon.Iteratoranyanyany
import typings.tstl.hashMultiSetMod.HashMultiSet
import typings.tstl.hashMultiSetMod.HashMultiSet.Iterator
import typings.tstl.hashMultiSetMod.HashMultiSet.ReverseIterator
import typings.tstl.icontainerMod.IContainer
import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.setContainerMod.SetContainer
import typings.tstl.setContainerMod.SetContainer.InsertRet
import typings.tstl.tstlBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ecol/lib/sets/HashMultiSetCollection", JSImport.Namespace)
@js.native
object hashMultiSetCollectionMod extends js.Object {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.tstl.isizeMod.ISize because Already inherited
  - typings.tstl.iforwardcontainerMod.IForwardContainer because Already inherited
  - typings.tstl.ipushMod.IPush because Already inherited
  - typings.tstl.iemptyMod.IEmpty because Already inherited
  - typings.std.Iterable because Already inherited
  - typings.tstl.ibidirectionalcontainerMod.IBidirectionalContainer because Already inherited
  - typings.tstl.icontainerMod.IContainer because Already inherited
  - typings.ecol.icollectionMod.ICollection because var conflicts: iterator, iterator_IContainer_. Inlined refresh, refresh, refresh */ @js.native
  class HashMultiSetCollection[T] ()
    extends HashMultiSet[T]
       with IEventDispatcher[T, HashMultiSet[T], Iterator[T], ReverseIterator[T]] {
    
    /* InferMemberOverrides */
    /* protected */ override def _Erase_by_range(first: Iterator[T]): Iterator[T] = js.native
    /* InferMemberOverrides */
    /* protected */ override def _Erase_by_range(first: Iterator[T], last: Iterator[T]): Iterator[T] = js.native
    
    /* InferMemberOverrides */
    /* protected */ override def _Erase_by_val(key: T): Double = js.native
    
    /* InferMemberOverrides */
    /* protected */ override def _Handle_erase(first: Iterator[T], last: Iterator[T]): Unit = js.native
    
    /* InferMemberOverrides */
    /* protected */ override def _Handle_insert(first: Iterator[T], last: Iterator[T]): Unit = js.native
    
    /* InferMemberOverrides */
    /* protected */ override def _Insert_by_hint(hint: Iterator[T], key: T): Iterator[T] = js.native
    
    /* InferMemberOverrides */
    /* protected */ override def _Insert_by_key(key: T): InsertRet[T, `false`, HashMultiSet[T], Iterator[T], ReverseIterator[T]] = js.native
    
    /* InferMemberOverrides */
    /* protected */ override def _Insert_by_range[InputIterator /* <: IForwardIterator[T, InputIterator] */](begin: InputIterator, end: InputIterator): Unit = js.native
    
    /* InferMemberOverrides */
    /* protected */ override def _Key_eq(x: T, y: T): Boolean = js.native
    
    /**
      * Range Assigner.
      *
      * @param first Input iteartor of the first position.
      * @param last Input iterator of the last position.
      */
    /* InferMemberOverrides */
    override def assign[InputIterator /* <: IForwardIterator[T, InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
    
    /**
      * @inheritDoc
      */
    /* InferMemberOverrides */
    override def clear(): Unit = js.native
    
    /**
      * @inheritDoc
      */
    /**
      * Count elements with a specified key.
      *
      * @param key Key to search for.
      * @return Number of elements with the specified key.
      */
    /* InferMemberOverrides */
    override def count(key: T): Double = js.native
    
    /**
      * @hidden
      */
    var dispatcher_ : js.Any = js.native
    
    /**
      * Erase elements in range.
      *
      * @param first Range of the first position to erase.
      * @param last Rangee of the last position to erase.
      * @return Iterator following the last removed element, strained by the erasing.
      */
    /* InferMemberOverrides */
    override def erase(first: Iterator[T], last: Iterator[T]): Iterator[T] = js.native
    /**
      * Erase an element.
      *
      * @param pos Position to erase.
      * @return Iterator following the *pos*, strained by the erasing.
      */
    /* InferMemberOverrides */
    override def erase(pos: Iterator[T]): Iterator[T] = js.native
    /**
      * @inheritDoc
      */
    /* InferMemberOverrides */
    @JSName("erase")
    override def erase_IteratorT(pos: Iterator[T]): Iterator[T] = js.native
    
    /**
      * @inheritDoc
      */
    /**
      * Get iterator to element.
      *
      * @param key Key to search for.
      * @return An iterator to the element, if the specified key is found, otherwise `this.end()`.
      */
    /* InferMemberOverrides */
    override def find(key: T): Iterator[T] = js.native
    
    /**
      * @inheritDoc
      */
    /**
      * Test whether a key exists.
      *
      * @param key Key to search for.
      * @return Whether the specified key exists.
      */
    /* InferMemberOverrides */
    override def has(key: T): Boolean = js.native
    
    /* InferMemberOverrides */
    override def insert(hint: Iterator[T], key: T): Iterator[T] = js.native
    /* InferMemberOverrides */
    override def insert(key: T): InsertRet[T, `false`, HashMultiSet[T], Iterator[T], ReverseIterator[T]] = js.native
    /* InferMemberOverrides */
    @JSName("insert")
    override def insert_InputIterator_IForwardIteratorKeyInputIterator_Unit[InputIterator /* <: IForwardIterator[T, InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
    
    /**
      * @inheritDoc
      */
    /* InferMemberOverrides */
    override def merge(source: HashMultiSet[T]): Unit = js.native
    
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
    
    /**
      * Swap elements.
      *
      * @param obj Target container to swap.
      */
    /* InferMemberOverrides */
    override def swap(obj: HashMultiSet[T]): Unit = js.native
    
    /**
      * Native function for `JSON.stringify()`.
      *
      * @return An array containing children elements.
      */
    /* InferMemberOverrides */
    override def toJSON(): js.Array[T] = js.native
  }
  @js.native
  object HashMultiSetCollection extends js.Object {
    
    val Event: Instantiable3[
        /* type */ String, 
        /* import warning: RewrittenClass.unapply cls was tparam IteratorT */ /* first */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam IteratorT */ /* last */ js.Any, 
        CollectionEvent[
          js.Object, 
          IContainer[
            /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam SourceT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam IteratorT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam ReverseT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any
          ], 
          typings.tstl.icontainerMod.IContainer.Iterator[
            /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam SourceT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam IteratorT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam ReverseT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any
          ], 
          typings.tstl.icontainerMod.IContainer.ReverseIterator[
            /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam SourceT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam IteratorT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam ReverseT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any
          ]
        ]
      ] = js.native
    
    val Iterator: Instantiable0[
        typings.tstl.setElementListMod.SetElementList.Iterator[
          js.Object, 
          Boolean, 
          SetContainer[
            /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any, 
            Iteratoranyanyany, 
            typings.tstl.setElementListMod.SetElementList.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    
    val ReverseIterator: Instantiable0[
        typings.tstl.setElementListMod.SetElementList.ReverseIterator[
          js.Object, 
          Boolean, 
          SetContainer[
            /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any, 
            Iteratoranyanyany, 
            typings.tstl.setElementListMod.SetElementList.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    
    type Event[T] = CollectionEvent[
        T, 
        HashMultiSet[T], 
        typings.tstl.hashMultiSetMod.HashMultiSet.Iterator[T], 
        typings.tstl.hashMultiSetMod.HashMultiSet.ReverseIterator[T]
      ]
    
    /**
      * Iterator of {@link HashMultiSet}
      */
    type Iterator[Key] = typings.tstl.setElementListMod.SetElementList.Iterator[Key, typings.ecol.ecolBooleans.`false`, HashMultiSet[Key]]
    
    type Listener[T] = typings.ecol.collectionEventMod.CollectionEvent.Listener[
        T, 
        HashMultiSet[T], 
        typings.tstl.hashMultiSetMod.HashMultiSet.Iterator[T], 
        typings.tstl.hashMultiSetMod.HashMultiSet.ReverseIterator[T]
      ]
    
    /**
      * Reverse iterator of {@link HashMultiSet}
      */
    type ReverseIterator[Key] = typings.tstl.setElementListMod.SetElementList.ReverseIterator[Key, typings.ecol.ecolBooleans.`false`, HashMultiSet[Key]]
  }
}
