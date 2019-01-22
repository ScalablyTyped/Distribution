package typings
package ecolLib.libLinearDequeCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- ecolLib.libBasicICollectionMod.ICollection because Inheritance from two classes */ @JSImport("ecol/lib/linear/DequeCollection", "DequeCollection")
@js.native
class DequeCollection[T] ()
  extends tstlLib.containerDequeMod.Deque[T] {
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
    listener: ecolLib.libLinearDequeCollectionMod.DequeCollectionNs.Listener[T]
  ): scala.Unit = js.native
  /**
    * @inheritdoc
    */
  def dispatchEvent(event: ecolLib.libLinearDequeCollectionMod.DequeCollectionNs.Event[T]): scala.Unit = js.native
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
    first: tstlLib.containerDequeMod.DequeNs.Iterator[T],
    last: tstlLib.containerDequeMod.DequeNs.Iterator[T]
  ): scala.Unit = js.native
  /**
    * @inheritdoc
    */
  def refresh(it: tstlLib.containerDequeMod.DequeNs.Iterator[T]): scala.Unit = js.native
  /**
    * @inheritdoc
    */
  def removeEventListener(
    `type`: ecolLib.libBasicCollectionEventMod.CollectionEventNs.Type,
    listener: ecolLib.libLinearDequeCollectionMod.DequeCollectionNs.Listener[T]
  ): scala.Unit = js.native
}

