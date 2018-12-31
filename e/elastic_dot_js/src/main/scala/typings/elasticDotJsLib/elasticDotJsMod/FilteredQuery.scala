package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "FilteredQuery")
@js.native
class FilteredQuery protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.FilteredQuery {
  /*
    A query that applies a filter to the results of another query.
    */
  def this(someQuery: js.Object, someFilter: js.Object) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
    Sets the boost value for documents matching the Query.
    */
  /* CompleteClass */
  override def boost(boost: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.FilteredQuery = js.native
  /*
    Enables caching of the filter.
    */
  /* CompleteClass */
  override def cache(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.FilteredQuery = js.native
  /*
    Set the cache key.
    */
  /* CompleteClass */
  override def cacheKey(k: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.FilteredQuery = js.native
  /*
    Adds the filter to apply a constant score to.
    */
  /* CompleteClass */
  override def filter(oFilter: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.FilteredQuery = js.native
  /*
    Adds the query to apply a constant score to.
    */
  /* CompleteClass */
  override def query(oQuery: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.FilteredQuery = js.native
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
  /* CompleteClass */
  override def strategy(strategy: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.FilteredQuery = js.native
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

