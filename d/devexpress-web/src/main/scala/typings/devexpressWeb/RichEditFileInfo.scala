package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the settings defining a file to save to.
  */
trait RichEditFileInfo extends StObject {
  
  /**
    * Gets or sets the file's document format.
    */
  var documentFormat: DocumentFormat
  
  /**
    * Gets or sets the file name.
    */
  var fileName: String
  
  /**
    * Gets or sets the file's folder name.
    */
  var folderPath: String
}
object RichEditFileInfo {
  
  inline def apply(documentFormat: DocumentFormat, fileName: String, folderPath: String): RichEditFileInfo = {
    val __obj = js.Dynamic.literal(documentFormat = documentFormat.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], folderPath = folderPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[RichEditFileInfo]
  }
  
  extension [Self <: RichEditFileInfo](x: Self) {
    
    inline def setDocumentFormat(value: DocumentFormat): Self = StObject.set(x, "documentFormat", value.asInstanceOf[js.Any])
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFolderPath(value: String): Self = StObject.set(x, "folderPath", value.asInstanceOf[js.Any])
  }
}
