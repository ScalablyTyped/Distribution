package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the ASPxDateNavigator control.
  */
trait ASPxClientDateNavigator
  extends StObject
     with ASPxClientControl {
  
  /**
    * Allows you to provide custom highlighting styles for day cells.
    */
  var DayCellCustomHighlight: ASPxClientEvent[
    ASPxClientDateNavigatorDayCellCustomHighlightEventHandler[ASPxClientDateNavigator]
  ]
  
  /**
    * Occurs when the end user selects another date.
    */
  var SelectionChanged: ASPxClientEvent[ASPxClientDateNavigatorSelectionChangedEventHandler[ASPxClientDateNavigator]]
  
  /**
    * Occurs when the end user changes the visible month.
    */
  var VisibleMonthChanged: ASPxClientEvent[ASPxClientDateNavigatorVisibleMonthChangedEventHandler[ASPxClientDateNavigator]]
}
object ASPxClientDateNavigator {
  
  inline def apply(
    AdjustControl: () => Unit,
    DayCellCustomHighlight: ASPxClientEvent[
      ASPxClientDateNavigatorDayCellCustomHighlightEventHandler[ASPxClientDateNavigator]
    ],
    GetClientVisible: () => Boolean,
    GetHeight: () => Double,
    GetMainElement: () => Any,
    GetParentControl: () => Any,
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
  
  extension [Self <: ASPxClientDateNavigator](x: Self) {
    
    inline def setDayCellCustomHighlight(
      value: ASPxClientEvent[
          ASPxClientDateNavigatorDayCellCustomHighlightEventHandler[ASPxClientDateNavigator]
        ]
    ): Self = StObject.set(x, "DayCellCustomHighlight", value.asInstanceOf[js.Any])
    
    inline def setSelectionChanged(
      value: ASPxClientEvent[ASPxClientDateNavigatorSelectionChangedEventHandler[ASPxClientDateNavigator]]
    ): Self = StObject.set(x, "SelectionChanged", value.asInstanceOf[js.Any])
    
    inline def setVisibleMonthChanged(
      value: ASPxClientEvent[ASPxClientDateNavigatorVisibleMonthChangedEventHandler[ASPxClientDateNavigator]]
    ): Self = StObject.set(x, "VisibleMonthChanged", value.asInstanceOf[js.Any])
  }
}
