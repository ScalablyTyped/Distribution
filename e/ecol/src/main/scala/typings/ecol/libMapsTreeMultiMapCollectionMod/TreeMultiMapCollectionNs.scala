package typings.ecol.libMapsTreeMultiMapCollectionMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import typings.ecol.ecolNumbers.`false`
import typings.ecol.libBasicCollectionEventMod.CollectionEvent
import typings.tstl.baseContainerContainerMod.Container
import typings.tstl.baseContainerMapContainerMod.MapContainer
import typings.tstl.containerTreeMultiMapMod.TreeMultiMap
import typings.tstl.utilityEntryMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecol/lib/maps/TreeMultiMapCollection", "TreeMultiMapCollection")
@js.native
object TreeMultiMapCollectionNs extends js.Object {
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
    typings.tstl.baseContainerMapElementListMod.MapElementListNs.Iterator[
      js.Object, 
      js.Object, 
      Boolean, 
      MapContainer[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
        typings.tstl.baseContainerMapElementListMod.MapElementListNs.Iterator[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
        ], 
        typings.tstl.baseContainerMapElementListMod.MapElementListNs.ReverseIterator[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
        ]
      ]
    ]
  ] = js.native
  val ReverseIterator: Instantiable0[
    typings.tstl.baseContainerMapElementListMod.MapElementListNs.ReverseIterator[
      js.Object, 
      js.Object, 
      Boolean, 
      MapContainer[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
        typings.tstl.baseContainerMapElementListMod.MapElementListNs.Iterator[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
        ], 
        typings.tstl.baseContainerMapElementListMod.MapElementListNs.ReverseIterator[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
        ]
      ]
    ]
  ] = js.native
  type Event[Key, T] = CollectionEvent[
    Entry[Key, T], 
    TreeMultiMap[Key, T], 
    typings.tstl.containerTreeMultiMapMod.TreeMultiMapNs.Iterator[Key, T], 
    typings.tstl.containerTreeMultiMapMod.TreeMultiMapNs.ReverseIterator[Key, T]
  ]
  type Iterator[Key, T] = typings.tstl.baseContainerMapElementListMod.MapElementListNs.Iterator[Key, T, `false`, TreeMultiMap[Key, T]]
  type Listener[Key, T] = typings.ecol.libBasicCollectionEventMod.CollectionEventNs.Listener[
    Entry[Key, T], 
    TreeMultiMap[Key, T], 
    typings.tstl.containerTreeMultiMapMod.TreeMultiMapNs.Iterator[Key, T], 
    typings.tstl.containerTreeMultiMapMod.TreeMultiMapNs.ReverseIterator[Key, T]
  ]
  type ReverseIterator[Key, T] = typings.tstl.baseContainerMapElementListMod.MapElementListNs.ReverseIterator[Key, T, `false`, TreeMultiMap[Key, T]]
}

