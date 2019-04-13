package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "TypeFilter")
@js.native
class TypeFilter protected () extends Filter {
  /*
    Filter results by a specified index type.
    */
  def this(`type`: java.lang.String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String = js.native
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: scala.Boolean): TypeFilter = js.native
  /*
    Sets the cache key.
    */
  def cacheKey(key: java.lang.String): TypeFilter = js.native
  /*
    Sets the filter name.
    */
  def name(name: java.lang.String): TypeFilter = js.native
  /*
    Returns the filter object.
    */
  def toJSON(): TypeFilter = js.native
  /*
    Sets the type
    */
  def `type`(`type`: java.lang.String): TypeFilter = js.native
}

