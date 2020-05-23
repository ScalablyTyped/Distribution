package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Component[T] extends js.Object {
  var component: js.UndefOr[T] = js.undefined
}

object Component {
  @scala.inline
  def apply[T](component: T = null): Component[T] = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    __obj.asInstanceOf[Component[T]]
  }
}

