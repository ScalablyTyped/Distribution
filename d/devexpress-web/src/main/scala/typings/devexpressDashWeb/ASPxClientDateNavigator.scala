package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientDateNavigator extends ASPxClientControl {
  var DayCellCustomHighlight: ASPxClientEvent[
    ASPxClientDateNavigatorDayCellCustomHighlightEventHandler[ASPxClientDateNavigator]
  ]
  var SelectionChanged: ASPxClientEvent[ASPxClientDateNavigatorSelectionChangedEventHandler[ASPxClientDateNavigator]]
  var VisibleMonthChanged: ASPxClientEvent[ASPxClientDateNavigatorVisibleMonthChangedEventHandler[ASPxClientDateNavigator]]
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
    GetMainElement: () => js.Object,
    GetParentControl: () => js.Object,
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
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), DayCellCustomHighlight = DayCellCustomHighlight, GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init, SelectionChanged = SelectionChanged, SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), VisibleMonthChanged = VisibleMonthChanged, name = name)
  
    __obj.asInstanceOf[ASPxClientDateNavigator]
  }
}

