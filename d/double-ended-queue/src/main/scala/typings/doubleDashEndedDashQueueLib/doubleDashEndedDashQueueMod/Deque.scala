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
    clear: js.Function0[scala.Unit],
    get: js.Function1[scala.Double, js.UndefOr[T]],
    isEmpty: js.Function0[scala.Boolean],
    length: scala.Double,
    peekBack: js.Function0[js.UndefOr[T]],
    peekFront: js.Function0[js.UndefOr[T]],
    pop: js.Function0[js.UndefOr[T]],
    push: js.Function1[/* repeated */ T, scala.Double],
    shift: js.Function0[js.UndefOr[T]],
    toArray: js.Function0[js.Array[T]],
    unshift: js.Function1[/* repeated */ T, scala.Double]
  ): Deque[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("isEmpty")(isEmpty)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("peekBack")(peekBack)
    __obj.updateDynamic("peekFront")(peekFront)
    __obj.updateDynamic("pop")(pop)
    __obj.updateDynamic("push")(push)
    __obj.updateDynamic("shift")(shift)
    __obj.updateDynamic("toArray")(toArray)
    __obj.updateDynamic("unshift")(unshift)
    __obj.asInstanceOf[Deque[T]]
  }
}

