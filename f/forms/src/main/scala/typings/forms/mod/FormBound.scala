package typings.forms.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormBound extends Form {
  
  /** Object containing all the parsed data keyed by field name. */
  var data: js.Any = js.native
  
  /** Checks all fields for an error attribute. Returns false if any exist, otherwise returns true. */
  def isValid(): Boolean = js.native
  
  /** Calls validate on each field in the bound form and returns the resulting form object to the callback. */
  def validate(callback: js.Function2[/* err */ String, /* form */ this.type, Unit]): Unit = js.native
}
