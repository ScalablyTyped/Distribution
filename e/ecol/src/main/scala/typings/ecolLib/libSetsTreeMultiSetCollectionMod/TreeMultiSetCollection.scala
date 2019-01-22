package typings
package ecolLib.libSetsTreeMultiSetCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- ecolLib.libBasicICollectionMod.ICollection because Inheritance from two classes */ @JSImport("ecol/lib/sets/TreeMultiSetCollection", "TreeMultiSetCollection")
@js.native
class TreeMultiSetCollection[T] ()
  extends tstlLib.containerTreeMultiSetMod.TreeMultiSet[T] {
  /**
    * @hidden
    */
  var `dispatcher_`: js.Any = js.native
  /**
    * @inheritDoc
    */
  def addEventListener(
    `type`: ecolLib.libBasicCollectionEventMod.CollectionEventNs.Type,
    listener: ecolLib.libSetsTreeMultiSetCollectionMod.TreeMultiSetCollectionNs.Listener[T]
  ): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def dispatchEvent(event: ecolLib.libSetsTreeMultiSetCollectionMod.TreeMultiSetCollectionNs.Event[T]): scala.Unit = js.native
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
    first: tstlLib.containerTreeMultiSetMod.TreeMultiSetNs.Iterator[T],
    last: tstlLib.containerTreeMultiSetMod.TreeMultiSetNs.Iterator[T]
  ): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def refresh(it: tstlLib.containerTreeMultiSetMod.TreeMultiSetNs.Iterator[T]): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def removeEventListener(
    `type`: ecolLib.libBasicCollectionEventMod.CollectionEventNs.Type,
    listener: ecolLib.libSetsTreeMultiSetCollectionMod.TreeMultiSetCollectionNs.Listener[T]
  ): scala.Unit = js.native
}

