package typings
package formsLib.formsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormBound extends Form {
  /** Object containing all the parsed data keyed by field name. */
  var data: js.Any = js.native
  /** Checks all fields for an error attribute. Returns false if any exist, otherwise returns true. */
  def isValid(): scala.Boolean = js.native
  /** Calls validate on each field in the bound form and returns the resulting form object to the callback. */
  def validate(callback: js.Function2[/* err */ java.lang.String, /* form */ this.type, scala.Unit]): scala.Unit = js.native
}

