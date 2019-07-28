package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the CustomButtonClick event.
  */
trait ASPxClientGridViewCustomButtonEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets the value which identifies the custom button.
    * Value: A string value that identifies the clicked custom button.
    */
  var buttonID: String
  /**
    * Gets the value which identifies the row whose custom button has been clicked.
    * Value: An integer value that identifies the row whose custom button has been clicked.
    */
  var visibleIndex: Double
}

object ASPxClientGridViewCustomButtonEventArgs {
  @scala.inline
  def apply(buttonID: String, processOnServer: Boolean, visibleIndex: Double): ASPxClientGridViewCustomButtonEventArgs = {
    val __obj = js.Dynamic.literal(buttonID = buttonID, processOnServer = processOnServer, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[ASPxClientGridViewCustomButtonEventArgs]
  }
}

