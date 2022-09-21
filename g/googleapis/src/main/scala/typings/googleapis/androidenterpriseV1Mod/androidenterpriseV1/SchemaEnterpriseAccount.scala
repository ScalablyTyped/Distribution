package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEnterpriseAccount extends StObject {
  
  /**
    * The email address of the service account.
    */
  var accountEmail: js.UndefOr[String | Null] = js.undefined
}
object SchemaEnterpriseAccount {
  
  inline def apply(): SchemaEnterpriseAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnterpriseAccount]
  }
  
  extension [Self <: SchemaEnterpriseAccount](x: Self) {
    
    inline def setAccountEmail(value: String): Self = StObject.set(x, "accountEmail", value.asInstanceOf[js.Any])
    
    inline def setAccountEmailNull: Self = StObject.set(x, "accountEmail", null)
    
    inline def setAccountEmailUndefined: Self = StObject.set(x, "accountEmail", js.undefined)
  }
}
