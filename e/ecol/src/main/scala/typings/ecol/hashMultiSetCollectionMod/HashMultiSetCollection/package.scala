package typings.ecol.hashMultiSetCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object HashMultiSetCollection {
  type Event[T] = typings.ecol.collectionEventMod.CollectionEvent[
    T, 
    typings.tstl.hashMultiSetMod.HashMultiSet[T], 
    typings.tstl.hashMultiSetMod.HashMultiSet.Iterator[T], 
    typings.tstl.hashMultiSetMod.HashMultiSet.ReverseIterator[T]
  ]
  /**
    * Iterator of {@link HashMultiSet}
    */
  type Iterator[Key] = typings.tstl.setElementListMod.SetElementList.Iterator[
    Key, 
    typings.ecol.ecolBooleans.`false`, 
    typings.tstl.hashMultiSetMod.HashMultiSet[Key]
  ]
  type Listener[T] = typings.ecol.collectionEventMod.CollectionEvent.Listener[
    T, 
    typings.tstl.hashMultiSetMod.HashMultiSet[T], 
    typings.tstl.hashMultiSetMod.HashMultiSet.Iterator[T], 
    typings.tstl.hashMultiSetMod.HashMultiSet.ReverseIterator[T]
  ]
  /**
    * Reverse iterator of {@link HashMultiSet}
    */
  type ReverseIterator[Key] = typings.tstl.setElementListMod.SetElementList.ReverseIterator[
    Key, 
    typings.ecol.ecolBooleans.`false`, 
    typings.tstl.hashMultiSetMod.HashMultiSet[Key]
  ]
}
