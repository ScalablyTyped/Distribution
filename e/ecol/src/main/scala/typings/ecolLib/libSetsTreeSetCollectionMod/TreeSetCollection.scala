package typings
package ecolLib.libSetsTreeSetCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- ecolLib.libBasicICollectionMod.ICollection because Inheritance from two classes. Inlined refresh, refresh, refresh */ @JSImport("ecol/lib/sets/TreeSetCollection", "TreeSetCollection")
@js.native
class TreeSetCollection[T] ()
  extends tstlLib.containerTreeSetMod.TreeSet[T] {
  /**
    * @hidden
    */
  var dispatcher_ : js.Any = js.native
  /**
    * @inheritDoc
    */
  def addEventListener(
    `type`: ecolLib.libBasicCollectionEventMod.CollectionEventNs.Type,
    listener: ecolLib.libSetsTreeSetCollectionMod.TreeSetCollectionNs.Listener[T]
  ): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def dispatchEvent(event: ecolLib.libSetsTreeSetCollectionMod.TreeSetCollectionNs.Event[T]): scala.Unit = js.native
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
    first: tstlLib.containerTreeSetMod.TreeSetNs.Iterator[T],
    last: tstlLib.containerTreeSetMod.TreeSetNs.Iterator[T]
  ): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def refresh(it: tstlLib.containerTreeSetMod.TreeSetNs.Iterator[T]): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def removeEventListener(
    `type`: ecolLib.libBasicCollectionEventMod.CollectionEventNs.Type,
    listener: ecolLib.libSetsTreeSetCollectionMod.TreeSetCollectionNs.Listener[T]
  ): scala.Unit = js.native
}

