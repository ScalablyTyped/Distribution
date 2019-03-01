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
    _type: js.Function0[java.lang.String],
    cache: js.Function1[scala.Boolean, TermFilter],
    cacheKey: js.Function1[java.lang.String, TermFilter],
    field: js.Function1[java.lang.String, TermFilter],
    name: js.Function1[java.lang.String, TermFilter],
    term: js.Function0[TermFilter],
    toJSON: js.Function0[TermFilter]
  ): TermFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_type")(_type)
    __obj.updateDynamic("cache")(cache)
    __obj.updateDynamic("cacheKey")(cacheKey)
    __obj.updateDynamic("field")(field)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("term")(term)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.asInstanceOf[TermFilter]
  }
}

