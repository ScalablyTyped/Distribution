package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientObjectContainer.FlashScriptCommand client event.
  */
trait ASPxClientFlashScriptCommandEventArgs extends ASPxClientEventArgs {
  /**
    * Gets arguments passed via the FSCommand action of the flash object.
    */
  var args: String
  /**
    * Gets a command passed via the FSCommand action of the flash object.
    */
  var command: String
}

object ASPxClientFlashScriptCommandEventArgs {
  @scala.inline
  def apply(args: String, command: String): ASPxClientFlashScriptCommandEventArgs = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFlashScriptCommandEventArgs]
  }
}

