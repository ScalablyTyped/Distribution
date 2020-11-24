package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileType extends js.Object {
  
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
  implicit class FileTypeOps[Self <: FileType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFileExtension(value: String): Self = this.set("fileExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileExtension: Self = this.set("fileExtension", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
  }
}
