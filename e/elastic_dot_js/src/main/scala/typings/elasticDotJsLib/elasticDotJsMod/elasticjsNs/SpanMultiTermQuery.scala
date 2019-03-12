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
    _type: () => java.lang.String,
    boost: scala.Double => SpanMultiTermQuery,
    `match`: js.Object => SpanMultiTermQuery,
    toJSON: () => js.Any
  ): SpanMultiTermQuery = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), boost = js.Any.fromFunction1(boost), toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    __obj.asInstanceOf[SpanMultiTermQuery]
  }
}

