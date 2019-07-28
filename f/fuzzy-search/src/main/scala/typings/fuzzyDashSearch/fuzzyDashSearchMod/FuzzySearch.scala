package typings.fuzzyDashSearch.fuzzyDashSearchMod

import typings.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FuzzySearch[T /* <: js.Object | String */] extends js.Object {
  var haystack: js.Array[T] = js.native
  var keys: js.Array[String] = js.native
  var options: Required[Options] = js.native
  def search(): js.Array[T] = js.native
  def search(needle: String): js.Array[T] = js.native
}

