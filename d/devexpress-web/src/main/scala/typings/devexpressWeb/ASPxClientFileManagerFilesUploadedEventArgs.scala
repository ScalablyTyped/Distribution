package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.FilesUploaded event.
  */
trait ASPxClientFileManagerFilesUploadedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets an array of uploaded file names.
    */
  var fileNames: js.Array[String]
  
  /**
    * Gets the path to the folder where files are uploaded.
    */
  var folder: String
}
object ASPxClientFileManagerFilesUploadedEventArgs {
  
  inline def apply(fileNames: js.Array[String], folder: String): ASPxClientFileManagerFilesUploadedEventArgs = {
    val __obj = js.Dynamic.literal(fileNames = fileNames.asInstanceOf[js.Any], folder = folder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerFilesUploadedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientFileManagerFilesUploadedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setFileNames(value: js.Array[String]): Self = StObject.set(x, "fileNames", value.asInstanceOf[js.Any])
    
    inline def setFileNamesVarargs(value: String*): Self = StObject.set(x, "fileNames", js.Array(value*))
    
    inline def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
  }
}
