package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the Resource class.
  */
@JSGlobal("ASPxClientResource")
@js.native
class ASPxClientResource () extends js.Object {
  /**
    * Returns the resource's caption.
    */
  var caption: String = js.native
  /**
    * Gets the resource's color.
    */
  var color: String = js.native
  /**
    * Gets the resource ID.
    */
  var resourceId: String = js.native
  /**
    * Returns the resource's caption.
    */
  def GetCaption(): String = js.native
  /**
    * Gets the resource's color.
    */
  def GetColor(): String = js.native
  /**
    * Gets the ID of the client appointment.
    */
  def GetId(): String = js.native
}

