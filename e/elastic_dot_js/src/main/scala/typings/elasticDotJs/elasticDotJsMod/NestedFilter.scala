package typings.elasticDotJs.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "NestedFilter")
@js.native
class NestedFilter protected () extends Filter {
  /*
    Constructs a filter that is capable of executing a filter against objects
    nested within a document.
    */
  def this(path: String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  /*
    Sets the boost value of the nested Query.
    */
  def boost(boost: Double): NestedFilter = js.native
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: Boolean): NestedFilter = js.native
  /*
    Sets the cache key.
    */
  def cacheKey(key: String): NestedFilter = js.native
  /*
    Sets the nested filter to be executed.
    */
  def filter(oFilter: js.Object): NestedFilter = js.native
  /*
    If the nested query should be "joined" with the parent document.
    Defaults to false.
    */
  def join(trueFalse: Boolean): NestedFilter = js.native
  /*
    Sets the filter name.
    */
  def name(name: String): NestedFilter = js.native
  /*
    Sets the root context for the nested filter.
    */
  def path(p: String): NestedFilter = js.native
  /*
    Sets the nested query to be executed.
    */
  def query(oQuery: Query): NestedFilter = js.native
  /*
    Sets the scope of the filter.  A scope allows to run facets on the
    same scope name that will work against the nested documents.
    */
  def scope(s: String): NestedFilter = js.native
  /*
    Returns the filter object.
    */
  def toJSON(): NestedFilter = js.native
}

