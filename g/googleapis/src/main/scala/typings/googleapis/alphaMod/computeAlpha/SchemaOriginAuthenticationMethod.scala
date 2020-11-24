package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for the origin authentication method.
  */
@js.native
trait SchemaOriginAuthenticationMethod extends js.Object {
  
  var jwt: js.UndefOr[SchemaJwt] = js.native
}
object SchemaOriginAuthenticationMethod {
  
  @scala.inline
  def apply(): SchemaOriginAuthenticationMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOriginAuthenticationMethod]
  }
  
  @scala.inline
  implicit class SchemaOriginAuthenticationMethodOps[Self <: SchemaOriginAuthenticationMethod] (val x: Self) extends AnyVal {
    
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
    def setJwt(value: SchemaJwt): Self = this.set("jwt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJwt: Self = this.set("jwt", js.undefined)
  }
}
