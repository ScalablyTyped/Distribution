package typings.ecol.libLinearDequeCollectionMod

import typings.ecol.libBasicCollectionEventMod.CollectionEventNs.Type
import typings.ecol.libLinearDequeCollectionMod.DequeCollectionNs.Event
import typings.ecol.libLinearDequeCollectionMod.DequeCollectionNs.Listener
import typings.tstl.containerDequeMod.Deque
import typings.tstl.containerDequeMod.DequeNs.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.ecol.libBasicICollectionMod.ICollection because Inheritance from two classes. Inlined refresh, refresh, refresh */ @JSImport("ecol/lib/linear/DequeCollection", "DequeCollection")
@js.native
class DequeCollection[T] () extends Deque[T] {
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
  var dispatcher_ : js.Any = js.native
  /**
    * @inheritdoc
    */
  def addEventListener(`type`: Type, listener: Listener[T]): Unit = js.native
  /**
    * @inheritdoc
    */
  def dispatchEvent(event: Event[T]): Unit = js.native
  /**
    * @inheritdoc
    */
  def hasEventListener(`type`: Type): Boolean = js.native
  /**
    * @inheritdoc
    */
  def refresh(): Unit = js.native
  /**
    * @inheritdoc
    */
  def refresh(first: Iterator[T], last: Iterator[T]): Unit = js.native
  /**
    * @inheritdoc
    */
  def refresh(it: Iterator[T]): Unit = js.native
  /**
    * @inheritdoc
    */
  def removeEventListener(`type`: Type, listener: Listener[T]): Unit = js.native
}

