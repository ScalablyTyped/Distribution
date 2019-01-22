package typings
package ecolLib.libMapsTreeMultiMapCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- ecolLib.libBasicICollectionMod.ICollection because Inheritance from two classes */ @JSImport("ecol/lib/maps/TreeMultiMapCollection", "TreeMultiMapCollection")
@js.native
class TreeMultiMapCollection[Key, T] ()
  extends tstlLib.containerTreeMultiMapMod.TreeMultiMap[Key, T] {
  /**
    * @hidden
    */
  var `dispatcher_`: js.Any = js.native
  /**
    * @inheritDoc
    */
  def addEventListener(
    `type`: ecolLib.libBasicCollectionEventMod.CollectionEventNs.Type,
    listener: ecolLib.libMapsTreeMultiMapCollectionMod.TreeMultiMapCollectionNs.Listener[Key, T]
  ): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def dispatchEvent(event: ecolLib.libMapsTreeMultiMapCollectionMod.TreeMultiMapCollectionNs.Event[Key, T]): scala.Unit = js.native
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
    first: tstlLib.containerTreeMultiMapMod.TreeMultiMapNs.Iterator[Key, T],
    last: tstlLib.containerTreeMultiMapMod.TreeMultiMapNs.Iterator[Key, T]
  ): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def refresh(it: tstlLib.containerTreeMultiMapMod.TreeMultiMapNs.Iterator[Key, T]): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def removeEventListener(
    `type`: ecolLib.libBasicCollectionEventMod.CollectionEventNs.Type,
    listener: ecolLib.libMapsTreeMultiMapCollectionMod.TreeMultiMapCollectionNs.Listener[Key, T]
  ): scala.Unit = js.native
}

