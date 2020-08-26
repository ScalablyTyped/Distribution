package typings.fuzzySearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fuzzy-search", JSImport.Namespace)
@js.native
class ^[T /* <: js.Object | String */] protected () extends FuzzySearch[T] {
  def this(haystack: js.Array[T]) = this()
  def this(haystack: js.Array[T], keys: js.Array[String]) = this()
  def this(haystack: js.Array[T], keys: js.UndefOr[scala.Nothing], options: Options) = this()
  def this(haystack: js.Array[T], keys: js.Array[String], options: Options) = this()
}

@JSImport("fuzzy-search", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def isMatch(item: String, query: String, caseSensitive: Boolean): Double = js.native
}

