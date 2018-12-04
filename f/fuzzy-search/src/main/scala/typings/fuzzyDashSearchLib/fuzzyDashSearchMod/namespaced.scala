package typings
package fuzzyDashSearchLib.fuzzyDashSearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fuzzy-search", JSImport.Namespace)
@js.native
class namespaced[T /* <: js.Object | java.lang.String */] protected () extends FuzzySearch[T] {
  def this(haystack: js.Array[T]) = this()
  def this(haystack: js.Array[T], keys: js.Array[java.lang.String]) = this()
  def this(haystack: js.Array[T], keys: js.Array[java.lang.String], options: fuzzyDashSearchLib.fuzzyDashSearchMod.FuzzySearchNs.Options) = this()
}

@JSImport("fuzzy-search", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  def isMatch(item: java.lang.String, query: java.lang.String, caseSensitive: scala.Boolean): scala.Double = js.native
}

