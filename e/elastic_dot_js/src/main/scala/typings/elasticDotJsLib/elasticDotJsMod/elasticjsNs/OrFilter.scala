package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrFilter extends Filter {
  /*
       The type of ejs object.  For internal use only.
       */
  def _type(): java.lang.String = js.native
  /*
       Enable or disable caching of the filter
       */
  def cache(trueFalse: scala.Boolean): OrFilter = js.native
  /*
       Sets the cache key.
       */
  def cacheKey(key: java.lang.String): OrFilter = js.native
  /*
       Updates the filters.  If passed a single Filter it is added to
       the existing filters.  If passed an array of Filters, they
       replace all existing Filters.
       */
  def filters(fltr: Filter): OrFilter = js.native
  /*
       Updates the filters.  If passed a single Filter it is added to
       the existing filters.  If passed an array of Filters, they
       replace all existing Filters.
       */
  def filters(fltr: js.Array[Filter]): OrFilter = js.native
  /*
       Sets the filter name.
       */
  def name(name: java.lang.String): OrFilter = js.native
  /*
       Returns the filter object.
       */
  def toJSON(): OrFilter = js.native
}

