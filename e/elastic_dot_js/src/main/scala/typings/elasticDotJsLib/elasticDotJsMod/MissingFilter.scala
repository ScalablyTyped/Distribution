package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "MissingFilter")
@js.native
class MissingFilter protected () extends Filter {
  /*
    Filters documents where a specific field has no value present.
    */
  def this(fieldName: java.lang.String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String = js.native
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: scala.Boolean): MissingFilter = js.native
  /*
    Sets the cache key.
    */
  def cacheKey(key: java.lang.String): MissingFilter = js.native
  /*
    Checks if the field doesn't exist.
    */
  def existence(trueFalse: scala.Boolean): MissingFilter = js.native
  /*
    Sets the field to check for missing values.
    */
  def field(name: java.lang.String): MissingFilter = js.native
  /*
    Sets the filter name.
    */
  def name(name: java.lang.String): MissingFilter = js.native
  /*
    Checks if the field has null values.
    */
  def nullValue(trueFalse: scala.Boolean): MissingFilter = js.native
  /*
    Returns the filter object.
    */
  def toJSON(): MissingFilter = js.native
}

