package typings.elasticJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "BoostingQuery")
@js.native
class BoostingQuery protected () extends Query {
  /*
    Constructs a query that can demote search results.  A negative boost.
    */
  def this(positiveQry: js.Object, negativeQry: js.Object, negativeBoost: Double) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: Double): BoostingQuery = js.native
  /*
    Sets the query used to match documents in the positive
    query that will be negatively boosted.
    */
  def negative(oQuery: js.Object): BoostingQuery = js.native
  /*
    Sets the negative boost value.
    */
  def negativeBoost(boost: Double): BoostingQuery = js.native
  /*
    Sets the "master" query that determines which results are returned.
    */
  def positive(oQuery: js.Object): BoostingQuery = js.native
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}

