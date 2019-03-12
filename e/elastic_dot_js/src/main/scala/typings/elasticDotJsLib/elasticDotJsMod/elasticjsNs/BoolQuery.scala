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
    _type: () => java.lang.String,
    adjustPureNegative: java.lang.String => BoolQuery,
    boost: scala.Double => BoolQuery,
    disableCoord: java.lang.String => BoolQuery,
    minimumNumberShouldMatch: scala.Double => BoolQuery,
    must: js.Object => BoolQuery,
    mustNot: js.Object => BoolQuery,
    should: js.Object => BoolQuery,
    toJSON: () => js.Any
  ): BoolQuery = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), adjustPureNegative = js.Any.fromFunction1(adjustPureNegative), boost = js.Any.fromFunction1(boost), disableCoord = js.Any.fromFunction1(disableCoord), minimumNumberShouldMatch = js.Any.fromFunction1(minimumNumberShouldMatch), must = js.Any.fromFunction1(must), mustNot = js.Any.fromFunction1(mustNot), should = js.Any.fromFunction1(should), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[BoolQuery]
  }
}

