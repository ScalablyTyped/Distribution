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
    _type: js.Function0[java.lang.String],
    boost: js.Function1[scala.Double, SpanTermQuery],
    field: js.Function1[java.lang.String, SpanTermQuery],
    term: js.Function1[java.lang.String, SpanTermQuery],
    toJSON: js.Function0[js.Any]
  ): SpanTermQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_type")(_type)
    __obj.updateDynamic("boost")(boost)
    __obj.updateDynamic("field")(field)
    __obj.updateDynamic("term")(term)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.asInstanceOf[SpanTermQuery]
  }
}

