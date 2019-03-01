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

object ScriptField {
  @scala.inline
  def apply(
    _type: js.Function0[java.lang.String],
    ignoreFailure: js.Function1[scala.Boolean, ScriptField],
    lang: js.Function1[java.lang.String, ScriptField],
    params: js.Function1[js.Object, ScriptField],
    script: js.Function1[java.lang.String, ScriptField],
    toJSON: js.Function0[js.Any]
  ): ScriptField = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_type")(_type)
    __obj.updateDynamic("ignoreFailure")(ignoreFailure)
    __obj.updateDynamic("lang")(lang)
    __obj.updateDynamic("params")(params)
    __obj.updateDynamic("script")(script)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.asInstanceOf[ScriptField]
  }
}

