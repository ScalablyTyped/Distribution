package typings.dropboxjs.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountInfo extends js.Object {
  
  var countryCode: String = js.native
  
  var email: String = js.native
  
  def json(): js.Object = js.native
  
  var name: String = js.native
  
  var privateBytes: Double = js.native
  
  var publicAppUrl: String = js.native
  
  var quota: Double = js.native
  
  var referralUrl: String = js.native
  
  var sharedBytes: Double = js.native
  
  var uid: String = js.native
  
  var usedQuota: Double = js.native
}
object AccountInfo {
  
  @scala.inline
  def apply(
    countryCode: String,
    email: String,
    json: () => js.Object,
    name: String,
    privateBytes: Double,
    publicAppUrl: String,
    quota: Double,
    referralUrl: String,
    sharedBytes: Double,
    uid: String,
    usedQuota: Double
  ): AccountInfo = {
    val __obj = js.Dynamic.literal(countryCode = countryCode.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), name = name.asInstanceOf[js.Any], privateBytes = privateBytes.asInstanceOf[js.Any], publicAppUrl = publicAppUrl.asInstanceOf[js.Any], quota = quota.asInstanceOf[js.Any], referralUrl = referralUrl.asInstanceOf[js.Any], sharedBytes = sharedBytes.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], usedQuota = usedQuota.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountInfo]
  }
  
  @scala.inline
  implicit class AccountInfoOps[Self <: AccountInfo] (val x: Self) extends AnyVal {
    
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
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJson(value: () => js.Object): Self = this.set("json", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateBytes(value: Double): Self = this.set("privateBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicAppUrl(value: String): Self = this.set("publicAppUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuota(value: Double): Self = this.set("quota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferralUrl(value: String): Self = this.set("referralUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedBytes(value: Double): Self = this.set("sharedBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUid(value: String): Self = this.set("uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedQuota(value: Double): Self = this.set("usedQuota", value.asInstanceOf[js.Any])
  }
}
