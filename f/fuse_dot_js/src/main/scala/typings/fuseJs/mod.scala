package typings.fuseJs

import typings.fuseJs.anon.Name
import typings.fuseJs.anon.Score
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fuse.js", JSImport.Namespace)
  @js.native
  class ^[T, O /* <: FuseOptions[T] */] protected () extends Fuse[T, O] {
    def this(list: js.Array[T]) = this()
    def this(list: js.Array[T], options: O) = this()
  }
  
  @js.native
  trait Fuse[T, O /* <: FuseOptions[T] */] extends StObject {
    
    var list: js.Array[T] = js.native
    
    def search[/** Type of item of return */
    R, /** include score (boolean) */
    S, /** include matches (boolean) */
    M](pattern: String): js.Array[
        (FuseResultWithMatches[R] with FuseResultWithScore[R]) | FuseResultWithMatches[R] | FuseResultWithScore[R] | R
      ] = js.native
    def search[/** Type of item of return */
    R, /** include score (boolean) */
    S, /** include matches (boolean) */
    M](pattern: String, opts: SearchOpts): js.Array[
        (FuseResultWithMatches[R] with FuseResultWithScore[R]) | FuseResultWithMatches[R] | FuseResultWithScore[R] | R
      ] = js.native
    
    def setCollection(list: js.Array[T]): js.Array[T] = js.native
  }
  
  @js.native
  trait FuseOptions[T] extends StObject {
    
    var caseSensitive: js.UndefOr[Boolean] = js.native
    
    var distance: js.UndefOr[Double] = js.native
    
    var findAllMatches: js.UndefOr[Boolean] = js.native
    
    var getFn: js.UndefOr[js.Function2[/* obj */ js.Any, /* path */ String, _]] = js.native
    
    var id: js.UndefOr[/* keyof T */ String] = js.native
    
    var includeMatches: js.UndefOr[Boolean] = js.native
    
    var includeScore: js.UndefOr[Boolean] = js.native
    
    var keys: js.UndefOr[js.Array[Name[T] | (/* keyof T */ String)]] = js.native
    
    var location: js.UndefOr[Double] = js.native
    
    var matchAllTokens: js.UndefOr[Boolean] = js.native
    
    var maxPatternLength: js.UndefOr[Double] = js.native
    
    var minMatchCharLength: js.UndefOr[Double] = js.native
    
    var shouldSort: js.UndefOr[Boolean] = js.native
    
    var sortFn: js.UndefOr[js.Function2[/* a */ Score, /* b */ Score, Double]] = js.native
    
    var threshold: js.UndefOr[Double] = js.native
    
    var tokenSeparator: js.UndefOr[RegExp] = js.native
    
    var tokenize: js.UndefOr[Boolean] = js.native
    
    var verbose: js.UndefOr[Boolean] = js.native
  }
  object FuseOptions {
    
    @scala.inline
    def apply[T](): FuseOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FuseOptions[T]]
    }
    
    @scala.inline
    implicit class FuseOptionsMutableBuilder[Self <: FuseOptions[_], T] (val x: Self with FuseOptions[T]) extends AnyVal {
      
      @scala.inline
      def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      @scala.inline
      def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      @scala.inline
      def setFindAllMatches(value: Boolean): Self = StObject.set(x, "findAllMatches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFindAllMatchesUndefined: Self = StObject.set(x, "findAllMatches", js.undefined)
      
      @scala.inline
      def setGetFn(value: (/* obj */ js.Any, /* path */ String) => _): Self = StObject.set(x, "getFn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetFnUndefined: Self = StObject.set(x, "getFn", js.undefined)
      
      @scala.inline
      def setId(value: /* keyof T */ String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIncludeMatches(value: Boolean): Self = StObject.set(x, "includeMatches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeMatchesUndefined: Self = StObject.set(x, "includeMatches", js.undefined)
      
      @scala.inline
      def setIncludeScore(value: Boolean): Self = StObject.set(x, "includeScore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeScoreUndefined: Self = StObject.set(x, "includeScore", js.undefined)
      
      @scala.inline
      def setKeys(value: js.Array[Name[T] | (/* keyof T */ String)]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      @scala.inline
      def setKeysVarargs(value: (Name[T] | (/* keyof T */ String))*): Self = StObject.set(x, "keys", js.Array(value :_*))
      
      @scala.inline
      def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setMatchAllTokens(value: Boolean): Self = StObject.set(x, "matchAllTokens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchAllTokensUndefined: Self = StObject.set(x, "matchAllTokens", js.undefined)
      
      @scala.inline
      def setMaxPatternLength(value: Double): Self = StObject.set(x, "maxPatternLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPatternLengthUndefined: Self = StObject.set(x, "maxPatternLength", js.undefined)
      
      @scala.inline
      def setMinMatchCharLength(value: Double): Self = StObject.set(x, "minMatchCharLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinMatchCharLengthUndefined: Self = StObject.set(x, "minMatchCharLength", js.undefined)
      
      @scala.inline
      def setShouldSort(value: Boolean): Self = StObject.set(x, "shouldSort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldSortUndefined: Self = StObject.set(x, "shouldSort", js.undefined)
      
      @scala.inline
      def setSortFn(value: (/* a */ Score, /* b */ Score) => Double): Self = StObject.set(x, "sortFn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSortFnUndefined: Self = StObject.set(x, "sortFn", js.undefined)
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      @scala.inline
      def setTokenSeparator(value: RegExp): Self = StObject.set(x, "tokenSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenSeparatorUndefined: Self = StObject.set(x, "tokenSeparator", js.undefined)
      
      @scala.inline
      def setTokenize(value: Boolean): Self = StObject.set(x, "tokenize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenizeUndefined: Self = StObject.set(x, "tokenize", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  @js.native
  trait FuseResultWithMatches[T] extends StObject {
    
    var item: T = js.native
    
    var matches: js.Any = js.native
  }
  object FuseResultWithMatches {
    
    @scala.inline
    def apply[T](item: T, matches: js.Any): FuseResultWithMatches[T] = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any])
      __obj.asInstanceOf[FuseResultWithMatches[T]]
    }
    
    @scala.inline
    implicit class FuseResultWithMatchesMutableBuilder[Self <: FuseResultWithMatches[_], T] (val x: Self with FuseResultWithMatches[T]) extends AnyVal {
      
      @scala.inline
      def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatches(value: js.Any): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FuseResultWithScore[T] extends StObject {
    
    var item: T = js.native
    
    var score: Double = js.native
  }
  object FuseResultWithScore {
    
    @scala.inline
    def apply[T](item: T, score: Double): FuseResultWithScore[T] = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
      __obj.asInstanceOf[FuseResultWithScore[T]]
    }
    
    @scala.inline
    implicit class FuseResultWithScoreMutableBuilder[Self <: FuseResultWithScore[_], T] (val x: Self with FuseResultWithScore[T]) extends AnyVal {
      
      @scala.inline
      def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SearchOpts extends StObject {
    
    var limit: js.UndefOr[Double] = js.native
  }
  object SearchOpts {
    
    @scala.inline
    def apply(): SearchOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchOpts]
    }
    
    @scala.inline
    implicit class SearchOptsMutableBuilder[Self <: SearchOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    }
  }
}
