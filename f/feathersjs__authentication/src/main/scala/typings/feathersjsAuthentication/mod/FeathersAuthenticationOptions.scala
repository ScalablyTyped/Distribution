package typings.feathersjsAuthentication.mod

import typings.feathersjsAuthentication.anon.Algorithm
import typings.feathersjsAuthentication.anon.Enabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeathersAuthenticationOptions extends js.Object {
  
  var cookie: js.UndefOr[Enabled] = js.native
  
  var entity: js.UndefOr[String] = js.native
  
  var header: js.UndefOr[String] = js.native
  
  var jwt: js.UndefOr[Algorithm] = js.native
  
  var passReqToCallback: js.UndefOr[Boolean] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var service: js.UndefOr[String] = js.native
  
  var session: js.UndefOr[Boolean] = js.native
}
object FeathersAuthenticationOptions {
  
  @scala.inline
  def apply(): FeathersAuthenticationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeathersAuthenticationOptions]
  }
  
  @scala.inline
  implicit class FeathersAuthenticationOptionsOps[Self <: FeathersAuthenticationOptions] (val x: Self) extends AnyVal {
    
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
    def setCookie(value: Enabled): Self = this.set("cookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookie: Self = this.set("cookie", js.undefined)
    
    @scala.inline
    def setEntity(value: String): Self = this.set("entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntity: Self = this.set("entity", js.undefined)
    
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setJwt(value: Algorithm): Self = this.set("jwt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJwt: Self = this.set("jwt", js.undefined)
    
    @scala.inline
    def setPassReqToCallback(value: Boolean): Self = this.set("passReqToCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassReqToCallback: Self = this.set("passReqToCallback", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
    
    @scala.inline
    def setSession(value: Boolean): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
  }
}
