package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Users resource represents an account associated with an enterprise. The
  * account may be specific to a device or to an individual user (who can then
  * use the account across multiple devices). The account may provide access to
  * managed Google Play only, or to other Google services, depending on the
  * identity model:  - The Google managed domain identity model requires
  * synchronization to Google account sources (via primaryEmail).  - The
  * managed Google Play Accounts identity model provides a dynamic means for
  * enterprises to create user or device accounts as needed. These accounts
  * provide access to managed Google Play.
  */
@js.native
trait SchemaUser extends js.Object {
  
  /**
    * A unique identifier you create for this user, such as &quot;user342&quot;
    * or &quot;asset#44418&quot;. Do not use personally identifiable
    * information (PII) for this property. Must always be set for EMM-managed
    * users. Not set for Google-managed users.
    */
  var accountIdentifier: js.UndefOr[String] = js.native
  
  /**
    * The type of account that this user represents. A userAccount can be
    * installed on multiple devices, but a deviceAccount is specific to a
    * single device. An EMM-managed user (emmManaged) can be either type
    * (userAccount, deviceAccount), but a Google-managed user (googleManaged)
    * is always a userAccount.
    */
  var accountType: js.UndefOr[String] = js.native
  
  /**
    * The name that will appear in user interfaces. Setting this property is
    * optional when creating EMM-managed users. If you do set this property,
    * use something generic about the organization (such as &quot;Example,
    * Inc.&quot;) or your name (as EMM). Not used for Google-managed user
    * accounts.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * The unique ID for the user.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#user&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The entity that manages the user. With googleManaged users, the source of
    * truth is Google so EMMs have to make sure a Google Account exists for the
    * user. With emmManaged users, the EMM is in charge.
    */
  var managementType: js.UndefOr[String] = js.native
  
  /**
    * The user&#39;s primary email address, for example,
    * &quot;jsmith@example.com&quot;. Will always be set for Google managed
    * users and not set for EMM managed users.
    */
  var primaryEmail: js.UndefOr[String] = js.native
}
object SchemaUser {
  
  @scala.inline
  def apply(): SchemaUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUser]
  }
  
  @scala.inline
  implicit class SchemaUserOps[Self <: SchemaUser] (val x: Self) extends AnyVal {
    
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
    def setAccountIdentifier(value: String): Self = this.set("accountIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountIdentifier: Self = this.set("accountIdentifier", js.undefined)
    
    @scala.inline
    def setAccountType(value: String): Self = this.set("accountType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountType: Self = this.set("accountType", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setManagementType(value: String): Self = this.set("managementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagementType: Self = this.set("managementType", js.undefined)
    
    @scala.inline
    def setPrimaryEmail(value: String): Self = this.set("primaryEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryEmail: Self = this.set("primaryEmail", js.undefined)
  }
}
