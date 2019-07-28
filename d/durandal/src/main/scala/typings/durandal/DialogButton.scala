package typings.durandal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogButton extends js.Object {
  var text: String
  var value: js.Any
}

object DialogButton {
  @scala.inline
  def apply(text: String, value: js.Any): DialogButton = {
    val __obj = js.Dynamic.literal(text = text, value = value)
  
    __obj.asInstanceOf[DialogButton]
  }
}

