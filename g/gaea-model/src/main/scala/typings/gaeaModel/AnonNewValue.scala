package typings.gaeaModel

import typings.gaeaModel.FitGaea.ComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNewValue extends js.Object {
  var newValue: ComponentProps
  var oldValue: ComponentProps
}

object AnonNewValue {
  @scala.inline
  def apply(newValue: ComponentProps, oldValue: ComponentProps): AnonNewValue = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNewValue]
  }
}

