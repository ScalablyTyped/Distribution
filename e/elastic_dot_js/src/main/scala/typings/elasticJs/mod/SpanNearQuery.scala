package typings.elasticJs.mod

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "SpanNearQuery")
@js.native
class SpanNearQuery protected () extends Query {
  def this(clauses: js.Array[Query], slop: Double) = this()
  /*
    Matches spans which are near one another.
    */
  def this(clauses: Query, slop: Double) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: Double): SpanNearQuery = js.native
  
  def clauses(clauses: js.Array[Query]): SpanNearQuery = js.native
  /*
    Sets the clauses used.  If passed a single SpanQuery, it is added
    to the existing list of clauses.  If passed an array of
    SpanQueries, they replace any existing clauses.
    */
  def clauses(clauses: Query): SpanNearQuery = js.native
  
  /*
    Sets whether or not payloads are being used. A payload is an arbitrary
    byte array stored at a specific position (i.e. token/term).
    */
  def collectPayloads(trueFalse: Boolean): SpanNearQuery = js.native
  
  /*
    Sets whether or not matches are required to be in-order.
    */
  def inOrder(trueFalse: Boolean): SpanNearQuery = js.native
  
  /*
    Sets the maximum number of intervening unmatched positions.
    */
  def slop(distance: Number): SpanNearQuery = js.native
  
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}
