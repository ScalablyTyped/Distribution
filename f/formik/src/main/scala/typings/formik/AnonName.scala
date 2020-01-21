package typings.formik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: String
  var onBlur: FnEFieldOrEvent
  var onChange: FnE
  var value: js.Any
}

object AnonName {
  @scala.inline
  def apply(name: String, onBlur: FnEFieldOrEvent, onChange: FnE, value: js.Any): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onBlur = onBlur.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonName]
  }
}

