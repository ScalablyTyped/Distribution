package typings.ecol.treeMultiMapCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TreeMultiMapCollection {
  type Event[Key, T] = typings.ecol.collectionEventMod.CollectionEvent[
    typings.tstl.entryMod.Entry[Key, T], 
    typings.tstl.treeMultiMapMod.TreeMultiMap[Key, T], 
    typings.tstl.treeMultiMapMod.TreeMultiMap.Iterator[Key, T], 
    typings.tstl.treeMultiMapMod.TreeMultiMap.ReverseIterator[Key, T]
  ]
  /**
    * Iterator of {@link TreeMultiMap}
    */
  type Iterator[Key, T] = typings.tstl.mapElementListMod.MapElementList.Iterator[
    Key, 
    T, 
    typings.ecol.ecolBooleans.`false`, 
    typings.tstl.treeMultiMapMod.TreeMultiMap[Key, T]
  ]
  type Listener[Key, T] = typings.ecol.collectionEventMod.CollectionEvent.Listener[
    typings.tstl.entryMod.Entry[Key, T], 
    typings.tstl.treeMultiMapMod.TreeMultiMap[Key, T], 
    typings.tstl.treeMultiMapMod.TreeMultiMap.Iterator[Key, T], 
    typings.tstl.treeMultiMapMod.TreeMultiMap.ReverseIterator[Key, T]
  ]
  /**
    * Iterator of {@link TreeMultiMap}
    */
  type ReverseIterator[Key, T] = typings.tstl.mapElementListMod.MapElementList.ReverseIterator[
    Key, 
    T, 
    typings.ecol.ecolBooleans.`false`, 
    typings.tstl.treeMultiMapMod.TreeMultiMap[Key, T]
  ]
}
