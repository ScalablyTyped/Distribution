package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageBoxReturnValue extends js.Object {
  /**
    * The checked state of the checkbox if checkboxLabel was set. Otherwise false.
    */
  var checkboxChecked: Boolean
  /**
    * The index of the clicked button.
    */
  var response: Double
}

object MessageBoxReturnValue {
  @scala.inline
  def apply(checkboxChecked: Boolean, response: Double): MessageBoxReturnValue = {
    val __obj = js.Dynamic.literal(checkboxChecked = checkboxChecked.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageBoxReturnValue]
  }
}

