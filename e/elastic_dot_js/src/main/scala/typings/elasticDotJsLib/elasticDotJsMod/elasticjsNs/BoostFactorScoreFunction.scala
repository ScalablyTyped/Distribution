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
    _type: () => java.lang.String,
    boost: scala.Double => BoostFactorScoreFunction,
    filter: Filter => BoostFactorScoreFunction,
    toJSON: () => js.Any
  ): BoostFactorScoreFunction = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), boost = js.Any.fromFunction1(boost), filter = js.Any.fromFunction1(filter), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[BoostFactorScoreFunction]
  }
}

