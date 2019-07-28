package typings.elasticDotJs.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "IndicesFilter")
@js.native
class IndicesFilter protected () extends Filter {
  /*
    A configurable filter that is dependent on the index name.
    */
  def this(fltr: js.Object, indices: String) = this()
  def this(fltr: js.Object, indices: js.Array[String]) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: Boolean): IndicesFilter = js.native
  /*
    Sets the cache key.
    */
  def cacheKey(key: String): IndicesFilter = js.native
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
  def indices(i: String): IndicesFilter = js.native
  def indices(i: js.Array[String]): IndicesFilter = js.native
  /*
    Sets the filter name.
    */
  def name(name: String): IndicesFilter = js.native
  def noMatchFilter(f: String): IndicesFilter = js.native
  /*
    Sets the filter to be used on an index that does not match an index
    name in the indices list.  Can also be set to "none" to not match any
    documents or "all" to match all documents.
    */
  def noMatchFilter(f: Filter): IndicesFilter = js.native
  /*
    Returns the filter object.
    */
  def toJSON(): IndicesFilter = js.native
}

