package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptScoreFunction extends ScoreFunction {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Adds a filter whose matching documents will have the score function applied.
    */
  def filter(oFilter: Filter): ScriptScoreFunction
  /*
    The script language being used.
    */
  def lang(language: java.lang.String): ScriptScoreFunction
  /*
    Sets parameters that will be applied to the script.  Overwrites
    any existing params.
    */
  def params(p: js.Object): ScriptScoreFunction
  /*
    Set the script that will modify the score.
    */
  def script(scriptCode: java.lang.String): ScriptScoreFunction
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

object ScriptScoreFunction {
  @scala.inline
  def apply(
    _type: () => java.lang.String,
    filter: Filter => ScriptScoreFunction,
    lang: java.lang.String => ScriptScoreFunction,
    params: js.Object => ScriptScoreFunction,
    script: java.lang.String => ScriptScoreFunction,
    toJSON: () => js.Any
  ): ScriptScoreFunction = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), filter = js.Any.fromFunction1(filter), lang = js.Any.fromFunction1(lang), params = js.Any.fromFunction1(params), script = js.Any.fromFunction1(script), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[ScriptScoreFunction]
  }
}

