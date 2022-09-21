package typings.fuzzaldrinPlus

import typings.fuzzaldrinPlus.mod.IFilterOptions
import typings.fuzzaldrinPlus.mod.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object fuzzaldrin {
    
    @JSGlobal("fuzzaldrin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("fuzzaldrin.Query")
    @js.native
    open class Query ()
      extends typings.fuzzaldrinPlus.mod.Query
    
    inline def filter[T](data: js.Array[T], query: String): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(data.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    inline def filter[T](data: js.Array[T], query: String, options: IFilterOptions[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(data.asInstanceOf[js.Any], query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    
    inline def `match`(str: String, query: String): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(str.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def `match`(str: String, query: String, options: IOptions): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(str.asInstanceOf[js.Any], query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    inline def prepareQuery(query: String): typings.fuzzaldrinPlus.mod.Query = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareQuery")(query.asInstanceOf[js.Any]).asInstanceOf[typings.fuzzaldrinPlus.mod.Query]
    inline def prepareQuery(query: String, options: IOptions): typings.fuzzaldrinPlus.mod.Query = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareQuery")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.fuzzaldrinPlus.mod.Query]
    
    inline def score(str: String, query: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("score")(str.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def score(str: String, query: String, options: IOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("score")(str.asInstanceOf[js.Any], query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def wrap(str: String, query: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(str.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def wrap(str: String, query: String, options: IOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(str.asInstanceOf[js.Any], query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
