package typings.ecol

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import typings.ecol.libBasicCollectionEventMod.CollectionEvent
import typings.ecol.libBasicCollectionEventMod.CollectionEvent.Listener
import typings.ecol.libBasicCollectionEventMod.CollectionEvent.Type
import typings.ecol.libBasicIEventDispatcherMod.IEventDispatcher
import typings.tstl.baseContainerArrayContainerMod.ArrayContainer
import typings.tstl.baseIteratorArrayIteratorMod.ArrayIterator
import typings.tstl.baseIteratorArrayIteratorMod.ArrayReverseIterator
import typings.tstl.containerVectorMod.Vector
import typings.tstl.containerVectorMod.Vector.Iterator
import typings.tstl.containerVectorMod.Vector.ReverseIterator
import typings.tstl.tstlMod.base.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecol/lib/linear/VectorCollection", JSImport.Namespace)
@js.native
object libLinearVectorCollectionMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.tstl.baseDisposableIForwardContainerMod.IForwardContainer because Already inherited
  - typings.tstl.baseDisposableIPartialContainersMod._IPush because Already inherited
  - typings.tstl.baseDisposableIPartialContainersMod._ISize because Already inherited
  - typings.tstl.baseDisposableIPartialContainersMod._IEmpty because Already inherited
  - typings.std.Iterable because Already inherited
  - typings.tstl.baseDisposableIBidirectionalContainerMod.IBidirectionalContainer because Already inherited
  - typings.tstl.baseContainerIContainerMod.IContainer because Already inherited
  - typings.tstl.baseContainerContainerMod.Container because Already inherited
  - typings.tstl.baseMod.Container because Inheritance from two classes. Inlined 
  - typings.tstl.tstlMod.base.Container because Inheritance from two classes. Inlined 
  - typings.ecol.libBasicICollectionMod.ICollection because Inheritance from two classes. Inlined refresh, refresh, refresh */ @js.native
  class ArrayCollection[T] ()
    extends Vector[T]
       with IEventDispatcher[T, Vector[T], Iterator[T], ReverseIterator[T]] {
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
    /* CompleteClass */
    override def addEventListener(`type`: Type, listener: Listener[T, Vector[T], Iterator[T], ReverseIterator[T]]): Unit = js.native
    /**
      * Iterator to the first element.
      *
      * @return Iterator to the first element.
      */
    /* InferMemberOverrides */
    override def begin(): typings.tstl.baseIteratorIteratorMod.Iterator[T, Vector[T], Iterator[T], ReverseIterator[T], T] = js.native
    /* CompleteClass */
    override def dispatchEvent(event: CollectionEvent[T, Vector[T], Iterator[T], ReverseIterator[T]]): Unit = js.native
    /**
      * Test whether container is empty.
      */
    /* CompleteClass */
    /* InferMemberOverrides */
    override def empty(): Boolean = js.native
    /**
      * Iterator to the end.
      *
      * @return Iterator to the end.
      */
    /* InferMemberOverrides */
    override def end(): typings.tstl.baseIteratorIteratorMod.Iterator[T, Vector[T], Iterator[T], ReverseIterator[T], T] = js.native
    /* CompleteClass */
    override def hasEventListener(`type`: Type): Boolean = js.native
    /**
      * Insert items at the end.
      *
      * @param items Items to insert.
      * @return Number of elements in the container after insertion.
      */
    /* InferMemberOverrides */
    override def push(items: T*): Double = js.native
    /**
      * Insert an element at the end.
      *
      * @param val Value to insert.
      */
    /* CompleteClass */
    /* InferMemberOverrides */
    override def push_back(`val`: T): Unit = js.native
    /**
      * Reverse iterator to the first element in reverse.
      *
      * @return Reverse iterator to the first.
      */
    /* CompleteClass */
    /* InferMemberOverrides */
    override def rbegin(): ReverseIterator[T] = js.native
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
      * Reverse iterator to the reverse end.
      *
      * @return Reverse iterator to the end.
      */
    /* CompleteClass */
    /* InferMemberOverrides */
    override def rend(): ReverseIterator[T] = js.native
    /**
      * Number of elements in the container.
      */
    /* InferMemberOverrides */
    override def size(): Double = js.native
  }
  
  @js.native
  object ArrayCollection extends js.Object {
    val Event: Instantiable3[
        /* type */ String, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam IteratorT */ /* first */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam IteratorT */ /* last */ js.Any, 
        CollectionEvent[
          js.Object, 
          Container[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam IteratorT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam ReverseT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any
          ], 
          typings.tstl.baseIteratorIteratorMod.Iterator[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam IteratorT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam ReverseT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any
          ], 
          typings.tstl.tstlMod.base.ReverseIterator[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam IteratorT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam ReverseT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any
          ]
        ]
      ] = js.native
    val Iterator: Instantiable0[
        ArrayIterator[
          js.Object, 
          ArrayContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any, 
            ArrayIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any
            ], 
            ArrayReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any
            ], 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any
          ]
        ]
      ] = js.native
    val ReverseIterator: Instantiable0[
        ArrayReverseIterator[
          js.Object, 
          ArrayContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any, 
            ArrayIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any
            ], 
            ArrayReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any
            ], 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any
          ]
        ]
      ] = js.native
    type Event[T] = CollectionEvent[
        T, 
        Vector[T], 
        typings.tstl.containerVectorMod.Vector.Iterator[T], 
        typings.tstl.containerVectorMod.Vector.ReverseIterator[T]
      ]
    type Iterator[T] = ArrayIterator[T, Vector[T]]
    type Listener[T] = typings.ecol.libBasicCollectionEventMod.CollectionEvent.Listener[
        T, 
        Vector[T], 
        typings.tstl.containerVectorMod.Vector.Iterator[T], 
        typings.tstl.containerVectorMod.Vector.ReverseIterator[T]
      ]
    type ReverseIterator[T] = ArrayReverseIterator[T, Vector[T]]
  }
  
}

