package typings.fuzzaldrin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fuzzaldrin", JSImport.Namespace)
@js.native
object fuzzaldrinMod extends js.Object {
  def filter(candidates: js.Array[String], query: String): js.Array[String] = js.native
  def filter(candidates: js.Array[String], query: String, options: Anon_MaxResults): js.Array[String] = js.native
  def filter[T, K /* <: String */](
    candidates: js.Array[T],
    query: String with (/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any),
    options: Anon_Key[K]
  ): js.Array[T] = js.native
  def `match`(string: String, query: String): js.Any = js.native
  def score(string: String, query: String): Double = js.native
}

