package typings.ecol.libSetsHashSetCollectionMod

import typings.ecol.libBasicCollectionEventMod.CollectionEventNs.Type
import typings.ecol.libSetsHashSetCollectionMod.HashSetCollectionNs.Event
import typings.ecol.libSetsHashSetCollectionMod.HashSetCollectionNs.Listener
import typings.tstl.containerHashSetMod.HashSet
import typings.tstl.containerHashSetMod.HashSetNs.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.ecol.libBasicICollectionMod.ICollection because Inheritance from two classes. Inlined refresh, refresh, refresh */ @JSImport("ecol/lib/sets/HashSetCollection", "HashSetCollection")
@js.native
class HashSetCollection[T] () extends HashSet[T] {
  /**
    * @hidden
    */
  var dispatcher_ : js.Any = js.native
  /**
    * @inheritDoc
    */
  def addEventListener(`type`: Type, listener: Listener[T]): Unit = js.native
  /**
    * @inheritDoc
    */
  def dispatchEvent(event: Event[T]): Unit = js.native
  /**
    * @inheritDoc
    */
  def hasEventListener(`type`: Type): Boolean = js.native
  /**
    * @inheritDoc
    */
  def refresh(): Unit = js.native
  /**
    * @inheritDoc
    */
  def refresh(first: Iterator[T], last: Iterator[T]): Unit = js.native
  /**
    * @inheritDoc
    */
  def refresh(it: Iterator[T]): Unit = js.native
  /**
    * @inheritDoc
    */
  def removeEventListener(`type`: Type, listener: Listener[T]): Unit = js.native
}

