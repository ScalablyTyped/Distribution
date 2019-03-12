package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestedFilter extends Filter {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Sets the boost value of the nested Query.
    */
  def boost(boost: scala.Double): NestedFilter
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: scala.Boolean): NestedFilter
  /*
    Sets the cache key.
    */
  def cacheKey(key: java.lang.String): NestedFilter
  /*
    Sets the nested filter to be executed.
    */
  def filter(oFilter: js.Object): NestedFilter
  /*
    If the nested query should be "joined" with the parent document.
    Defaults to false.
    */
  def join(trueFalse: scala.Boolean): NestedFilter
  /*
    Sets the filter name.
    */
  def name(name: java.lang.String): NestedFilter
  /*
    Sets the root context for the nested filter.
    */
  def path(p: java.lang.String): NestedFilter
  /*
    Sets the nested query to be executed.
    */
  def query(oQuery: Query): NestedFilter
  /*
    Sets the scope of the filter.  A scope allows to run facets on the
    same scope name that will work against the nested documents.
    */
  def scope(s: java.lang.String): NestedFilter
  /*
    Returns the filter object.
    */
  def toJSON(): NestedFilter
}

object NestedFilter {
  @scala.inline
  def apply(
    _type: () => java.lang.String,
    boost: scala.Double => NestedFilter,
    cache: scala.Boolean => NestedFilter,
    cacheKey: java.lang.String => NestedFilter,
    filter: js.Object => NestedFilter,
    join: scala.Boolean => NestedFilter,
    name: java.lang.String => NestedFilter,
    path: java.lang.String => NestedFilter,
    query: Query => NestedFilter,
    scope: java.lang.String => NestedFilter,
    toJSON: () => NestedFilter
  ): NestedFilter = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), boost = js.Any.fromFunction1(boost), cache = js.Any.fromFunction1(cache), cacheKey = js.Any.fromFunction1(cacheKey), filter = js.Any.fromFunction1(filter), join = js.Any.fromFunction1(join), name = js.Any.fromFunction1(name), path = js.Any.fromFunction1(path), query = js.Any.fromFunction1(query), scope = js.Any.fromFunction1(scope), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[NestedFilter]
  }
}

