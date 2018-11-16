package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "ScriptField")
@js.native
class ScriptField protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.ScriptField {
  /*
       Computes dynamic document properties based on information from other fields.
       */
  def this(fieldName: java.lang.String) = this()
  /*
       The type of ejs object.  For internal use only.
       */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
       If execeptions thrown from the script should be ignored or not.
       Default: false
       */
  /* CompleteClass */
  override def ignoreFailure(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.ScriptField = js.native
  /*
       The script language being used. Currently supported values are
       javascript and mvel.
       */
  /* CompleteClass */
  override def lang(language: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.ScriptField = js.native
  /*
       Allows you to set script parameters to be used during the execution of the script.
       */
  /* CompleteClass */
  override def params(oParams: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.ScriptField = js.native
  /*
       Sets the script/code that will be used to perform the calculation.
       */
  /* CompleteClass */
  override def script(expression: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.ScriptField = js.native
  /*
       Retrieves the internal script object. This is typically used by
       internal API functions so use with caution.
       */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

