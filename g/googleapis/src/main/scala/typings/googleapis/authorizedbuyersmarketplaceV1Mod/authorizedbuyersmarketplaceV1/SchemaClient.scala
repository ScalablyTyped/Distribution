package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaClient extends StObject {
  
  /**
    * Required. Display name shown to publishers. Must be unique for clients without partnerClientId specified. Maximum length of 255 characters is allowed.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The resource name of the client. Format: `buyers/{accountId\}/clients/{clientAccountId\}`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Arbitrary unique identifier provided by the buyer. This field can be used to associate a client with an identifier in the namespace of the buyer, lookup clients by that identifier and verify whether an Authorized Buyers account of the client already exists. If present, must be unique across all the clients.
    */
  var partnerClientId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The role assigned to the client. Each role implies a set of permissions granted to the client.
    */
  var role: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the client will be visible to sellers.
    */
  var sellerVisible: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. The state of the client.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaClient {
  
  inline def apply(): SchemaClient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClient]
  }
  
  extension [Self <: SchemaClient](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPartnerClientId(value: String): Self = StObject.set(x, "partnerClientId", value.asInstanceOf[js.Any])
    
    inline def setPartnerClientIdNull: Self = StObject.set(x, "partnerClientId", null)
    
    inline def setPartnerClientIdUndefined: Self = StObject.set(x, "partnerClientId", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleNull: Self = StObject.set(x, "role", null)
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSellerVisible(value: Boolean): Self = StObject.set(x, "sellerVisible", value.asInstanceOf[js.Any])
    
    inline def setSellerVisibleNull: Self = StObject.set(x, "sellerVisible", null)
    
    inline def setSellerVisibleUndefined: Self = StObject.set(x, "sellerVisible", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
