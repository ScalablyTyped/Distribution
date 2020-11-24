package typings.elasticJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "ScriptScoreFunction")
@js.native
/*
  Modify a documents score using a script.
  */
class ScriptScoreFunction () extends ScoreFunction {
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Adds a filter whose matching documents will have the score function applied.
    */
  def filter(oFilter: Filter): ScriptScoreFunction = js.native
  
  /*
    The script language being used.
    */
  def lang(language: String): ScriptScoreFunction = js.native
  
  /*
    Sets parameters that will be applied to the script.  Overwrites
    any existing params.
    */
  def params(p: js.Object): ScriptScoreFunction = js.native
  
  /*
    Set the script that will modify the score.
    */
  def script(scriptCode: String): ScriptScoreFunction = js.native
  
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}
