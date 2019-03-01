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
    _type: js.Function0[java.lang.String],
    boost: js.Function1[scala.Double, HasParentQuery],
    parentType: js.Function1[java.lang.String, HasParentQuery],
    query: js.Function1[js.Object, HasParentQuery],
    scope: js.Function1[java.lang.String, HasParentQuery],
    scoreMode: js.Function1[java.lang.String, HasParentQuery],
    scoreType: js.Function1[java.lang.String, HasParentQuery],
    toJSON: js.Function0[js.Any]
  ): HasParentQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_type")(_type)
    __obj.updateDynamic("boost")(boost)
    __obj.updateDynamic("parentType")(parentType)
    __obj.updateDynamic("query")(query)
    __obj.updateDynamic("scope")(scope)
    __obj.updateDynamic("scoreMode")(scoreMode)
    __obj.updateDynamic("scoreType")(scoreType)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.asInstanceOf[HasParentQuery]
  }
}

