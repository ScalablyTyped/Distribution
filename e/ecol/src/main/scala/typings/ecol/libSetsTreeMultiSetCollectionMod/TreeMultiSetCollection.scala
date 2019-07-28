package typings.ecol.libSetsTreeMultiSetCollectionMod

import typings.ecol.libBasicCollectionEventMod.CollectionEventNs.Type
import typings.ecol.libSetsTreeMultiSetCollectionMod.TreeMultiSetCollectionNs.Event
import typings.ecol.libSetsTreeMultiSetCollectionMod.TreeMultiSetCollectionNs.Listener
import typings.tstl.containerTreeMultiSetMod.TreeMultiSet
import typings.tstl.containerTreeMultiSetMod.TreeMultiSetNs.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.ecol.libBasicICollectionMod.ICollection because var conflicts: iterator, iterator_IContainer. Inlined refresh, refresh, refresh */ @JSImport("ecol/lib/sets/TreeMultiSetCollection", "TreeMultiSetCollection")
@js.native
class TreeMultiSetCollection[T] () extends TreeMultiSet[T] {
  /**
    * @hidden
    */
  var dispatcher_ : js.Any = js.native
  /**
    * @inheritDoc
    */
  def addEventListener(`type`: Type, listener: Listener[T]): Unit = js.native
  /**
    * @inheritDoc
    */
  def dispatchEvent(event: Event[T]): Unit = js.native
  /**
    * @inheritDoc
    */
  def hasEventListener(`type`: Type): Boolean = js.native
  /**
    * @inheritDoc
    */
  def refresh(): Unit = js.native
  /**
    * @inheritDoc
    */
  def refresh(first: Iterator[T], last: Iterator[T]): Unit = js.native
  /**
    * @inheritDoc
    */
  def refresh(it: Iterator[T]): Unit = js.native
  /**
    * @inheritDoc
    */
  def removeEventListener(`type`: Type, listener: Listener[T]): Unit = js.native
}

