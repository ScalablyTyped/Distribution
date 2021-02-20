package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileType extends StObject {
  
  var fileExtension: js.UndefOr[String] = js.native
  
  /**
    * The mime-type of a file type listed in a fileTypes collection.
    */
  var mimeType: js.UndefOr[String] = js.native
}
object FileType {
  
  @scala.inline
  def apply(): FileType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileType]
  }
  
  @scala.inline
  implicit class FileTypeMutableBuilder[Self <: FileType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileExtension(value: String): Self = StObject.set(x, "fileExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileExtensionUndefined: Self = StObject.set(x, "fileExtension", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
  }
}
