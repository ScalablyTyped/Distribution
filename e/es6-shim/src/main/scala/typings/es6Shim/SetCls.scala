package typings.es6Shim

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Set")
@js.native
class SetCls[T] () extends Set[T] {
  def this(iterable: IterableShim[T]) = this()
}

