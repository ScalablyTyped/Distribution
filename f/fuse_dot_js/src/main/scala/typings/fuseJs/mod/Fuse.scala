package typings.fuseJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.fuseJs.anon.Idx
import typings.fuseJs.anon.Keys
import typings.fuseJs.anon.RecordEntryObjectinumber
import typings.fuseJs.anon._empty
import typings.fuseJs.mod.Fuse.Expression
import typings.fuseJs.mod.Fuse.FuseIndex
import typings.fuseJs.mod.Fuse.FuseResult
import typings.fuseJs.mod.Fuse.FuseSearchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fuse[T] extends StObject {
  
  /**
    * Adds a doc to the end the list.
    */
  def add(doc: T): Unit = js.native
  
  /**
    * Returns the generated Fuse index
    */
  def getIndex(): FuseIndex[T] = js.native
  
  /**
    * Removes all documents from the list which the predicate returns truthy for,
    * and returns an array of the removed docs.
    * The predicate is invoked with two arguments: (doc, index).
    */
  def remove(predicate: js.Function2[/* doc */ T, /* idx */ Double, Boolean]): js.Array[T] = js.native
  
  /**
    * Removes the doc at the specified index.
    */
  def removeAt(idx: Double): Unit = js.native
  
  /**
    * Search function for the Fuse instance.
    *
    * ```typescript
    * const list: MyType[] = [myType1, myType2, etc...]
    * const options: Fuse.IFuseOptions<MyType> = {
    *  keys: ['key1', 'key2']
    * }
    *
    * const myFuse = new Fuse(list, options)
    * let result = myFuse.search('pattern')
    * ```
    *
    * @param pattern The pattern to search
    * @param options `Fuse.FuseSearchOptions`
    * @returns An array of search results
    */
  def search[R](pattern: String): js.Array[FuseResult[R]] = js.native
  def search[R](pattern: String, options: FuseSearchOptions): js.Array[FuseResult[R]] = js.native
  def search[R](pattern: Expression): js.Array[FuseResult[R]] = js.native
  def search[R](pattern: Expression, options: FuseSearchOptions): js.Array[FuseResult[R]] = js.native
  
  def setCollection(docs: js.Array[T]): Unit = js.native
  def setCollection(docs: js.Array[T], index: FuseIndex[T]): Unit = js.native
}
object Fuse {
  
  /* Rewritten from type alias, can be one of: 
    - org.scalablytyped.runtime.StringDictionary[java.lang.String]
    - typings.fuseJs.anon.Path
    - typings.fuseJs.anon.And
    - typings.fuseJs.anon.Or
  */
  type Expression = _Expression | StringDictionary[String]
  
  type FuseGetFunction[T] = js.Function2[/* obj */ T, /* path */ String | js.Array[String], js.Array[String] | String]
  
  trait FuseIndex[T] extends StObject {
    
    def add(doc: T): Unit
    
    def create(): Unit
    
    def setIndexRecords(records: FuseIndexRecords): Unit
    
    def setKeys(keys: js.Array[String]): Unit
    
    def setSources(docs: js.Array[T]): Unit
    
    def toJSON(): Keys
  }
  object FuseIndex {
    
