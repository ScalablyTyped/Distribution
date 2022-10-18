package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Serves as a base for commands with the Boolean state.
  */
/* note: abstract class */ @JSGlobal("CommandWithBooleanStateBase")
@js.native
open class CommandWithBooleanStateBase ()
  extends StObject
     with typings.devexpressWeb.CommandWithBooleanStateBase {
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[Boolean] = js.native
}
