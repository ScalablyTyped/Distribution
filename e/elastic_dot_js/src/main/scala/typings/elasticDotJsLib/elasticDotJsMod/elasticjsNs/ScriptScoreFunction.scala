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

