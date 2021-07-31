package typings.evernote.anon

import typings.evernote.mod.Types.Accounting
import typings.evernote.mod.Types.BusinessUserInfo
import typings.evernote.mod.Types.PrivilegeLevel
import typings.evernote.mod.Types.ServiceLevel
import typings.evernote.mod.Types.Timestamp
import typings.evernote.mod.Types.UserAttributes
import typings.evernote.mod.Types.UserID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountLimits extends StObject {
  
  var accountLimits: js.UndefOr[typings.evernote.mod.Types.AccountLimits] = js.undefined
  
  var accounting: js.UndefOr[Accounting] = js.undefined
  
  var active: js.UndefOr[Boolean] = js.undefined
  
  var attributes: js.UndefOr[UserAttributes] = js.undefined
  
  var businessUserInfo: js.UndefOr[BusinessUserInfo] = js.undefined
  
  var created: js.UndefOr[Timestamp] = js.undefined
  
  var deleted: js.UndefOr[Timestamp] = js.undefined
  
  var email: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[UserID] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var photoLastUpdated: js.UndefOr[Timestamp] = js.undefined
  
  var photoUrl: js.UndefOr[String] = js.undefined
  
  var privilege: js.UndefOr[PrivilegeLevel] = js.undefined
  
  var serviceLevel: js.UndefOr[ServiceLevel] = js.undefined
  
  var shardId: js.UndefOr[String] = js.undefined
  
  var timezone: js.UndefOr[String] = js.undefined
  
  var updated: js.UndefOr[Timestamp] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
}
object AccountLimits {
  
  @scala.inline
  def apply(): AccountLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountLimits]
  }
  
  @scala.inline
  implicit class AccountLimitsMutableBuilder[Self <: AccountLimits] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountLimits(value: typings.evernote.mod.Types.AccountLimits): Self = StObject.set(x, "accountLimits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountLimitsUndefined: Self = StObject.set(x, "accountLimits", js.undefined)
    
    @scala.inline
    def setAccounting(value: Accounting): Self = StObject.set(x, "accounting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountingUndefined: Self = StObject.set(x, "accounting", js.undefined)
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setAttributes(value: UserAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setBusinessUserInfo(value: BusinessUserInfo): Self = StObject.set(x, "businessUserInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusinessUserInfoUndefined: Self = StObject.set(x, "businessUserInfo", js.undefined)
    
    @scala.inline
    def setCreated(value: Timestamp): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setDeleted(value: Timestamp): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setId(value: UserID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPhotoLastUpdated(value: Timestamp): Self = StObject.set(x, "photoLastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoLastUpdatedUndefined: Self = StObject.set(x, "photoLastUpdated", js.undefined)
    
    @scala.inline
    def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
    
    @scala.inline
    def setPrivilege(value: PrivilegeLevel): Self = StObject.set(x, "privilege", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivilegeUndefined: Self = StObject.set(x, "privilege", js.undefined)
    
    @scala.inline
    def setServiceLevel(value: ServiceLevel): Self = StObject.set(x, "serviceLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceLevelUndefined: Self = StObject.set(x, "serviceLevel", js.undefined)
    
    @scala.inline
    def setShardId(value: String): Self = StObject.set(x, "shardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShardIdUndefined: Self = StObject.set(x, "shardId", js.undefined)
    
    @scala.inline
    def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    
    @scala.inline
    def setUpdated(value: Timestamp): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
