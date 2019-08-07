package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxDateNavigator control.
  */
@JSGlobal("ASPxClientDateNavigator")
@js.native
class ASPxClientDateNavigator () extends ASPxClientControl {
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

