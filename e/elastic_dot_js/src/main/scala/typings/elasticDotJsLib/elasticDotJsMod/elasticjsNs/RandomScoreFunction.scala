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
    _type: () => java.lang.String,
    filter: Filter => RandomScoreFunction,
    seed: scala.Double => RandomScoreFunction,
    toJSON: () => js.Any
  ): RandomScoreFunction = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), filter = js.Any.fromFunction1(filter), seed = js.Any.fromFunction1(seed), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[RandomScoreFunction]
  }
}

