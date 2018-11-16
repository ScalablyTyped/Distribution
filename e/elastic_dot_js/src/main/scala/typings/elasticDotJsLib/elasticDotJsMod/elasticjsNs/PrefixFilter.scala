package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PrefixFilter extends Filter {
  /*
       The type of ejs object.  For internal use only.
       */
  def _type(): java.lang.String
  /*
       Enable or disable caching of the filter
       */
  def cache(trueFalse: scala.Boolean): PrefixFilter
  /*
       Sets the cache key.
       */
  def cacheKey(key: java.lang.String): PrefixFilter
  /*
       Returns the field name used to create this object.
       */
  def field(field: java.lang.String): PrefixFilter
  /*
       Sets the filter name.
       */
  def name(name: java.lang.String): PrefixFilter
  /*
       Sets the prefix to search for.
       */
  def prefix(value: java.lang.String): PrefixFilter
  /*
       Returns the filter object.
       */
  def toJSON(): PrefixFilter
}

