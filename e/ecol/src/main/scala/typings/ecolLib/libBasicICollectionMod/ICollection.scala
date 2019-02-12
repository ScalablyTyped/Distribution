package typings
package ecolLib.libBasicICollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICollection[T, SourceT /* <: tstlLib.baseContainerContainerMod.Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: tstlLib.baseIteratorIteratorMod.Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */]
  extends tstlLib.baseContainerContainerMod.Container[T, SourceT, IteratorT, ReverseT, T]
     with ecolLib.libBasicIEventDispatcherMod.IEventDispatcher[T, SourceT, IteratorT, ReverseT] {
  /**
    * Iterator to the first element.
    *
    * @return Iterator to the first element.
    */
  /* InferMemberOverrides */
  override def begin(): tstlLib.baseIteratorIteratorMod.Iterator[T, SourceT, IteratorT, ReverseT, T] = js.native
  /**
    * Test whether container is empty.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def empty(): scala.Boolean = js.native
  /**
    * Iterator to the end.
    *
    * @return Iterator to the end.
    */
  /* InferMemberOverrides */
  override def end(): tstlLib.baseIteratorIteratorMod.Iterator[T, SourceT, IteratorT, ReverseT, T] = js.native
  /**
    * Insert items at the end.
    *
    * @param items Items to insert.
    * @return Number of elements in the container after insertion.
    */
  /* InferMemberOverrides */
  override def push(items: T*): scala.Double = js.native
  /**
    * Reverse iterator to the first element in reverse.
    *
    * @return Reverse iterator to the first.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def rbegin(): ReverseT = js.native
  def refresh(): scala.Unit = js.native
  def refresh(first: IteratorT, last: IteratorT): scala.Unit = js.native
  def refresh(it: IteratorT): scala.Unit = js.native
  /**
    * Reverse iterator to the reverse end.
    *
    * @return Reverse iterator to the end.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def rend(): ReverseT = js.native
  /**
    * Number of elements in the container.
    */
  /* InferMemberOverrides */
  override def size(): scala.Double = js.native
}

