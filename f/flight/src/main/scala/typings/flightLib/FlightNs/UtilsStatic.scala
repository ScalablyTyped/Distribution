package typings
package flightLib.FlightNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UtilsStatic extends js.Object {
  def compose(fn1: js.Function, fn2: js.Function, fns: js.Function*): js.Function = js.native
  def countThen(num: scala.Double, base: js.Function): js.Function = js.native
  def debounce(func: js.Function, wait: scala.Double, immediate: scala.Boolean): js.Function = js.native
  def delegate(rules: js.Object): scala.Unit = js.native
  def isDomObj(obj: js.Object): scala.Boolean = js.native
  def isEnumerable(obj: js.Object, property: java.lang.String): scala.Boolean = js.native
  def merge(obj1: js.Object, obj2: js.Object): js.Object = js.native
  def merge(obj1: js.Object, obj2: js.Object, args: js.Any*): js.Object = js.native
  def merge(obj1: js.Object, obj2: js.Object, deepClone: scala.Boolean): js.Object = js.native
  def push(base: js.Object, extra: js.Object): scala.Unit = js.native
  def push(base: js.Object, extra: js.Object, protect: scala.Boolean): scala.Unit = js.native
  def throttle(func: js.Function, wait: scala.Double): js.Function = js.native
  def toArray(obj: js.Object): js.Array[_] = js.native
  def toArray(obj: js.Object, from: scala.Double): js.Array[_] = js.native
  def uniqueArray(array: js.Array[_]): js.Array[_] = js.native
}

