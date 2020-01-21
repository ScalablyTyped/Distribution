package typings.elasticJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "QueryFilter")
@js.native
class QueryFilter protected () extends Filter {
  /*
    Filters documents matching the wrapped query.
    */
  def this(qry: js.Object) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: Boolean): QueryFilter = js.native
  /*
    Sets the cache key.
    */
  def cacheKey(key: String): QueryFilter = js.native
  /*
    Sets the filter name.
    */
  def name(name: String): QueryFilter = js.native
  /*
    Sets the query
    */
  def query(q: js.Object): QueryFilter = js.native
  /*
    Returns the filter object.
    */
  def toJSON(): QueryFilter = js.native
}

