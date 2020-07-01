package typings.fuzzaldrinPlus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fuzzaldrin-plus", "filter")
@js.native
object filter extends js.Object {
  def apply[T](data: js.Array[T], query: String): js.Array[T] = js.native
  def apply[T](data: js.Array[T], query: String, options: IFilterOptions[T]): js.Array[T] = js.native
}

