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
    _type: () => java.lang.String,
    cache: scala.Boolean => QueryFilter,
    cacheKey: java.lang.String => QueryFilter,
    name: java.lang.String => QueryFilter,
    query: js.Object => QueryFilter,
    toJSON: () => QueryFilter
  ): QueryFilter = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), cache = js.Any.fromFunction1(cache), cacheKey = js.Any.fromFunction1(cacheKey), name = js.Any.fromFunction1(name), query = js.Any.fromFunction1(query), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[QueryFilter]
  }
}

