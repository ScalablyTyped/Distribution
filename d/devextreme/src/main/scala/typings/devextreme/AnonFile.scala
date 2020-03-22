package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.event
import typings.devextreme.mod.DevExpress.ui.dxFileUploader
import typings.devextreme.mod._Global_.JQueryEventObject
import typings.std.File
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFile extends js.Object {
  var component: js.UndefOr[dxFileUploader] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.event] = js.undefined
  var file: js.UndefOr[File] = js.undefined
  var jQueryEvent: js.UndefOr[JQueryEventObject] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var request: js.UndefOr[XMLHttpRequest] = js.undefined
}

object AnonFile {
  @scala.inline
  def apply(
    component: dxFileUploader = null,
    element: dxElement = null,
    event: event = null,
    file: File = null,
    jQueryEvent: JQueryEventObject = null,
    model: js.Any = null,
    request: XMLHttpRequest = null
  ): AnonFile = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (jQueryEvent != null) __obj.updateDynamic("jQueryEvent")(jQueryEvent.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFile]
  }
}

