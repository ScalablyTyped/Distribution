package typings
package fuzzaldrinLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fuzzaldrin", JSImport.Namespace)
@js.native
object fuzzaldrinMod extends js.Object {
  def filter(candidates: js.Array[java.lang.String], query: java.lang.String): js.Array[java.lang.String] = js.native
  def filter(
    candidates: js.Array[java.lang.String],
    query: java.lang.String,
    options: fuzzaldrinLib.Anon_MaxResults
  ): js.Array[java.lang.String] = js.native
  def filter[T, K /* <: java.lang.String */](
    candidates: js.Array[T],
    query: java.lang.String with (/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any),
    options: fuzzaldrinLib.Anon_MaxResultsKey[K]
  ): js.Array[T] = js.native
  def `match`(string: java.lang.String, query: java.lang.String): js.Any = js.native
  def score(string: java.lang.String, query: java.lang.String): scala.Double = js.native
}

