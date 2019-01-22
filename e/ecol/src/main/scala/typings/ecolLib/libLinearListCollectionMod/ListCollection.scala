package typings
package ecolLib.libLinearListCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- ecolLib.libBasicICollectionMod.ICollection because var conflicts: iterator, iterator_IContainer. Inlined refresh, refresh, refresh */ @JSImport("ecol/lib/linear/ListCollection", "ListCollection")
@js.native
class ListCollection[T] ()
  extends tstlLib.containerListMod.List[T] {
  /**
    * @hidden
    */
  var _Notify_erase: js.Any = js.native
  /**
    * @hidden
    */
  var _Notify_insert: js.Any = js.native
  /**
    * @hidden
    */
  var `dispatcher_`: js.Any = js.native
  /**
    * @inheritdoc
    */
  def addEventListener(
    `type`: ecolLib.libBasicCollectionEventMod.CollectionEventNs.Type,
    listener: ecolLib.libLinearListCollectionMod.ListCollectionNs.Listener[T]
  ): scala.Unit = js.native
  /**
    * @inheritdoc
    */
  def dispatchEvent(event: ecolLib.libLinearListCollectionMod.ListCollectionNs.Event[T]): scala.Unit = js.native
  /**
    * @inheritdoc
    */
  def hasEventListener(`type`: ecolLib.libBasicCollectionEventMod.CollectionEventNs.Type): scala.Boolean = js.native
  /**
    * @inheritdoc
    */
  def refresh(): scala.Unit = js.native
  /**
    * @inheritdoc
    */
  def refresh(
    first: tstlLib.containerListMod.ListNs.Iterator[T],
    last: tstlLib.containerListMod.ListNs.Iterator[T]
  ): scala.Unit = js.native
  /**
    * @inheritdoc
    */
  def refresh(it: tstlLib.containerListMod.ListNs.Iterator[T]): scala.Unit = js.native
  /**
    * @inheritdoc
    */
  def removeEventListener(
    `type`: ecolLib.libBasicCollectionEventMod.CollectionEventNs.Type,
    listener: ecolLib.libLinearListCollectionMod.ListCollectionNs.Listener[T]
  ): scala.Unit = js.native
}

