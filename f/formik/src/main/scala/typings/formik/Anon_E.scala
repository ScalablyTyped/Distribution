package typings.formik

import typings.react.reactMod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_E extends js.Object {
  var name: String
  var value: js.Any
  def onBlur(e: js.Any): Unit
  def onChange(e: ChangeEvent[_]): Unit
}

object Anon_E {
  @scala.inline
  def apply(name: String, onBlur: js.Any => Unit, onChange: ChangeEvent[_] => Unit, value: js.Any): Anon_E = {
    val __obj = js.Dynamic.literal(name = name, onBlur = js.Any.fromFunction1(onBlur), onChange = js.Any.fromFunction1(onChange), value = value)
  
    __obj.asInstanceOf[Anon_E]
  }
}

