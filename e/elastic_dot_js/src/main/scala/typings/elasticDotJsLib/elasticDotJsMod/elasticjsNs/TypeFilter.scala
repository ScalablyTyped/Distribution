package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeFilter extends Filter {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: scala.Boolean): TypeFilter
  /*
    Sets the cache key.
    */
  def cacheKey(key: java.lang.String): TypeFilter
  /*
    Sets the filter name.
    */
  def name(name: java.lang.String): TypeFilter
  /*
    Returns the filter object.
    */
  def toJSON(): TypeFilter
  /*
    Sets the type
    */
  def `type`(`type`: java.lang.String): TypeFilter
}

