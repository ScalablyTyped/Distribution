package typings.forms.formsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldBound extends Field {
  /** The request data coerced to the correct format for this field. */
  var data: js.Any = js.native
  /** An error message if the field fails validation. */
  var error: String = js.native
  /** The raw value from the request data. */
  var value: js.Any = js.native
  /**
    * Checks if the field is required and whether it is empty. Then runs the validator functions in order until one fails or they all pass.
    * If a validator fails, the resulting message is stored in the field's error attribute.
    */
  def validate(form: Form, callback: js.Function2[/* err */ String, /* field */ Field, Unit]): Unit = js.native
}

