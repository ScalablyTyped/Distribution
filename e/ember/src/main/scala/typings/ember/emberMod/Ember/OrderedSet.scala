package typings.ember.emberMod.Ember

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class is used internally by Ember and Ember Data.
  * Please do not use it at this time. We plan to clean it up
  * and add many tests soon.
  * @deprecated
  */
@JSImport("ember", "Ember.OrderedSet")
@js.native
class OrderedSet () extends js.Object {
  def add(obj: js.Any): Unit = js.native
  def clear(): Unit = js.native
  def copy(): OrderedSet = js.native
  def forEach(fn: js.Function1[/* repeated */ js.Any, _], self: js.Any): Unit = js.native
  def has(obj: js.Any): Boolean = js.native
  def isEmpty(): Boolean = js.native
  def toArray(): Array[_] = js.native
}

/* static members */
@JSImport("ember", "Ember.OrderedSet")
@js.native
object OrderedSet extends js.Object {
  def create(): OrderedSet = js.native
}

