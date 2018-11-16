package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LimitFilter extends Filter {
  /*
       The type of ejs object.  For internal use only.
       */
  def _type(): java.lang.String
  /*
       Enable or disable caching of the filter
       */
  def cache(trueFalse: scala.Boolean): LimitFilter
  /*
       Sets the cache key.
       */
  def cacheKey(key: java.lang.String): LimitFilter
  /*
       Sets the filter name.
       */
  def name(name: java.lang.String): LimitFilter
  /*
       Returns the filter object.
       */
  def toJSON(): LimitFilter
  /*
       Sets the limit value.
       */
  def value(`val`: scala.Double): LimitFilter
}

