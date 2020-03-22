package typings.ecol.hashMultiMapCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object HashMultiMapCollection {
  type Event[Key, T] = typings.ecol.collectionEventMod.CollectionEvent[
    typings.tstl.entryMod.Entry[Key, T], 
    typings.tstl.hashMultiMapMod.HashMultiMap[Key, T], 
    typings.tstl.hashMultiMapMod.HashMultiMap.Iterator[Key, T], 
    typings.tstl.hashMultiMapMod.HashMultiMap.ReverseIterator[Key, T]
  ]
  /**
    * Iterator of {@link HashMultiMap}
    */
  type Iterator[Key, T] = typings.tstl.mapElementListMod.MapElementList.Iterator[
    Key, 
    T, 
    typings.ecol.ecolBooleans.`false`, 
    typings.tstl.hashMultiMapMod.HashMultiMap[Key, T]
  ]
  type Listener[Key, T] = typings.ecol.collectionEventMod.CollectionEvent.Listener[
    typings.tstl.entryMod.Entry[Key, T], 
    typings.tstl.hashMultiMapMod.HashMultiMap[Key, T], 
    typings.tstl.hashMultiMapMod.HashMultiMap.Iterator[Key, T], 
    typings.tstl.hashMultiMapMod.HashMultiMap.ReverseIterator[Key, T]
  ]
  /**
    * Reverse iterator of {@link HashMultiMap}
    */
  type ReverseIterator[Key, T] = typings.tstl.mapElementListMod.MapElementList.ReverseIterator[
    Key, 
    T, 
    typings.ecol.ecolBooleans.`false`, 
    typings.tstl.hashMultiMapMod.HashMultiMap[Key, T]
  ]
}
