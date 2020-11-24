package typings.feathersjsAuthenticationJwt.anon

import org.scalablytyped.runtime.Instantiable2
import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.feathersjsAuthenticationJwt.mod.JwtFromRequestFunction
import typings.feathersjsAuthenticationJwt.mod.Verifier
import typings.feathersjsFeathers.mod.Application
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@feathersjs/authentication-jwt.@feathersjs/authentication-jwt.FeathersAuthenticationJWTOptions> */
@js.native
trait PartialFeathersAuthentica extends js.Object {
  
  var Verifier: js.UndefOr[
    Instantiable2[
      /* app */ Application[js.Object], 
      /* options */ js.Any, 
      typings.feathersjsAuthenticationJwt.mod.Verifier
    ]
  ] = js.native
  
  var entity: js.UndefOr[String] = js.native
  
  var jwtFromRequest: js.UndefOr[JwtFromRequestFunction] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var passReqToCallback: js.UndefOr[Boolean] = js.native
  
  var secretOrKey: js.UndefOr[String] = js.native
  
  var service: js.UndefOr[String] = js.native
  
  var session: js.UndefOr[Boolean] = js.native
}
object PartialFeathersAuthentica {
  
  @scala.inline
  def apply(): PartialFeathersAuthentica = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFeathersAuthentica]
  }
  
  @scala.inline
  implicit class PartialFeathersAuthenticaOps[Self <: PartialFeathersAuthentica] (val x: Self) extends AnyVal {
    
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
    def setVerifier(value: Instantiable2[/* app */ Application[js.Object], /* options */ js.Any, Verifier]): Self = this.set("Verifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerifier: Self = this.set("Verifier", js.undefined)
    
    @scala.inline
    def setEntity(value: String): Self = this.set("entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntity: Self = this.set("entity", js.undefined)
    
    @scala.inline
    def setJwtFromRequest(value: /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query] => String | Null): Self = this.set("jwtFromRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteJwtFromRequest: Self = this.set("jwtFromRequest", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPassReqToCallback(value: Boolean): Self = this.set("passReqToCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassReqToCallback: Self = this.set("passReqToCallback", js.undefined)
    
    @scala.inline
    def setSecretOrKey(value: String): Self = this.set("secretOrKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretOrKey: Self = this.set("secretOrKey", js.undefined)
    
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
