package typings.fuseJs

import typings.fuseJs.anon.Name
import typings.fuseJs.anon.Score
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fuse.js", JSImport.Namespace)
  @js.native
  class ^[T, O /* <: FuseOptions[T] */] protected ()
    extends StObject
       with Fuse[T, O] {
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
        (FuseResultWithMatches[R] & FuseResultWithScore[R]) | FuseResultWithMatches[R] | FuseResultWithScore[R] | R
      ] = js.native
    def search[/** Type of item of return */
    R, /** include score (boolean) */
    S, /** include matches (boolean) */
    M](pattern: String, opts: SearchOpts): js.Array[
        (FuseResultWithMatches[R] & FuseResultWithScore[R]) | FuseResultWithMatches[R] | FuseResultWithScore[R] | R
      ] = js.native
    
    def setCollection(list: js.Array[T]): js.Array[T] = js.native
  }
  
  trait FuseOptions[T] extends StObject {
    
    var caseSensitive: js.UndefOr[Boolean] = js.undefined
    
    var distance: js.UndefOr[Double] = js.undefined
    
    var findAllMatches: js.UndefOr[Boolean] = js.undefined
    
    var getFn: js.UndefOr[js.Function2[/* obj */ js.Any, /* path */ String, js.Any]] = js.undefined
    
    var id: js.UndefOr[/* keyof T */ String] = js.undefined
    
    var includeMatches: js.UndefOr[Boolean] = js.undefined
    
    var includeScore: js.UndefOr[Boolean] = js.undefined
    
    var keys: js.UndefOr[js.Array[Name[T] | (/* keyof T */ String)]] = js.undefined
    
    var location: js.UndefOr[Double] = js.undefined
    
    var matchAllTokens: js.UndefOr[Boolean] = js.undefined
    
    var maxPatternLength: js.UndefOr[Double] = js.undefined
    
    var minMatchCharLength: js.UndefOr[Double] = js.undefined
    
    var shouldSort: js.UndefOr[Boolean] = js.undefined
    
    var sortFn: js.UndefOr[js.Function2[/* a */ Score, /* b */ Score, Double]] = js.undefined
    
    var threshold: js.UndefOr[Double] = js.undefined
    
    var tokenSeparator: js.UndefOr[RegExp] = js.undefined
    
    var tokenize: js.UndefOr[Boolean] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object FuseOptions {
    
    inline def apply[T](): FuseOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FuseOptions[T]]
    }
    
    extension [Self <: FuseOptions[?], T](x: Self & FuseOptions[T]) {
      
      inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      inline def setFindAllMatches(value: Boolean): Self = StObject.set(x, "findAllMatches", value.asInstanceOf[js.Any])
      
      inline def setFindAllMatchesUndefined: Self = StObject.set(x, "findAllMatches", js.undefined)
      
      inline def setGetFn(value: (/* obj */ js.Any, /* path */ String) => js.Any): Self = StObject.set(x, "getFn", js.Any.fromFunction2(value))
      
      inline def setGetFnUndefined: Self = StObject.set(x, "getFn", js.undefined)
      
      inline def setId(value: /* keyof T */ String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIncludeMatches(value: Boolean): Self = StObject.set(x, "includeMatches", value.asInstanceOf[js.Any])
      
      inline def setIncludeMatchesUndefined: Self = StObject.set(x, "includeMatches", js.undefined)
      
      inline def setIncludeScore(value: Boolean): Self = StObject.set(x, "includeScore", value.asInstanceOf[js.Any])
      
      inline def setIncludeScoreUndefined: Self = StObject.set(x, "includeScore", js.undefined)
      
      inline def setKeys(value: js.Array[Name[T] | (/* keyof T */ String)]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      inline def setKeysVarargs(value: (Name[T] | (/* keyof T */ String))*): Self = StObject.set(x, "keys", js.Array(value :_*))
      
      inline def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setMatchAllTokens(value: Boolean): Self = StObject.set(x, "matchAllTokens", value.asInstanceOf[js.Any])
      
      inline def setMatchAllTokensUndefined: Self = StObject.set(x, "matchAllTokens", js.undefined)
      
      inline def setMaxPatternLength(value: Double): Self = StObject.set(x, "maxPatternLength", value.asInstanceOf[js.Any])
      
      inline def setMaxPatternLengthUndefined: Self = StObject.set(x, "maxPatternLength", js.undefined)
      
      inline def setMinMatchCharLength(value: Double): Self = StObject.set(x, "minMatchCharLength", value.asInstanceOf[js.Any])
      
      inline def setMinMatchCharLengthUndefined: Self = StObject.set(x, "minMatchCharLength", js.undefined)
      
      inline def setShouldSort(value: Boolean): Self = StObject.set(x, "shouldSort", value.asInstanceOf[js.Any])
      
      inline def setShouldSortUndefined: Self = StObject.set(x, "shouldSort", js.undefined)
      
      inline def setSortFn(value: (/* a */ Score, /* b */ Score) => Double): Self = StObject.set(x, "sortFn", js.Any.fromFunction2(value))
      
      inline def setSortFnUndefined: Self = StObject.set(x, "sortFn", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      inline def setTokenSeparator(value: RegExp): Self = StObject.set(x, "tokenSeparator", value.asInstanceOf[js.Any])
      
      inline def setTokenSeparatorUndefined: Self = StObject.set(x, "tokenSeparator", js.undefined)
      
      inline def setTokenize(value: Boolean): Self = StObject.set(x, "tokenize", value.asInstanceOf[js.Any])
      
      inline def setTokenizeUndefined: Self = StObject.set(x, "tokenize", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  trait FuseResultWithMatches[T] extends StObject {
    
    var item: T
    
    var matches: js.Any
  }
  object FuseResultWithMatches {
    
    inline def apply[T](item: T, matches: js.Any): FuseResultWithMatches[T] = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any])
      __obj.asInstanceOf[FuseResultWithMatches[T]]
    }
    
    extension [Self <: FuseResultWithMatches[?], T](x: Self & FuseResultWithMatches[T]) {
      
      inline def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setMatches(value: js.Any): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    }
  }
  
  trait FuseResultWithScore[T] extends StObject {
    
    var item: T
    
    var score: Double
  }
  object FuseResultWithScore {
    
    inline def apply[T](item: T, score: Double): FuseResultWithScore[T] = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
      __obj.asInstanceOf[FuseResultWithScore[T]]
    }
    
    extension [Self <: FuseResultWithScore[?], T](x: Self & FuseResultWithScore[T]) {
      
      inline def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    }
  }
  
  trait SearchOpts extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
  }
  object SearchOpts {
    
    inline def apply(): SearchOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchOpts]
    }
    
    extension [Self <: SearchOpts](x: Self) {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    }
  }
}
