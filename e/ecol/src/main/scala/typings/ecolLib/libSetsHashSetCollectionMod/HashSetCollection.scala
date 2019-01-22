package typings
package ecolLib.libSetsHashSetCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- ecolLib.libBasicICollectionMod.ICollection because Inheritance from two classes */ @JSImport("ecol/lib/sets/HashSetCollection", "HashSetCollection")
@js.native
class HashSetCollection[T] ()
  extends tstlLib.containerHashSetMod.HashSet[T] {
  /**
    * @hidden
    */
  var `dispatcher_`: js.Any = js.native
  /**
    * @inheritDoc
    */
  def addEventListener(
    `type`: ecolLib.libBasicCollectionEventMod.CollectionEventNs.Type,
    listener: ecolLib.libSetsHashSetCollectionMod.HashSetCollectionNs.Listener[T]
  ): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def dispatchEvent(event: ecolLib.libSetsHashSetCollectionMod.HashSetCollectionNs.Event[T]): scala.Unit = js.native
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
    first: tstlLib.containerHashSetMod.HashSetNs.Iterator[T],
    last: tstlLib.containerHashSetMod.HashSetNs.Iterator[T]
  ): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def refresh(it: tstlLib.containerHashSetMod.HashSetNs.Iterator[T]): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def removeEventListener(
    `type`: ecolLib.libBasicCollectionEventMod.CollectionEventNs.Type,
    listener: ecolLib.libSetsHashSetCollectionMod.HashSetCollectionNs.Listener[T]
  ): scala.Unit = js.native
}

