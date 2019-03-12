package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoostingQuery extends Query {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: scala.Double): BoostingQuery
  /*
    Sets the query used to match documents in the positive
    query that will be negatively boosted.
    */
  def negative(oQuery: js.Object): BoostingQuery
  /*
    Sets the negative boost value.
    */
  def negativeBoost(boost: scala.Double): BoostingQuery
  /*
    Sets the "master" query that determines which results are returned.
    */
  def positive(oQuery: js.Object): BoostingQuery
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

object BoostingQuery {
  @scala.inline
  def apply(
    _type: () => java.lang.String,
    boost: scala.Double => BoostingQuery,
    negative: js.Object => BoostingQuery,
    negativeBoost: scala.Double => BoostingQuery,
    positive: js.Object => BoostingQuery,
    toJSON: () => js.Any
  ): BoostingQuery = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), boost = js.Any.fromFunction1(boost), negative = js.Any.fromFunction1(negative), negativeBoost = js.Any.fromFunction1(negativeBoost), positive = js.Any.fromFunction1(positive), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[BoostingQuery]
  }
}

