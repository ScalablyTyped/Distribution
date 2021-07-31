package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to download the document file, specifying its extension.
  */
@js.native
trait FileDownloadCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the FileDownloadCommand command with the specified parameters. true if the command has been successfully executed; false if the command execution has failed.
    * @param fileExtension A string value specifying the extension of the downloading file.
    * @param fileName The name of the downloaded document.
    */
  def execute(fileExtension: String): Boolean = js.native
  def execute(fileExtension: String, fileName: String): Boolean = js.native
  def execute(fileExtension: DocumentFormat): Boolean = js.native
  def execute(fileExtension: DocumentFormat, fileName: String): Boolean = js.native
}
