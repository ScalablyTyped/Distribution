package typings.devextreme

import typings.devextreme.mod.DevExpress.viz.basePointObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonElementTarget extends js.Object {
  var component: js.UndefOr[js.Any] = js.undefined
  var element: js.UndefOr[js.Any] = js.undefined
  var target: js.UndefOr[basePointObject] = js.undefined
}

object AnonElementTarget {
  @scala.inline
  def apply(component: js.Any = null, element: js.Any = null, target: basePointObject = null): AnonElementTarget = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonElementTarget]
  }
}

