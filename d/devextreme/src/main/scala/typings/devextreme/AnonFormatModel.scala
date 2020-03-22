package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFormatModel[T] extends js.Object {
  var cancel: js.UndefOr[Boolean] = js.undefined
  var component: js.UndefOr[T] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var fileName: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
}

object AnonFormatModel {
  @scala.inline
  def apply[T](
    cancel: js.UndefOr[Boolean] = js.undefined,
    component: T = null,
    element: dxElement = null,
    fileName: String = null,
    format: String = null,
    model: js.Any = null
  ): AnonFormatModel[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFormatModel[T]]
  }
}

