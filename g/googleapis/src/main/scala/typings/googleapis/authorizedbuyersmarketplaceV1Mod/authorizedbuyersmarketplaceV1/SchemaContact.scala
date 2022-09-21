package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContact extends StObject {
  
  /**
    * The display_name of the contact.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Email address for the contact.
    */
  var email: js.UndefOr[String | Null] = js.undefined
}
object SchemaContact {
  
  inline def apply(): SchemaContact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContact]
  }
  
  extension [Self <: SchemaContact](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
  }
}
