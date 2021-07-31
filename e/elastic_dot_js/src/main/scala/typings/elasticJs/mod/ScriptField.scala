package typings.elasticJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "ScriptField")
@js.native
class ScriptField protected () extends StObject {
  /*
    Computes dynamic document properties based on information from other fields.
    */
  def this(fieldName: String) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    If execeptions thrown from the script should be ignored or not.
    Default: false
    */
  def ignoreFailure(trueFalse: Boolean): ScriptField = js.native
  
  /*
    The script language being used. Currently supported values are
    javascript and mvel.
    */
  def lang(language: String): ScriptField = js.native
  
  /*
    Allows you to set script parameters to be used during the execution of the script.
    */
  def params(oParams: js.Object): ScriptField = js.native
  
  /*
    Sets the script/code that will be used to perform the calculation.
    */
  def script(expression: String): ScriptField = js.native
  
  /*
    Retrieves the internal script object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}
