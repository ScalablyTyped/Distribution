package typings.gaeaModel.anon

import typings.gaeaModel.FitGaea.ComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewValue extends js.Object {
  var newValue: ComponentProps
  var oldValue: ComponentProps
}

object NewValue {
  @scala.inline
  def apply(newValue: ComponentProps, oldValue: ComponentProps): NewValue = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewValue]
  }
}

