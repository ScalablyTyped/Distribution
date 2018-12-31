package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpanFirstQuery extends Query {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: scala.Double): SpanFirstQuery
  /*
    Sets the maximum end position permitted in a match.
    */
  def end(position: stdLib.Number): SpanFirstQuery
  /*
    Sets the span query to match on.
    */
  def `match`(spanQuery: js.Object): SpanFirstQuery
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

