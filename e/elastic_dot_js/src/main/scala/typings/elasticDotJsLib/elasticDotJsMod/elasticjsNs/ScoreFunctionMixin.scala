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
  def apply(_type: () => java.lang.String, filter: Filter => ScoreFunctionMixin, toJSON: () => js.Any): ScoreFunctionMixin = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), filter = js.Any.fromFunction1(filter), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[ScoreFunctionMixin]
  }
}

