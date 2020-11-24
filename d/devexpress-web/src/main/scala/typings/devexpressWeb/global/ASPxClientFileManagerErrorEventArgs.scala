package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.ErrorOccurred event.
  */
@JSGlobal("ASPxClientFileManagerErrorEventArgs")
@js.native
class ASPxClientFileManagerErrorEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientFileManagerErrorEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFileManagerErrorEventArgs class.
    * @param commandName A string value that specifies the name of the processed command.
    * @param errorText A string value that specifies the error description.
    * @param errorCode An integer value that specifies the error code.
    */
  def this(commandName: String, errorText: String, errorCode: Double) = this()
}
