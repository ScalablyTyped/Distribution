package typings.elasticJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "IndicesQuery")
@js.native
open class IndicesQuery protected ()
  extends StObject
     with Query {
  /*
    A configurable query that is dependent on the index name.
    */
  def this(qry: Query, indices: String) = this()
  def this(qry: Query, indices: js.Array[String]) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: Double): IndicesQuery = js.native
  
  /*
    Sets the indicies the query should match.  When passed a string,
    the index name is added to the current list of indices.  When passed
    an array, it overwites all current indices.
    */
  def indices(i: String): IndicesQuery = js.native
  def indices(i: js.Array[String]): IndicesQuery = js.native
  
  def noMatchQuery(q: String): IndicesQuery = js.native
  /*
    Sets the query to be used on an index that does not match an index
    name in the indices list.  Can also be set to "none" to not match any
    documents or "all" to match all documents.
    */
  def noMatchQuery(q: Query): IndicesQuery = js.native
  
  /*
    Sets the query to be executed against the indices specified.
    */
  def query(q: Query): IndicesQuery = js.native
  
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): Any = js.native
}
