package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the client events involved with a key being pressed or released.
  */
@JSGlobal("ASPxClientEditKeyEventArgs")
@js.native
class ASPxClientEditKeyEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientEditKeyEventArgs object.
    * @param htmlEvent A DHTML event object that relates to the processed event.
    */
  def this(htmlEvent: js.Any) = this()
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any = js.native
}

