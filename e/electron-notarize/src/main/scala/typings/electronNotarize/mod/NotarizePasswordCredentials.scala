package typings.electronNotarize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotarizePasswordCredentials extends NotarizeCredentials {
  
  var appleId: String = js.native
  
  var appleIdPassword: String = js.native
}
object NotarizePasswordCredentials {
  
  @scala.inline
  def apply(appleId: String, appleIdPassword: String): NotarizePasswordCredentials = {
    val __obj = js.Dynamic.literal(appleId = appleId.asInstanceOf[js.Any], appleIdPassword = appleIdPassword.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotarizePasswordCredentials]
  }
  
  @scala.inline
  implicit class NotarizePasswordCredentialsOps[Self <: NotarizePasswordCredentials] (val x: Self) extends AnyVal {
    
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
    def setAppleId(value: String): Self = this.set("appleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppleIdPassword(value: String): Self = this.set("appleIdPassword", value.asInstanceOf[js.Any])
  }
}
