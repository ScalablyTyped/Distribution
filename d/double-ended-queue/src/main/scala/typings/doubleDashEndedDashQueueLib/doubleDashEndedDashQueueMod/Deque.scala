package typings
package doubleDashEndedDashQueueLib.doubleDashEndedDashQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deque[T] extends js.Object {
  val length: scala.Double
  def clear(): scala.Unit
  def get(index: scala.Double): js.UndefOr[T]
  def isEmpty(): scala.Boolean
  def peekBack(): js.UndefOr[T]
  def peekFront(): js.UndefOr[T]
  def pop(): js.UndefOr[T]
  def push(items: T*): scala.Double
  def shift(): js.UndefOr[T]
  def toArray(): js.Array[T]
  def unshift(items: T*): scala.Double
}

object Deque {
  @scala.inline
  def apply[T](
    clear: () => scala.Unit,
    get: scala.Double => js.UndefOr[T],
    isEmpty: () => scala.Boolean,
    length: scala.Double,
    peekBack: () => js.UndefOr[T],
    peekFront: () => js.UndefOr[T],
    pop: () => js.UndefOr[T],
    push: /* repeated */ T => scala.Double,
    shift: () => js.UndefOr[T],
    toArray: () => js.Array[T],
    unshift: /* repeated */ T => scala.Double
  ): Deque[T] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction1(get), isEmpty = js.Any.fromFunction0(isEmpty), length = length, peekBack = js.Any.fromFunction0(peekBack), peekFront = js.Any.fromFunction0(peekFront), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), shift = js.Any.fromFunction0(shift), toArray = js.Any.fromFunction0(toArray), unshift = js.Any.fromFunction1(unshift))
  
    __obj.asInstanceOf[Deque[T]]
  }
}

