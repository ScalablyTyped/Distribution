package typings.ecol.libSetsTreeSetCollectionMod

import typings.ecol.libBasicCollectionEventMod.CollectionEventNs.Type
import typings.ecol.libSetsTreeSetCollectionMod.TreeSetCollectionNs.Event
import typings.ecol.libSetsTreeSetCollectionMod.TreeSetCollectionNs.Listener
import typings.tstl.containerTreeSetMod.TreeSet
import typings.tstl.containerTreeSetMod.TreeSetNs.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.ecol.libBasicICollectionMod.ICollection because var conflicts: iterator, iterator_IContainer. Inlined refresh, refresh, refresh */ @JSImport("ecol/lib/sets/TreeSetCollection", "TreeSetCollection")
@js.native
class TreeSetCollection[T] () extends TreeSet[T] {
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

