package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FilterMixin extends js.Object {
  /*
       The type of ejs object.  For internal use only.
       */
  def _type(): java.lang.String
  /*
       Enable or disable caching of the filter
       */
  def cache(trueFalse: scala.Boolean): FilterMixin
  /*
       Sets the cache key.
       */
  def cacheKey(key: java.lang.String): FilterMixin
  /*
       Sets the filter name.
       */
  def name(name: java.lang.String): FilterMixin
  /*
       Returns the filter object.
       */
  def toJSON(): FilterMixin
}

