package typings
package ecolLib.libSetsTreeSetCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecol/lib/sets/TreeSetCollection", "TreeSetCollection")
@js.native
object TreeSetCollectionNs extends js.Object {
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
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam ReverseT */ js.Any
      ], 
      tstlLib.baseIteratorIteratorMod.Iterator[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam IteratorT */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam ReverseT */ js.Any
      ], 
      tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam SourceT */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam IteratorT */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam ReverseT */ js.Any
      ]
    ]
  ] = js.native
  type Event[T] = ecolLib.libBasicCollectionEventMod.CollectionEvent[
    T, 
    tstlLib.containerTreeSetMod.TreeSet[T], 
    tstlLib.containerTreeSetMod.TreeSetNs.Iterator[T], 
    tstlLib.containerTreeSetMod.TreeSetNs.ReverseIterator[T]
  ]
  type Listener[T] = ecolLib.libBasicCollectionEventMod.CollectionEventNs.Listener[
    T, 
    tstlLib.containerTreeSetMod.TreeSet[T], 
    tstlLib.containerTreeSetMod.TreeSetNs.Iterator[T], 
    tstlLib.containerTreeSetMod.TreeSetNs.ReverseIterator[T]
  ]
}

