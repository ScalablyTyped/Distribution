package typings
package ecolLib.libMapsHashMultiMapCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- ecolLib.libBasicICollectionMod.ICollection because Inheritance from two classes */ @JSImport("ecol/lib/maps/HashMultiMapCollection", "HashMultiMapCollection")
@js.native
class HashMultiMapCollection[Key, T] ()
  extends tstlLib.containerHashMultiMapMod.HashMultiMap[Key, T] {
  /**
    * @hidden
    */
  var `dispatcher_`: js.Any = js.native
  /**
    * @inheritDoc
    */
  def addEventListener(
    `type`: ecolLib.libBasicCollectionEventMod.CollectionEventNs.Type,
    listener: ecolLib.libMapsHashMultiMapCollectionMod.HashMultiMapCollectionNs.Listener[Key, T]
  ): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def dispatchEvent(event: ecolLib.libMapsHashMultiMapCollectionMod.HashMultiMapCollectionNs.Event[Key, T]): scala.Unit = js.native
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
    first: tstlLib.containerHashMultiMapMod.HashMultiMapNs.Iterator[Key, T],
    last: tstlLib.containerHashMultiMapMod.HashMultiMapNs.Iterator[Key, T]
  ): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def refresh(it: tstlLib.containerHashMultiMapMod.HashMultiMapNs.Iterator[Key, T]): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def removeEventListener(
    `type`: ecolLib.libBasicCollectionEventMod.CollectionEventNs.Type,
    listener: ecolLib.libMapsHashMultiMapCollectionMod.HashMultiMapCollectionNs.Listener[Key, T]
  ): scala.Unit = js.native
}

