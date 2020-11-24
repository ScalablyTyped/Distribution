package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Downloadurl extends js.Object {
  
  var download_url: js.UndefOr[String] = js.native
  
  var encrypted_key: js.UndefOr[String] = js.native
  
  var language: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[String] = js.native
  
  var version: js.UndefOr[String] = js.native
}
object Downloadurl {
  
  @scala.inline
  def apply(): Downloadurl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Downloadurl]
  }
  
  @scala.inline
  implicit class DownloadurlOps[Self <: Downloadurl] (val x: Self) extends AnyVal {
    
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
    def setDownload_url(value: String): Self = this.set("download_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownload_url: Self = this.set("download_url", js.undefined)
    
    @scala.inline
    def setEncrypted_key(value: String): Self = this.set("encrypted_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncrypted_key: Self = this.set("encrypted_key", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
