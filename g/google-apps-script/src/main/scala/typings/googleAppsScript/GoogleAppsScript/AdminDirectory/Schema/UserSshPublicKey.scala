package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserSshPublicKey extends js.Object {
  
  var expirationTimeUsec: js.UndefOr[String] = js.native
  
  var fingerprint: js.UndefOr[String] = js.native
  
  var key: js.UndefOr[String] = js.native
}
object UserSshPublicKey {
  
  @scala.inline
  def apply(): UserSshPublicKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserSshPublicKey]
  }
  
  @scala.inline
  implicit class UserSshPublicKeyOps[Self <: UserSshPublicKey] (val x: Self) extends AnyVal {
    
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
    def setExpirationTimeUsec(value: String): Self = this.set("expirationTimeUsec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationTimeUsec: Self = this.set("expirationTimeUsec", js.undefined)
    
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
  }
}
