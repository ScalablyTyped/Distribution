package typings.ecol.libSetsTreeSetCollectionMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import typings.ecol.ecolNumbers.`true`
import typings.ecol.libBasicCollectionEventMod.CollectionEvent
import typings.tstl.baseContainerContainerMod.Container
import typings.tstl.baseContainerSetContainerMod.SetContainer
import typings.tstl.containerTreeSetMod.TreeSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecol/lib/sets/TreeSetCollection", "TreeSetCollection")
@js.native
object TreeSetCollectionNs extends js.Object {
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
    typings.tstl.baseContainerSetElementListMod.SetElementListNs.Iterator[
      js.Object, 
      Boolean, 
      SetContainer[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
        typings.tstl.baseContainerSetElementListMod.SetElementListNs.Iterator[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
        ], 
        typings.tstl.baseContainerSetElementListMod.SetElementListNs.ReverseIterator[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
        ]
      ]
    ]
  ] = js.native
  val ReverseIterator: Instantiable0[
    typings.tstl.baseContainerSetElementListMod.SetElementListNs.ReverseIterator[
      js.Object, 
      Boolean, 
      SetContainer[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
        typings.tstl.baseContainerSetElementListMod.SetElementListNs.Iterator[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
        ], 
        typings.tstl.baseContainerSetElementListMod.SetElementListNs.ReverseIterator[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
        ]
      ]
    ]
  ] = js.native
  type Event[T] = CollectionEvent[
    T, 
    TreeSet[T], 
    typings.tstl.containerTreeSetMod.TreeSetNs.Iterator[T], 
    typings.tstl.containerTreeSetMod.TreeSetNs.ReverseIterator[T]
  ]
  type Iterator[Key] = typings.tstl.baseContainerSetElementListMod.SetElementListNs.Iterator[Key, `true`, TreeSet[Key]]
  type Listener[T] = typings.ecol.libBasicCollectionEventMod.CollectionEventNs.Listener[
    T, 
    TreeSet[T], 
    typings.tstl.containerTreeSetMod.TreeSetNs.Iterator[T], 
    typings.tstl.containerTreeSetMod.TreeSetNs.ReverseIterator[T]
  ]
  type ReverseIterator[Key] = typings.tstl.baseContainerSetElementListMod.SetElementListNs.ReverseIterator[Key, `true`, TreeSet[Key]]
}

