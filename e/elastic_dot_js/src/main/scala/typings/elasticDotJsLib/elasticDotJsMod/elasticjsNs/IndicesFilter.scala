package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndicesFilter extends Filter {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String = js.native
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: scala.Boolean): IndicesFilter = js.native
  /*
    Sets the cache key.
    */
  def cacheKey(key: java.lang.String): IndicesFilter = js.native
  /*
    Sets the filter to be used when executing on one of the indicies
    specified.
    */
  def filter(f: js.Object): IndicesFilter = js.native
  /*
    Sets the indicies the filter should match.  When passed a string,
    the index name is added to the current list of indices.  When passed
    an array, it overwites all current indices.
    */
  def indices(i: java.lang.String): IndicesFilter = js.native
  def indices(i: js.Array[java.lang.String]): IndicesFilter = js.native
  /*
    Sets the filter name.
    */
  def name(name: java.lang.String): IndicesFilter = js.native
  /*
    Sets the filter to be used on an index that does not match an index
    name in the indices list.  Can also be set to "none" to not match any
    documents or "all" to match all documents.
    */
  def noMatchFilter(f: Filter): IndicesFilter = js.native
  def noMatchFilter(f: java.lang.String): IndicesFilter = js.native
  /*
    Returns the filter object.
    */
  def toJSON(): IndicesFilter = js.native
}

