package typings.fuseDotJs.fuseDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fuse[T, O /* <: FuseOptions[_] */] extends js.Object {
  def search(pattern: String): js.Array[(FuseResult[String | T]) | String | T] = js.native
  def search(pattern: String, opts: SearchOpts): js.Array[(FuseResult[String | T]) | String | T] = js.native
  def setCollection(list: js.Array[T]): js.Array[T] = js.native
}

