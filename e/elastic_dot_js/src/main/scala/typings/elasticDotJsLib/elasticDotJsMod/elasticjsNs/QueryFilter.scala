package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryFilter extends Filter {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: scala.Boolean): QueryFilter
  /*
    Sets the cache key.
    */
  def cacheKey(key: java.lang.String): QueryFilter
  /*
    Sets the filter name.
    */
  def name(name: java.lang.String): QueryFilter
  /*
    Sets the query
    */
  def query(q: js.Object): QueryFilter
  /*
    Returns the filter object.
    */
  def toJSON(): QueryFilter
}

object QueryFilter {
  @scala.inline
  def apply(
    _type: js.Function0[java.lang.String],
    cache: js.Function1[scala.Boolean, QueryFilter],
    cacheKey: js.Function1[java.lang.String, QueryFilter],
    name: js.Function1[java.lang.String, QueryFilter],
    query: js.Function1[js.Object, QueryFilter],
    toJSON: js.Function0[QueryFilter]
  ): QueryFilter = {
    val __obj = js.Dynamic.literal(_type = _type, cache = cache, cacheKey = cacheKey, name = name, query = query, toJSON = toJSON)
  
    __obj.asInstanceOf[QueryFilter]
  }
}

