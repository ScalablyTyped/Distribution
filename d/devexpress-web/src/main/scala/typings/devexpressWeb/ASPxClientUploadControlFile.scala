package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client file that corresponds to a particular file selected for uploading in the upload control.
  */
trait ASPxClientUploadControlFile extends StObject {
  
  /**
    * Gets the name of the file selected for uploading.
    */
  var name: String
  
  /**
    * Gets the size of the file selected for uploading.
    */
  var size: Double
  
  /**
    * Provides access to the file as a native Javascript object.
    */
  var sourceFileObject: js.Any
}
object ASPxClientUploadControlFile {
  
  inline def apply(name: String, size: Double, sourceFileObject: js.Any): ASPxClientUploadControlFile = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], sourceFileObject = sourceFileObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientUploadControlFile]
  }
  
  extension [Self <: ASPxClientUploadControlFile](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSourceFileObject(value: js.Any): Self = StObject.set(x, "sourceFileObject", value.asInstanceOf[js.Any])
  }
}
