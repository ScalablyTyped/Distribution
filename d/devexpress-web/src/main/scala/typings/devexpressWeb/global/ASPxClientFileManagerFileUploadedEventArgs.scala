package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.FileUploaded event.
  */
@JSGlobal("ASPxClientFileManagerFileUploadedEventArgs")
@js.native
open class ASPxClientFileManagerFileUploadedEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientFileManagerFileUploadedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFileManagerFileUploadedEventArgs object with the specified parameters.
    * @param folder A string value specifying the uploaded file path.
    * @param fileName A  string value that specifies the file name.
    */
  def this(folder: String, fileName: String) = this()
  
  /**
    * Gets the name of the uploaded file.
    */
  /* CompleteClass */
  var fileName: String = js.native
  
  /**
    * Gets the path to the folder where a file is uploaded.
    */
  /* CompleteClass */
  var folder: String = js.native
}
