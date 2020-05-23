package typings.devexpressWeb.global

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDateNavigator.SelectionChanged event.
  */
@JSGlobal("ASPxClientDateNavigatorSelectionChangedEventArgs")
@js.native
class ASPxClientDateNavigatorSelectionChangedEventArgs ()
  extends typings.devexpressWeb.ASPxClientDateNavigatorSelectionChangedEventArgs {
  /**
    * Returns the selected dates related to the event.
    */
  /* CompleteClass */
  override var selectedDates: js.Array[Date] = js.native
}

