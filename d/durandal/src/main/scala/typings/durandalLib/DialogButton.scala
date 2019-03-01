package typings
package durandalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogButton extends js.Object {
  var text: java.lang.String
  var value: js.Any
}

object DialogButton {
  @scala.inline
  def apply(text: java.lang.String, value: js.Any): DialogButton = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DialogButton]
  }
}

