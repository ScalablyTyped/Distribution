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
    _type: () => java.lang.String,
    cache: scala.Boolean => HasParentFilter,
    cacheKey: java.lang.String => HasParentFilter,
    filter: js.Object => HasParentFilter,
    name: java.lang.String => HasParentFilter,
    parentType: java.lang.String => HasParentFilter,
    query: js.Object => HasParentFilter,
    scope: java.lang.String => HasParentFilter,
    toJSON: () => HasParentFilter
  ): HasParentFilter = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), cache = js.Any.fromFunction1(cache), cacheKey = js.Any.fromFunction1(cacheKey), filter = js.Any.fromFunction1(filter), name = js.Any.fromFunction1(name), parentType = js.Any.fromFunction1(parentType), query = js.Any.fromFunction1(query), scope = js.Any.fromFunction1(scope), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[HasParentFilter]
  }
}

