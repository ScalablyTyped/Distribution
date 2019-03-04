package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoolQuery extends Query {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Sets if the Query should be enhanced with a
    MatchAllQuery in order to act as a pure exclude when
    only negative (mustNot) clauses exist. Default: true.
    */
  def adjustPureNegative(trueFalse: java.lang.String): BoolQuery
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: scala.Double): BoolQuery
  /*
    Enables or disables similarity coordinate scoring of documents
    matching the Query. Default: false.
    */
  def disableCoord(trueFalse: java.lang.String): BoolQuery
  /*
    Sets the number of optional clauses that must match.
    By default no optional clauses are necessary for a match
    (unless there are no required clauses).  If this method is used,
    then the specified number of clauses is required.
    Use of this method is totally independent of specifying that
    any specific clauses are required (or prohibited).  This number will
    only be compared against the number of matching optional clauses.
    */
  def minimumNumberShouldMatch(minMatch: scala.Double): BoolQuery
  /*
    Adds query to boolean container. Given query "must" appear in matching documents.
    */
  def must(oQuery: js.Object): BoolQuery
  /*
    Adds query to boolean container. Given query "must not" appear in matching documents.
    */
  def mustNot(oQuery: js.Object): BoolQuery
  /*
    Adds query to boolean container. Given query "should" appear in matching documents.
    */
  def should(oQuery: js.Object): BoolQuery
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

object BoolQuery {
  @scala.inline
  def apply(
    _type: js.Function0[java.lang.String],
    adjustPureNegative: js.Function1[java.lang.String, BoolQuery],
    boost: js.Function1[scala.Double, BoolQuery],
    disableCoord: js.Function1[java.lang.String, BoolQuery],
    minimumNumberShouldMatch: js.Function1[scala.Double, BoolQuery],
    must: js.Function1[js.Object, BoolQuery],
    mustNot: js.Function1[js.Object, BoolQuery],
    should: js.Function1[js.Object, BoolQuery],
    toJSON: js.Function0[js.Any]
  ): BoolQuery = {
    val __obj = js.Dynamic.literal(_type = _type, adjustPureNegative = adjustPureNegative, boost = boost, disableCoord = disableCoord, minimumNumberShouldMatch = minimumNumberShouldMatch, must = must, mustNot = mustNot, should = should, toJSON = toJSON)
  
    __obj.asInstanceOf[BoolQuery]
  }
}

