package typings
package devexpressDashWebLib

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
  var buttonIndex: scala.Double
}

object ASPxClientButtonEditClickEventArgs {
  @scala.inline
  def apply(buttonIndex: scala.Double, processOnServer: scala.Boolean): ASPxClientButtonEditClickEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buttonIndex")(buttonIndex)
    __obj.updateDynamic("processOnServer")(processOnServer)
    __obj.asInstanceOf[ASPxClientButtonEditClickEventArgs]
  }
}

