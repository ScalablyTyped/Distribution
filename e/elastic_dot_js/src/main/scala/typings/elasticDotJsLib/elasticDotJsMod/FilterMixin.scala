package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "FilterMixin")
@js.native
class FilterMixin () extends js.Object {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String = js.native
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: scala.Boolean): FilterMixin = js.native
  /*
    Sets the cache key.
    */
  def cacheKey(key: java.lang.String): FilterMixin = js.native
  /*
    Sets the filter name.
    */
  def name(name: java.lang.String): FilterMixin = js.native
  /*
    Returns the filter object.
    */
  def toJSON(): FilterMixin = js.native
}

