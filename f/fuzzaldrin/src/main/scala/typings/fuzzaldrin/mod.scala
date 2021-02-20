package typings.fuzzaldrin

import typings.fuzzaldrin.anon.Key
import typings.fuzzaldrin.anon.MaxResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fuzzaldrin", "filter")
  @js.native
  def filter(candidates: js.Array[String], query: String): js.Array[String] = js.native
  @JSImport("fuzzaldrin", "filter")
  @js.native
  def filter(candidates: js.Array[String], query: String, options: MaxResults): js.Array[String] = js.native
  @JSImport("fuzzaldrin", "filter")
  @js.native
  def filter[T, K /* <: /* keyof T */ String */](
    candidates: js.Array[T],
    query: String with (/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any),
    options: Key[K, T]
  ): js.Array[T] = js.native
  
  @JSImport("fuzzaldrin", "score")
  @js.native
  def score(string: String, query: String): Double = js.native
  
  @JSImport("fuzzaldrin", "match")
  @js.native
  def `match`(string: String, query: String): js.Any = js.native
}
