package typings.ecol.libLinearDequeCollectionMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import typings.ecol.libBasicCollectionEventMod.CollectionEvent
import typings.tstl.baseContainerArrayContainerMod.ArrayContainer
import typings.tstl.baseContainerContainerMod.Container
import typings.tstl.baseIteratorArrayIteratorMod.ArrayIterator
import typings.tstl.baseIteratorArrayIteratorMod.ArrayReverseIterator
import typings.tstl.containerDequeMod.Deque
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecol/lib/linear/DequeCollection", "DequeCollection")
@js.native
object DequeCollectionNs extends js.Object {
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
      typings.tstl.baseIteratorReverseIteratorMod.ReverseIterator[
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
    Deque[T], 
    typings.tstl.containerDequeMod.DequeNs.Iterator[T], 
    typings.tstl.containerDequeMod.DequeNs.ReverseIterator[T]
  ]
  type Iterator[T] = ArrayIterator[T, Deque[T]]
  type Listener[T] = typings.ecol.libBasicCollectionEventMod.CollectionEventNs.Listener[
    T, 
    Deque[T], 
    typings.tstl.containerDequeMod.DequeNs.Iterator[T], 
    typings.tstl.containerDequeMod.DequeNs.ReverseIterator[T]
  ]
  type ReverseIterator[T] = ArrayReverseIterator[T, Deque[T]]
}

