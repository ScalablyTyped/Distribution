package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUser extends StObject {
  
  /**
    * A unique identifier you create for this user, such as "user342" or "asset#44418". Do not use personally identifiable information (PII) for this property. Must always be set for EMM-managed users. Not set for Google-managed users.
    */
  var accountIdentifier: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of account that this user represents. A userAccount can be installed on multiple devices, but a deviceAccount is specific to a single device. An EMM-managed user (emmManaged) can be either type (userAccount, deviceAccount), but a Google-managed user (googleManaged) is always a userAccount.
    */
  var accountType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name that will appear in user interfaces. Setting this property is optional when creating EMM-managed users. If you do set this property, use something generic about the organization (such as "Example, Inc.") or your name (as EMM). Not used for Google-managed user accounts. @mutable androidenterprise.users.update
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique ID for the user.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The entity that manages the user. With googleManaged users, the source of truth is Google so EMMs have to make sure a Google Account exists for the user. With emmManaged users, the EMM is in charge.
    */
  var managementType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user's primary email address, for example, "jsmith@example.com". Will always be set for Google managed users and not set for EMM managed users.
    */
  var primaryEmail: js.UndefOr[String | Null] = js.undefined
}
object SchemaUser {
  
  inline def apply(): SchemaUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUser]
  }
  
  extension [Self <: SchemaUser](x: Self) {
    
    inline def setAccountIdentifier(value: String): Self = StObject.set(x, "accountIdentifier", value.asInstanceOf[js.Any])
    
    inline def setAccountIdentifierNull: Self = StObject.set(x, "accountIdentifier", null)
    
    inline def setAccountIdentifierUndefined: Self = StObject.set(x, "accountIdentifier", js.undefined)
    
    inline def setAccountType(value: String): Self = StObject.set(x, "accountType", value.asInstanceOf[js.Any])
    
    inline def setAccountTypeNull: Self = StObject.set(x, "accountType", null)
    
    inline def setAccountTypeUndefined: Self = StObject.set(x, "accountType", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setManagementType(value: String): Self = StObject.set(x, "managementType", value.asInstanceOf[js.Any])
    
    inline def setManagementTypeNull: Self = StObject.set(x, "managementType", null)
    
    inline def setManagementTypeUndefined: Self = StObject.set(x, "managementType", js.undefined)
    
    inline def setPrimaryEmail(value: String): Self = StObject.set(x, "primaryEmail", value.asInstanceOf[js.Any])
    
    inline def setPrimaryEmailNull: Self = StObject.set(x, "primaryEmail", null)
    
    inline def setPrimaryEmailUndefined: Self = StObject.set(x, "primaryEmail", js.undefined)
  }
}
