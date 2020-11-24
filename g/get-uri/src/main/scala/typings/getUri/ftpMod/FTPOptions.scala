package typings.getUri.ftpMod

import typings.ftp.mod.Options
import typings.getUri.mod.GetUriOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FTPOptions
  extends GetUriOptions
     with Options {
  
  @JSName("cache")
  var cache_FTPOptions: js.UndefOr[FTPReadable] = js.native
}
object FTPOptions {
  
  @scala.inline
  def apply(): FTPOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FTPOptions]
  }
  
  @scala.inline
  implicit class FTPOptionsOps[Self <: FTPOptions] (val x: Self) extends AnyVal {
    
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
    def setCache(value: FTPReadable): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
  }
}
