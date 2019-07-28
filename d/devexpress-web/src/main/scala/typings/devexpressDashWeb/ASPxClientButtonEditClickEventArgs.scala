package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ButtonClick event.
  */
trait ASPxClientButtonEditClickEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets the index of the clicked button.
    * Value: An integer value representing the index of the clicked button within the editor's Buttons collection.
    */
  var buttonIndex: Double
}

object ASPxClientButtonEditClickEventArgs {
  @scala.inline
  def apply(buttonIndex: Double, processOnServer: Boolean): ASPxClientButtonEditClickEventArgs = {
    val __obj = js.Dynamic.literal(buttonIndex = buttonIndex, processOnServer = processOnServer)
  
    __obj.asInstanceOf[ASPxClientButtonEditClickEventArgs]
  }
}

