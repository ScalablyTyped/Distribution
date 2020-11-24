package typings.googleAuthLibrary.jwtclientMod

import typings.googleAuthLibrary.oauth2clientMod.RefreshOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JWTOptions extends RefreshOptions {
  
  var additionalClaims: js.UndefOr[js.Object] = js.native
  
  var email: js.UndefOr[String] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var keyFile: js.UndefOr[String] = js.native
  
  var keyId: js.UndefOr[String] = js.native
  
  var scopes: js.UndefOr[String | js.Array[String]] = js.native
  
  var subject: js.UndefOr[String] = js.native
}
object JWTOptions {
  
  @scala.inline
  def apply(): JWTOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JWTOptions]
  }
  
  @scala.inline
  implicit class JWTOptionsOps[Self <: JWTOptions] (val x: Self) extends AnyVal {
    
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
    def setAdditionalClaims(value: js.Object): Self = this.set("additionalClaims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalClaims: Self = this.set("additionalClaims", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setKeyFile(value: String): Self = this.set("keyFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyFile: Self = this.set("keyFile", js.undefined)
    
    @scala.inline
    def setKeyId(value: String): Self = this.set("keyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyId: Self = this.set("keyId", js.undefined)
    
    @scala.inline
    def setScopesVarargs(value: String*): Self = this.set("scopes", js.Array(value :_*))
    
    @scala.inline
    def setScopes(value: String | js.Array[String]): Self = this.set("scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopes: Self = this.set("scopes", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
  }
}
