package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.CustomButtonClick event.
  */
@JSGlobal("ASPxClientVerticalGridCustomButtonEventArgs")
@js.native
class ASPxClientVerticalGridCustomButtonEventArgs protected () extends ASPxClientProcessingModeEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridCustomButtonEventArgs class.
    * @param visibleIndex An integer value that identifies the record whose custom button has been clicked. This value is assigned to the ASPxClientVerticalGridCustomButtonEventArgs.visibleIndex property.
    * @param buttonID An integer value that identifies the clicked custom button. This value is assigned to the ASPxClientVerticalGridCustomButtonEventArgs.buttonID property.
    */
  def this(visibleIndex: Double, buttonID: String) = this()
  /**
    * Gets the value which identifies the custom button.
    */
  var buttonID: String = js.native
  /**
    * Gets the value which identifies the record whose custom button has been clicked.
    */
  var visibleIndex: Double = js.native
}

