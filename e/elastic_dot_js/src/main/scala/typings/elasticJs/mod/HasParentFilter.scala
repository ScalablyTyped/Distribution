package typings.elasticJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "HasParentFilter")
@js.native
class HasParentFilter protected () extends Filter {
  /*
    Returns results that have parent documents matching the filter.
    */
  def this(qry: js.Object, parentType: String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: Boolean): HasParentFilter = js.native
  /*
    Sets the cache key.
    */
  def cacheKey(key: String): HasParentFilter = js.native
  /*
    Sets the filter
    */
  def filter(f: js.Object): HasParentFilter = js.native
  /*
    Sets the filter name.
    */
  def name(name: String): HasParentFilter = js.native
  /*
    Sets the child document type to search against
    */
  def parentType(t: String): HasParentFilter = js.native
  /*
    Sets the query
    */
  def query(q: js.Object): HasParentFilter = js.native
  /*
    Sets the scope of the filter.  A scope allows to run facets on the
    same scope name that will work against the parent documents.
    */
  def scope(s: String): HasParentFilter = js.native
  /*
    Returns the filter object.
    */
  def toJSON(): HasParentFilter = js.native
}

