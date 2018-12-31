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

