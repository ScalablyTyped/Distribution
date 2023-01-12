package typings.googleAdsScripts.GoogleAdsScripts

import typings.googleAdsScripts.GoogleAdsScripts.AdsApp.GoogleAdsDate
import typings.googleAdsScripts.GoogleAdsScripts.AdsApp.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Base {
  
  trait Builder[Operation] extends StObject {
    
    /** Builds the entity Returns an Operation that corresponds to the creation of the Entity. */
    def build(): Operation
  }
  object Builder {
    
    inline def apply[Operation](build: () => Operation): Builder[Operation] = {
      val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build))
      __obj.asInstanceOf[Builder[Operation]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Builder[?], Operation] (val x: Self & Builder[Operation]) extends AnyVal {
      
      inline def setBuild(value: () => Operation): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    }
  }
  
  trait Iterator[Entity] extends StObject {
    
    /** Returns true if the iterator has more elements. */
    def hasNext(): Boolean
    
    /** Returns the next entity in the iterator. */
    def next(): Entity
    
    /** Returns the total number of entities matched by the selector which generated this iterator. */
    def totalNumEntities(): Double
  }
  object Iterator {
    
    inline def apply[Entity](hasNext: () => Boolean, next: () => Entity, totalNumEntities: () => Double): Iterator[Entity] = {
      val __obj = js.Dynamic.literal(hasNext = js.Any.fromFunction0(hasNext), next = js.Any.fromFunction0(next), totalNumEntities = js.Any.fromFunction0(totalNumEntities))
      __obj.asInstanceOf[Iterator[Entity]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Iterator[?], Entity] (val x: Self & Iterator[Entity]) extends AnyVal {
      
      inline def setHasNext(value: () => Boolean): Self = StObject.set(x, "hasNext", js.Any.fromFunction0(value))
      
      inline def setNext(value: () => Entity): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      inline def setTotalNumEntities(value: () => Double): Self = StObject.set(x, "totalNumEntities", js.Any.fromFunction0(value))
    }
  }
  
  trait Operation[Entity] extends StObject {
    
    def getErrors(): js.Array[String]
    
    def getResult(): Entity | Null
    
    def isSuccessful(): Boolean
  }
  object Operation {
    
    inline def apply[Entity](getErrors: () => js.Array[String], getResult: () => Entity | Null, isSuccessful: () => Boolean): Operation[Entity] = {
      val __obj = js.Dynamic.literal(getErrors = js.Any.fromFunction0(getErrors), getResult = js.Any.fromFunction0(getResult), isSuccessful = js.Any.fromFunction0(isSuccessful))
      __obj.asInstanceOf[Operation[Entity]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Operation[?], Entity] (val x: Self & Operation[Entity]) extends AnyVal {
      
      inline def setGetErrors(value: () => js.Array[String]): Self = StObject.set(x, "getErrors", js.Any.fromFunction0(value))
      
      inline def setGetResult(value: () => Entity | Null): Self = StObject.set(x, "getResult", js.Any.fromFunction0(value))
      
      inline def setIsSuccessful(value: () => Boolean): Self = StObject.set(x, "isSuccessful", js.Any.fromFunction0(value))
    }
  }
  
  trait Selector[Iterator] extends StObject {
    
    /** Fetches the requested entity and returns an iterator. */
    def get(): Iterator
  }
  object Selector {
    
    inline def apply[Iterator](get: () => Iterator): Selector[Iterator] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get))
      __obj.asInstanceOf[Selector[Iterator]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Selector[?], Iterator] (val x: Self & Selector[Iterator]) extends AnyVal {
      
      inline def setGet(value: () => Iterator): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait SelectorForDateRange extends StObject {
    
    /**
      * Sets a custom date range onto the selector.
      * Both parameters can be either an object containing year, month, and day fields, or an 8-digit string in `YYYYMMDD` form.
      * For instance, `March 24th, 2013` is represented as either `{year: 2013, month: 3, day: 24}` or `"20130324"`.
      * The date range is inclusive on both ends, so `forDateRange("20130324", "20130324")` sets the range of one day.
      *
      * Date range must be specified if the selector has conditions or ordering for a stat field. Note that only the last date
      * range specified for the selector will take effect.
      */
    def forDateRange(dateFrom: String, dateTo: String): this.type = js.native
    def forDateRange(dateFrom: String, dateTo: GoogleAdsDate): this.type = js.native
    def forDateRange(dateFrom: GoogleAdsDate, dateTo: String): this.type = js.native
    def forDateRange(dateFrom: GoogleAdsDate, dateTo: GoogleAdsDate): this.type = js.native
    /**
      * Sets a predefined date range onto the selector. Supported values:
      *
      * `TODAY`, `YESTERDAY`, `LAST_7_DAYS`, `THIS_WEEK_SUN_TODAY`, `LAST_WEEK`, `LAST_14_DAYS`, `LAST_30_DAYS`,
      * `LAST_BUSINESS_WEEK`, `LAST_WEEK_SUN_SAT`, `THIS_MONTH`, `LAST_MONTH`, `ALL_TIME`.
      *
      * Example:
      *
      *      selector.forDateRange("THIS_WEEK_SUN_TODAY");
      *
      * Date range must be specified if the selector has conditions or ordering for a stat field. Note that only
      * the last date range specified for the selector will take effect.
      */
    def forDateRange(dateRange: DateRangeType): this.type = js.native
  }
  
  trait SelectorOrderBy extends StObject {
    
    /** Specifies the ordering of the resulting entities. */
    def orderBy(orderBy: String): this.type
  }
  object SelectorOrderBy {
    
    inline def apply(orderBy: String => SelectorOrderBy): SelectorOrderBy = {
      val __obj = js.Dynamic.literal(orderBy = js.Any.fromFunction1(orderBy))
      __obj.asInstanceOf[SelectorOrderBy]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectorOrderBy] (val x: Self) extends AnyVal {
      
      inline def setOrderBy(value: String => SelectorOrderBy): Self = StObject.set(x, "orderBy", js.Any.fromFunction1(value))
    }
  }
  
  trait SelectorWithCondition extends StObject {
    
    /** Adds the specified condition to the selector in order to narrow down the results. */
    def withCondition(condition: String): this.type
  }
  object SelectorWithCondition {
    
    inline def apply(withCondition: String => SelectorWithCondition): SelectorWithCondition = {
      val __obj = js.Dynamic.literal(withCondition = js.Any.fromFunction1(withCondition))
      __obj.asInstanceOf[SelectorWithCondition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectorWithCondition] (val x: Self) extends AnyVal {
      
      inline def setWithCondition(value: String => SelectorWithCondition): Self = StObject.set(x, "withCondition", js.Any.fromFunction1(value))
    }
  }
  
  trait SelectorWithIds extends StObject {
    
    /** Restricts this selector to return only the entities with the given IDs. */
    def withIds(ids: js.Array[Double]): this.type
  }
  object SelectorWithIds {
    
    inline def apply(withIds: js.Array[Double] => SelectorWithIds): SelectorWithIds = {
      val __obj = js.Dynamic.literal(withIds = js.Any.fromFunction1(withIds))
      __obj.asInstanceOf[SelectorWithIds]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectorWithIds] (val x: Self) extends AnyVal {
      
      inline def setWithIds(value: js.Array[Double] => SelectorWithIds): Self = StObject.set(x, "withIds", js.Any.fromFunction1(value))
    }
  }
  
  trait SelectorWithLimit extends StObject {
    
    /** Specifies limit for the selector to use. For instance, `withLimit(50)` returns only the first 50 entities.. */
    def withLimit(limit: Double): this.type
  }
  object SelectorWithLimit {
    
    inline def apply(withLimit: Double => SelectorWithLimit): SelectorWithLimit = {
      val __obj = js.Dynamic.literal(withLimit = js.Any.fromFunction1(withLimit))
      __obj.asInstanceOf[SelectorWithLimit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectorWithLimit] (val x: Self) extends AnyVal {
      
      inline def setWithLimit(value: Double => SelectorWithLimit): Self = StObject.set(x, "withLimit", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait StatsFor extends StObject {
    
    /** Returns stats for the specified custom date range. */
    def getStatsFor(dateFrom: String, dateTo: String): Stats = js.native
    def getStatsFor(dateFrom: String, dateTo: GoogleAdsDate): Stats = js.native
    def getStatsFor(dateFrom: GoogleAdsDate, dateTo: String): Stats = js.native
    def getStatsFor(dateFrom: GoogleAdsDate, dateTo: GoogleAdsDate): Stats = js.native
    /** Returns stats for the specified date range. */
    def getStatsFor(dateRange: DateRangeType): Stats = js.native
  }
}
