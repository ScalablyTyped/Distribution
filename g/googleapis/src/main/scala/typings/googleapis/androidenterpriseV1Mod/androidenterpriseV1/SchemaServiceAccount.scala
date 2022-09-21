package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaServiceAccount extends StObject {
  
  /**
    * Credentials that can be used to authenticate as this ServiceAccount.
    */
  var key: js.UndefOr[SchemaServiceAccountKey] = js.undefined
  
  /**
    * The account name of the service account, in the form of an email address. Assigned by the server.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaServiceAccount {
  
  inline def apply(): SchemaServiceAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceAccount]
  }
  
  extension [Self <: SchemaServiceAccount](x: Self) {
    
    inline def setKey(value: SchemaServiceAccountKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
