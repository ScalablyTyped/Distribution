package typings.dropboxjs.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MakeURLOptions extends js.Object {
  
  var download: js.UndefOr[Boolean] = js.native
  
  var downloadHack: js.UndefOr[Boolean] = js.native
  
  var long: js.UndefOr[Boolean] = js.native
  
  var longUrl: js.UndefOr[Boolean] = js.native
}
object MakeURLOptions {
  
  @scala.inline
  def apply(): MakeURLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MakeURLOptions]
  }
  
  @scala.inline
  implicit class MakeURLOptionsOps[Self <: MakeURLOptions] (val x: Self) extends AnyVal {
    
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
    def setDownload(value: Boolean): Self = this.set("download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownload: Self = this.set("download", js.undefined)
    
    @scala.inline
    def setDownloadHack(value: Boolean): Self = this.set("downloadHack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownloadHack: Self = this.set("downloadHack", js.undefined)
    
    @scala.inline
    def setLong(value: Boolean): Self = this.set("long", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLong: Self = this.set("long", js.undefined)
    
    @scala.inline
    def setLongUrl(value: Boolean): Self = this.set("longUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongUrl: Self = this.set("longUrl", js.undefined)
  }
}
