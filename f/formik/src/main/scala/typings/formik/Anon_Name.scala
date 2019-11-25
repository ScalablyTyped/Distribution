package typings.formik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: String
  var onBlur: Fn_EFieldOrEvent
  var onChange: Fn_E
  var value: js.Any
}

object Anon_Name {
  @scala.inline
  def apply(name: String, onBlur: Fn_EFieldOrEvent, onChange: Fn_E, value: js.Any): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onBlur = onBlur.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Name]
  }
}

