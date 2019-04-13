package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "NestedQuery")
@js.native
class NestedQuery protected () extends Query {
  /*
    Constructs a query that is capable of executing a search against objects
    nested within a document.
    */
  def this(path: java.lang.String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String = js.native
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: scala.Double): NestedQuery = js.native
  /*
    Sets the nested filter to be executed.
    */
  def filter(oFilter: js.Object): NestedQuery = js.native
  /*
    Sets the root context for the nested query.
    */
  def path(path: java.lang.String): NestedQuery = js.native
  /*
    Sets the nested query to be executed.
    */
  def query(oQuery: js.Object): NestedQuery = js.native
  /*
    Sets the scope of the query.  A scope allows to run facets on the
    same scope name that will work against the nested documents.
    */
  def scope(s: java.lang.String): NestedQuery = js.native
  /*
    Sets how the inner (nested) matches affect scoring on the parent document.
    */
  def scoreMode(mode: java.lang.String): NestedQuery = js.native
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}

