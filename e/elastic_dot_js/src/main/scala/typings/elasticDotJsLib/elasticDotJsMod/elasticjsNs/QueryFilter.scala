package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait QueryFilter extends Filter {
  /*
       The type of ejs object.  For internal use only.
       */
  def _type(): java.lang.String
  /*
       Enable or disable caching of the filter
       */
  def cache(trueFalse: scala.Boolean): QueryFilter
  /*
       Sets the cache key.
       */
  def cacheKey(key: java.lang.String): QueryFilter
  /*
       Sets the filter name.
       */
  def name(name: java.lang.String): QueryFilter
  /*
       Sets the query
       */
  def query(q: js.Object): QueryFilter
  /*
       Returns the filter object.
       */
  def toJSON(): QueryFilter
}

