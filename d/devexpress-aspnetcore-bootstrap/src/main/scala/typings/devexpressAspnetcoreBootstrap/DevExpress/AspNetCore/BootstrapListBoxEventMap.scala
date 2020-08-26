package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapListBoxEventMap extends BootstrapClientEditEventMap {
  var beginCallback: BeginCallbackEventArgs = js.native
  var callbackError: CallbackErrorEventArgs = js.native
  var customHighlighting: ListEditCustomHighlightingEventArgs = js.native
  var endCallback: EndCallbackEventArgs = js.native
  var itemDoubleClick: EventArgs = js.native
  var itemFiltering: ListEditItemFilteringEventArgs = js.native
  var keyDown: EditKeyEventArgs = js.native
  var keyPress: EditKeyEventArgs = js.native
  var keyUp: EditKeyEventArgs = js.native
  var selectedIndexChanged: ProcessingModeEventArgs = js.native
}

object BootstrapListBoxEventMap {
  @scala.inline
  def apply(
    beginCallback: BeginCallbackEventArgs,
    callbackError: CallbackErrorEventArgs,
    customHighlighting: ListEditCustomHighlightingEventArgs,
    endCallback: EndCallbackEventArgs,
    gotFocus: EventArgs,
    init: EventArgs,
    itemDoubleClick: EventArgs,
    itemFiltering: ListEditItemFilteringEventArgs,
    keyDown: EditKeyEventArgs,
    keyPress: EditKeyEventArgs,
    keyUp: EditKeyEventArgs,
    lostFocus: EventArgs,
    selectedIndexChanged: ProcessingModeEventArgs,
    validation: EditValidationEventArgs,
    valueChanged: ProcessingModeEventArgs
  ): BootstrapListBoxEventMap = {
    val __obj = js.Dynamic.literal(beginCallback = beginCallback.asInstanceOf[js.Any], callbackError = callbackError.asInstanceOf[js.Any], customHighlighting = customHighlighting.asInstanceOf[js.Any], endCallback = endCallback.asInstanceOf[js.Any], gotFocus = gotFocus.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], itemDoubleClick = itemDoubleClick.asInstanceOf[js.Any], itemFiltering = itemFiltering.asInstanceOf[js.Any], keyDown = keyDown.asInstanceOf[js.Any], keyPress = keyPress.asInstanceOf[js.Any], keyUp = keyUp.asInstanceOf[js.Any], lostFocus = lostFocus.asInstanceOf[js.Any], selectedIndexChanged = selectedIndexChanged.asInstanceOf[js.Any], validation = validation.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapListBoxEventMap]
  }
  @scala.inline
  implicit class BootstrapListBoxEventMapOps[Self <: BootstrapListBoxEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBeginCallback(value: BeginCallbackEventArgs): Self = this.set("beginCallback", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallbackError(value: CallbackErrorEventArgs): Self = this.set("callbackError", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomHighlighting(value: ListEditCustomHighlightingEventArgs): Self = this.set("customHighlighting", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndCallback(value: EndCallbackEventArgs): Self = this.set("endCallback", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemDoubleClick(value: EventArgs): Self = this.set("itemDoubleClick", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemFiltering(value: ListEditItemFilteringEventArgs): Self = this.set("itemFiltering", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyDown(value: EditKeyEventArgs): Self = this.set("keyDown", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyPress(value: EditKeyEventArgs): Self = this.set("keyPress", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyUp(value: EditKeyEventArgs): Self = this.set("keyUp", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedIndexChanged(value: ProcessingModeEventArgs): Self = this.set("selectedIndexChanged", value.asInstanceOf[js.Any])
  }
  
}

