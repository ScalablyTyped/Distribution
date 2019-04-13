package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "MatchAllFilter")
@js.native
/*
  A filter that matches on all documents
  */
class MatchAllFilter () extends Filter {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String = js.native
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: scala.Boolean): MatchAllFilter = js.native
  /*
    Sets the cache key.
    */
  def cacheKey(key: java.lang.String): MatchAllFilter = js.native
  /*
    Sets the filter name.
    */
  def name(name: java.lang.String): MatchAllFilter = js.native
  /*
    Returns the filter object.
    */
  def toJSON(): MatchAllFilter = js.native
}

