package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptField extends js.Object {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    If execeptions thrown from the script should be ignored or not.
    Default: false
    */
  def ignoreFailure(trueFalse: scala.Boolean): ScriptField
  /*
    The script language being used. Currently supported values are
    javascript and mvel.
    */
  def lang(language: java.lang.String): ScriptField
  /*
    Allows you to set script parameters to be used during the execution of the script.
    */
  def params(oParams: js.Object): ScriptField
  /*
    Sets the script/code that will be used to perform the calculation.
    */
  def script(expression: java.lang.String): ScriptField
  /*
    Retrieves the internal script object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

