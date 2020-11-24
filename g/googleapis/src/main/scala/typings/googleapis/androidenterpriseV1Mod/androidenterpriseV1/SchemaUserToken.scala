package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A UserToken is used by a user when setting up a managed device or profile
  * with their managed Google Play account on a device. When the user enters
  * their email address and token (activation code) the appropriate EMM app can
  * be automatically downloaded.
  */
@js.native
trait SchemaUserToken extends js.Object {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#userToken&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The token (activation code) to be entered by the user. This consists of a
    * sequence of decimal digits. Note that the leading digit may be 0.
    */
  var token: js.UndefOr[String] = js.native
  
  /**
    * The unique ID for the user.
    */
  var userId: js.UndefOr[String] = js.native
}
object SchemaUserToken {
  
  @scala.inline
  def apply(): SchemaUserToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserToken]
  }
  
  @scala.inline
  implicit class SchemaUserTokenOps[Self <: SchemaUserToken] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
}
