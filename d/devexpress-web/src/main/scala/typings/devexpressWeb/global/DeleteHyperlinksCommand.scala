package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to delete all hyperlinks in a selected range.
  */
@JSGlobal("DeleteHyperlinksCommand")
@js.native
open class DeleteHyperlinksCommand ()
  extends StObject
     with typings.devexpressWeb.DeleteHyperlinksCommand {
  
  /**
    * Executes the DeleteHyperlinksCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.SimpleCommandState = js.native
}
