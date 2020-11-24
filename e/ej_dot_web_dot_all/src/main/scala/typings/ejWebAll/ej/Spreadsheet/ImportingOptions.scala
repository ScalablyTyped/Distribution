package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportingOptions extends js.Object {
  
  /** Pass the url to import manually
    */
  var Url: js.UndefOr[String] = js.native
  
  /** Pass the file to import manually
    */
  var file: js.UndefOr[String] = js.native
  
  /** Pass the file stream to import manually
    */
  var fileStream: js.UndefOr[String] = js.native
  
  /** Pass the filetype to import manually
    */
  var fileType: js.UndefOr[String] = js.native
  
  /** Pass the password to import manually
    */
  var password: js.UndefOr[String] = js.native
}
object ImportingOptions {
  
  @scala.inline
  def apply(): ImportingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportingOptions]
  }
  
  @scala.inline
  implicit class ImportingOptionsOps[Self <: ImportingOptions] (val x: Self) extends AnyVal {
    
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
    def setUrl(value: String): Self = this.set("Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("Url", js.undefined)
    
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    
    @scala.inline
    def setFileStream(value: String): Self = this.set("fileStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileStream: Self = this.set("fileStream", js.undefined)
    
    @scala.inline
    def setFileType(value: String): Self = this.set("fileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileType: Self = this.set("fileType", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
  }
}
