package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Notary extends StObject {
  
  /**
    * The creation date of the account in UTC timedate format.
    */
  var createdDate: js.UndefOr[String] = js.undefined
  
  var enabled: js.UndefOr[String] = js.undefined
  
  var searchable: js.UndefOr[String] = js.undefined
  
  var userInfo: js.UndefOr[UserInformation] = js.undefined
}
object Notary {
  
  inline def apply(): Notary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Notary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Notary] (val x: Self) extends AnyVal {
    
    inline def setCreatedDate(value: String): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    inline def setEnabled(value: String): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setSearchable(value: String): Self = StObject.set(x, "searchable", value.asInstanceOf[js.Any])
    
    inline def setSearchableUndefined: Self = StObject.set(x, "searchable", js.undefined)
    
    inline def setUserInfo(value: UserInformation): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
    
    inline def setUserInfoUndefined: Self = StObject.set(x, "userInfo", js.undefined)
  }
}
