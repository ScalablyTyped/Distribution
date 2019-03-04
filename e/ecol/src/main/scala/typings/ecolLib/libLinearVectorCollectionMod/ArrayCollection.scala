package typings
package ecolLib.libLinearVectorCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- ecolLib.libBasicICollectionMod.ICollection because Inheritance from two classes. Inlined refresh, refresh, refresh */ @JSImport("ecol/lib/linear/VectorCollection", "ArrayCollection")
@js.native
class ArrayCollection[T] ()
  extends tstlLib.containerVectorMod.Vector[T] {
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
  def addEventListener(
    `type`: ecolLib.libBasicCollectionEventMod.CollectionEventNs.Type,
    listener: ecolLib.libLinearVectorCollectionMod.ArrayCollectionNs.Listener[T]
  ): scala.Unit = js.native
  /**
    * @inheritdoc
    */
  def dispatchEvent(event: ecolLib.libLinearVectorCollectionMod.ArrayCollectionNs.Event[T]): scala.Unit = js.native
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
    first: tstlLib.containerVectorMod.VectorNs.Iterator[T],
    last: tstlLib.containerVectorMod.VectorNs.Iterator[T]
  ): scala.Unit = js.native
  /**
    * @inheritdoc
    */
  def refresh(it: tstlLib.containerVectorMod.VectorNs.Iterator[T]): scala.Unit = js.native
  /**
    * @inheritdoc
    */
  def removeEventListener(
    `type`: ecolLib.libBasicCollectionEventMod.CollectionEventNs.Type,
    listener: ecolLib.libLinearVectorCollectionMod.ArrayCollectionNs.Listener[T]
  ): scala.Unit = js.native
}

