package typings.ecol.libMapsTreeMultiMapCollectionMod

import typings.ecol.libBasicCollectionEventMod.CollectionEventNs.Type
import typings.ecol.libMapsTreeMultiMapCollectionMod.TreeMultiMapCollectionNs.Event
import typings.ecol.libMapsTreeMultiMapCollectionMod.TreeMultiMapCollectionNs.Listener
import typings.tstl.containerTreeMultiMapMod.TreeMultiMap
import typings.tstl.containerTreeMultiMapMod.TreeMultiMapNs.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.ecol.libBasicICollectionMod.ICollection because Inheritance from two classes. Inlined refresh, refresh, refresh */ @JSImport("ecol/lib/maps/TreeMultiMapCollection", "TreeMultiMapCollection")
@js.native
class TreeMultiMapCollection[Key, T] () extends TreeMultiMap[Key, T] {
  /**
    * @hidden
    */
  var dispatcher_ : js.Any = js.native
  /**
    * @inheritDoc
    */
  def addEventListener(`type`: Type, listener: Listener[Key, T]): Unit = js.native
  /**
    * @inheritDoc
    */
  def dispatchEvent(event: Event[Key, T]): Unit = js.native
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
  def refresh(first: Iterator[Key, T], last: Iterator[Key, T]): Unit = js.native
  /**
    * @inheritDoc
    */
  def refresh(it: Iterator[Key, T]): Unit = js.native
  /**
    * @inheritDoc
    */
  def removeEventListener(`type`: Type, listener: Listener[Key, T]): Unit = js.native
}

