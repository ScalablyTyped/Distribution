package typings.elasticJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "SpanMultiTermQuery")
@js.native
class SpanMultiTermQuery protected ()
  extends StObject
     with Query {
  /*
    Use MultiTermQueries as a SpanQuery.
    */
  def this(qry: Query) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: Double): SpanMultiTermQuery = js.native
  
  /*
    Sets the span query to match on.
    */
  def `match`(mtQuery: js.Object): SpanMultiTermQuery = js.native
  
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}
