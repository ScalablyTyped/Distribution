package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasChildFilter extends Filter {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: scala.Boolean): HasChildFilter
  /*
    Sets the cache key.
    */
  def cacheKey(key: java.lang.String): HasChildFilter
  /*
    Sets the filter
    */
  def filter(f: Query): HasChildFilter
  /*
    Sets the filter name.
    */
  def name(name: java.lang.String): HasChildFilter
  /*
    Sets the query
    */
  def query(q: Query): HasChildFilter
  /*
    Sets the scope of the filter.  A scope allows to run facets on the
    same scope name that will work against the child documents.
    */
  def scope(s: java.lang.String): HasChildFilter
  /*
    Sets the cutoff value to short circuit processing.
    */
  def shortCircuitCutoff(cutoff: scala.Double): HasChildFilter
  /*
    Returns the filter object.
    */
  def toJSON(): HasChildFilter
  /*
    Sets the child document type to search against
    */
  def `type`(t: java.lang.String): HasChildFilter
}

object HasChildFilter {
  @scala.inline
  def apply(
    _type: () => java.lang.String,
    cache: scala.Boolean => HasChildFilter,
    cacheKey: java.lang.String => HasChildFilter,
    filter: Query => HasChildFilter,
    name: java.lang.String => HasChildFilter,
    query: Query => HasChildFilter,
    scope: java.lang.String => HasChildFilter,
    shortCircuitCutoff: scala.Double => HasChildFilter,
    toJSON: () => HasChildFilter,
    `type`: java.lang.String => HasChildFilter
  ): HasChildFilter = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), cache = js.Any.fromFunction1(cache), cacheKey = js.Any.fromFunction1(cacheKey), filter = js.Any.fromFunction1(filter), name = js.Any.fromFunction1(name), query = js.Any.fromFunction1(query), scope = js.Any.fromFunction1(scope), shortCircuitCutoff = js.Any.fromFunction1(shortCircuitCutoff), toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(js.Any.fromFunction1(`type`))
    __obj.asInstanceOf[HasChildFilter]
  }
}

