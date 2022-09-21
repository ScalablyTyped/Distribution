package typings.elasticJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "HasParentQuery")
@js.native
open class HasParentQuery protected ()
  extends StObject
     with Query {
  /*
    Returns results that have parent documents matching the query.
    */
  def this(qry: js.Object, parentType: String) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: Double): HasParentQuery = js.native
  
  /*
    Sets the child document type to search against
    */
  def parentType(t: String): HasParentQuery = js.native
  
  /*
    Sets the query
    */
  def query(q: js.Object): HasParentQuery = js.native
  
  /*
    Sets the scope of the query.  A scope allows to run facets on the
    same scope name that will work against the parent documents.
    */
  def scope(s: String): HasParentQuery = js.native
  
  /*
    Sets the scoring method.  Valid values are:
    none - the default, no scoring
    score - the score of the parent is used in all child documents.
    */
  def scoreMode(s: String): HasParentQuery = js.native
  
  /*
    Sets the scoring method.  Valid values are:
    none - the default, no scoring
    score - the score of the parent is used in all child documents.
    */
  def scoreType(s: String): HasParentQuery = js.native
  
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): Any = js.native
}
