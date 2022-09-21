package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke the File Open dialog allowing one to select and load a document file into RichEdit.
  */
@JSGlobal("FileOpenDialogCommand")
@js.native
open class FileOpenDialogCommand ()
  extends StObject
     with typings.devexpressWeb.FileOpenDialogCommand {
  
  /**
    * Executes the FileOpenDialogCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.SimpleCommandState = js.native
}
