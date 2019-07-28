package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the EndCallback event.
  */
trait ASPxClientGlobalEndCallbackEventArgs extends ASPxClientEventArgs {
  /**
    * Gets an object that initiated a callback.
    * Value: An <see cref="ASPxClientControl" /> class descendant object that is the control that initiated a callback.
    */
  var control: ASPxClientControl
}

object ASPxClientGlobalEndCallbackEventArgs {
  @scala.inline
  def apply(control: ASPxClientControl): ASPxClientGlobalEndCallbackEventArgs = {
    val __obj = js.Dynamic.literal(control = control)
  
    __obj.asInstanceOf[ASPxClientGlobalEndCallbackEventArgs]
  }
}

