package typings.elasticJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "FilteredQuery")
@js.native
class FilteredQuery protected () extends Query {
  /*
    A query that applies a filter to the results of another query.
    */
  def this(someQuery: js.Object, someFilter: js.Object) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: Double): FilteredQuery = js.native
  
  /*
    Enables caching of the filter.
    */
  def cache(trueFalse: Boolean): FilteredQuery = js.native
  
  /*
    Set the cache key.
    */
  def cacheKey(k: String): FilteredQuery = js.native
  
  /*
    Adds the filter to apply a constant score to.
    */
  def filter(oFilter: js.Object): FilteredQuery = js.native
  
  /*
    Adds the query to apply a constant score to.
    */
  def query(oQuery: js.Object): FilteredQuery = js.native
  
  /*
    Sets the filter strategy.
    The strategy defines how the filter is applied during document collection.
    Valid values are:
    query_first - advance query scorer first then filter
    random_access_random - random access filter
    leap_frog - query scorer and filter "leap-frog", query goes first
    leap_frog_filter_first - same as leap_frog, but filter goes first
    random_access_N - replace N with integer, same as random access
    except you can specify a custom threshold
    This is an advanced setting, use with care.
    */
  def strategy(strategy: String): FilteredQuery = js.native
  
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}
