package typings.ecol.libMapsHashMapCollectionMod

import typings.ecol.libBasicCollectionEventMod.CollectionEventNs.Type
import typings.ecol.libMapsHashMapCollectionMod.HashMapCollectionNs.Event
import typings.ecol.libMapsHashMapCollectionMod.HashMapCollectionNs.Listener
import typings.tstl.containerHashMapMod.HashMap
import typings.tstl.containerHashMapMod.HashMapNs.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.ecol.libBasicICollectionMod.ICollection because Inheritance from two classes. Inlined refresh, refresh, refresh */ @JSImport("ecol/lib/maps/HashMapCollection", "HashMapCollection")
@js.native
class HashMapCollection[Key, T] () extends HashMap[Key, T] {
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

