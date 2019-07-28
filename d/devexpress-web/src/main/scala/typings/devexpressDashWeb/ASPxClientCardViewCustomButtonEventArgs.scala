package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the CustomButtonClick event.
  */
trait ASPxClientCardViewCustomButtonEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets the value which identifies the custom button.
    * Value: A string value that identifies the clicked custom button.
    */
  var buttonID: String
  /**
    * Gets the value which identifies the card whose custom button has been clicked.
    * Value: An integer value that identifies the card whose custom button has been clicked.
    */
  var visibleIndex: Double
}

object ASPxClientCardViewCustomButtonEventArgs {
  @scala.inline
  def apply(buttonID: String, processOnServer: Boolean, visibleIndex: Double): ASPxClientCardViewCustomButtonEventArgs = {
    val __obj = js.Dynamic.literal(buttonID = buttonID, processOnServer = processOnServer, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[ASPxClientCardViewCustomButtonEventArgs]
  }
}

