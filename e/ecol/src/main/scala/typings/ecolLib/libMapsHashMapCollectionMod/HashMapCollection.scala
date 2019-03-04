package typings
package ecolLib.libMapsHashMapCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- ecolLib.libBasicICollectionMod.ICollection because Inheritance from two classes. Inlined refresh, refresh, refresh */ @JSImport("ecol/lib/maps/HashMapCollection", "HashMapCollection")
@js.native
class HashMapCollection[Key, T] ()
  extends tstlLib.containerHashMapMod.HashMap[Key, T] {
  /**
    * @hidden
    */
  var dispatcher_ : js.Any = js.native
  /**
    * @inheritDoc
    */
  def addEventListener(
    `type`: ecolLib.libBasicCollectionEventMod.CollectionEventNs.Type,
    listener: ecolLib.libMapsHashMapCollectionMod.HashMapCollectionNs.Listener[Key, T]
  ): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def dispatchEvent(event: ecolLib.libMapsHashMapCollectionMod.HashMapCollectionNs.Event[Key, T]): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def hasEventListener(`type`: ecolLib.libBasicCollectionEventMod.CollectionEventNs.Type): scala.Boolean = js.native
  /**
    * @inheritDoc
    */
  def refresh(): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def refresh(
    first: tstlLib.containerHashMapMod.HashMapNs.Iterator[Key, T],
    last: tstlLib.containerHashMapMod.HashMapNs.Iterator[Key, T]
  ): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def refresh(it: tstlLib.containerHashMapMod.HashMapNs.Iterator[Key, T]): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def removeEventListener(
    `type`: ecolLib.libBasicCollectionEventMod.CollectionEventNs.Type,
    listener: ecolLib.libMapsHashMapCollectionMod.HashMapCollectionNs.Listener[Key, T]
  ): scala.Unit = js.native
}

