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
    _type: () => java.lang.String,
    cache: scala.Boolean => MissingFilter,
    cacheKey: java.lang.String => MissingFilter,
    existence: scala.Boolean => MissingFilter,
    field: java.lang.String => MissingFilter,
    name: java.lang.String => MissingFilter,
    nullValue: scala.Boolean => MissingFilter,
    toJSON: () => MissingFilter
  ): MissingFilter = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), cache = js.Any.fromFunction1(cache), cacheKey = js.Any.fromFunction1(cacheKey), existence = js.Any.fromFunction1(existence), field = js.Any.fromFunction1(field), name = js.Any.fromFunction1(name), nullValue = js.Any.fromFunction1(nullValue), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[MissingFilter]
  }
}

