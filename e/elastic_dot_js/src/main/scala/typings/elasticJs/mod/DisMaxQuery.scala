package typings.elasticJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "DisMaxQuery")
@js.native
/*
  A query that generates the union of documents produced by its subqueries such
  as termQuerys, phraseQuerys, boolQuerys, etc.
  */
class DisMaxQuery () extends Query {
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: Double): DisMaxQuery = js.native
  
  def queries(qs: js.Array[Query]): DisMaxQuery = js.native
  /*
    Updates the queries.  If passed a single Query, it is added to the
    list of existing queries.  If passed an array of Queries, it
    replaces all existing values.
    */
  def queries(qs: Query): DisMaxQuery = js.native
  
  /*
    The tie breaker value.
    The tie breaker capability allows results that include the same term in multiple
    fields to be judged better than results that include this term in only the best of those
    multiple fields, without confusing this with the better case of two different terms in
    the multiple fields.
    Default: 0.0.
    */
  def tieBreaker(tieBreaker: Double): DisMaxQuery = js.native
  
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}
