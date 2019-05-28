package typings
package formikLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: java.lang.String
  var onBlur: Fn_EFieldOrEvent
  var onChange: Fn_E
  var value: js.Any
}

object Anon_Name {
  @scala.inline
  def apply(name: java.lang.String, onBlur: Fn_EFieldOrEvent, onChange: Fn_E, value: js.Any): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name, onBlur = onBlur, onChange = onChange, value = value)
  
    __obj.asInstanceOf[Anon_Name]
  }
}

