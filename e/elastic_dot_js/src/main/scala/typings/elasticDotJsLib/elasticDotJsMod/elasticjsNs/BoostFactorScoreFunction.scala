package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoostFactorScoreFunction extends ScoreFunction {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Sets the boost factor.
    */
  def boost(b: scala.Double): BoostFactorScoreFunction
  /*
    Adds a filter whose matching documents will have the score function applied.
    */
  def filter(oFilter: Filter): BoostFactorScoreFunction
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

object BoostFactorScoreFunction {
  @scala.inline
  def apply(
    _type: js.Function0[java.lang.String],
    boost: js.Function1[scala.Double, BoostFactorScoreFunction],
    filter: js.Function1[Filter, BoostFactorScoreFunction],
    toJSON: js.Function0[js.Any]
  ): BoostFactorScoreFunction = {
    val __obj = js.Dynamic.literal(_type = _type, boost = boost, filter = filter, toJSON = toJSON)
  
    __obj.asInstanceOf[BoostFactorScoreFunction]
  }
}

