package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MatchAllFilter extends Filter {
  /*
       The type of ejs object.  For internal use only.
       */
  def _type(): java.lang.String
  /*
       Enable or disable caching of the filter
       */
  def cache(trueFalse: scala.Boolean): MatchAllFilter
  /*
       Sets the cache key.
       */
  def cacheKey(key: java.lang.String): MatchAllFilter
  /*
       Sets the filter name.
       */
  def name(name: java.lang.String): MatchAllFilter
  /*
       Returns the filter object.
       */
  def toJSON(): MatchAllFilter
}

