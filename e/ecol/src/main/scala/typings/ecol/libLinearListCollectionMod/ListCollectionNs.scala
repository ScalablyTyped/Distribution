package typings.ecol.libLinearListCollectionMod

import org.scalablytyped.runtime.Instantiable3
import typings.ecol.libBasicCollectionEventMod.CollectionEvent
import typings.tstl.baseIteratorListIteratorMod.ListIterator
import typings.tstl.containerListMod.List
import typings.tstl.tstlMod.baseNs.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecol/lib/linear/ListCollection", "ListCollection")
@js.native
object ListCollectionNs extends js.Object {
  /**
    * Iterator of the List.
    *
    * @author Jeongho Nam <http://samchon.org>
    */
  @js.native
  /**
    * @hidden
    */
  class Iterator[T] protected ()
    extends ListIterator[
          T, 
          List[T], 
          typings.tstl.containerListMod.ListNs.Iterator[T], 
          typings.tstl.containerListMod.ListNs.ReverseIterator[T], 
          T
        ] {
    /**
      * @hidden
      */
    var source_ptr_ : js.Any = js.native
    def equals(obj: typings.tstl.containerListMod.ListNs.Iterator[T]): Boolean = js.native
  }
  
  /**
    * Reverse iterator of the List.
    *
    * @author Jeongho Nam <http://samchon.org>
    */
  @js.native
  class ReverseIterator[T] ()
    extends typings.tstl.baseIteratorReverseIteratorMod.ReverseIterator[
          T, 
          List[T], 
          typings.tstl.containerListMod.ListNs.Iterator[T], 
          typings.tstl.containerListMod.ListNs.ReverseIterator[T], 
          T
        ]
  
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
      typings.tstl.tstlMod.baseNs.ReverseIterator[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam IteratorT */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam ReverseT */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any
      ]
    ]
  ] = js.native
  type Event[T] = CollectionEvent[
    T, 
    List[T], 
    typings.tstl.containerListMod.ListNs.Iterator[T], 
    typings.tstl.containerListMod.ListNs.ReverseIterator[T]
  ]
  type Listener[T] = typings.ecol.libBasicCollectionEventMod.CollectionEventNs.Listener[
    T, 
    List[T], 
    typings.tstl.containerListMod.ListNs.Iterator[T], 
    typings.tstl.containerListMod.ListNs.ReverseIterator[T]
  ]
}

