package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComponent[T] extends js.Object {
  var component: js.UndefOr[T] = js.undefined
}

object AnonComponent {
  @scala.inline
  def apply[T](component: T = null): AnonComponent[T] = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComponent[T]]
  }
}

