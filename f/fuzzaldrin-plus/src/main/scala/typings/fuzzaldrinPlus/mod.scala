package typings.fuzzaldrinPlus

import typings.fuzzaldrinPlus.anon.TagClass
import typings.fuzzaldrinPlus.fuzzaldrinPlusStrings.Slash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fuzzaldrin-plus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fuzzaldrin-plus", "Query")
  @js.native
  open class Query () extends StObject {
    
    @JSName("$$__internal")
    var DollarDollar__internal: js.Symbol = js.native
  }
  
  inline def filter[T](data: js.Array[T], query: String): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(data.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def filter[T](data: js.Array[T], query: String, options: IFilterOptions[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(data.asInstanceOf[js.Any], query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def `match`(str: String, query: String): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(str.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def `match`(str: String, query: String, options: IOptions): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(str.asInstanceOf[js.Any], query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def prepareQuery(query: String): Query = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareQuery")(query.asInstanceOf[js.Any]).asInstanceOf[Query]
  inline def prepareQuery(query: String, options: IOptions): Query = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareQuery")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Query]
  
  inline def score(str: String, query: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("score")(str.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def score(str: String, query: String, options: IOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("score")(str.asInstanceOf[js.Any], query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def wrap(str: String, query: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(str.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def wrap(str: String, query: String, options: IOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(str.asInstanceOf[js.Any], query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait IFilterOptions[T]
    extends StObject
       with IOptions {
    
    var key: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: T extends string ? never : keyof T | undefined */ js.Any
      ] = js.undefined
    
    var maxInners: js.UndefOr[Double] = js.undefined
    
    var maxResults: js.UndefOr[Double] = js.undefined
  }
  object IFilterOptions {
    
    inline def apply[T](): IFilterOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFilterOptions[T]]
    }
    
    extension [Self <: IFilterOptions[?], T](x: Self & IFilterOptions[T]) {
      
      inline def setKey(
        value: /* import warning: importer.ImportType#apply Failed type conversion: T extends string ? never : keyof T | undefined */ js.Any
      ): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setMaxInners(value: Double): Self = StObject.set(x, "maxInners", value.asInstanceOf[js.Any])
      
      inline def setMaxInnersUndefined: Self = StObject.set(x, "maxInners", js.undefined)
      
      inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    }
  }
  
  trait IOptions extends StObject {
    
    var allowErrors: js.UndefOr[Boolean] = js.undefined
    
    var optCharRegEx: js.UndefOr[js.RegExp] = js.undefined
    
    var pathSeparator: js.UndefOr[Slash | (/* \ */ String)] = js.undefined
    
    var preparedQuery: js.UndefOr[Query] = js.undefined
    
    var useExtensionBonus: js.UndefOr[Boolean] = js.undefined
    
    var usePathScoring: js.UndefOr[Boolean] = js.undefined
    
    var wrap: js.UndefOr[TagClass] = js.undefined
  }
  object IOptions {
    
    inline def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    extension [Self <: IOptions](x: Self) {
      
      inline def setAllowErrors(value: Boolean): Self = StObject.set(x, "allowErrors", value.asInstanceOf[js.Any])
      
      inline def setAllowErrorsUndefined: Self = StObject.set(x, "allowErrors", js.undefined)
      
      inline def setOptCharRegEx(value: js.RegExp): Self = StObject.set(x, "optCharRegEx", value.asInstanceOf[js.Any])
      
      inline def setOptCharRegExUndefined: Self = StObject.set(x, "optCharRegEx", js.undefined)
      
      inline def setPathSeparator(value: Slash | (/* \ */ String)): Self = StObject.set(x, "pathSeparator", value.asInstanceOf[js.Any])
      
      inline def setPathSeparatorUndefined: Self = StObject.set(x, "pathSeparator", js.undefined)
      
      inline def setPreparedQuery(value: Query): Self = StObject.set(x, "preparedQuery", value.asInstanceOf[js.Any])
      
      inline def setPreparedQueryUndefined: Self = StObject.set(x, "preparedQuery", js.undefined)
      
      inline def setUseExtensionBonus(value: Boolean): Self = StObject.set(x, "useExtensionBonus", value.asInstanceOf[js.Any])
      
      inline def setUseExtensionBonusUndefined: Self = StObject.set(x, "useExtensionBonus", js.undefined)
      
      inline def setUsePathScoring(value: Boolean): Self = StObject.set(x, "usePathScoring", value.asInstanceOf[js.Any])
      
      inline def setUsePathScoringUndefined: Self = StObject.set(x, "usePathScoring", js.undefined)
      
      inline def setWrap(value: TagClass): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
}
