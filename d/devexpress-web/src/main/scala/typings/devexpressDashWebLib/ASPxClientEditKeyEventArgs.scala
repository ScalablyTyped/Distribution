package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the client events involved with a key being pressed or released.
  */
trait ASPxClientEditKeyEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a DHTML event object that relates to the processed event.
    * Value: An object that maintains DHTML event-specific information.
    */
  var htmlEvent: js.Object
}

object ASPxClientEditKeyEventArgs {
  @scala.inline
  def apply(htmlEvent: js.Object): ASPxClientEditKeyEventArgs = {
    val __obj = js.Dynamic.literal(htmlEvent = htmlEvent)
  
    __obj.asInstanceOf[ASPxClientEditKeyEventArgs]
  }
}

