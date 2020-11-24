package typings.flight.Flight

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UtilsStatic extends js.Object {
  
  def compose(fn1: js.Function, fn2: js.Function, fns: js.Function*): js.Function = js.native
  
  def countThen(num: Double, base: js.Function): js.Function = js.native
  
  def debounce(func: js.Function, wait: Double, immediate: Boolean): js.Function = js.native
  
  def delegate(rules: js.Object): Unit = js.native
  
  def isDomObj(obj: js.Object): Boolean = js.native
  
  def isEnumerable(obj: js.Object, property: String): Boolean = js.native
  
  def merge(obj1: js.Object, obj2: js.Object): js.Object = js.native
  def merge(obj1: js.Object, obj2: js.Object, args: js.Any*): js.Object = js.native
  def merge(obj1: js.Object, obj2: js.Object, deepClone: Boolean): js.Object = js.native
  
  def push(base: js.Object, extra: js.Object): Unit = js.native
  def push(base: js.Object, extra: js.Object, protect: Boolean): Unit = js.native
  
  def throttle(func: js.Function, wait: Double): js.Function = js.native
  
  def toArray(obj: js.Object): js.Array[_] = js.native
  def toArray(obj: js.Object, from: Double): js.Array[_] = js.native
  
  def uniqueArray(array: js.Array[_]): js.Array[_] = js.native
}
