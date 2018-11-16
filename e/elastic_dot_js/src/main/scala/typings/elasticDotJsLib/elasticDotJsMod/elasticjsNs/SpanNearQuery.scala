package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpanNearQuery extends Query {
  /*
       The type of ejs object.  For internal use only.
       */
  def _type(): java.lang.String = js.native
  /*
       Sets the boost value for documents matching the Query.
       */
  def boost(boost: scala.Double): SpanNearQuery = js.native
  /*
       Sets the clauses used.  If passed a single SpanQuery, it is added
       to the existing list of clauses.  If passed an array of
       SpanQueries, they replace any existing clauses.
       */
  def clauses(clauses: Query): SpanNearQuery = js.native
  /*
       Sets the clauses used.  If passed a single SpanQuery, it is added
       to the existing list of clauses.  If passed an array of
       SpanQueries, they replace any existing clauses.
       */
  def clauses(clauses: js.Array[Query]): SpanNearQuery = js.native
  /*
       Sets whether or not payloads are being used. A payload is an arbitrary
       byte array stored at a specific position (i.e. token/term).
       */
  def collectPayloads(trueFalse: scala.Boolean): SpanNearQuery = js.native
  /*
       Sets whether or not matches are required to be in-order.
       */
  def inOrder(trueFalse: scala.Boolean): SpanNearQuery = js.native
  /*
       Sets the maximum number of intervening unmatched positions.
       */
  def slop(distance: stdLib.Number): SpanNearQuery = js.native
  /*
       Retrieves the internal query object. This is typically used by
       internal API functions so use with caution.
       */
  def toJSON(): js.Any = js.native
}

