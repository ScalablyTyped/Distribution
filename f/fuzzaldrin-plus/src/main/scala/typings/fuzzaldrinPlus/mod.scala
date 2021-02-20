package typings.fuzzaldrinPlus

import typings.fuzzaldrinPlus.anon.TagClass
import typings.fuzzaldrinPlus.fuzzaldrinPlusStrings.Backslash
import typings.fuzzaldrinPlus.fuzzaldrinPlusStrings.Slash
import typings.std.RegExp
import typings.std.Symbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fuzzaldrin-plus", "Query")
  @js.native
  class Query () extends StObject {
    
    @JSName("$$__internal")
    var DollarDollar__internal: Symbol = js.native
  }
  
  @JSImport("fuzzaldrin-plus", "filter")
  @js.native
  def filter[T](data: js.Array[T], query: String): js.Array[T] = js.native
  @JSImport("fuzzaldrin-plus", "filter")
  @js.native
  def filter[T](data: js.Array[T], query: String, options: IFilterOptions[T]): js.Array[T] = js.native
  
  @JSImport("fuzzaldrin-plus", "prepareQuery")
  @js.native
  def prepareQuery(query: String): Query = js.native
  @JSImport("fuzzaldrin-plus", "prepareQuery")
  @js.native
  def prepareQuery(query: String, options: IOptions): Query = js.native
  
  @JSImport("fuzzaldrin-plus", "score")
  @js.native
  def score(str: String, query: String): Double = js.native
  @JSImport("fuzzaldrin-plus", "score")
  @js.native
  def score(str: String, query: String, options: IOptions): Double = js.native
  
  @JSImport("fuzzaldrin-plus", "wrap")
  @js.native
  def wrap(str: String, query: String): String = js.native
  @JSImport("fuzzaldrin-plus", "wrap")
  @js.native
  def wrap(str: String, query: String, options: IOptions): String = js.native
  
  /* Inlined fuzzaldrin-plus.fuzzaldrin-plus.IOptions & {  key :T extends string ? never : keyof T | undefined,   maxResults :number | undefined,   maxInners :number | undefined} */
  @js.native
  trait IFilterOptions[T] extends StObject {
    
    var allowErrors: js.UndefOr[Boolean] = js.native
    
    var key: js.UndefOr[/* keyof T */ String] = js.native
    
    var maxInners: js.UndefOr[Double] = js.native
    
    var maxResults: js.UndefOr[Double] = js.native
    
    var optCharRegEx: js.UndefOr[RegExp] = js.native
    
    var pathSeparator: js.UndefOr[Slash | Backslash | String] = js.native
    
    var preparedQuery: js.UndefOr[Query] = js.native
    
    var useExtensionBonus: js.UndefOr[Boolean] = js.native
    
    var usePathScoring: js.UndefOr[Boolean] = js.native
    
    var wrap: js.UndefOr[TagClass] = js.native
  }
  object IFilterOptions {
    
    @scala.inline
    def apply[T](): IFilterOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFilterOptions[T]]
    }
    
    @scala.inline
    implicit class IFilterOptionsMutableBuilder[Self <: IFilterOptions[_], T] (val x: Self with IFilterOptions[T]) extends AnyVal {
      
      @scala.inline
      def setAllowErrors(value: Boolean): Self = StObject.set(x, "allowErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowErrorsUndefined: Self = StObject.set(x, "allowErrors", js.undefined)
      
      @scala.inline
      def setKey(value: /* keyof T */ String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setMaxInners(value: Double): Self = StObject.set(x, "maxInners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxInnersUndefined: Self = StObject.set(x, "maxInners", js.undefined)
      
      @scala.inline
      def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
      
      @scala.inline
      def setOptCharRegEx(value: RegExp): Self = StObject.set(x, "optCharRegEx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptCharRegExUndefined: Self = StObject.set(x, "optCharRegEx", js.undefined)
      
      @scala.inline
      def setPathSeparator(value: Slash | Backslash | String): Self = StObject.set(x, "pathSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathSeparatorUndefined: Self = StObject.set(x, "pathSeparator", js.undefined)
      
      @scala.inline
      def setPreparedQuery(value: Query): Self = StObject.set(x, "preparedQuery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreparedQueryUndefined: Self = StObject.set(x, "preparedQuery", js.undefined)
      
      @scala.inline
      def setUseExtensionBonus(value: Boolean): Self = StObject.set(x, "useExtensionBonus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseExtensionBonusUndefined: Self = StObject.set(x, "useExtensionBonus", js.undefined)
      
      @scala.inline
      def setUsePathScoring(value: Boolean): Self = StObject.set(x, "usePathScoring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsePathScoringUndefined: Self = StObject.set(x, "usePathScoring", js.undefined)
      
      @scala.inline
      def setWrap(value: TagClass): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  @js.native
  trait IOptions extends StObject {
    
    var allowErrors: js.UndefOr[Boolean] = js.native
    
    var optCharRegEx: js.UndefOr[RegExp] = js.native
    
    var pathSeparator: js.UndefOr[Slash | Backslash | String] = js.native
    
    var preparedQuery: js.UndefOr[Query] = js.native
    
    var useExtensionBonus: js.UndefOr[Boolean] = js.native
    
    var usePathScoring: js.UndefOr[Boolean] = js.native
    
    var wrap: js.UndefOr[TagClass] = js.native
  }
  object IOptions {
    
    @scala.inline
    def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    @scala.inline
    implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowErrors(value: Boolean): Self = StObject.set(x, "allowErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowErrorsUndefined: Self = StObject.set(x, "allowErrors", js.undefined)
      
      @scala.inline
      def setOptCharRegEx(value: RegExp): Self = StObject.set(x, "optCharRegEx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptCharRegExUndefined: Self = StObject.set(x, "optCharRegEx", js.undefined)
      
      @scala.inline
      def setPathSeparator(value: Slash | Backslash | String): Self = StObject.set(x, "pathSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathSeparatorUndefined: Self = StObject.set(x, "pathSeparator", js.undefined)
      
      @scala.inline
      def setPreparedQuery(value: Query): Self = StObject.set(x, "preparedQuery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreparedQueryUndefined: Self = StObject.set(x, "preparedQuery", js.undefined)
      
      @scala.inline
      def setUseExtensionBonus(value: Boolean): Self = StObject.set(x, "useExtensionBonus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseExtensionBonusUndefined: Self = StObject.set(x, "useExtensionBonus", js.undefined)
      
      @scala.inline
      def setUsePathScoring(value: Boolean): Self = StObject.set(x, "usePathScoring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsePathScoringUndefined: Self = StObject.set(x, "usePathScoring", js.undefined)
      
      @scala.inline
      def setWrap(value: TagClass): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  @JSImport("fuzzaldrin-plus", "match")
  @js.native
  def `match`(str: String, query: String): js.Array[Double] = js.native
  @JSImport("fuzzaldrin-plus", "match")
  @js.native
  def `match`(str: String, query: String, options: IOptions): js.Array[Double] = js.native
}
