package typings.easyXapiSupertest.tlsMod

import typings.easyXapiSupertest.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionOptions extends js.Object {
  
  var NPNProtocols: js.UndefOr[js.Any] = js.native
  
    //string | Buffer
  var ca: js.UndefOr[js.Any] = js.native
  
  var cert: js.UndefOr[js.Any] = js.native
  
  var host: js.UndefOr[String] = js.native
  
     //string | Buffer
  var key: js.UndefOr[js.Any] = js.native
  
     //string | Buffer
  var passphrase: js.UndefOr[String] = js.native
  
  var pfx: js.UndefOr[js.Any] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
      //Array of string | Buffer
  var rejectUnauthorized: js.UndefOr[Boolean] = js.native
  
    //Array of string | Buffer
  var servername: js.UndefOr[String] = js.native
  
  var socket: js.UndefOr[Socket] = js.native
}
object ConnectionOptions {
  
  @scala.inline
  def apply(): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionOptions]
  }
  
  @scala.inline
  implicit class ConnectionOptionsOps[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
    
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
    def setNPNProtocols(value: js.Any): Self = this.set("NPNProtocols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNPNProtocols: Self = this.set("NPNProtocols", js.undefined)
    
    @scala.inline
    def setCa(value: js.Any): Self = this.set("ca", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCa: Self = this.set("ca", js.undefined)
    
    @scala.inline
    def setCert(value: js.Any): Self = this.set("cert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCert: Self = this.set("cert", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setKey(value: js.Any): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setPassphrase(value: String): Self = this.set("passphrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassphrase: Self = this.set("passphrase", js.undefined)
    
    @scala.inline
    def setPfx(value: js.Any): Self = this.set("pfx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePfx: Self = this.set("pfx", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setRejectUnauthorized(value: Boolean): Self = this.set("rejectUnauthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRejectUnauthorized: Self = this.set("rejectUnauthorized", js.undefined)
    
    @scala.inline
    def setServername(value: String): Self = this.set("servername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServername: Self = this.set("servername", js.undefined)
    
    @scala.inline
    def setSocket(value: Socket): Self = this.set("socket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocket: Self = this.set("socket", js.undefined)
  }
}
