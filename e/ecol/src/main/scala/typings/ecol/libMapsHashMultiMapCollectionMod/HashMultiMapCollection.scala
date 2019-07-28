package typings.ecol.libMapsHashMultiMapCollectionMod

import typings.ecol.libBasicCollectionEventMod.CollectionEventNs.Type
import typings.ecol.libMapsHashMultiMapCollectionMod.HashMultiMapCollectionNs.Event
import typings.ecol.libMapsHashMultiMapCollectionMod.HashMultiMapCollectionNs.Listener
import typings.tstl.containerHashMultiMapMod.HashMultiMap
import typings.tstl.containerHashMultiMapMod.HashMultiMapNs.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.ecol.libBasicICollectionMod.ICollection because Inheritance from two classes. Inlined refresh, refresh, refresh */ @JSImport("ecol/lib/maps/HashMultiMapCollection", "HashMultiMapCollection")
@js.native
class HashMultiMapCollection[Key, T] () extends HashMultiMap[Key, T] {
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

