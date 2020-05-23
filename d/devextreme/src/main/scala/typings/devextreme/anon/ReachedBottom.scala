package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.event
import typings.devextreme.mod.DevExpress.ui.dxList
import typings.devextreme.mod.global.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReachedBottom extends js.Object {
  var component: js.UndefOr[dxList] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.event] = js.undefined
  var jQueryEvent: js.UndefOr[JQueryEventObject] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var reachedBottom: js.UndefOr[Boolean] = js.undefined
  var reachedLeft: js.UndefOr[Boolean] = js.undefined
  var reachedRight: js.UndefOr[Boolean] = js.undefined
  var reachedTop: js.UndefOr[Boolean] = js.undefined
  var scrollOffset: js.UndefOr[js.Any] = js.undefined
}

object ReachedBottom {
  @scala.inline
  def apply(
    component: dxList = null,
    element: dxElement = null,
    event: event = null,
    jQueryEvent: JQueryEventObject = null,
    model: js.Any = null,
    reachedBottom: js.UndefOr[Boolean] = js.undefined,
    reachedLeft: js.UndefOr[Boolean] = js.undefined,
    reachedRight: js.UndefOr[Boolean] = js.undefined,
    reachedTop: js.UndefOr[Boolean] = js.undefined,
    scrollOffset: js.Any = null
  ): ReachedBottom = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (jQueryEvent != null) __obj.updateDynamic("jQueryEvent")(jQueryEvent.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (!js.isUndefined(reachedBottom)) __obj.updateDynamic("reachedBottom")(reachedBottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reachedLeft)) __obj.updateDynamic("reachedLeft")(reachedLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reachedRight)) __obj.updateDynamic("reachedRight")(reachedRight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reachedTop)) __obj.updateDynamic("reachedTop")(reachedTop.get.asInstanceOf[js.Any])
    if (scrollOffset != null) __obj.updateDynamic("scrollOffset")(scrollOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReachedBottom]
  }
}

