package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "BoostingQuery")
@js.native
class BoostingQuery protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.BoostingQuery {
  /*
    Constructs a query that can demote search results.  A negative boost.
    */
  def this(positiveQry: js.Object, negativeQry: js.Object, negativeBoost: scala.Double) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
    Sets the boost value for documents matching the Query.
    */
  /* CompleteClass */
  override def boost(boost: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.BoostingQuery = js.native
  /*
    Sets the query used to match documents in the positive
    query that will be negatively boosted.
    */
  /* CompleteClass */
  override def negative(oQuery: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.BoostingQuery = js.native
  /*
    Sets the negative boost value.
    */
  /* CompleteClass */
  override def negativeBoost(boost: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.BoostingQuery = js.native
  /*
    Sets the "master" query that determines which results are returned.
    */
  /* CompleteClass */
  override def positive(oQuery: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.BoostingQuery = js.native
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

