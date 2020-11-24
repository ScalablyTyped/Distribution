package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExternalFile extends js.Object {
  
  /**
    * The UTC date and time that the file or folder was last modified.
    */
  var date: js.UndefOr[String] = js.native
  
  /**
    * The storage provider's id for the file or folder.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The file extension for a file.
    *
    * **Note**: If the item is a folder, this value is null.
    */
  var img: js.UndefOr[String] = js.native
  
  /**
    * The full name of a file.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The size of the file. The file size limit varies based on the cloud storage provider.
    */
  var size: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, DocuSign supports the file type for upload.
    */
  var supported: js.UndefOr[String] = js.native
  
  /**
    * The type of cloud storage item. Valid values are:
    *
    * - `file`
    * - `folder`
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * The URI for the file or folder.
    */
  var uri: js.UndefOr[String] = js.native
}
object ExternalFile {
  
  @scala.inline
  def apply(): ExternalFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalFile]
  }
  
  @scala.inline
  implicit class ExternalFileOps[Self <: ExternalFile] (val x: Self) extends AnyVal {
    
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
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setImg(value: String): Self = this.set("img", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImg: Self = this.set("img", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSupported(value: String): Self = this.set("supported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupported: Self = this.set("supported", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
}
