package typings.genericPool.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("generic-pool", "createPool")
@js.native
object createPool extends js.Object {
  def apply[T](factory: Factory[T]): Pool[T] = js.native
  def apply[T](factory: Factory[T], opts: Options): Pool[T] = js.native
}

