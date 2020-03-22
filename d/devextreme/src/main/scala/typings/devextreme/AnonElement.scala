package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonElement[T] extends js.Object {
  var component: js.UndefOr[T] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
}

object AnonElement {
  @scala.inline
  def apply[T](component: T = null, element: dxElement = null): AnonElement[T] = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonElement[T]]
  }
}

