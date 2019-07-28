package typings.es6DashCollections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeakMap[K /* <: js.Object */, V] extends js.Object {
  def clear(): Unit = js.native
  def delete(key: K): Boolean = js.native
  def get(key: K): V = js.native
  def has(key: K): Boolean = js.native
  def set(key: K): WeakMap[K, V] = js.native
  def set(key: K, value: V): WeakMap[K, V] = js.native
}

@JSGlobal("WeakMap")
@js.native
class WeakMapCls[K /* <: js.Object */, V] () extends WeakMap[K, V] {
  def this(iterable: ForEachable[js.Tuple2[K, V]]) = this()
}

