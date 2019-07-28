package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for cancelable client events.
  */
trait ASPxClientCancelEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    * Value: true if the action that raised the event should be canceled; otherwise, false.
    */
  var cancel: Boolean
}

object ASPxClientCancelEventArgs {
  @scala.inline
  def apply(cancel: Boolean): ASPxClientCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel)
  
    __obj.asInstanceOf[ASPxClientCancelEventArgs]
  }
}

