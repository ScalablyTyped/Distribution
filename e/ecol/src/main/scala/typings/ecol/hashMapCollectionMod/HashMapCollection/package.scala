package typings.ecol.hashMapCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object HashMapCollection {
  type Event[Key, T] = typings.ecol.collectionEventMod.CollectionEvent[
    typings.tstl.entryMod.Entry[Key, T], 
    typings.tstl.hashMapMod.HashMap[Key, T], 
    typings.tstl.hashMapMod.HashMap.Iterator[Key, T], 
    typings.tstl.hashMapMod.HashMap.ReverseIterator[Key, T]
  ]
  /**
    * Iterator of {@link HashMap}
    */
  type Iterator[Key, T] = typings.tstl.mapElementListMod.MapElementList.Iterator[Key, T, typings.ecol.ecolBooleans.`true`, typings.tstl.hashMapMod.HashMap[Key, T]]
  type Listener[Key, T] = typings.ecol.collectionEventMod.CollectionEvent.Listener[
    typings.tstl.entryMod.Entry[Key, T], 
    typings.tstl.hashMapMod.HashMap[Key, T], 
    typings.tstl.hashMapMod.HashMap.Iterator[Key, T], 
    typings.tstl.hashMapMod.HashMap.ReverseIterator[Key, T]
  ]
  /**
    * Reverse iterator of {@link HashMap}
    */
  type ReverseIterator[Key, T] = typings.tstl.mapElementListMod.MapElementList.ReverseIterator[Key, T, typings.ecol.ecolBooleans.`true`, typings.tstl.hashMapMod.HashMap[Key, T]]
}
