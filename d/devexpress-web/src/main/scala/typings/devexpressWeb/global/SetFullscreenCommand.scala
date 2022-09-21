package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle the fullscreen mode.
  */
@JSGlobal("SetFullscreenCommand")
@js.native
open class SetFullscreenCommand ()
  extends StObject
     with typings.devexpressWeb.SetFullscreenCommand {
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[Boolean] = js.native
}
