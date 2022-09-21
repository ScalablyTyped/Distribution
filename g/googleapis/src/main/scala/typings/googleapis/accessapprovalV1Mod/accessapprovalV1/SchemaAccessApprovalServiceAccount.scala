package typings.googleapis.accessapprovalV1Mod.accessapprovalV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccessApprovalServiceAccount extends StObject {
  
  /**
    * Email address of the service account.
    */
  var accountEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name of the Access Approval service account. Format is one of: * "projects/{project\}/serviceAccount" * "folders/{folder\}/serviceAccount" * "organizations/{organization\}/serviceAccount"
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaAccessApprovalServiceAccount {
  
  inline def apply(): SchemaAccessApprovalServiceAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccessApprovalServiceAccount]
  }
  
  extension [Self <: SchemaAccessApprovalServiceAccount](x: Self) {
    
    inline def setAccountEmail(value: String): Self = StObject.set(x, "accountEmail", value.asInstanceOf[js.Any])
    
    inline def setAccountEmailNull: Self = StObject.set(x, "accountEmail", null)
    
    inline def setAccountEmailUndefined: Self = StObject.set(x, "accountEmail", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
