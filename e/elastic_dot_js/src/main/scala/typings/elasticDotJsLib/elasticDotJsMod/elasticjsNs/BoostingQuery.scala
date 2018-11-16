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

