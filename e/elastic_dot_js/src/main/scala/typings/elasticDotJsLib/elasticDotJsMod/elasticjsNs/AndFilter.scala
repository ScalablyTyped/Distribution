package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndFilter extends Filter {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String = js.native
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: scala.Boolean): AndFilter = js.native
  /*
    Sets the cache key.
    */
  def cacheKey(key: java.lang.String): AndFilter = js.native
  /*
    Sets the filters for the filter.  If fltr is a single
    Filter, it is added to the current filters.  If fltr is an array
    of Filters, then they replace all existing filters.
    */
  def filters(fltr: Filter): AndFilter = js.native
  def filters(fltr: js.Array[Filter]): AndFilter = js.native
  /*
    Sets the filter name.
    */
  def name(name: java.lang.String): AndFilter = js.native
  /*
    Returns the filter object.
    */
  def toJSON(): AndFilter = js.native
}

