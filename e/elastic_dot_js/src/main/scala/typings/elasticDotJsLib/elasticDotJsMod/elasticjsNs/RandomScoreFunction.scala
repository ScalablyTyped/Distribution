package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RandomScoreFunction extends ScoreFunction {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Adds a filter whose matching documents will have the score function applied.
    */
  def filter(oFilter: Filter): RandomScoreFunction
  /*
    Sets random seed value.
    */
  def seed(s: scala.Double): RandomScoreFunction
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

object RandomScoreFunction {
  @scala.inline
  def apply(
    _type: js.Function0[java.lang.String],
    filter: js.Function1[Filter, RandomScoreFunction],
    seed: js.Function1[scala.Double, RandomScoreFunction],
    toJSON: js.Function0[js.Any]
  ): RandomScoreFunction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_type")(_type)
    __obj.updateDynamic("filter")(filter)
    __obj.updateDynamic("seed")(seed)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.asInstanceOf[RandomScoreFunction]
  }
}

