package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileType extends StObject {
  
  var fileExtension: js.UndefOr[String] = js.undefined
  
  /**
    * The mime-type of a file type listed in a fileTypes collection.
    */
  var mimeType: js.UndefOr[String] = js.undefined
}
object FileType {
  
  inline def apply(): FileType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileType] (val x: Self) extends AnyVal {
    
    inline def setFileExtension(value: String): Self = StObject.set(x, "fileExtension", value.asInstanceOf[js.Any])
    
    inline def setFileExtensionUndefined: Self = StObject.set(x, "fileExtension", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
  }
}
