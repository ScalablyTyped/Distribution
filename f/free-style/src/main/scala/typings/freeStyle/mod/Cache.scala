package typings.freeStyle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("free-style", "Cache")
@js.native
class Cache[T /* <: Container[_] */] () extends js.Object {
  def this(changes: Changes) = this()
  var _children: js.Any = js.native
  var _counters: js.Any = js.native
  var _keys: js.Any = js.native
  var changeId: Double = js.native
  var changes: Changes = js.native
  var sheet: js.Array[String] = js.native
  def add(style: T): Unit = js.native
  def merge(cache: Cache[_]): this.type = js.native
  def remove(style: T): Unit = js.native
  def unmerge(cache: Cache[_]): this.type = js.native
  def values(): js.Array[T] = js.native
}

