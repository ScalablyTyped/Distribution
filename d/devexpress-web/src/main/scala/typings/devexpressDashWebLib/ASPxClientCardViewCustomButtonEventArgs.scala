package typings
package devexpressDashWebLib

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
  var buttonID: java.lang.String
  /**
    * Gets the value which identifies the card whose custom button has been clicked.
    * Value: An integer value that identifies the card whose custom button has been clicked.
    */
  var visibleIndex: scala.Double
}

object ASPxClientCardViewCustomButtonEventArgs {
  @scala.inline
  def apply(buttonID: java.lang.String, processOnServer: scala.Boolean, visibleIndex: scala.Double): ASPxClientCardViewCustomButtonEventArgs = {
    val __obj = js.Dynamic.literal(buttonID = buttonID, processOnServer = processOnServer, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[ASPxClientCardViewCustomButtonEventArgs]
  }
}

