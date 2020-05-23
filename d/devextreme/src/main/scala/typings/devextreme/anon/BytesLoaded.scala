package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.event
import typings.devextreme.mod.DevExpress.ui.dxFileUploader
import typings.devextreme.mod.global.JQueryEventObject
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BytesLoaded extends js.Object {
  var bytesLoaded: js.UndefOr[Double] = js.undefined
  var bytesTotal: js.UndefOr[Double] = js.undefined
  var component: js.UndefOr[dxFileUploader] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.event] = js.undefined
  var file: js.UndefOr[typings.std.File] = js.undefined
  var jQueryEvent: js.UndefOr[JQueryEventObject] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var request: js.UndefOr[XMLHttpRequest] = js.undefined
  var segmentSize: js.UndefOr[Double] = js.undefined
}

object BytesLoaded {
  @scala.inline
  def apply(
    bytesLoaded: js.UndefOr[Double] = js.undefined,
    bytesTotal: js.UndefOr[Double] = js.undefined,
    component: dxFileUploader = null,
    element: dxElement = null,
    event: event = null,
    file: typings.std.File = null,
    jQueryEvent: JQueryEventObject = null,
    model: js.Any = null,
    request: XMLHttpRequest = null,
    segmentSize: js.UndefOr[Double] = js.undefined
  ): BytesLoaded = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bytesLoaded)) __obj.updateDynamic("bytesLoaded")(bytesLoaded.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bytesTotal)) __obj.updateDynamic("bytesTotal")(bytesTotal.get.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (jQueryEvent != null) __obj.updateDynamic("jQueryEvent")(jQueryEvent.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (!js.isUndefined(segmentSize)) __obj.updateDynamic("segmentSize")(segmentSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BytesLoaded]
  }
}

