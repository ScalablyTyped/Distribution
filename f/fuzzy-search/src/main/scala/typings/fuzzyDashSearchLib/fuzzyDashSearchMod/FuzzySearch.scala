package typings
package fuzzyDashSearchLib.fuzzyDashSearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FuzzySearch[T /* <: js.Object | java.lang.String */] extends js.Object {
  var haystack: js.Array[T] = js.native
  var keys: js.Array[java.lang.String] = js.native
  var options: stdLib.Required[fuzzyDashSearchLib.fuzzyDashSearchMod.FuzzySearchNs.Options] = js.native
  def search(): js.Array[T] = js.native
  def search(needle: java.lang.String): js.Array[T] = js.native
}

