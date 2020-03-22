package typings.ecol.treeMapCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TreeMapCollection {
  type Event[Key, T] = typings.ecol.collectionEventMod.CollectionEvent[
    typings.tstl.entryMod.Entry[Key, T], 
    typings.tstl.treeMapMod.TreeMap[Key, T], 
    typings.tstl.treeMapMod.TreeMap.Iterator[Key, T], 
    typings.tstl.treeMapMod.TreeMap.ReverseIterator[Key, T]
  ]
  /**
    * Iterator of {@link TreeMap}
    */
  type Iterator[Key, T] = typings.tstl.mapElementListMod.MapElementList.Iterator[Key, T, typings.ecol.ecolBooleans.`true`, typings.tstl.treeMapMod.TreeMap[Key, T]]
  type Listener[Key, T] = typings.ecol.collectionEventMod.CollectionEvent.Listener[
    typings.tstl.entryMod.Entry[Key, T], 
    typings.tstl.treeMapMod.TreeMap[Key, T], 
    typings.tstl.treeMapMod.TreeMap.Iterator[Key, T], 
    typings.tstl.treeMapMod.TreeMap.ReverseIterator[Key, T]
  ]
  /**
    * Reverse iterator of {@link TreeMap}
    */
  type ReverseIterator[Key, T] = typings.tstl.mapElementListMod.MapElementList.ReverseIterator[Key, T, typings.ecol.ecolBooleans.`true`, typings.tstl.treeMapMod.TreeMap[Key, T]]
}
