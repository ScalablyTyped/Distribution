package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client file that corresponds to a particular file selected for uploading in the upload control.
  */
@js.native
trait ASPxClientUploadControlFile extends StObject {
  
  /**
    * Gets the name of the file selected for uploading.
    */
  var name: String = js.native
  
  /**
    * Gets the size of the file selected for uploading.
    */
  var size: Double = js.native
  
  /**
    * Provides access to the file as a native Javascript object.
    */
  var sourceFileObject: js.Any = js.native
}
object ASPxClientUploadControlFile {
  
  @scala.inline
  def apply(name: String, size: Double, sourceFileObject: js.Any): ASPxClientUploadControlFile = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], sourceFileObject = sourceFileObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientUploadControlFile]
  }
  
  @scala.inline
  implicit class ASPxClientUploadControlFileMutableBuilder[Self <: ASPxClientUploadControlFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFileObject(value: js.Any): Self = StObject.set(x, "sourceFileObject", value.asInstanceOf[js.Any])
  }
}
