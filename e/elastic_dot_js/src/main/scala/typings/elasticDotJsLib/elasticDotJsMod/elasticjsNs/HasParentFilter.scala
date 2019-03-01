package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasParentFilter extends Filter {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: scala.Boolean): HasParentFilter
  /*
    Sets the cache key.
    */
  def cacheKey(key: java.lang.String): HasParentFilter
  /*
    Sets the filter
    */
  def filter(f: js.Object): HasParentFilter
  /*
    Sets the filter name.
    */
  def name(name: java.lang.String): HasParentFilter
  /*
    Sets the child document type to search against
    */
  def parentType(t: java.lang.String): HasParentFilter
  /*
    Sets the query
    */
  def query(q: js.Object): HasParentFilter
  /*
    Sets the scope of the filter.  A scope allows to run facets on the
    same scope name that will work against the parent documents.
    */
  def scope(s: java.lang.String): HasParentFilter
  /*
    Returns the filter object.
    */
  def toJSON(): HasParentFilter
}

object HasParentFilter {
  @scala.inline
  def apply(
    _type: js.Function0[java.lang.String],
    cache: js.Function1[scala.Boolean, HasParentFilter],
    cacheKey: js.Function1[java.lang.String, HasParentFilter],
    filter: js.Function1[js.Object, HasParentFilter],
    name: js.Function1[java.lang.String, HasParentFilter],
    parentType: js.Function1[java.lang.String, HasParentFilter],
    query: js.Function1[js.Object, HasParentFilter],
    scope: js.Function1[java.lang.String, HasParentFilter],
    toJSON: js.Function0[HasParentFilter]
  ): HasParentFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_type")(_type)
    __obj.updateDynamic("cache")(cache)
    __obj.updateDynamic("cacheKey")(cacheKey)
    __obj.updateDynamic("filter")(filter)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("parentType")(parentType)
    __obj.updateDynamic("query")(query)
    __obj.updateDynamic("scope")(scope)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.asInstanceOf[HasParentFilter]
  }
}

