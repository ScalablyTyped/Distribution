package typings.ecol

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import typings.ecol.collectionEventMod.CollectionEvent
import typings.ecol.collectionEventMod.CollectionEvent.Listener
import typings.ecol.collectionEventMod.CollectionEvent.Type
import typings.ecol.ieventdispatcherMod.IEventDispatcher
import typings.tstl.entryMod.Entry
import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.ipairMod.IPair
import typings.tstl.mapContainerMod.MapContainer
import typings.tstl.mapContainerMod.MapContainer.InsertRet
import typings.tstl.mod.base.Container
import typings.tstl.treeMapMod.TreeMap
import typings.tstl.treeMapMod.TreeMap.Iterator
import typings.tstl.treeMapMod.TreeMap.ReverseIterator
import typings.tstl.tstlBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecol/lib/maps/TreeMapCollection", JSImport.Namespace)
@js.native
object treeMapCollectionMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.tstl.isizeMod.ISize because Already inherited
  - typings.tstl.iforwardcontainerMod.IForwardContainer because Already inherited
  - typings.tstl.ipushMod.IPush because Already inherited
  - typings.tstl.iemptyMod.IEmpty because Already inherited
  - typings.std.Iterable because Already inherited
  - typings.tstl.ibidirectionalcontainerMod.IBidirectionalContainer because Already inherited
  - typings.tstl.icontainerMod.IContainer because Already inherited
  - typings.tstl.containerContainerMod.Container because Inheritance from two classes. Inlined begin, empty, end, push, rbegin, rend, size
  - typings.ecol.icollectionMod.ICollection because Inheritance from two classes. Inlined refresh, refresh, refresh */ @js.native
  class TreeMapCollection[Key, T] ()
    extends TreeMap[Key, T]
       with IEventDispatcher[Entry[Key, T], TreeMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]] {
    /**
      * @hidden
      */
    var dispatcher_ : js.Any = js.native
    /* InferMemberOverrides */
    /* protected */ override def _Erase_by_key(key: Key): Double = js.native
    /* InferMemberOverrides */
    /* protected */ override def _Erase_by_range(first: Iterator[Key, T]): Iterator[Key, T] = js.native
    /* InferMemberOverrides */
    /* protected */ override def _Erase_by_range(first: Iterator[Key, T], last: Iterator[Key, T]): Iterator[Key, T] = js.native
    /* InferMemberOverrides */
    /* protected */ override def _Handle_erase(first: Iterator[Key, T], last: Iterator[Key, T]): Unit = js.native
    /* InferMemberOverrides */
    /* protected */ override def _Handle_insert(first: Iterator[Key, T], last: Iterator[Key, T]): Unit = js.native
    /* InferMemberOverrides */
    /* protected */ override def _Insert_by_range[InputIterator /* <: IForwardIterator[IPair[Key, T], InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
    /* CompleteClass */
    override def addEventListener(
      `type`: Type,
      listener: Listener[Entry[Key, T], TreeMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]]
    ): Unit = js.native
    /**
      * Range Assigner.
      *
      * @param first Input iteartor of the first position.
      * @param last Input iterator of the last position.
      */
    /* InferMemberOverrides */
    override def assign[InputIterator /* <: IForwardIterator[IPair[Key, T], InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
    /**
      * Iterator to the first element.
      *
      * @return Iterator to the first element.
      */
    /* InferMemberOverrides */
    override def begin(): typings.tstl.icontainerMod.IContainer.Iterator[Entry[Key, T], TreeMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T], IPair[Key, T]] = js.native
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
    override def count(key: Key): Double = js.native
    /* CompleteClass */
    override def dispatchEvent(event: CollectionEvent[Entry[Key, T], TreeMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]]): Unit = js.native
    /* InferMemberOverrides */
    override def emplace(key: Key, `val`: T): InsertRet[Key, T, `true`, TreeMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]] = js.native
    /* InferMemberOverrides */
    override def emplace_hint(hint: Iterator[Key, T], key: Key, `val`: T): Iterator[Key, T] = js.native
    /**
      * Test whether container is empty.
      */
    /* InferMemberOverrides */
    override def empty(): Boolean = js.native
    /**
      * Iterator to the end.
      *
      * @return Iterator to the end.
      */
    /* InferMemberOverrides */
    override def end(): typings.tstl.icontainerMod.IContainer.Iterator[Entry[Key, T], TreeMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T], IPair[Key, T]] = js.native
    /**
      * Erase elements in range.
      *
      * @param first Range of the first position to erase.
      * @param last Rangee of the last position to erase.
      * @return Iterator following the last removed element, strained by the erasing.
      */
    /* InferMemberOverrides */
    override def erase(first: Iterator[Key, T], last: Iterator[Key, T]): Iterator[Key, T] = js.native
    /**
      * Erase an element.
      *
      * @param pos Position to erase.
      * @return Iterator following the *pos*, strained by the erasing.
      */
    /* InferMemberOverrides */
    override def erase(pos: Iterator[Key, T]): Iterator[Key, T] = js.native
    /**
      * @inheritDoc
      */
    /* InferMemberOverrides */
    @JSName("erase")
    override def erase_IteratorT(it: Iterator[Key, T]): Iterator[Key, T] = js.native
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
    override def find(key: Key): Iterator[Key, T] = js.native
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
    override def has(key: Key): Boolean = js.native
    /* CompleteClass */
    override def hasEventListener(`type`: Type): Boolean = js.native
    /* InferMemberOverrides */
    override def insert(hint: Iterator[Key, T], pair: IPair[Key, T]): Iterator[Key, T] = js.native
    /* InferMemberOverrides */
    override def insert(pair: IPair[Key, T]): InsertRet[Key, T, `true`, TreeMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]] = js.native
    /* InferMemberOverrides */
    override def insert[InputIterator /* <: IForwardIterator[IPair[Key, T], InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
    /**
      * Merge two containers.
      *
      * @param source Source container to transfer.
      */
    /* InferMemberOverrides */
    override def merge(source: TreeMap[Key, T]): Unit = js.native
    /**
      * Insert items at the end.
      *
      * @param items Items to insert.
      * @return Number of elements in the container after insertion.
      */
    /* InferMemberOverrides */
    override def push(items: (IPair[Key, T])*): Double = js.native
    /**
      * Reverse iterator to the first element in reverse.
      *
      * @return Reverse iterator to the first.
      */
    /* InferMemberOverrides */
    override def rbegin(): ReverseIterator[Key, T] = js.native
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
      listener: Listener[Entry[Key, T], TreeMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]]
    ): Unit = js.native
    /**
      * Reverse iterator to the reverse end.
      *
      * @return Reverse iterator to the end.
      */
    /* InferMemberOverrides */
    override def rend(): ReverseIterator[Key, T] = js.native
    /**
      * Number of elements in the container.
      */
    /* InferMemberOverrides */
    override def size(): Double = js.native
    /**
      * Swap elements.
      *
      * @param obj Target container to swap.
      */
    /* InferMemberOverrides */
    override def swap(obj: TreeMap[Key, T]): Unit = js.native
    /**
      * Native function for `JSON.stringify()`.
      *
      * @return An array containing children elements.
      */
    /* InferMemberOverrides */
    override def toJSON(): js.Array[Entry[Key, T]] = js.native
  }
  
  @js.native
  object TreeMapCollection extends js.Object {
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
    val Iterator: Instantiable0[
        typings.tstl.mapElementListMod.MapElementList.Iterator[
          js.Object, 
          js.Object, 
          Boolean, 
          MapContainer[
            /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any, 
            typings.tstl.mapElementListMod.MapElementList.Iterator[
              /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
            ], 
            typings.tstl.mapElementListMod.MapElementList.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    val ReverseIterator: Instantiable0[
        typings.tstl.mapElementListMod.MapElementList.ReverseIterator[
          js.Object, 
          js.Object, 
          Boolean, 
          MapContainer[
            /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any, 
            typings.tstl.mapElementListMod.MapElementList.Iterator[
              /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
            ], 
            typings.tstl.mapElementListMod.MapElementList.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    type Event[Key, T] = CollectionEvent[
        Entry[Key, T], 
        TreeMap[Key, T], 
        typings.tstl.treeMapMod.TreeMap.Iterator[Key, T], 
        typings.tstl.treeMapMod.TreeMap.ReverseIterator[Key, T]
      ]
    /**
      * Iterator of {@link TreeMap}
      */
    type Iterator[Key, T] = typings.tstl.mapElementListMod.MapElementList.Iterator[Key, T, typings.ecol.ecolBooleans.`true`, TreeMap[Key, T]]
    type Listener[Key, T] = typings.ecol.collectionEventMod.CollectionEvent.Listener[
        Entry[Key, T], 
        TreeMap[Key, T], 
        typings.tstl.treeMapMod.TreeMap.Iterator[Key, T], 
        typings.tstl.treeMapMod.TreeMap.ReverseIterator[Key, T]
      ]
    /**
      * Reverse iterator of {@link TreeMap}
      */
    type ReverseIterator[Key, T] = typings.tstl.mapElementListMod.MapElementList.ReverseIterator[Key, T, typings.ecol.ecolBooleans.`true`, TreeMap[Key, T]]
  }
  
}

