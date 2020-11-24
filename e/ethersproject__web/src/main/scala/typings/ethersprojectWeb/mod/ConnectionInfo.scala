package typings.ethersprojectWeb.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionInfo extends js.Object {
  
  var allowGzip: js.UndefOr[Boolean] = js.native
  
  var allowInsecureAuthentication: js.UndefOr[Boolean] = js.native
  
  var headers: js.UndefOr[StringDictionary[String | Double]] = js.native
  
  var password: js.UndefOr[String] = js.native
  
  var throttleCallback: js.UndefOr[js.Function2[/* attempt */ Double, /* url */ String, js.Promise[Boolean]]] = js.native
  
  var throttleLimit: js.UndefOr[Double] = js.native
  
  var throttleSlotInterval: js.UndefOr[Double] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var url: String = js.native
  
  var user: js.UndefOr[String] = js.native
}
object ConnectionInfo {
  
  @scala.inline
  def apply(url: String): ConnectionInfo = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionInfo]
  }
  
  @scala.inline
  implicit class ConnectionInfoOps[Self <: ConnectionInfo] (val x: Self) extends AnyVal {
    
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowGzip(value: Boolean): Self = this.set("allowGzip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowGzip: Self = this.set("allowGzip", js.undefined)
    
    @scala.inline
    def setAllowInsecureAuthentication(value: Boolean): Self = this.set("allowInsecureAuthentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowInsecureAuthentication: Self = this.set("allowInsecureAuthentication", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String | Double]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setThrottleCallback(value: (/* attempt */ Double, /* url */ String) => js.Promise[Boolean]): Self = this.set("throttleCallback", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteThrottleCallback: Self = this.set("throttleCallback", js.undefined)
    
    @scala.inline
    def setThrottleLimit(value: Double): Self = this.set("throttleLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrottleLimit: Self = this.set("throttleLimit", js.undefined)
    
    @scala.inline
    def setThrottleSlotInterval(value: Double): Self = this.set("throttleSlotInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrottleSlotInterval: Self = this.set("throttleSlotInterval", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
