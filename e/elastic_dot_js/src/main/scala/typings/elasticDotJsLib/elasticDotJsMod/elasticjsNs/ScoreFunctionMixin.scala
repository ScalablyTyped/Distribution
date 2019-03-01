package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScoreFunctionMixin extends ScoreFunction {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Adds a filter whose matching documents will have the score function applied.
    */
  def filter(oFilter: Filter): ScoreFunctionMixin
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

object ScoreFunctionMixin {
  @scala.inline
  def apply(
    _type: js.Function0[java.lang.String],
    filter: js.Function1[Filter, ScoreFunctionMixin],
    toJSON: js.Function0[js.Any]
  ): ScoreFunctionMixin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_type")(_type)
    __obj.updateDynamic("filter")(filter)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.asInstanceOf[ScoreFunctionMixin]
  }
}

