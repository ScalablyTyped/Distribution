package typings.elasticDotJs.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "ScoreFunctionMixin")
@js.native
class ScoreFunctionMixin () extends ScoreFunction {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  /*
    Adds a filter whose matching documents will have the score function applied.
    */
  def filter(oFilter: Filter): ScoreFunctionMixin = js.native
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}

