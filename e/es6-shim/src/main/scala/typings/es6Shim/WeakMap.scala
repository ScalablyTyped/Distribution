package typings.es6Shim

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeakMap[K /* <: js.Object */, V] extends js.Object {
  def delete(key: K): Boolean
  def get(key: K): js.UndefOr[V]
  def has(key: K): Boolean
  def set(key: K, value: V): WeakMap[K, V]
}

@JSGlobal("WeakMap")
@js.native
object WeakMap extends TopLevel[WeakMapConstructor]

