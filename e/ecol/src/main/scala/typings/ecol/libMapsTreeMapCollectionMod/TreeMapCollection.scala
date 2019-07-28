package typings.ecol.libMapsTreeMapCollectionMod

import typings.ecol.libBasicCollectionEventMod.CollectionEventNs.Type
import typings.ecol.libMapsTreeMapCollectionMod.TreeMapCollectionNs.Event
import typings.ecol.libMapsTreeMapCollectionMod.TreeMapCollectionNs.Listener
import typings.tstl.containerTreeMapMod.TreeMap
import typings.tstl.containerTreeMapMod.TreeMapNs.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.ecol.libBasicICollectionMod.ICollection because Inheritance from two classes. Inlined refresh, refresh, refresh */ @JSImport("ecol/lib/maps/TreeMapCollection", "TreeMapCollection")
@js.native
class TreeMapCollection[Key, T] () extends TreeMap[Key, T] {
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

