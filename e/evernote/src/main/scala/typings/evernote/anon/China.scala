package typings.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait China extends js.Object {
  
  var china: js.UndefOr[Boolean] = js.native
  
  var consumerKey: js.UndefOr[String] = js.native
  
  var consumerSecret: js.UndefOr[String] = js.native
  
  var sandbox: js.UndefOr[Boolean] = js.native
  
  var serviceHost: js.UndefOr[String] = js.native
  
  var token: js.UndefOr[String] = js.native
}
object China {
  
  @scala.inline
  def apply(): China = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[China]
  }
  
  @scala.inline
  implicit class ChinaOps[Self <: China] (val x: Self) extends AnyVal {
    
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
    def setChina(value: Boolean): Self = this.set("china", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChina: Self = this.set("china", js.undefined)
    
    @scala.inline
    def setConsumerKey(value: String): Self = this.set("consumerKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumerKey: Self = this.set("consumerKey", js.undefined)
    
    @scala.inline
    def setConsumerSecret(value: String): Self = this.set("consumerSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumerSecret: Self = this.set("consumerSecret", js.undefined)
    
    @scala.inline
    def setSandbox(value: Boolean): Self = this.set("sandbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSandbox: Self = this.set("sandbox", js.undefined)
    
    @scala.inline
    def setServiceHost(value: String): Self = this.set("serviceHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceHost: Self = this.set("serviceHost", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
  }
}
