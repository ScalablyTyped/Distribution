package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MissingFilter extends Filter {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: scala.Boolean): MissingFilter
  /*
    Sets the cache key.
    */
  def cacheKey(key: java.lang.String): MissingFilter
  /*
    Checks if the field doesn't exist.
    */
  def existence(trueFalse: scala.Boolean): MissingFilter
  /*
    Sets the field to check for missing values.
    */
  def field(name: java.lang.String): MissingFilter
  /*
    Sets the filter name.
    */
  def name(name: java.lang.String): MissingFilter
  /*
    Checks if the field has null values.
    */
  def nullValue(trueFalse: scala.Boolean): MissingFilter
  /*
    Returns the filter object.
    */
  def toJSON(): MissingFilter
}

object MissingFilter {
  @scala.inline
  def apply(
    _type: js.Function0[java.lang.String],
    cache: js.Function1[scala.Boolean, MissingFilter],
    cacheKey: js.Function1[java.lang.String, MissingFilter],
    existence: js.Function1[scala.Boolean, MissingFilter],
    field: js.Function1[java.lang.String, MissingFilter],
    name: js.Function1[java.lang.String, MissingFilter],
    nullValue: js.Function1[scala.Boolean, MissingFilter],
    toJSON: js.Function0[MissingFilter]
  ): MissingFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_type")(_type)
    __obj.updateDynamic("cache")(cache)
    __obj.updateDynamic("cacheKey")(cacheKey)
    __obj.updateDynamic("existence")(existence)
    __obj.updateDynamic("field")(field)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("nullValue")(nullValue)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.asInstanceOf[MissingFilter]
  }
}

