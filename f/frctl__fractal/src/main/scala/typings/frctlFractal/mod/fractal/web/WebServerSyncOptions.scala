package typings.frctlFractal.mod.fractal.web

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebServerSyncOptions extends js.Object {
  
  var browser: js.UndefOr[js.Array[String]] = js.native
  
  @JSName("notify")
  var notify_FWebServerSyncOptions: js.UndefOr[Boolean] = js.native
  
  var open: js.UndefOr[Boolean] = js.native
}
object WebServerSyncOptions {
  
  @scala.inline
  def apply(): WebServerSyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebServerSyncOptions]
  }
  
  @scala.inline
  implicit class WebServerSyncOptionsOps[Self <: WebServerSyncOptions] (val x: Self) extends AnyVal {
    
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
    def setBrowserVarargs(value: String*): Self = this.set("browser", js.Array(value :_*))
    
    @scala.inline
    def setBrowser(value: js.Array[String]): Self = this.set("browser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowser: Self = this.set("browser", js.undefined)
    
    @scala.inline
    def setNotify(value: Boolean): Self = this.set("notify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotify: Self = this.set("notify", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
  }
}
