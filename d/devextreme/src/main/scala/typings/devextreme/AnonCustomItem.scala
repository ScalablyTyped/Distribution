package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCustomItem[T] extends js.Object {
  var component: js.UndefOr[T] = js.undefined
  var customItem: js.UndefOr[String | js.Any | Promise[_] | JQueryPromise[_]] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object AnonCustomItem {
  @scala.inline
  def apply[T](
    component: T = null,
    customItem: String | js.Any | Promise[_] | JQueryPromise[_] = null,
    element: dxElement = null,
    model: js.Any = null,
    text: String = null
  ): AnonCustomItem[T] = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (customItem != null) __obj.updateDynamic("customItem")(customItem.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCustomItem[T]]
  }
}

