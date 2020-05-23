package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the Resource class.
  */
trait ASPxClientResource extends js.Object {
  /**
    * Returns the resource's caption.
    */
  var caption: String
  /**
    * Gets the resource's color.
    */
  var color: String
  /**
    * Gets the resource ID.
    */
  var resourceId: String
  /**
    * Returns the resource's caption.
    */
  def GetCaption(): String
  /**
    * Gets the resource's color.
    */
  def GetColor(): String
  /**
    * Gets the ID of the client appointment.
    */
  def GetId(): String
}

object ASPxClientResource {
  @scala.inline
  def apply(
    GetCaption: () => String,
    GetColor: () => String,
    GetId: () => String,
    caption: String,
    color: String,
    resourceId: String
  ): ASPxClientResource = {
    val __obj = js.Dynamic.literal(GetCaption = js.Any.fromFunction0(GetCaption), GetColor = js.Any.fromFunction0(GetColor), GetId = js.Any.fromFunction0(GetId), caption = caption.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientResource]
  }
}

