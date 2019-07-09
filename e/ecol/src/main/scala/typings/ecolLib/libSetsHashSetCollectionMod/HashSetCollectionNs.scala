package typings
package ecolLib.libSetsHashSetCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecol/lib/sets/HashSetCollection", "HashSetCollection")
@js.native
object HashSetCollectionNs extends js.Object {
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
  val Iterator: org.scalablytyped.runtime.Instantiable0[
    tstlLib.baseContainerSetElementListMod.SetElementListNs.Iterator[
      js.Object, 
      scala.Boolean, 
      tstlLib.baseContainerSetContainerMod.SetContainer[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
        tstlLib.baseContainerSetElementListMod.SetElementListNs.Iterator[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
        ], 
        tstlLib.baseContainerSetElementListMod.SetElementListNs.ReverseIterator[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
        ]
      ]
    ]
  ] = js.native
  val ReverseIterator: org.scalablytyped.runtime.Instantiable0[
    tstlLib.baseContainerSetElementListMod.SetElementListNs.ReverseIterator[
      js.Object, 
      scala.Boolean, 
      tstlLib.baseContainerSetContainerMod.SetContainer[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
        tstlLib.baseContainerSetElementListMod.SetElementListNs.Iterator[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
        ], 
        tstlLib.baseContainerSetElementListMod.SetElementListNs.ReverseIterator[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
        ]
      ]
    ]
  ] = js.native
  type Event[T] = ecolLib.libBasicCollectionEventMod.CollectionEvent[
    T, 
    tstlLib.containerHashSetMod.HashSet[T], 
    tstlLib.containerHashSetMod.HashSetNs.Iterator[T], 
    tstlLib.containerHashSetMod.HashSetNs.ReverseIterator[T]
  ]
  type Iterator[Key] = tstlLib.baseContainerSetElementListMod.SetElementListNs.Iterator[Key, ecolLib.ecolLibNumbers.`true`, tstlLib.containerHashSetMod.HashSet[Key]]
  type Listener[T] = ecolLib.libBasicCollectionEventMod.CollectionEventNs.Listener[
    T, 
    tstlLib.containerHashSetMod.HashSet[T], 
    tstlLib.containerHashSetMod.HashSetNs.Iterator[T], 
    tstlLib.containerHashSetMod.HashSetNs.ReverseIterator[T]
  ]
  type ReverseIterator[Key] = tstlLib.baseContainerSetElementListMod.SetElementListNs.ReverseIterator[Key, ecolLib.ecolLibNumbers.`true`, tstlLib.containerHashSetMod.HashSet[Key]]
}

