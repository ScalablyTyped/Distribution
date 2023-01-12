package typings.dropboxjs.Dropbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountInfo extends StObject {
  
  var countryCode: String
  
  var email: String
  
  def json(): js.Object
  
  var name: String
  
  var privateBytes: Double
  
  var publicAppUrl: String
  
  var quota: Double
  
  var referralUrl: String
  
  var sharedBytes: Double
  
  var uid: String
  
  var usedQuota: Double
}
object AccountInfo {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: AccountInfo] (val x: Self) extends AnyVal {
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setJson(value: () => js.Object): Self = StObject.set(x, "json", js.Any.fromFunction0(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPrivateBytes(value: Double): Self = StObject.set(x, "privateBytes", value.asInstanceOf[js.Any])
    
    inline def setPublicAppUrl(value: String): Self = StObject.set(x, "publicAppUrl", value.asInstanceOf[js.Any])
    
    inline def setQuota(value: Double): Self = StObject.set(x, "quota", value.asInstanceOf[js.Any])
    
    inline def setReferralUrl(value: String): Self = StObject.set(x, "referralUrl", value.asInstanceOf[js.Any])
    
    inline def setSharedBytes(value: Double): Self = StObject.set(x, "sharedBytes", value.asInstanceOf[js.Any])
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUsedQuota(value: Double): Self = StObject.set(x, "usedQuota", value.asInstanceOf[js.Any])
  }
}
