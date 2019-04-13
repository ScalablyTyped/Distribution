package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "ExistsFilter")
@js.native
class ExistsFilter protected () extends Filter {
  /*
    Filters documents where a specified field exists and contains a value.
    */
  def this(fieldName: java.lang.String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String = js.native
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: scala.Boolean): ExistsFilter = js.native
  /*
    Sets the cache key.
    */
  def cacheKey(key: java.lang.String): ExistsFilter = js.native
  /*
    Sets the field to check for missing values.
    */
  def field(name: java.lang.String): ExistsFilter = js.native
  /*
    Sets the filter name.
    */
  def name(name: java.lang.String): ExistsFilter = js.native
  /*
    Returns the filter object.
    */
  def toJSON(): ExistsFilter = js.native
}

