package typings.ecol.treeMultiSetCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TreeMultiSetCollection {
  type Event[T] = typings.ecol.collectionEventMod.CollectionEvent[
    T, 
    typings.tstl.treeMultiSetMod.TreeMultiSet[T], 
    typings.tstl.treeMultiSetMod.TreeMultiSet.Iterator[T], 
    typings.tstl.treeMultiSetMod.TreeMultiSet.ReverseIterator[T]
  ]
  /**
    * Iterator of {@link TreeMultiSet}
    */
  type Iterator[Key] = typings.tstl.setElementListMod.SetElementList.Iterator[
    Key, 
    typings.ecol.ecolBooleans.`false`, 
    typings.tstl.treeMultiSetMod.TreeMultiSet[Key]
  ]
  type Listener[T] = typings.ecol.collectionEventMod.CollectionEvent.Listener[
    T, 
    typings.tstl.treeMultiSetMod.TreeMultiSet[T], 
    typings.tstl.treeMultiSetMod.TreeMultiSet.Iterator[T], 
    typings.tstl.treeMultiSetMod.TreeMultiSet.ReverseIterator[T]
  ]
  /**
    * Reverse iterator of {@link TreeMultiSet}
    */
  type ReverseIterator[Key] = typings.tstl.setElementListMod.SetElementList.ReverseIterator[
    Key, 
    typings.ecol.ecolBooleans.`false`, 
    typings.tstl.treeMultiSetMod.TreeMultiSet[Key]
  ]
}
