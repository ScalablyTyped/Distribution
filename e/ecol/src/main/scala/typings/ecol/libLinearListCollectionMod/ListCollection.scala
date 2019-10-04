package typings.ecol.libLinearListCollectionMod

import typings.ecol.libBasicCollectionEventMod.CollectionEventNs.Type
import typings.ecol.libLinearListCollectionMod.ListCollectionNs.Event
import typings.ecol.libLinearListCollectionMod.ListCollectionNs.Listener
import typings.tstl.containerListMod.List
import typings.tstl.containerListMod.ListNs.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.ecol.libBasicICollectionMod.ICollection because Inheritance from two classes. Inlined refresh, refresh, refresh */ @JSImport("ecol/lib/linear/ListCollection", "ListCollection")
@js.native
class ListCollection[T] () extends List[T] {
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

