package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientUploadControl.FilesUploadStart event.
  */
@JSGlobal("ASPxClientUploadControlFilesUploadStartEventArgs")
@js.native
class ASPxClientUploadControlFilesUploadStartEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientUploadControlFilesUploadStartEventArgs {
  /**
    * Initializes a new instance of the ASPxClientUploadControlFilesUploadStartEventArgs class.
    * @param cancel true, if the action that raised the event should be canceled; otherwise, false.
    */
  def this(cancel: Boolean) = this()
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
}
