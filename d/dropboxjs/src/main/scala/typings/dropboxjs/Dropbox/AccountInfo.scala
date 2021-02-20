package typings.dropboxjs.Dropbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountInfo extends StObject {
  
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
  implicit class AccountInfoMutableBuilder[Self <: AccountInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJson(value: () => js.Object): Self = StObject.set(x, "json", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateBytes(value: Double): Self = StObject.set(x, "privateBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicAppUrl(value: String): Self = StObject.set(x, "publicAppUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuota(value: Double): Self = StObject.set(x, "quota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferralUrl(value: String): Self = StObject.set(x, "referralUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedBytes(value: Double): Self = StObject.set(x, "sharedBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedQuota(value: Double): Self = StObject.set(x, "usedQuota", value.asInstanceOf[js.Any])
  }
}
