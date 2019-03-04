package typings
package devexpressDashWebLib

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
    AdjustControl: js.Function0[scala.Unit],
    DayCellCustomHighlight: ASPxClientEvent[
      ASPxClientDateNavigatorDayCellCustomHighlightEventHandler[ASPxClientDateNavigator]
    ],
    GetClientVisible: js.Function0[scala.Boolean],
    GetHeight: js.Function0[scala.Double],
    GetMainElement: js.Function0[js.Object],
    GetParentControl: js.Function0[js.Object],
    GetVisible: js.Function0[scala.Boolean],
    GetWidth: js.Function0[scala.Double],
    InCallback: js.Function0[scala.Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SelectionChanged: ASPxClientEvent[ASPxClientDateNavigatorSelectionChangedEventHandler[ASPxClientDateNavigator]],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    VisibleMonthChanged: ASPxClientEvent[ASPxClientDateNavigatorVisibleMonthChangedEventHandler[ASPxClientDateNavigator]],
    name: java.lang.String
  ): ASPxClientDateNavigator = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl, DayCellCustomHighlight = DayCellCustomHighlight, GetClientVisible = GetClientVisible, GetHeight = GetHeight, GetMainElement = GetMainElement, GetParentControl = GetParentControl, GetVisible = GetVisible, GetWidth = GetWidth, InCallback = InCallback, Init = Init, SelectionChanged = SelectionChanged, SendMessageToAssistiveTechnology = SendMessageToAssistiveTechnology, SetClientVisible = SetClientVisible, SetHeight = SetHeight, SetVisible = SetVisible, SetWidth = SetWidth, VisibleMonthChanged = VisibleMonthChanged, name = name)
  
    __obj.asInstanceOf[ASPxClientDateNavigator]
  }
}

