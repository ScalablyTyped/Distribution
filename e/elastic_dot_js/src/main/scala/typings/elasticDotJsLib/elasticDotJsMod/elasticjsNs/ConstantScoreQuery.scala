package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstantScoreQuery extends Query {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: scala.Double): ConstantScoreQuery
  /*
    Enables caching of the filter.
    */
  def cache(trueFalse: scala.Boolean): ConstantScoreQuery
  /*
    Set the cache key.
    */
  def cacheKey(k: java.lang.String): ConstantScoreQuery
  /*
    Adds the filter to apply a constant score to.
    */
  def filter(oFilter: js.Object): ConstantScoreQuery
  /*
    Adds the query to apply a constant score to.
    */
  def query(oQuery: js.Object): ConstantScoreQuery
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

object ConstantScoreQuery {
  @scala.inline
  def apply(
    _type: js.Function0[java.lang.String],
    boost: js.Function1[scala.Double, ConstantScoreQuery],
    cache: js.Function1[scala.Boolean, ConstantScoreQuery],
    cacheKey: js.Function1[java.lang.String, ConstantScoreQuery],
    filter: js.Function1[js.Object, ConstantScoreQuery],
    query: js.Function1[js.Object, ConstantScoreQuery],
    toJSON: js.Function0[js.Any]
  ): ConstantScoreQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_type")(_type)
    __obj.updateDynamic("boost")(boost)
    __obj.updateDynamic("cache")(cache)
    __obj.updateDynamic("cacheKey")(cacheKey)
    __obj.updateDynamic("filter")(filter)
    __obj.updateDynamic("query")(query)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.asInstanceOf[ConstantScoreQuery]
  }
}

