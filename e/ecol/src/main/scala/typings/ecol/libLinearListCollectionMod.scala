package typings.ecol

import org.scalablytyped.runtime.Instantiable3
import typings.ecol.libBasicCollectionEventMod.CollectionEvent
import typings.ecol.libBasicCollectionEventMod.CollectionEvent.Listener
import typings.ecol.libBasicCollectionEventMod.CollectionEvent.Type
import typings.ecol.libBasicIEventDispatcherMod.IEventDispatcher
import typings.tstl.containerListMod.List
import typings.tstl.containerListMod.List.Iterator
import typings.tstl.containerListMod.List.ReverseIterator
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typings.tstl.tstlMod.base.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecol/lib/linear/ListCollection", JSImport.Namespace)
@js.native
object libLinearListCollectionMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.std.Iterable because Already inherited
  - typings.tstl.baseContainerIContainerMod.IContainer because Already inherited
  - typings.tstl.baseContainerContainerMod.Container because Inheritance from two classes. Inlined 
  - typings.ecol.libBasicICollectionMod.ICollection because Inheritance from two classes. Inlined refresh, refresh, refresh */ @js.native
  class ListCollection[T] ()
    extends List[T]
       with IEventDispatcher[T, List[T], Iterator[T], ReverseIterator[T]] {
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
      * @hidden
      */
    /* protected */ def _Erase_by_range(first: Iterator[T], last: Iterator[T]): Iterator[T] = js.native
    /**
      * @hidden
      */
    /* protected */ def _Insert_by_range[U /* <: T */, InputIterator /* <: IForwardIterator[U, InputIterator] */](pos: Iterator[T], first: InputIterator, last: InputIterator): Iterator[T] = js.native
    /* CompleteClass */
    override def addEventListener(`type`: Type, listener: Listener[T, List[T], Iterator[T], ReverseIterator[T]]): Unit = js.native
    /* CompleteClass */
    override def dispatchEvent(event: CollectionEvent[T, List[T], Iterator[T], ReverseIterator[T]]): Unit = js.native
    /* CompleteClass */
    override def hasEventListener(`type`: Type): Boolean = js.native
    /**
      * Erase the first element.
      */
    /* CompleteClass */
    /* InferMemberOverrides */
    override def pop_front(): Unit = js.native
    /**
      * @inheritDoc
      */
    /* CompleteClass */
    /* InferMemberOverrides */
    override def push_front(`val`: T): Unit = js.native
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
    override def removeEventListener(`type`: Type, listener: Listener[T, List[T], Iterator[T], ReverseIterator[T]]): Unit = js.native
  }
  
  @js.native
  object ListCollection extends js.Object {
    /**
      * Iterator of the List.
      *
      * @author Jeongho Nam <http://samchon.org>
      */
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ListIterator<T, List<T>, Iterator<T>, ReverseIterator<T>, T> * / any */ @js.native
    /**
      * @hidden
      */
    class Iterator[T] protected () extends js.Object {
      /**
        * @hidden
        */
      var source_ptr_ : js.Any = js.native
      def equals(obj: typings.tstl.containerListMod.List.Iterator[T]): Boolean = js.native
      /**
        * @inheritDoc
        */
      def reverse(): typings.tstl.containerListMod.List.ReverseIterator[T] = js.native
      /**
        * @inheritDoc
        */
      def source(): List[T] = js.native
      /**
        * @inheritDoc
        */
      def value(): T = js.native
      /**
        * @inheritDoc
        */
      def value(`val`: T): js.Any = js.native
    }
    
    /**
      * Reverse iterator of the List.
      *
      * @author Jeongho Nam <http://samchon.org>
      */
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReverseIteratorBase<T, List<T>, Iterator<T>, ReverseIterator<T>, T> * / any */ @js.native
    class ReverseIterator[T] () extends js.Object {
      /**
        * @hidden
        */
      /* protected */ def _Create_neighbor(base: typings.tstl.containerListMod.List.Iterator[T]): typings.tstl.containerListMod.List.ReverseIterator[T] = js.native
      /**
        * @inheritDoc
        */
      def value(): T = js.native
      /**
        * @inheritDoc
        */
      def value(`val`: T): js.Any = js.native
    }
    
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
    type Event[T] = CollectionEvent[
        T, 
        List[T], 
        typings.tstl.containerListMod.List.Iterator[T], 
        typings.tstl.containerListMod.List.ReverseIterator[T]
      ]
    type Listener[T] = typings.ecol.libBasicCollectionEventMod.CollectionEvent.Listener[
        T, 
        List[T], 
        typings.tstl.containerListMod.List.Iterator[T], 
        typings.tstl.containerListMod.List.ReverseIterator[T]
      ]
  }
  
}

