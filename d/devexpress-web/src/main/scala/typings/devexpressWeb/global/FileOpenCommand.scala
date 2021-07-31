package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to open the file, specifying its path.
  */
@JSGlobal("FileOpenCommand")
@js.native
class FileOpenCommand ()
  extends StObject
     with typings.devexpressWeb.FileOpenCommand {
  
  /**
    * Executes the FileOpenCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param path A string value specifying path to the opening file.
    */
  /* CompleteClass */
  override def execute(path: String): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.SimpleCommandState = js.native
}
