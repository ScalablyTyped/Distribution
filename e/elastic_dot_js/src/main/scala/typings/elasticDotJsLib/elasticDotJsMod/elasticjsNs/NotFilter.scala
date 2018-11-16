package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NotFilter extends Filter {
  /*
       The type of ejs object.  For internal use only.
       */
  def _type(): java.lang.String
  /*
       Enable or disable caching of the filter
       */
  def cache(trueFalse: scala.Boolean): NotFilter
  /*
       Sets the cache key.
       */
  def cacheKey(key: java.lang.String): NotFilter
  /*
       Sets the filter
       */
  def filter(fltr: js.Object): NotFilter
  /*
       Sets the filter name.
       */
  def name(name: java.lang.String): NotFilter
  /*
       Returns the filter object.
       */
  def toJSON(): NotFilter
}

