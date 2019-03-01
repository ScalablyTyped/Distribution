package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpanMultiTermQuery extends Query {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: scala.Double): SpanMultiTermQuery
  /*
    Sets the span query to match on.
    */
  def `match`(mtQuery: js.Object): SpanMultiTermQuery
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

object SpanMultiTermQuery {
  @scala.inline
  def apply(
    _type: js.Function0[java.lang.String],
    boost: js.Function1[scala.Double, SpanMultiTermQuery],
    `match`: js.Function1[js.Object, SpanMultiTermQuery],
    toJSON: js.Function0[js.Any]
  ): SpanMultiTermQuery = {
    val __obj = js.Dynamic.literal(`match` = `match`)
    __obj.updateDynamic("_type")(_type)
    __obj.updateDynamic("boost")(boost)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.asInstanceOf[SpanMultiTermQuery]
  }
}

