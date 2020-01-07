package typings.ecol

import org.scalablytyped.runtime.Instantiable3
import typings.ecol.libBasicCollectionEventMod.CollectionEvent
import typings.ecol.libBasicCollectionEventMod.CollectionEvent.Listener
import typings.ecol.libBasicCollectionEventMod.CollectionEvent.Type
import typings.ecol.libBasicIEventDispatcherMod.IEventDispatcher
import typings.tstl.baseContainerIContainerMod.IContainer
import typings.tstl.containerVectorMod.Vector
import typings.tstl.containerVectorMod.Vector.Iterator
import typings.tstl.containerVectorMod.Vector.ReverseIterator
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typings.tstl.tstlMod.base.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecol/lib/linear/VectorCollection", JSImport.Namespace)
@js.native
object libLinearVectorCollectionMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.tstl.baseContainerContainerMod.Container because Inheritance from two classes. Inlined 
  - typings.ecol.libBasicICollectionMod.ICollection because Inheritance from two classes. Inlined refresh, refresh, refresh */ @js.native
  class ArrayCollection[T] ()
    extends Vector[T]
       with IEventDispatcher[T, Vector[T], Iterator[T], ReverseIterator[T]]
       with IContainer[T, Vector[T], Iterator[T], ReverseIterator[T], T] {
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
    override def addEventListener(`type`: Type, listener: Listener[T, Vector[T], Iterator[T], ReverseIterator[T]]): Unit = js.native
    /* CompleteClass */
    override def dispatchEvent(event: CollectionEvent[T, Vector[T], Iterator[T], ReverseIterator[T]]): Unit = js.native
    /* CompleteClass */
    override def hasEventListener(`type`: Type): Boolean = js.native
    /**
      * @inheritdoc
      */
    def pop_back(): Unit = js.native
    /**
      * @inheritdoc
      */
    def push_back(`val`: T): Unit = js.native
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
    override def removeEventListener(`type`: Type, listener: Listener[T, Vector[T], Iterator[T], ReverseIterator[T]]): Unit = js.native
    /**
      * @inheritDoc
      */
    def set(index: Double, `val`: T): Unit = js.native
  }
  
  @js.native
  object ArrayCollection extends js.Object {
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
        Vector[T], 
        typings.tstl.containerVectorMod.Vector.Iterator[T], 
        typings.tstl.containerVectorMod.Vector.ReverseIterator[T]
      ]
    type Iterator[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArrayIterator<T, Vector<T>> */ js.Any
    type Listener[T] = typings.ecol.libBasicCollectionEventMod.CollectionEvent.Listener[
        T, 
        Vector[T], 
        typings.tstl.containerVectorMod.Vector.Iterator[T], 
        typings.tstl.containerVectorMod.Vector.ReverseIterator[T]
      ]
    type ReverseIterator[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArrayReverseIterator<T, Vector<T>> */ js.Any
  }
  
}

