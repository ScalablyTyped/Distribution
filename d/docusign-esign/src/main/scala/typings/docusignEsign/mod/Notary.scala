package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Notary extends StObject {
  
  /**
    * The creation date of the account in UTC timedate format.
    */
  var createdDate: js.UndefOr[String] = js.native
  
  var enabled: js.UndefOr[String] = js.native
  
  var searchable: js.UndefOr[String] = js.native
  
  var userInfo: js.UndefOr[UserInformation] = js.native
}
object Notary {
  
  @scala.inline
  def apply(): Notary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Notary]
  }
  
  @scala.inline
  implicit class NotaryMutableBuilder[Self <: Notary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedDate(value: String): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    @scala.inline
    def setEnabled(value: String): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setSearchable(value: String): Self = StObject.set(x, "searchable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchableUndefined: Self = StObject.set(x, "searchable", js.undefined)
    
    @scala.inline
    def setUserInfo(value: UserInformation): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInfoUndefined: Self = StObject.set(x, "userInfo", js.undefined)
  }
}
