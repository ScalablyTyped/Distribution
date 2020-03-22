package typings.ecol.hashSetCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object HashSetCollection {
  type Event[T] = typings.ecol.collectionEventMod.CollectionEvent[
    T, 
    typings.tstl.hashSetMod.HashSet[T], 
    typings.tstl.hashSetMod.HashSet.Iterator[T], 
    typings.tstl.hashSetMod.HashSet.ReverseIterator[T]
  ]
  /**
    * Iterator of {@link HashSet}
    */
  type Iterator[Key] = typings.tstl.setElementListMod.SetElementList.Iterator[Key, typings.ecol.ecolBooleans.`true`, typings.tstl.hashSetMod.HashSet[Key]]
  type Listener[T] = typings.ecol.collectionEventMod.CollectionEvent.Listener[
    T, 
    typings.tstl.hashSetMod.HashSet[T], 
    typings.tstl.hashSetMod.HashSet.Iterator[T], 
    typings.tstl.hashSetMod.HashSet.ReverseIterator[T]
  ]
  /**
    * Reverse iterator of {@link HashSet}
    */
  type ReverseIterator[Key] = typings.tstl.setElementListMod.SetElementList.ReverseIterator[Key, typings.ecol.ecolBooleans.`true`, typings.tstl.hashSetMod.HashSet[Key]]
}
