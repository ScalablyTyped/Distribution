package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "ScriptField")
@js.native
class ScriptField protected () extends js.Object {
  /*
    Computes dynamic document properties based on information from other fields.
    */
  def this(fieldName: java.lang.String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String = js.native
  /*
    If execeptions thrown from the script should be ignored or not.
    Default: false
    */
  def ignoreFailure(trueFalse: scala.Boolean): ScriptField = js.native
  /*
    The script language being used. Currently supported values are
    javascript and mvel.
    */
  def lang(language: java.lang.String): ScriptField = js.native
  /*
    Allows you to set script parameters to be used during the execution of the script.
    */
  def params(oParams: js.Object): ScriptField = js.native
  /*
    Sets the script/code that will be used to perform the calculation.
    */
  def script(expression: java.lang.String): ScriptField = js.native
  /*
    Retrieves the internal script object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}

