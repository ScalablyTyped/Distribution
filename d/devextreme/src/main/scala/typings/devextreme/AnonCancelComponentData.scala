package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancelComponentData[T] extends js.Object {
  var cancel: js.UndefOr[Boolean] = js.undefined
  var component: js.UndefOr[T] = js.undefined
  var data: js.UndefOr[Blob] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var fileName: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String] = js.undefined
}

object AnonCancelComponentData {
  @scala.inline
  def apply[T](
    cancel: js.UndefOr[Boolean] = js.undefined,
    component: T = null,
    data: Blob = null,
    element: dxElement = null,
    fileName: String = null,
    format: String = null
  ): AnonCancelComponentData[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCancelComponentData[T]]
  }
}

