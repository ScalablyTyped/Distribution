package typings.ecol

import org.scalablytyped.runtime.Instantiable3
import typings.ecol.libBasicCollectionEventMod.CollectionEvent
import typings.ecol.libBasicCollectionEventMod.CollectionEvent.Listener
import typings.ecol.libBasicCollectionEventMod.CollectionEvent.Type
import typings.ecol.libBasicIEventDispatcherMod.IEventDispatcher
import typings.std.IterableIterator
import typings.tstl.containerDequeMod.Deque
import typings.tstl.containerDequeMod.Deque.Iterator
import typings.tstl.containerDequeMod.Deque.ReverseIterator
import typings.tstl.tstlMod.base.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecol/lib/linear/DequeCollection", JSImport.Namespace)
@js.native
object libLinearDequeCollectionMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.std.Iterable because var conflicts: iterator. Inlined 
  - typings.tstl.baseContainerIContainerMod.IContainer because var conflicts: iterator. Inlined iterator_IContainer, begin, empty, end, erase, erase, rbegin, rend, toJSON
  - typings.tstl.baseContainerContainerMod.Container because Inheritance from two classes. Inlined 
  - typings.ecol.libBasicICollectionMod.ICollection because Inheritance from two classes. Inlined refresh, refresh, refresh */ @js.native
  class DequeCollection[T] ()
    extends Deque[T]
       with IEventDispatcher[T, Deque[T], Iterator[T], ReverseIterator[T]] {
    /**
      * @hidden
      */
    var _Notify_erase: js.Any = js.native
    /**
      * @hidden
      */
    var _Notify_insert: js.Any = js.native
    /**
      * @hidden
      */
    var dispatcher_ : js.Any = js.native
    /**
      * @inheritDoc
      */
    @JSName(scala.scalajs.js.Symbol.iterator)
    var iterator_IContainer: js.Function0[IterableIterator[T]] = js.native
    /* CompleteClass */
    override def addEventListener(`type`: Type, listener: Listener[T, Deque[T], Iterator[T], ReverseIterator[T]]): Unit = js.native
    /**
      * @inheritDoc
      */
    def begin(): Iterator[T] = js.native
    /* CompleteClass */
    override def dispatchEvent(event: CollectionEvent[T, Deque[T], Iterator[T], ReverseIterator[T]]): Unit = js.native
    /**
      * @inheritDoc
      */
    def empty(): Boolean = js.native
    /**
      * @inheritDoc
      */
    def end(): Iterator[T] = js.native
    /**
      * Erase elements in range.
      *
      * @param first Range of the first position to erase.
      * @param last Rangee of the last position to erase.
      * @return Iterator following the last removed element, strained by the erasing.
      */
    def erase(first: Iterator[T], last: Iterator[T]): Iterator[T] = js.native
    /**
      * Erase an element.
      *
      * @param pos Position to erase.
      * @return Iterator following the *pos*, strained by the erasing.
      */
    def erase(pos: Iterator[T]): Iterator[T] = js.native
    /* CompleteClass */
    override def hasEventListener(`type`: Type): Boolean = js.native
    /**
      * @inheritDoc
      */
    def rbegin(): ReverseIterator[T] = js.native
    /**
      * @inheritdoc
      */
    def refresh(): Unit = js.native
    /**
      * @inheritdoc
      */
    def refresh(first: Iterator[T], last: Iterator[T]): Unit = js.native
    /**
      * @inheritdoc
      */
    def refresh(it: Iterator[T]): Unit = js.native
    /* CompleteClass */
    override def removeEventListener(`type`: Type, listener: Listener[T, Deque[T], Iterator[T], ReverseIterator[T]]): Unit = js.native
    /**
      * @inheritDoc
      */
    def rend(): ReverseIterator[T] = js.native
    /**
      * Native function for `JSON.stringify()`.
      *
      * @return An array containing children elements.
      */
    def toJSON(): js.Array[T] = js.native
  }
  
  @js.native
  object DequeCollection extends js.Object {
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
    val Iterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrayIterator */ js.Any = js.native
    val ReverseIterator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrayReverseIterator */ js.Any = js.native
    type Event[T] = CollectionEvent[
        T, 
        Deque[T], 
        typings.tstl.containerDequeMod.Deque.Iterator[T], 
        typings.tstl.containerDequeMod.Deque.ReverseIterator[T]
      ]
    type Iterator[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArrayIterator<T, Deque<T>> */ js.Any
    type Listener[T] = typings.ecol.libBasicCollectionEventMod.CollectionEvent.Listener[
        T, 
        Deque[T], 
        typings.tstl.containerDequeMod.Deque.Iterator[T], 
        typings.tstl.containerDequeMod.Deque.ReverseIterator[T]
      ]
    type ReverseIterator[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArrayReverseIterator<T, Deque<T>> */ js.Any
  }
  
}

