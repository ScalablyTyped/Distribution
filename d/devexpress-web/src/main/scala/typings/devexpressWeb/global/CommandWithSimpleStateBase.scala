package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Serves as a base for commands with a simple common command state.
  */
/* note: abstract class */ @JSGlobal("CommandWithSimpleStateBase")
@js.native
open class CommandWithSimpleStateBase ()
  extends StObject
     with typings.devexpressWeb.CommandWithSimpleStateBase {
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.SimpleCommandState = js.native
}
