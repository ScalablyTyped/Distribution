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
    _type: js.Function0[java.lang.String],
    cache: js.Function1[scala.Boolean, HasChildFilter],
    cacheKey: js.Function1[java.lang.String, HasChildFilter],
    filter: js.Function1[Query, HasChildFilter],
    name: js.Function1[java.lang.String, HasChildFilter],
    query: js.Function1[Query, HasChildFilter],
    scope: js.Function1[java.lang.String, HasChildFilter],
    shortCircuitCutoff: js.Function1[scala.Double, HasChildFilter],
    toJSON: js.Function0[HasChildFilter],
    `type`: js.Function1[java.lang.String, HasChildFilter]
  ): HasChildFilter = {
    val __obj = js.Dynamic.literal(_type = _type, cache = cache, cacheKey = cacheKey, filter = filter, name = name, query = query, scope = scope, shortCircuitCutoff = shortCircuitCutoff, toJSON = toJSON)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[HasChildFilter]
  }
}

