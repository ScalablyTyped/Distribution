package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxDateNavigator control.
  */
@js.native
trait ASPxClientDateNavigator extends ASPxClientControl {
  /**
    * Allows you to provide custom highlighting styles for day cells.
    */
  var DayCellCustomHighlight: ASPxClientEvent[
    ASPxClientDateNavigatorDayCellCustomHighlightEventHandler[ASPxClientDateNavigator]
  ] = js.native
  /**
    * Occurs when the end user selects another date.
    */
  var SelectionChanged: ASPxClientEvent[ASPxClientDateNavigatorSelectionChangedEventHandler[ASPxClientDateNavigator]] = js.native
  /**
    * Occurs when the end user changes the visible month.
    */
  var VisibleMonthChanged: ASPxClientEvent[ASPxClientDateNavigatorVisibleMonthChangedEventHandler[ASPxClientDateNavigator]] = js.native
}

object ASPxClientDateNavigator {
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    DayCellCustomHighlight: ASPxClientEvent[
      ASPxClientDateNavigatorDayCellCustomHighlightEventHandler[ASPxClientDateNavigator]
    ],
    GetClientVisible: () => Boolean,
    GetHeight: () => Double,
    GetMainElement: () => js.Any,
    GetParentControl: () => js.Any,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SelectionChanged: ASPxClientEvent[ASPxClientDateNavigatorSelectionChangedEventHandler[ASPxClientDateNavigator]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetHeight: Double => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    VisibleMonthChanged: ASPxClientEvent[ASPxClientDateNavigatorVisibleMonthChangedEventHandler[ASPxClientDateNavigator]],
    name: String
  ): ASPxClientDateNavigator = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), DayCellCustomHighlight = DayCellCustomHighlight.asInstanceOf[js.Any], GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], SelectionChanged = SelectionChanged.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), VisibleMonthChanged = VisibleMonthChanged.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDateNavigator]
  }
  @scala.inline
  implicit class ASPxClientDateNavigatorOps[Self <: ASPxClientDateNavigator] (val x: Self) extends AnyVal {
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
    def setDayCellCustomHighlight(
      value: ASPxClientEvent[
          ASPxClientDateNavigatorDayCellCustomHighlightEventHandler[ASPxClientDateNavigator]
        ]
    ): Self = this.set("DayCellCustomHighlight", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionChanged(
      value: ASPxClientEvent[ASPxClientDateNavigatorSelectionChangedEventHandler[ASPxClientDateNavigator]]
    ): Self = this.set("SelectionChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisibleMonthChanged(
      value: ASPxClientEvent[ASPxClientDateNavigatorVisibleMonthChangedEventHandler[ASPxClientDateNavigator]]
    ): Self = this.set("VisibleMonthChanged", value.asInstanceOf[js.Any])
  }
  
}

