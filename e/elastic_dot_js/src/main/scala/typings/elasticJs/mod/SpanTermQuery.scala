package typings.elasticJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "SpanTermQuery")
@js.native
class SpanTermQuery protected ()
  extends StObject
     with Query {
  /*
    Matches spans containing a term
    */
  def this(field: String, value: String) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: Double): SpanTermQuery = js.native
  
  /*
    Sets the field to query against.
    */
  def field(f: String): SpanTermQuery = js.native
  
  /*
    Sets the term.
    */
  def term(t: String): SpanTermQuery = js.native
  
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}
