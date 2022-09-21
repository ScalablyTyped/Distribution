package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.FileDownloading event.
  */
@JSGlobal("ASPxClientFileManagerFileDownloadingEventArgs")
@js.native
open class ASPxClientFileManagerFileDownloadingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientFileManagerFileDownloadingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFileManagerFileDownloadingEventArgs object.
    * @param file An ASPxClientFileManagerFile object that is the file currently being processed.
    */
  def this(file: typings.devexpressWeb.ASPxClientFileManagerFile) = this()
  
  /**
    * Gets or sets a value indicating whether the action which raised the event, should be canceled.
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets a file related to the event.
    */
  /* CompleteClass */
  var file: typings.devexpressWeb.ASPxClientFileManagerFile = js.native
}
