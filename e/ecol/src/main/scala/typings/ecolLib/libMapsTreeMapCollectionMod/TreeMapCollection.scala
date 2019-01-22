package typings
package ecolLib.libMapsTreeMapCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- ecolLib.libBasicICollectionMod.ICollection because Inheritance from two classes */ @JSImport("ecol/lib/maps/TreeMapCollection", "TreeMapCollection")
@js.native
class TreeMapCollection[Key, T] ()
  extends tstlLib.containerTreeMapMod.TreeMap[Key, T] {
  /**
    * @hidden
    */
  var `dispatcher_`: js.Any = js.native
  /**
    * @inheritDoc
    */
  def addEventListener(
    `type`: ecolLib.libBasicCollectionEventMod.CollectionEventNs.Type,
    listener: ecolLib.libMapsTreeMapCollectionMod.TreeMapCollectionNs.Listener[Key, T]
  ): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def dispatchEvent(event: ecolLib.libMapsTreeMapCollectionMod.TreeMapCollectionNs.Event[Key, T]): scala.Unit = js.native
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
    first: tstlLib.containerTreeMapMod.TreeMapNs.Iterator[Key, T],
    last: tstlLib.containerTreeMapMod.TreeMapNs.Iterator[Key, T]
  ): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def refresh(it: tstlLib.containerTreeMapMod.TreeMapNs.Iterator[Key, T]): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def removeEventListener(
    `type`: ecolLib.libBasicCollectionEventMod.CollectionEventNs.Type,
    listener: ecolLib.libMapsTreeMapCollectionMod.TreeMapCollectionNs.Listener[Key, T]
  ): scala.Unit = js.native
}

