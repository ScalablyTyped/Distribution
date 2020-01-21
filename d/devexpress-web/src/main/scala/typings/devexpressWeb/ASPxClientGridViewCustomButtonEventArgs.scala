package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.CustomButtonClick event.
  */
@JSGlobal("ASPxClientGridViewCustomButtonEventArgs")
@js.native
class ASPxClientGridViewCustomButtonEventArgs protected () extends ASPxClientProcessingModeEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGridViewCustomButtonEventArgs class.
    * @param visibleIndex An integer value that identifies the row whose custom button has been clicked. This value is assigned to the ASPxClientGridViewCustomButtonEventArgs.visibleIndex property.
    * @param buttonID An integer value that identifies the clicked custom button. This value is assigned to the ASPxClientGridViewCustomButtonEventArgs.buttonID property.
    */
  def this(visibleIndex: Double, buttonID: String) = this()
  /**
    * Gets the value that identifies the custom button.
    */
  var buttonID: String = js.native
  /**
    * Gets the value that identifies the row whose custom button has been clicked.
    */
  var visibleIndex: Double = js.native
}

