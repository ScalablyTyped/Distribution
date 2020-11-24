package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for the peer authentication method.
  */
@js.native
trait SchemaPeerAuthenticationMethod extends js.Object {
  
  /**
    * Set if mTLS is used for peer authentication.
    */
  var mtls: js.UndefOr[SchemaMutualTls] = js.native
}
object SchemaPeerAuthenticationMethod {
  
  @scala.inline
  def apply(): SchemaPeerAuthenticationMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPeerAuthenticationMethod]
  }
  
  @scala.inline
  implicit class SchemaPeerAuthenticationMethodOps[Self <: SchemaPeerAuthenticationMethod] (val x: Self) extends AnyVal {
    
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
    def setMtls(value: SchemaMutualTls): Self = this.set("mtls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMtls: Self = this.set("mtls", js.undefined)
  }
}
