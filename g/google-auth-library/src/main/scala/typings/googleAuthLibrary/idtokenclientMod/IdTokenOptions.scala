package typings.googleAuthLibrary.idtokenclientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdTokenOptions extends js.Object {
  
  /**
    * The client to make the request to fetch an ID token.
    */
  var idTokenProvider: IdTokenProvider = js.native
  
  /**
    * The audience to use when requesting an ID token.
    */
  var targetAudience: String = js.native
}
object IdTokenOptions {
  
  @scala.inline
  def apply(idTokenProvider: IdTokenProvider, targetAudience: String): IdTokenOptions = {
    val __obj = js.Dynamic.literal(idTokenProvider = idTokenProvider.asInstanceOf[js.Any], targetAudience = targetAudience.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdTokenOptions]
  }
  
  @scala.inline
  implicit class IdTokenOptionsOps[Self <: IdTokenOptions] (val x: Self) extends AnyVal {
    
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
    def setIdTokenProvider(value: IdTokenProvider): Self = this.set("idTokenProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetAudience(value: String): Self = this.set("targetAudience", value.asInstanceOf[js.Any])
  }
}
