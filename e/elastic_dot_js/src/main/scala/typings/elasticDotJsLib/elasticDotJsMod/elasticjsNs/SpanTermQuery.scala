package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpanTermQuery extends Query {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: scala.Double): SpanTermQuery
  /*
    Sets the field to query against.
    */
  def field(f: java.lang.String): SpanTermQuery
  /*
    Sets the term.
    */
  def term(t: java.lang.String): SpanTermQuery
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

object SpanTermQuery {
  @scala.inline
  def apply(
    _type: () => java.lang.String,
    boost: scala.Double => SpanTermQuery,
    field: java.lang.String => SpanTermQuery,
    term: java.lang.String => SpanTermQuery,
    toJSON: () => js.Any
  ): SpanTermQuery = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), boost = js.Any.fromFunction1(boost), field = js.Any.fromFunction1(field), term = js.Any.fromFunction1(term), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[SpanTermQuery]
  }
}

