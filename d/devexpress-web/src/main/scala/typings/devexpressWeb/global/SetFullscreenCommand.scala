package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to toggle the fullscreen mode.
  */
@JSGlobal("SetFullscreenCommand")
@js.native
class SetFullscreenCommand ()
  extends typings.devexpressWeb.SetFullscreenCommand {
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[Boolean] = js.native
}

