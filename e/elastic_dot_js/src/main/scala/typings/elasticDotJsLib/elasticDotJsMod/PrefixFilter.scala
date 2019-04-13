package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "PrefixFilter")
@js.native
class PrefixFilter protected () extends Filter {
  /*
    Filters documents that have fields containing terms with a specified prefix.
    */
  def this(fieldName: java.lang.String, prefix: java.lang.String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String = js.native
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: scala.Boolean): PrefixFilter = js.native
  /*
    Sets the cache key.
    */
  def cacheKey(key: java.lang.String): PrefixFilter = js.native
  /*
    Returns the field name used to create this object.
    */
  def field(field: java.lang.String): PrefixFilter = js.native
  /*
    Sets the filter name.
    */
  def name(name: java.lang.String): PrefixFilter = js.native
  /*
    Sets the prefix to search for.
    */
  def prefix(value: java.lang.String): PrefixFilter = js.native
  /*
    Returns the filter object.
    */
  def toJSON(): PrefixFilter = js.native
}

