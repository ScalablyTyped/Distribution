package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasChildQuery extends Query {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: scala.Double): HasChildQuery
  /*
    Sets the query
    */
  def query(q: js.Object): HasChildQuery
  /*
    Sets the scope of the query.  A scope allows to run facets on the
    same scope name that will work against the child documents.
    */
  def scope(s: java.lang.String): HasChildQuery
  /*
    Sets the scoring method.  Valid values are:
    none - the default, no scoring
    max - the highest score of all matched child documents is used
    sum - the sum the all the matched child documents is used
    avg - the average of all matched child documents is used
    */
  def scoreMode(s: java.lang.String): HasChildQuery
  /*
    Sets the scoring method.  Valid values are:
    none - the default, no scoring
    max - the highest score of all matched child documents is used
    sum - the sum the all the matched child documents is used
    avg - the average of all matched child documents is used
    */
  def scoreType(s: java.lang.String): HasChildQuery
  /*
    Sets the cutoff value to short circuit processing.
    */
  def shortCircuitCutoff(cutoff: scala.Double): HasChildQuery
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
  /*
    Sets the child document type to search against
    */
  def `type`(t: java.lang.String): HasChildQuery
}

object HasChildQuery {
  @scala.inline
  def apply(
    _type: () => java.lang.String,
    boost: scala.Double => HasChildQuery,
    query: js.Object => HasChildQuery,
    scope: java.lang.String => HasChildQuery,
    scoreMode: java.lang.String => HasChildQuery,
    scoreType: java.lang.String => HasChildQuery,
    shortCircuitCutoff: scala.Double => HasChildQuery,
    toJSON: () => js.Any,
    `type`: java.lang.String => HasChildQuery
  ): HasChildQuery = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), boost = js.Any.fromFunction1(boost), query = js.Any.fromFunction1(query), scope = js.Any.fromFunction1(scope), scoreMode = js.Any.fromFunction1(scoreMode), scoreType = js.Any.fromFunction1(scoreType), shortCircuitCutoff = js.Any.fromFunction1(shortCircuitCutoff), toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(js.Any.fromFunction1(`type`))
    __obj.asInstanceOf[HasChildQuery]
  }
}

