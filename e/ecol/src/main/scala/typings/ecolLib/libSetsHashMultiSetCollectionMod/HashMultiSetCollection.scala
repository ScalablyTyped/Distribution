package typings
package ecolLib.libSetsHashMultiSetCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- ecolLib.libBasicICollectionMod.ICollection because var conflicts: iterator, iterator_IContainer. Inlined refresh, refresh, refresh */ @JSImport("ecol/lib/sets/HashMultiSetCollection", "HashMultiSetCollection")
@js.native
class HashMultiSetCollection[T] ()
  extends tstlLib.containerHashMultiSetMod.HashMultiSet[T] {
  /**
    * @hidden
    */
  var dispatcher_ : js.Any = js.native
  /**
    * @inheritDoc
    */
  def addEventListener(
    `type`: ecolLib.libBasicCollectionEventMod.CollectionEventNs.Type,
    listener: ecolLib.libSetsHashMultiSetCollectionMod.HashMultiSetCollectionNs.Listener[T]
  ): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def dispatchEvent(event: ecolLib.libSetsHashMultiSetCollectionMod.HashMultiSetCollectionNs.Event[T]): scala.Unit = js.native
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
    first: tstlLib.containerHashMultiSetMod.HashMultiSetNs.Iterator[T],
    last: tstlLib.containerHashMultiSetMod.HashMultiSetNs.Iterator[T]
  ): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def refresh(it: tstlLib.containerHashMultiSetMod.HashMultiSetNs.Iterator[T]): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def removeEventListener(
    `type`: ecolLib.libBasicCollectionEventMod.CollectionEventNs.Type,
    listener: ecolLib.libSetsHashMultiSetCollectionMod.HashMultiSetCollectionNs.Listener[T]
  ): scala.Unit = js.native
}

