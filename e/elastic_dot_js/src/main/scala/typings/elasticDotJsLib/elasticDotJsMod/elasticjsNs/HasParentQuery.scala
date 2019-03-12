package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasParentQuery extends Query {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: scala.Double): HasParentQuery
  /*
    Sets the child document type to search against
    */
  def parentType(t: java.lang.String): HasParentQuery
  /*
    Sets the query
    */
  def query(q: js.Object): HasParentQuery
  /*
    Sets the scope of the query.  A scope allows to run facets on the
    same scope name that will work against the parent documents.
    */
  def scope(s: java.lang.String): HasParentQuery
  /*
    Sets the scoring method.  Valid values are:
    none - the default, no scoring
    score - the score of the parent is used in all child documents.
    */
  def scoreMode(s: java.lang.String): HasParentQuery
  /*
    Sets the scoring method.  Valid values are:
    none - the default, no scoring
    score - the score of the parent is used in all child documents.
    */
  def scoreType(s: java.lang.String): HasParentQuery
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

object HasParentQuery {
  @scala.inline
  def apply(
    _type: () => java.lang.String,
    boost: scala.Double => HasParentQuery,
    parentType: java.lang.String => HasParentQuery,
    query: js.Object => HasParentQuery,
    scope: java.lang.String => HasParentQuery,
    scoreMode: java.lang.String => HasParentQuery,
    scoreType: java.lang.String => HasParentQuery,
    toJSON: () => js.Any
  ): HasParentQuery = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), boost = js.Any.fromFunction1(boost), parentType = js.Any.fromFunction1(parentType), query = js.Any.fromFunction1(query), scope = js.Any.fromFunction1(scope), scoreMode = js.Any.fromFunction1(scoreMode), scoreType = js.Any.fromFunction1(scoreType), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[HasParentQuery]
  }
}

