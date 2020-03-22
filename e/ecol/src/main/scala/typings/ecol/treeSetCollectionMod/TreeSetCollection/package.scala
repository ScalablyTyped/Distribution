package typings.ecol.treeSetCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TreeSetCollection {
  type Event[T] = typings.ecol.collectionEventMod.CollectionEvent[
    T, 
    typings.tstl.treeSetMod.TreeSet[T], 
    typings.tstl.treeSetMod.TreeSet.Iterator[T], 
    typings.tstl.treeSetMod.TreeSet.ReverseIterator[T]
  ]
  /**
    * Iterator of {@link TreeSet}
    */
  type Iterator[Key] = typings.tstl.setElementListMod.SetElementList.Iterator[Key, typings.ecol.ecolBooleans.`true`, typings.tstl.treeSetMod.TreeSet[Key]]
  type Listener[T] = typings.ecol.collectionEventMod.CollectionEvent.Listener[
    T, 
    typings.tstl.treeSetMod.TreeSet[T], 
    typings.tstl.treeSetMod.TreeSet.Iterator[T], 
    typings.tstl.treeSetMod.TreeSet.ReverseIterator[T]
  ]
  /**
    * Reverse iterator of {@link TreeSet}
    */
  type ReverseIterator[Key] = typings.tstl.setElementListMod.SetElementList.ReverseIterator[Key, typings.ecol.ecolBooleans.`true`, typings.tstl.treeSetMod.TreeSet[Key]]
}