    inline def apply[T](
      add: T => Unit,
      create: () => Unit,
      setIndexRecords: FuseIndexRecords => Unit,
      setKeys: js.Array[String] => Unit,
      setSources: js.Array[T] => Unit,
      toJSON: () => Keys
    ): FuseIndex[T] = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), create = js.Any.fromFunction0(create), setIndexRecords = js.Any.fromFunction1(setIndexRecords), setKeys = js.Any.fromFunction1(setKeys), setSources = js.Any.fromFunction1(setSources), toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[FuseIndex[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FuseIndex[?], T] (val x: Self & FuseIndex[T]) extends AnyVal {
      
      inline def setAdd(value: T => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setCreate(value: () => Unit): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
      
      inline def setSetIndexRecords(value: FuseIndexRecords => Unit): Self = StObject.set(x, "setIndexRecords", js.Any.fromFunction1(value))
      
      inline def setSetKeys(value: js.Array[String] => Unit): Self = StObject.set(x, "setKeys", js.Any.fromFunction1(value))
      
      inline def setSetSources(value: js.Array[T] => Unit): Self = StObject.set(x, "setSources", js.Any.fromFunction1(value))
      
      inline def setToJSON(value: () => Keys): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
  
  // {
  //   i: 0,
  //   '$': {
  //     '0': { v: "Old Man's War", n: 0.5773502691896258 },
  //     '1': { v: 'Codenar', n: 1 },
  //     '2': [
  //       { v: 'pizza lover', i: 2, n: 0.7071067811865475 },
  //       { v: 'helo wold', i: 1, n: 0.7071067811865475 },
  //       { v: 'hello world', i: 0, n: 0.7071067811865475 }
  //     ]
  //   }
  // }
  trait FuseIndexObjectRecord extends StObject {
    
    // The index of the record in the source list
    @JSName("$")
    var $: RecordEntry
    
    var i: Double
  }
  object FuseIndexObjectRecord {
    
    inline def apply($: RecordEntry, i: Double): FuseIndexObjectRecord = {
      val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any])
      __obj.asInstanceOf[FuseIndexObjectRecord]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FuseIndexObjectRecord] (val x: Self) extends AnyVal {
      
      inline def set$(value: RecordEntry): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
      
      inline def setI(value: Double): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
    }
  }
  
  trait FuseIndexOptions[T] extends StObject {
    
    def getFn(obj: T, path: String): js.Array[String] | String
    def getFn(obj: T, path: js.Array[String]): js.Array[String] | String
    @JSName("getFn")
    var getFn_Original: FuseGetFunction[T]
  }
  object FuseIndexOptions {
    
    inline def apply[T](getFn: (T, /* path */ String | js.Array[String]) => js.Array[String] | String): FuseIndexOptions[T] = {
      val __obj = js.Dynamic.literal(getFn = js.Any.fromFunction2(getFn))
      __obj.asInstanceOf[FuseIndexOptions[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FuseIndexOptions[?], T] (val x: Self & FuseIndexOptions[T]) extends AnyVal {
      
      inline def setGetFn(value: (T, /* path */ String | js.Array[String]) => js.Array[String] | String): Self = StObject.set(x, "getFn", js.Any.fromFunction2(value))
    }
  }
  
  type FuseIndexRecords = js.Array[FuseIndexObjectRecord | FuseIndexStringRecord]
  
  // {
  //   keys: null,
  //   list: [
  //     { v: 'one', i: 0, n: 1 },
  //     { v: 'two', i: 1, n: 1 },
  //     { v: 'three', i: 2, n: 1 }
  //   ]
  // }
  trait FuseIndexStringRecord extends StObject {
    
    var i: Double
    
    // The text value
    var n: Double
    
    // The index of the record in the source list
    var v: String
  }
  object FuseIndexStringRecord {
    
    inline def apply(i: Double, n: Double, v: String): FuseIndexStringRecord = {
      val __obj = js.Dynamic.literal(i = i.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[FuseIndexStringRecord]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FuseIndexStringRecord] (val x: Self) extends AnyVal {
      
      inline def setI(value: Double): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      inline def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      inline def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  type FuseOptionKey[T] = FuseOptionKeyObject[T] | String | js.Array[String]
  
  trait FuseOptionKeyObject[T] extends StObject {
    
    var getFn: js.UndefOr[js.Function1[/* obj */ T, js.Array[String] | String]] = js.undefined
    
    var name: String | js.Array[String]
    
    var weight: js.UndefOr[Double] = js.undefined
  }
  object FuseOptionKeyObject {
    
    inline def apply[T](name: String | js.Array[String]): FuseOptionKeyObject[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FuseOptionKeyObject[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FuseOptionKeyObject[?], T] (val x: Self & FuseOptionKeyObject[T]) extends AnyVal {
      
      inline def setGetFn(value: /* obj */ T => js.Array[String] | String): Self = StObject.set(x, "getFn", js.Any.fromFunction1(value))
      
      inline def setGetFnUndefined: Self = StObject.set(x, "getFn", js.undefined)
      
      inline def setName(value: String | js.Array[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value*))
      
      inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    }
  }
  
  trait FuseResult[T] extends StObject {
    
    var item: T
    
    var matches: js.UndefOr[js.Array[FuseResultMatch]] = js.undefined
    
    var refIndex: Double
    
    var score: js.UndefOr[Double] = js.undefined
  }
  object FuseResult {
    
    inline def apply[T](item: T, refIndex: Double): FuseResult[T] = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], refIndex = refIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[FuseResult[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FuseResult[?], T] (val x: Self & FuseResult[T]) extends AnyVal {
      
      inline def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setMatches(value: js.Array[FuseResultMatch]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      inline def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
      
      inline def setMatchesVarargs(value: FuseResultMatch*): Self = StObject.set(x, "matches", js.Array(value*))
      
      inline def setRefIndex(value: Double): Self = StObject.set(x, "refIndex", value.asInstanceOf[js.Any])
      
      inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
      
      inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    }
  }
  
  trait FuseResultMatch extends StObject {
    
    var indices: js.Array[RangeTuple]
    
    var key: js.UndefOr[String] = js.undefined
    
    var refIndex: js.UndefOr[Double] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object FuseResultMatch {
    
    inline def apply(indices: js.Array[RangeTuple]): FuseResultMatch = {
      val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any])
      __obj.asInstanceOf[FuseResultMatch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FuseResultMatch] (val x: Self) extends AnyVal {
      
      inline def setIndices(value: js.Array[RangeTuple]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
      
      inline def setIndicesVarargs(value: RangeTuple*): Self = StObject.set(x, "indices", js.Array(value*))
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setRefIndex(value: Double): Self = StObject.set(x, "refIndex", value.asInstanceOf[js.Any])
      
      inline def setRefIndexUndefined: Self = StObject.set(x, "refIndex", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait FuseSearchOptions extends StObject {
    
    var limit: Double
  }
  object FuseSearchOptions {
    
    inline def apply(limit: Double): FuseSearchOptions = {
      val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any])
      __obj.asInstanceOf[FuseSearchOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FuseSearchOptions] (val x: Self) extends AnyVal {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    }
  }
  
  type FuseSortFunction = js.Function2[/* a */ FuseSortFunctionArg, /* b */ FuseSortFunctionArg, Double]
  
  trait FuseSortFunctionArg extends StObject {
    
    var idx: Double
    
    var item: FuseSortFunctionItem
    
    var matches: js.UndefOr[js.Array[FuseSortFunctionMatch | FuseSortFunctionMatchList]] = js.undefined
    
    var score: Double
  }
  object FuseSortFunctionArg {
    
    inline def apply(idx: Double, item: FuseSortFunctionItem, score: Double): FuseSortFunctionArg = {
      val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
      __obj.asInstanceOf[FuseSortFunctionArg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FuseSortFunctionArg] (val x: Self) extends AnyVal {
      
      inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
      
      inline def setItem(value: FuseSortFunctionItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setMatches(value: js.Array[FuseSortFunctionMatch | FuseSortFunctionMatchList]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      inline def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
      
      inline def setMatchesVarargs(value: (FuseSortFunctionMatch | FuseSortFunctionMatchList)*): Self = StObject.set(x, "matches", js.Array(value*))
      
      inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    }
  }
  
  type FuseSortFunctionItem = StringDictionary[_empty | js.Array[Idx]]
  
  trait FuseSortFunctionMatch extends StObject {
    
    var indices: js.Array[js.Array[Double]]
    
    var key: String
    
    var score: Double
    
    var value: String
  }
  object FuseSortFunctionMatch {
    
    inline def apply(indices: js.Array[js.Array[Double]], key: String, score: Double, value: String): FuseSortFunctionMatch = {
      val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FuseSortFunctionMatch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FuseSortFunctionMatch] (val x: Self) extends AnyVal {
      
      inline def setIndices(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
      
      inline def setIndicesVarargs(value: js.Array[Double]*): Self = StObject.set(x, "indices", js.Array(value*))
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait FuseSortFunctionMatchList
    extends StObject
       with FuseSortFunctionMatch {
    
    var idx: Double
  }
  object FuseSortFunctionMatchList {
    
    inline def apply(idx: Double, indices: js.Array[js.Array[Double]], key: String, score: Double, value: String): FuseSortFunctionMatchList = {
      val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FuseSortFunctionMatchList]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FuseSortFunctionMatchList] (val x: Self) extends AnyVal {
      
      inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
    }
  }
  
  trait IFuseOptions[T] extends StObject {
    
    /** Determines how close the match must be to the fuzzy location (specified by `location`). An exact letter match which is `distance` characters away from the fuzzy location would score as a complete mismatch. A `distance` of `0` requires the match be at the exact `location` specified. A distance of `1000` would require a perfect match to be within `800` characters of the `location` to be found using a `threshold` of `0.8`. */
    var distance: js.UndefOr[Double] = js.undefined
    
    /** Determines how much the `field-length norm` affects scoring. A value of `0` is equivalent to ignoring the field-length norm. A value of `0.5` will greatly reduce the effect of field-length norm, while a value of `2.0` will greatly increase it. */
    var fieldNormWeight: js.UndefOr[Double] = js.undefined
    
    /** When true, the matching function will continue to the end of a search pattern even if a perfect match has already been located in the string. */
    var findAllMatches: js.UndefOr[Boolean] = js.undefined
    
    /** The function to use to retrieve an object's value at the provided path. The default will also search nested paths. */
    var getFn: js.UndefOr[FuseGetFunction[T]] = js.undefined
    
    /** When `true`, the calculation for the relevance score (used for sorting) will ignore the `field-length norm`. */
    var ignoreFieldNorm: js.UndefOr[Boolean] = js.undefined
    
    /** When `true`, search will ignore `location` and `distance`, so it won't matter where in the string the pattern appears. */
    var ignoreLocation: js.UndefOr[Boolean] = js.undefined
    
    /** Whether the matches should be included in the result set. When `true`, each record in the result set will include the indices of the matched characters. These can consequently be used for highlighting purposes. */
    var includeMatches: js.UndefOr[Boolean] = js.undefined
    
    /** Whether the score should be included in the result set. A score of `0`indicates a perfect match, while a score of `1` indicates a complete mismatch. */
    var includeScore: js.UndefOr[Boolean] = js.undefined
    
    /** Indicates whether comparisons should be case sensitive. */
    var isCaseSensitive: js.UndefOr[Boolean] = js.undefined
    
    /** List of keys that will be searched. This supports nested paths, weighted search, searching in arrays of `strings` and `objects`. */
    var keys: js.UndefOr[js.Array[FuseOptionKey[T]]] = js.undefined
    
    /** Determines approximately where in the text is the pattern expected to be found. */
    var location: js.UndefOr[Double] = js.undefined
    
    /** Only the matches whose length exceeds this value will be returned. (For instance, if you want to ignore single character matches in the result, set it to `2`). */
    var minMatchCharLength: js.UndefOr[Double] = js.undefined
    
    /** Whether to sort the result list, by score. */
    var shouldSort: js.UndefOr[Boolean] = js.undefined
    
    /** The function to use to sort all the results. The default will sort by ascending relevance score, ascending index. */
    var sortFn: js.UndefOr[FuseSortFunction] = js.undefined
    
    /** At what point does the match algorithm give up. A threshold of `0.0` requires a perfect match (of both letters and location), a threshold of `1.0` would match anything. */
    var threshold: js.UndefOr[Double] = js.undefined
    
    /** When `true`, it enables the use of unix-like search commands. See [example](/examples.html#extended-search). */
    var useExtendedSearch: js.UndefOr[Boolean] = js.undefined
  }
  object IFuseOptions {
    
    inline def apply[T](): IFuseOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFuseOptions[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFuseOptions[?], T] (val x: Self & IFuseOptions[T]) extends AnyVal {
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      inline def setFieldNormWeight(value: Double): Self = StObject.set(x, "fieldNormWeight", value.asInstanceOf[js.Any])
      
      inline def setFieldNormWeightUndefined: Self = StObject.set(x, "fieldNormWeight", js.undefined)
      
      inline def setFindAllMatches(value: Boolean): Self = StObject.set(x, "findAllMatches", value.asInstanceOf[js.Any])
      
      inline def setFindAllMatchesUndefined: Self = StObject.set(x, "findAllMatches", js.undefined)
      
      inline def setGetFn(value: (T, /* path */ String | js.Array[String]) => js.Array[String] | String): Self = StObject.set(x, "getFn", js.Any.fromFunction2(value))
      
      inline def setGetFnUndefined: Self = StObject.set(x, "getFn", js.undefined)
      
      inline def setIgnoreFieldNorm(value: Boolean): Self = StObject.set(x, "ignoreFieldNorm", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFieldNormUndefined: Self = StObject.set(x, "ignoreFieldNorm", js.undefined)
      
      inline def setIgnoreLocation(value: Boolean): Self = StObject.set(x, "ignoreLocation", value.asInstanceOf[js.Any])
      
      inline def setIgnoreLocationUndefined: Self = StObject.set(x, "ignoreLocation", js.undefined)
      
      inline def setIncludeMatches(value: Boolean): Self = StObject.set(x, "includeMatches", value.asInstanceOf[js.Any])
      
      inline def setIncludeMatchesUndefined: Self = StObject.set(x, "includeMatches", js.undefined)
      
      inline def setIncludeScore(value: Boolean): Self = StObject.set(x, "includeScore", value.asInstanceOf[js.Any])
      
      inline def setIncludeScoreUndefined: Self = StObject.set(x, "includeScore", js.undefined)
      
      inline def setIsCaseSensitive(value: Boolean): Self = StObject.set(x, "isCaseSensitive", value.asInstanceOf[js.Any])
      
      inline def setIsCaseSensitiveUndefined: Self = StObject.set(x, "isCaseSensitive", js.undefined)
      
      inline def setKeys(value: js.Array[FuseOptionKey[T]]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      inline def setKeysVarargs(value: FuseOptionKey[T]*): Self = StObject.set(x, "keys", js.Array(value*))
      
      inline def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setMinMatchCharLength(value: Double): Self = StObject.set(x, "minMatchCharLength", value.asInstanceOf[js.Any])
      
      inline def setMinMatchCharLengthUndefined: Self = StObject.set(x, "minMatchCharLength", js.undefined)
      
      inline def setShouldSort(value: Boolean): Self = StObject.set(x, "shouldSort", value.asInstanceOf[js.Any])
      
      inline def setShouldSortUndefined: Self = StObject.set(x, "shouldSort", js.undefined)
      
      inline def setSortFn(value: (/* a */ FuseSortFunctionArg, /* b */ FuseSortFunctionArg) => Double): Self = StObject.set(x, "sortFn", js.Any.fromFunction2(value))
      
      inline def setSortFnUndefined: Self = StObject.set(x, "sortFn", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      inline def setUseExtendedSearch(value: Boolean): Self = StObject.set(x, "useExtendedSearch", value.asInstanceOf[js.Any])
      
      inline def setUseExtendedSearchUndefined: Self = StObject.set(x, "useExtendedSearch", js.undefined)
    }
  }
  
  // Denotes the start/end indices of a match
  //                 start    end
  //                   ↓       ↓
  type RangeTuple = js.Tuple2[Double, Double]
  
  // TODO: this makes it difficult to infer the type. Need to think more about this
  type RecordEntry = StringDictionary[RecordEntryObject | RecordEntryArrayItem]
  
  // 'author.tags.name': [{
  //   'v': 'pizza lover',
  //   'i': 2,
  //   'n: 0.7071067811865475
  // }
  type RecordEntryArrayItem = js.Array[RecordEntryObjectinumber]
  
  // title: {
  //   '$': "Old Man's War",
  //   'n': 0.5773502691896258
  // }
  trait RecordEntryObject extends StObject {
    
    // The text value
    var n: Double
    
    var v: String
  }
  object RecordEntryObject {
    
    inline def apply(n: Double, v: String): RecordEntryObject = {
      val __obj = js.Dynamic.literal(n = n.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordEntryObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RecordEntryObject] (val x: Self) extends AnyVal {
      
      inline def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      inline def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  trait _Expression extends StObject
  object _Expression {
    
    inline def And(): typings.fuseJs.anon.And = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.fuseJs.anon.And]
    }
    
    inline def Or(): typings.fuseJs.anon.Or = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.fuseJs.anon.Or]
    }
    
    inline def Path($path: js.Array[String], $val: String): typings.fuseJs.anon.Path = {
      val __obj = js.Dynamic.literal($path = $path.asInstanceOf[js.Any], $val = $val.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fuseJs.anon.Path]
    }
  }
}
