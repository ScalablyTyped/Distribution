package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TermFilter extends Filter {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: scala.Boolean): TermFilter
  /*
    Sets the cache key.
    */
  def cacheKey(key: java.lang.String): TermFilter
  /*
    Provides access to the filter fieldName used to construct the
    termFilter object.
    */
  def field(f: java.lang.String): TermFilter
  /*
    Sets the filter name.
    */
  def name(name: java.lang.String): TermFilter
  /*
    Provides access to the filter term used to construct the
    termFilter object.
    */
  def term(): TermFilter
  /*
    Returns the filter object.
    */
  def toJSON(): TermFilter
}

object TermFilter {
  @scala.inline
  def apply(
    _type: () => java.lang.String,
    cache: scala.Boolean => TermFilter,
    cacheKey: java.lang.String => TermFilter,
    field: java.lang.String => TermFilter,
    name: java.lang.String => TermFilter,
    term: () => TermFilter,
    toJSON: () => TermFilter
  ): TermFilter = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), cache = js.Any.fromFunction1(cache), cacheKey = js.Any.fromFunction1(cacheKey), field = js.Any.fromFunction1(field), name = js.Any.fromFunction1(name), term = js.Any.fromFunction0(term), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[TermFilter]
  }
}

