package typings
package ecolLib.libMapsTreeMultiMapCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecol/lib/maps/TreeMultiMapCollection", "TreeMultiMapCollection")
@js.native
object TreeMultiMapCollectionNs extends js.Object {
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
  type Event[Key, T] = ecolLib.libBasicCollectionEventMod.CollectionEvent[
    tstlLib.utilityEntryMod.Entry[Key, T], 
    tstlLib.containerTreeMultiMapMod.TreeMultiMap[Key, T], 
    tstlLib.containerTreeMultiMapMod.TreeMultiMapNs.Iterator[Key, T], 
    tstlLib.containerTreeMultiMapMod.TreeMultiMapNs.ReverseIterator[Key, T]
  ]
  type Listener[Key, T] = ecolLib.libBasicCollectionEventMod.CollectionEventNs.Listener[
    tstlLib.utilityEntryMod.Entry[Key, T], 
    tstlLib.containerTreeMultiMapMod.TreeMultiMap[Key, T], 
    tstlLib.containerTreeMultiMapMod.TreeMultiMapNs.Iterator[Key, T], 
    tstlLib.containerTreeMultiMapMod.TreeMultiMapNs.ReverseIterator[Key, T]
  ]
}

