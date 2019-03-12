package typings
package formikLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_E extends js.Object {
  var name: java.lang.String
  var value: js.Any
  def onBlur(e: js.Any): scala.Unit
  def onChange(e: reactLib.reactMod.ReactNs.ChangeEvent[_]): scala.Unit
}

object Anon_E {
  @scala.inline
  def apply(
    name: java.lang.String,
    onBlur: js.Any => scala.Unit,
    onChange: reactLib.reactMod.ReactNs.ChangeEvent[_] => scala.Unit,
    value: js.Any
  ): Anon_E = {
    val __obj = js.Dynamic.literal(name = name, onBlur = js.Any.fromFunction1(onBlur), onChange = js.Any.fromFunction1(onChange), value = value)
  
    __obj.asInstanceOf[Anon_E]
  }
}

