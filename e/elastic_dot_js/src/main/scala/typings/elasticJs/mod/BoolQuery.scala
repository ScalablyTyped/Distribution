package typings.elasticJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "BoolQuery")
@js.native
/*
  A Query that matches documents matching boolean combinations of other
  queries, e.g. termQuerys, phraseQuerys or other boolQuerys.
  */
open class BoolQuery ()
  extends StObject
     with Query {
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Sets if the Query should be enhanced with a
    MatchAllQuery in order to act as a pure exclude when
    only negative (mustNot) clauses exist. Default: true.
    */
  def adjustPureNegative(trueFalse: String): BoolQuery = js.native
  
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: Double): BoolQuery = js.native
  
  /*
    Enables or disables similarity coordinate scoring of documents
    matching the Query. Default: false.
    */
  def disableCoord(trueFalse: String): BoolQuery = js.native
  
  /*
    Sets the number of optional clauses that must match.
    By default no optional clauses are necessary for a match
    (unless there are no required clauses).  If this method is used,
    then the specified number of clauses is required.
    Use of this method is totally independent of specifying that
    any specific clauses are required (or prohibited).  This number will
    only be compared against the number of matching optional clauses.
    */
  def minimumNumberShouldMatch(minMatch: Double): BoolQuery = js.native
  
  /*
    Adds query to boolean container. Given query "must" appear in matching documents.
    */
  def must(oQuery: js.Object): BoolQuery = js.native
  
  /*
    Adds query to boolean container. Given query "must not" appear in matching documents.
    */
  def mustNot(oQuery: js.Object): BoolQuery = js.native
  
  /*
    Adds query to boolean container. Given query "should" appear in matching documents.
    */
  def should(oQuery: js.Object): BoolQuery = js.native
  
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): Any = js.native
}
