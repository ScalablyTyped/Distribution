package typings
package ecolLib.libLinearListCollectionMod

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
    extends tstlLib.baseIteratorListIteratorMod.ListIterator[
          T, 
          tstlLib.containerListMod.List[T], 
          tstlLib.containerListMod.ListNs.Iterator[T], 
          tstlLib.containerListMod.ListNs.ReverseIterator[T], 
          T
        ] {
    /**
      * @hidden
      */
    var source_ptr_ : js.Any = js.native
    def equals(obj: tstlLib.containerListMod.ListNs.Iterator[T]): scala.Boolean = js.native
  }
  
  /**
    * Reverse iterator of the List.
    *
    * @author Jeongho Nam <http://samchon.org>
    */
  @js.native
  class ReverseIterator[T] ()
    extends tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[
          T, 
          tstlLib.containerListMod.List[T], 
          tstlLib.containerListMod.ListNs.Iterator[T], 
          tstlLib.containerListMod.ListNs.ReverseIterator[T], 
          T
        ]
  
  val Event: org.scalablytyped.runtime.Instantiable3[
    /* type */ java.lang.String, 
    /* import warning: RewrittenClass.unapply cls $anonfun was tparam IteratorT */ /* first */ js.Any, 
    /* import warning: RewrittenClass.unapply cls $anonfun was tparam IteratorT */ /* last */ js.Any, 
    ecolLib.libBasicCollectionEventMod.CollectionEvent[
      js.Object, 
      tstlLib.baseContainerContainerMod.Container[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam IteratorT */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam ReverseT */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any
      ], 
      tstlLib.baseIteratorIteratorMod.Iterator[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam IteratorT */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam ReverseT */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any
      ], 
      tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam IteratorT */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam ReverseT */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any
      ]
    ]
  ] = js.native
  type Event[T] = ecolLib.libBasicCollectionEventMod.CollectionEvent[
    T, 
    tstlLib.containerListMod.List[T], 
    tstlLib.containerListMod.ListNs.Iterator[T], 
    tstlLib.containerListMod.ListNs.ReverseIterator[T]
  ]
  type Listener[T] = ecolLib.libBasicCollectionEventMod.CollectionEventNs.Listener[
    T, 
    tstlLib.containerListMod.List[T], 
    tstlLib.containerListMod.ListNs.Iterator[T], 
    tstlLib.containerListMod.ListNs.ReverseIterator[T]
  ]
}

