package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapCalendarEventMap extends BootstrapClientEditEventMap {
  var beginCallback: BeginCallbackEventArgs = js.native
  var callbackError: CallbackErrorEventArgs = js.native
  var customDisabledDate: CalendarCustomDisabledDateEventArgs = js.native
  var endCallback: EndCallbackEventArgs = js.native
  var keyDown: EditKeyEventArgs = js.native
  var keyPress: EditKeyEventArgs = js.native
  var keyUp: EditKeyEventArgs = js.native
  var selectionChanged: ProcessingModeEventArgs = js.native
  var visibleMonthChanged: ProcessingModeEventArgs = js.native
}

object BootstrapCalendarEventMap {
  @scala.inline
  def apply(
    beginCallback: BeginCallbackEventArgs,
    callbackError: CallbackErrorEventArgs,
    customDisabledDate: CalendarCustomDisabledDateEventArgs,
    endCallback: EndCallbackEventArgs,
    gotFocus: EventArgs,
    init: EventArgs,
    keyDown: EditKeyEventArgs,
    keyPress: EditKeyEventArgs,
    keyUp: EditKeyEventArgs,
    lostFocus: EventArgs,
    selectionChanged: ProcessingModeEventArgs,
    validation: EditValidationEventArgs,
    valueChanged: ProcessingModeEventArgs,
    visibleMonthChanged: ProcessingModeEventArgs
  ): BootstrapCalendarEventMap = {
    val __obj = js.Dynamic.literal(beginCallback = beginCallback.asInstanceOf[js.Any], callbackError = callbackError.asInstanceOf[js.Any], customDisabledDate = customDisabledDate.asInstanceOf[js.Any], endCallback = endCallback.asInstanceOf[js.Any], gotFocus = gotFocus.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], keyDown = keyDown.asInstanceOf[js.Any], keyPress = keyPress.asInstanceOf[js.Any], keyUp = keyUp.asInstanceOf[js.Any], lostFocus = lostFocus.asInstanceOf[js.Any], selectionChanged = selectionChanged.asInstanceOf[js.Any], validation = validation.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any], visibleMonthChanged = visibleMonthChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapCalendarEventMap]
  }
  @scala.inline
  implicit class BootstrapCalendarEventMapOps[Self <: BootstrapCalendarEventMap] (val x: Self) extends AnyVal {
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
    def setCustomDisabledDate(value: CalendarCustomDisabledDateEventArgs): Self = this.set("customDisabledDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndCallback(value: EndCallbackEventArgs): Self = this.set("endCallback", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyDown(value: EditKeyEventArgs): Self = this.set("keyDown", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyPress(value: EditKeyEventArgs): Self = this.set("keyPress", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyUp(value: EditKeyEventArgs): Self = this.set("keyUp", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionChanged(value: ProcessingModeEventArgs): Self = this.set("selectionChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisibleMonthChanged(value: ProcessingModeEventArgs): Self = this.set("visibleMonthChanged", value.asInstanceOf[js.Any])
  }
  
}

