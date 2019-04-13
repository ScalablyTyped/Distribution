package typings
package doubleDashEndedDashQueueLib.doubleDashEndedDashQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("double-ended-queue", JSImport.Namespace)
@js.native
class Class[T] () extends Deque[T] {
  def this(capacity: scala.Double) = this()
  def this(items: js.Array[T]) = this()
  /* CompleteClass */
  override val length: scala.Double = js.native
  /* CompleteClass */
  override def clear(): scala.Unit = js.native
  /* CompleteClass */
  override def get(index: scala.Double): js.UndefOr[T] = js.native
  /* CompleteClass */
  override def isEmpty(): scala.Boolean = js.native
  /* CompleteClass */
  override def peekBack(): js.UndefOr[T] = js.native
  /* CompleteClass */
  override def peekFront(): js.UndefOr[T] = js.native
  /* CompleteClass */
  override def pop(): js.UndefOr[T] = js.native
  /* CompleteClass */
  override def push(items: T*): scala.Double = js.native
  /* CompleteClass */
  override def shift(): js.UndefOr[T] = js.native
  /* CompleteClass */
  override def toArray(): js.Array[T] = js.native
  /* CompleteClass */
  override def unshift(items: T*): scala.Double = js.native
}

