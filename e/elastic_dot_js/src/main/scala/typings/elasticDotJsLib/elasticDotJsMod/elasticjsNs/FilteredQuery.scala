package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilteredQuery extends Query {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: scala.Double): FilteredQuery
  /*
    Enables caching of the filter.
    */
  def cache(trueFalse: scala.Boolean): FilteredQuery
  /*
    Set the cache key.
    */
  def cacheKey(k: java.lang.String): FilteredQuery
  /*
    Adds the filter to apply a constant score to.
    */
  def filter(oFilter: js.Object): FilteredQuery
  /*
    Adds the query to apply a constant score to.
    */
  def query(oQuery: js.Object): FilteredQuery
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
  def strategy(strategy: java.lang.String): FilteredQuery
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

object FilteredQuery {
  @scala.inline
  def apply(
    _type: js.Function0[java.lang.String],
    boost: js.Function1[scala.Double, FilteredQuery],
    cache: js.Function1[scala.Boolean, FilteredQuery],
    cacheKey: js.Function1[java.lang.String, FilteredQuery],
    filter: js.Function1[js.Object, FilteredQuery],
    query: js.Function1[js.Object, FilteredQuery],
    strategy: js.Function1[java.lang.String, FilteredQuery],
    toJSON: js.Function0[js.Any]
  ): FilteredQuery = {
    val __obj = js.Dynamic.literal(_type = _type, boost = boost, cache = cache, cacheKey = cacheKey, filter = filter, query = query, strategy = strategy, toJSON = toJSON)
  
    __obj.asInstanceOf[FilteredQuery]
  }
}

