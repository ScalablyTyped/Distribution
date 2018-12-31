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

