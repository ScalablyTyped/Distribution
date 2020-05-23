package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientButtonEditBase.ButtonClick event.
  */
trait ASPxClientButtonEditClickEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets the index of the clicked button.
    */
  var buttonIndex: Double
}

object ASPxClientButtonEditClickEventArgs {
  @scala.inline
  def apply(buttonIndex: Double, processOnServer: Boolean): ASPxClientButtonEditClickEventArgs = {
    val __obj = js.Dynamic.literal(buttonIndex = buttonIndex.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientButtonEditClickEventArgs]
  }
}

