package typings.fuzzaldrin

import typings.fuzzaldrin.anon.Key
import typings.fuzzaldrin.anon.MaxResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fuzzaldrin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def filter(candidates: js.Array[String], query: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(candidates.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def filter(candidates: js.Array[String], query: String, options: MaxResults): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(candidates.asInstanceOf[js.Any], query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def filter[T, K /* <: /* keyof T */ String */](
    candidates: js.Array[T],
    query: String & (/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any),
    options: Key[K, T]
  ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(candidates.asInstanceOf[js.Any], query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def `match`(string: String, query: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(string.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def score(string: String, query: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("score")(string.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[Double]
}
