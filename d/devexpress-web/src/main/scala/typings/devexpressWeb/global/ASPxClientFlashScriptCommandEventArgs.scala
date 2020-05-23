package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientObjectContainer.FlashScriptCommand client event.
  */
@JSGlobal("ASPxClientFlashScriptCommandEventArgs")
@js.native
class ASPxClientFlashScriptCommandEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientFlashScriptCommandEventArgs {
  /**
    * Initializes a new object of the ASPxClientFlashScriptCommandEventArgs type with the specified settings.
    */
  def this(command: String, args: String) = this()
  /**
    * Gets arguments passed via the FSCommand action of the flash object.
    */
  /* CompleteClass */
  override var args: String = js.native
  /**
    * Gets a command passed via the FSCommand action of the flash object.
    */
  /* CompleteClass */
  override var command: String = js.native
}

