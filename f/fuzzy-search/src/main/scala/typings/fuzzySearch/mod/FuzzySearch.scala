package typings.fuzzySearch.mod

import typings.fuzzySearch.RequiredOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FuzzySearch[T /* <: js.Object | String */] extends js.Object {
  var haystack: js.Array[T] = js.native
  var keys: js.Array[String] = js.native
  var options: RequiredOptions = js.native
  def search(): js.Array[T] = js.native
  def search(needle: String): js.Array[T] = js.native
}

