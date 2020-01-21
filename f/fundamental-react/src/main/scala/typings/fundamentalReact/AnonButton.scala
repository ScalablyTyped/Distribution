package typings.fundamentalReact

import typings.fundamentalReact.fundamentalReactStrings.Button
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonButton extends js.Object {
  var displayName: Button
}

object AnonButton {
  @scala.inline
  def apply(displayName: Button): AnonButton = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonButton]
  }
}

