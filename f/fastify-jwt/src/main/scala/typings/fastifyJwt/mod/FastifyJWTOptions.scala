package typings.fastifyJwt.mod

import org.scalablytyped.runtime.StringDictionary
import typings.fastifyJwt.anon.AuthorizationTokenExpiredMessage
import typings.fastifyJwt.anon.CookieName
import typings.fastifyJwt.anon.Private
import typings.fastifyJwt.anon.VerifyOptionsextractToken
import typings.fastifyJwt.mod.JWTTypes.SignPayloadType
import typings.fastifyJwt.mod.fastifyAugmentingMod.FastifyReply
import typings.fastifyJwt.mod.fastifyAugmentingMod.FastifyRequest
import typings.jsonwebtoken.mod.DecodeOptions
import typings.jsonwebtoken.mod.SignOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FastifyJWTOptions extends js.Object {
  
  var cookie: js.UndefOr[CookieName] = js.native
  
  var decode: js.UndefOr[DecodeOptions] = js.native
  
  var messages: js.UndefOr[AuthorizationTokenExpiredMessage] = js.native
  
  var secret: Secret | Private = js.native
  
  var sign: js.UndefOr[SignOptions] = js.native
  
  var trusted: js.UndefOr[
    js.Function2[
      /* request */ FastifyRequest, 
      /* decodedToken */ StringDictionary[js.Any], 
      Boolean | (js.Promise[Boolean | SignPayloadType]) | SignPayloadType
    ]
  ] = js.native
  
  var verify: js.UndefOr[VerifyOptionsextractToken] = js.native
}
object FastifyJWTOptions {
  
  @scala.inline
  def apply(secret: Secret | Private): FastifyJWTOptions = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastifyJWTOptions]
  }
  
  @scala.inline
  implicit class FastifyJWTOptionsOps[Self <: FastifyJWTOptions] (val x: Self) extends AnyVal {
    
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
    def setSecretFunction3(
      value: (/* request */ FastifyRequest, /* reply */ FastifyReply, /* cb */ js.Function2[/* e */ Error | Null, /* secret */ js.UndefOr[String], Unit]) => Unit
    ): Self = this.set("secret", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSecret(value: Secret | Private): Self = this.set("secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookie(value: CookieName): Self = this.set("cookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookie: Self = this.set("cookie", js.undefined)
    
    @scala.inline
    def setDecode(value: DecodeOptions): Self = this.set("decode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecode: Self = this.set("decode", js.undefined)
    
    @scala.inline
    def setMessages(value: AuthorizationTokenExpiredMessage): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setSign(value: SignOptions): Self = this.set("sign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSign: Self = this.set("sign", js.undefined)
    
    @scala.inline
    def setTrusted(
      value: (/* request */ FastifyRequest, /* decodedToken */ StringDictionary[js.Any]) => Boolean | (js.Promise[Boolean | SignPayloadType]) | SignPayloadType
    ): Self = this.set("trusted", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTrusted: Self = this.set("trusted", js.undefined)
    
    @scala.inline
    def setVerify(value: VerifyOptionsextractToken): Self = this.set("verify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerify: Self = this.set("verify", js.undefined)
  }
}
