package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "ScriptScoreFunction")
@js.native
/*
  Modify a documents score using a script.
  */
class ScriptScoreFunction ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.ScriptScoreFunction {
  /*
    The type of ejs object.  For internal use only.
    */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
    Adds a filter whose matching documents will have the score function applied.
    */
  /* CompleteClass */
  override def filter(oFilter: elasticDotJsLib.elasticDotJsMod.elasticjsNs.Filter): elasticDotJsLib.elasticDotJsMod.elasticjsNs.ScriptScoreFunction = js.native
  /*
    The script language being used.
    */
  /* CompleteClass */
  override def lang(language: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.ScriptScoreFunction = js.native
  /*
    Sets parameters that will be applied to the script.  Overwrites
    any existing params.
    */
  /* CompleteClass */
  override def params(p: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.ScriptScoreFunction = js.native
  /*
    Set the script that will modify the score.
    */
  /* CompleteClass */
  override def script(scriptCode: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.ScriptScoreFunction = js.native
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

