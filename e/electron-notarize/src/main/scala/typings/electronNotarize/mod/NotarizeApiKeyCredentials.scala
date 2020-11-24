package typings.electronNotarize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotarizeApiKeyCredentials extends NotarizeCredentials {
  
  var appleApiIssuer: String = js.native
  
  var appleApiKey: String = js.native
}
object NotarizeApiKeyCredentials {
  
  @scala.inline
  def apply(appleApiIssuer: String, appleApiKey: String): NotarizeApiKeyCredentials = {
    val __obj = js.Dynamic.literal(appleApiIssuer = appleApiIssuer.asInstanceOf[js.Any], appleApiKey = appleApiKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotarizeApiKeyCredentials]
  }
  
  @scala.inline
  implicit class NotarizeApiKeyCredentialsOps[Self <: NotarizeApiKeyCredentials] (val x: Self) extends AnyVal {
    
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
    def setAppleApiIssuer(value: String): Self = this.set("appleApiIssuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppleApiKey(value: String): Self = this.set("appleApiKey", value.asInstanceOf[js.Any])
  }
}
